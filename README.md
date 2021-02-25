<<<<<<< HEAD
# Spring Cloud 分布式微服务开发Demo

#### 介绍
入门级别的分布式微服务实现- Spring Cloud Eureka

#### 软件架构
#### 使用说明

拉取源代码下来，修改register-server模块下application.yml的配置端口(默认为8800)；修改provider模块下的application.yml配置的端口（默认9001）；修改consumer模块下的application.yml配置的端口（默认10010）；


**#### To build####** 

mvn clean package -Dmaven.test.skip=true

 **#### Dockerfile build####** 

docker build -t register-server:0.2 .

docker build -t provider:0.2 .

docker build -t consumer:0.2 .

 **### To run **#####
 
docker run --name register-server -d -p 8800:8800 --net=host register-server:0.2

docker run --name provider -d -p 9001:9001 --net=host provider:0.2

docker run --name consumer -d -p 10010:10010 --net=host consumer:0.2


**#### To kubernetes** 

kubectl apply -f register-server.yaml

kubectl apply -f provider.yaml

kubectl apply -f consumer.yaml

