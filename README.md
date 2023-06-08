# Pricing-Model

# Project Description

The project appears to be related to a pricing model, which likely involves calculating and retrieving pricing information for cards. It follows a RESTful architecture and is implemented in Java using the Spring framework.

# Pricing Model API

This API provides endpoints to retrieve pricing information for cards.

## Base URL

The base URL for all API endpoints is: `http://localhost:8080`

## Authentication

No authentication is required to access the endpoints.

## Endpoints

### Get Card Pricing

Retrieves the pricing information for a card.

- **Endpoint**: `GET /pricing/card`
- **Description**: This endpoint retrieves the pricing information for a card.
- **Response**:
  - **Status Code**: 200 OK
  - **Content Type**: application/json
  - **Example Response Body**:

    ```
        {
        "subscriptions": [
            {
                "type": "silver",
                "description": "Students",
                "offers": [
                    {
                        "quantity": 0,
                        "description": "200+ Custom Icons",
                        "active": true
                    },
                    {
                        "quantity": 10,
                        "description": "Custom Packs",
                        "active": true
                    }
                ]
            }
        ]
      }
      
- **Error Response**:
  - **Status Code**: 500 Internal Server Error
  - **Description**: This error response indicates that the server encountered an unexpected condition.

The error response will not contain a response body. Instead, the server will provide additional information in the response headers or logs for debugging purposes.
