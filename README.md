[![CircleCI](https://circleci.com/gh/guvenbe/mssc-beer-service-BG.svg?style=svg)](https://circleci.com/gh/guvenbe/mssc-beer-service-BG)
# MSSC Beer Service

Source code in this repository is to support my online courses.

Learn more about my courses below!
* [Spring Boot Microservices with Spring Cloud](https://www.udemy.com/spring-boot-microservices-with-spring-cloud-beginner-to-guru/?couponCode=GIT_HUB2)


# Default Port Mappings - For Single Host
| Service Name | Port | 
| --------| -----|
| Brewery Beer Service | 8080 |
| [Brewery Beer Order Service](https://github.com/springframeworkguru/mssc-beer-order-service) | 8081 |
| [Brewery Beer Inventory Service](https://github.com/springframeworkguru/mssc-beer-inventory-service) | 8082 |


docker run -it  \
  -p 8161:8161 \
  -p 61616:61616 \
  vromero/activemq-artemis
  
  artemis / simetraehcapa
  
  mvn release:prepare -P ossrh
  mvn release:perform _P ossrh
  
  keytool -importcert -alias DoMySQLCert -file ca-certificate.crt -keystore truststore -storepass password

In Intellij run edit configuration
-Djavax.net.ssl.trustStore=/home/vagrant/IdeaProjects/mssc-brewery-ws/mssc-beer-inventory-service/src/main/docker/truststore
-Djavax.net.ssl.trustStorePassword=password