# uaplanes 

## Rest API test app

### Paths and requests:
HTTP METHOD  |  PATH  |  DESCRIPTION
* GET - `/api/flights` - List all flights.
* GET - `/api/flights/{id}` - Get flight by ID.
* POST - `/api/flights/add` - Add flight. Information about flight should be supplied in JSON body. 
* DELETE - `/api/flights/{id}` - Delete flight by ID.


POST body example:
```
{
"id": 2,
"flightNumber": 123,
"price": 13.7,
"creationDate": "21.12.22 - 16:02",
"arrival": "Stockholm",
"departure": "Brazil",
"departureDateTime": "23.12.22 - 22:30",
"arrivalDateTime": "24.12.22 - 10:00"
}
```

Postman collection is also included.