./mvnw package -Pprod -DskipTests jib:dockerBuild

sudo docker tag customer-external:latest jatindocker/customer-external
sudo docker push jatindocker/customer-external
