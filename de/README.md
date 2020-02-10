# SmsDigital

SmsDigital coding challenge backend

Build project

```sh
$ ./gradlew build
```

Projekt ausführen

```sh
$ ./gradlew bootRun
```

Führen Sie Tests aus

```sh
$ ./gradlew test
```

Testbericht @ `build/reports/tests/test`

Docker-Image erstellen

```sh
$ ./gradlew docker
```

Endpunkte

- curl -X GET http: // localhost: 8080 / hotel
- curl -X GET http: // localhost: 8080 / hotel /: id
- curl -X POST http: // localhost: 8080 / hotel -H 'Inhaltstyp: application / json' -d '{"id" 10101, "city": "2", "start_date": "05/08 / 2013 "," end_date ":" 5/18/2013 "," price ":" 55.82 "," status ":" selten "," color ":" # fd4e19 "} '
