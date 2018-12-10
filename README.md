# SmsDigital
SmsDigital coding challenge backend

Build project 

```sh
$ ./gradlew build
```

Run project

```sh
$ ./gradlew bootRun
```

Run Tests

```sh
$ ./gradlew test
```
Test report @ ``build/reports/tests/test``

Build docker image

```sh
$ ./gradlew docker
```

Endpoints

- curl -X GET http://localhost:8080/hotel
- curl -X GET http://localhost:8080/hotel/:id
- curl -X POST http://localhost:8080/hotel  -H 'Content-Type: application/json' 
-d'{"id"10101,"city":"2","start_date":"05/08/2013","end_date":"5/18/2013","price":"55.82","status":"Seldom","color":"#fd4e19"}'
