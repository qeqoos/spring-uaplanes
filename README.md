# uaplanes 

## Rest API test app

### Prerequisites

For local development:
* Java 17
* Running instance of PostgreSQL database

For launching in container:
* Docker and docker-compose

### Project structure

* `src` - all of the app sources (code, resources, configs)
* `sql` - scripts for provisioning DB structure and filling it with sample data
* `gradle` folder and all `gradle*` files - related to build of the app
* `Dockerfile` - contains instructions for containerizing the app
* `docker-compose.yml` - config for launching app container alongside with PostgreSQL database. DB data is persisted using volumes. You can configure all env variables for each container 
* `uaplanes_postman_collection.json` - import this file into Postman, and you'll get all the possible API requests

### Installation

Build project by using `./gradlew build`. For local testing, launch `.jar` file located in `build/libs/`.
Following environment variables are required:

* DB_HOST
* DB_NAME
* DB_USERNAME
* DB_PASSWORD

### Containerization

Run `docker build -f Dockerfile -t <image_name>:<iamge_tag> .` (don't forget dot at the end).

Run `docker compose up -d` to launch DB and freshly containerized app.

Connect to DB using IntelliJ Idea and launch scripts from `sql`
 folder.

Go to `localhost:8080` to check the availability of the app.

Inspect logs with `docker logs <container_name>`.

### Paths and requests:
HTTP METHOD  |  PATH  |  DESCRIPTION
* GET - `/api/flights` - List all flights.
* GET - `/api/flights/{id}` - Get flight by ID.
* POST - `/api/flights/add` - Add flight. Information about flight should be supplied in JSON body. 
* DELETE - `/api/flights/{id}` - Delete flight by ID.


POST body example:
```
{
    "flight_number": 123,
    "price": 13.7,
    "created_at": "2023-11-19T17:03:05+02",
    "arrival_city_id": "3",
    "departure_city_id": "2",
    "departure_time": "2023-11-23T21:23:54+02",
    "arrival_time": "2023-11-24T05:23:54+02"
}
```

Postman collection is included, check it out for more requests.