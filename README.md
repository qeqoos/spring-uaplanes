# uaplanes 

## Rest API test app

### Prerequisites

For local development:
* Java 17
* Running instance of PostgreSQL database

For launching in container:
* Docker
* Minikube

### Project structure

* `src` - all of the app sources (code, resources, configs)
* `sql` - scripts for provisioning DB structure and filling it with sample data
* `gradle` folder and all `gradle*` files - related to build of the app
* `Dockerfile` - contains instructions for containerizing the app
* `k8s` - manifests for launching app container. RDS endpoint is used for connection to DB. You can configure all env variables for each container. 
* `uaplanes_postman_collection.json` - import this file into Postman, and you'll get all the possible API requests

### Installation

Build project by using `./gradlew build -x test`. For local testing, launch `.jar` file located in `build/libs/`.
Following environment variables are required:

* DB_HOST
* DB_NAME
* DB_USERNAME
* DB_PASSWORD

### Install Minikube

Get the official docs, download script and launch it. Then do `minikube start`.

### Containerization

Run `docker build -f Dockerfile -t <image_name>:<image_tag> .` (don't forget dot at the end).

### Kubernetes

Run `minikube image load <image_name>:<image_tag>` to allow Minikube to use our local image.

Edit `rds-externalname.yaml` with you database endpoint. Apply the manifest.

Run `minikube kubectl -- apply -f k8s/app-deployment.yaml` to launch app.

Run `minikube kubectl -- apply -f k8s/app-service.yaml` to expose app on given NodePort (30080).

Run `minikube service uaplanes --url` to allow access to app from local machine.

Go to the given URL to check the availability of the app.

Get pods with `minikube kubectl -- get pods`.

Inspect logs with `minikube kubectl -- logs <pod_name>`

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