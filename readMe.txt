Install java 8
Install Maven
Install Docker
Install Docker compose

Push to Remove Docker Hub
=========================
**Run below commands in individual modules

sudo docker build -t nextgen-eureka-server:latest .
sudo docker image tag nextgen-eureka-server:latest ashoksuryap/nextgen-eureka-server:latest
sudo docker login
sudo docker push ashoksuryap/nextgen-eureka-server:latest


sudo docker build -t nextgen-book-service:latest .
sudo docker image tag nextgen-book-service:latest ashoksuryap/nextgen-book-service:latest
sudo docker login
sudo docker push ashoksuryap/nextgen-book-service:latest


sudo docker build -t nextgen-review-service:latest .
sudo docker image tag nextgen-review-service:latest ashoksuryap/nextgen-review-service:latest
sudo docker login
sudo docker push ashoksuryap/nextgen-review-service:latest

Push to Remove Docker Hub
=========================
**Run below command in project root folder

sudo docker-compose up