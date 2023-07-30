import requests
import json

def call_products_api():
    #read
    response = requests.get("http://localhost:5000/products/3")
    print(response.status_code)
    print(response.text)

    #create
    product = {
        'name': 'Product 3',
        'price': 100.99
    }

    response = requests.post("http://localhost:5000/products", json = product)
    print(response.status_code)
    print(response.text)


    #update
    response = requests.put("http://localhost:5000/products/2", json=product)
    print(response.status_code)
    print(response.text)

    #delete
    response = requests.delete("http://localhost:5000/products/2")
    print(response.status_code)
    print(response.text)


if __name__ == "__main__":
    call_products_api()