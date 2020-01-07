# rest-java-spring-boot

Java11
Postgresql
Rest
Flyway
TravisCI
Swagger

# execute

gradle clean bootRun

# teste curl

curl localhost:8080/api/message 
<br>
curl -d '{ "message": "DANIEL"}' -H "Content-Type: application/json" -X PUT localhost:8080/api/message

# docker

docker-compose build
