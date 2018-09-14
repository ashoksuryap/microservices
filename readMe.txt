Zuul
========
http://localhost:8080/book-service/books




***********EC2***************
Install java 8
==============
install Java 1.8:
sudo yum install java-1.8.0

change the Java version:
sudo alternatives --config java

Install Maven
==================
/usr/local create directory called maven:sudo mkdir maven
sudo cd maven
sudo wget http://www-us.apache.org/dist/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
Extract:sudo tar -xvzf apache-maven-3.5.4-bin.tar.gz





sudo wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo

sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo

sudo yum install -y apache-maven

mvn –v

Install Docker
==============
https://docs.aws.amazon.com/AmazonECS/latest/developerguide/docker-basics.html


Install Docker compose
===================
curl -L https://github.com/docker/compose/releases/download/1.9.0/docker-compose-`uname -s`-`uname -m` | sudo tee /usr/local/bin/docker-compose > /dev/null

chmod +x /usr/local/bin/docker-compose

Insstall Git
===========
sudo yum install git


***************Build Project-generate jars

Push to Docker Hub
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

sudo docker build -t nextgen-edge-service:latest .
sudo docker image tag nextgen-edge-service:latest ashoksuryap/nextgen-edge-service:latest
sudo docker login
sudo docker push ashoksuryap/nextgen-edge-service:latest


**Run below command in project root folder

sudo docker-compose up