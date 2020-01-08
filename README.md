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

curl http://localhost:8080/person/2

<br>
curl -d '{ "message": "DANIEL"}' -H "Content-Type: application/json" -X PUT localhost:8080/message

# build docker

docker-compose build
docker-compose up
