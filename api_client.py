import requests
import json

def call_flights_api():
    flight = {
        "flightNumber": "4123123",
        "airline": {
            "name": "Indigo"
        },
        "departureAirport": {
            "name": "Delhi Airport",
            "city": "Delhi"
        },
        "arrivalAirport": {
            "name": "Bangalore Airport",
            "city": "Bangalore"
        }
    }
    response = requests.post("http://localhost:3000/flights", json = flight)
    print(response.status_code)
    
    resp_json = json.loads(response.text)
    print(resp_json)
    flight_id = resp_json["id"]
    seats = [
        {
            "number": "C1",
            "status": "AVAILABLE"
        },
        {
            "number": "C2",
            "status": "AVAILABLE"
        },
        {
            "number": "D1",
            "status": "AVAILABLE"
        },
        {
            "number": "D2",
            "status": "AVAILABLE"
        }
    ]
    response = requests.post("http://localhost:3000/flights/%s/seats" % flight_id, json=seats)
    print(response.status_code)
    print(response.text)

call_flights_api()