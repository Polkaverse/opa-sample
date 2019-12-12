package com.example.service;

import org.springframework.http.HttpHeaders;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ExecutionContext {

    private Map<String, Object> headers = new HashMap<String, Object>();
    private Map<String, Object> params = new HashMap<String, Object>();
    private Map<String, Object> models = new HashMap<String, Object>();
    private Map<String, Object> transients = new HashMap<String, Object>();

    public static enum NameSpace {
        HEADERS, PARAMS, MODELS, TRANSIENTS
    }

    public ExecutionContext(Map<String, Object> params) {
        this.params = params;
    }

    public ExecutionContext(HttpHeaders httpHeaders, Map<String, Object> params) {
        this.headers = httpHeaders.toSingleValueMap().entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (Object) e.getValue()));
        this.models.put("requestbody", null);
        this.params = params;
    }

    public ExecutionContext(Object requestBody, HttpHeaders httpHeaders, Map<String, Object> params) {
        this.headers = httpHeaders.toSingleValueMap().entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (Object) e.getValue()));
        this.models.put("requestbody", requestBody);
        this.params = params;
    }

    public void put(final NameSpace nameSpace, final String key, final Object value) {
        if (nameSpace.equals(NameSpace.HEADERS)) {
            this.headers.put(key, value);
        } else if (nameSpace.equals(NameSpace.PARAMS)) {
            this.params.put(key, value);
        } else if (nameSpace.equals(NameSpace.MODELS)) {
            this.models.put(key, value);
        } else if (nameSpace.equals(NameSpace.TRANSIENTS)) {
            this.transients.put(key, value);
        }
        //TODO log a context change
    }

    public void putAll(final NameSpace nameSpace, final Map<String, ? extends Object> data) {
        final Map<String, Object> lowerData = new HashMap<String, Object>();
        data.forEach((key, value) -> lowerData.put(key, value));
        if (nameSpace.equals(NameSpace.HEADERS)) {
            this.headers.putAll(lowerData);
        } else if (nameSpace.equals(NameSpace.PARAMS)) {
            this.params.putAll(lowerData);
        } else if (nameSpace.equals(NameSpace.MODELS)) {
            this.models.putAll(lowerData);
        } else if (nameSpace.equals(NameSpace.TRANSIENTS)) {
            this.transients.putAll(lowerData);
        }
        //TODO log a context change
    }

    public Object get(final NameSpace nameSpace, final String key) {
        Object result = null;
        if (key != null) {
            if (nameSpace.equals(NameSpace.HEADERS)) {
                result = this.headers.get(key);
            } else if (nameSpace.equals(NameSpace.PARAMS)) {
                result = this.params.get(key);
            } else if (nameSpace.equals(NameSpace.MODELS)) {
                result = this.models.get(key);
            } else if (nameSpace.equals(NameSpace.TRANSIENTS)) {
                result = this.transients.get(key);
            }
        }
        return result;
    }


    public Object remove(final NameSpace nameSpace, final String key) {
        Object result = null;
        if (key != null) {
            if (nameSpace.equals(NameSpace.HEADERS)) {
                result = this.headers.remove(key);
            } else if (nameSpace.equals(NameSpace.PARAMS)) {
                result = this.params.remove(key);
            } else if (nameSpace.equals(NameSpace.MODELS)) {
                result = this.models.remove(key);
            } else if (nameSpace.equals(NameSpace.TRANSIENTS)) {
                result = this.transients.remove(key);
            }
        }
        return result;
    }

    public boolean exists(final NameSpace nameSpace, final String key) {
        return (this.get(nameSpace, key) != null);
    }
}
