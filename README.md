# paymentService

`paymentService` is a Spring Boot application designed to handle payment processing using various payment gateways, including Stripe. This project demonstrates how to integrate Stripe for creating payment links and managing transactions.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- Create payment links using Stripe
- Handle payment transactions
- RESTful API for payment operations

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher
- Stripe account and API key

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/TanKoth/paymentService.git
    cd paymentService
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Configuration

1. Create an `application.properties` file in the `src/main/resources` directory.

2. Add your Stripe API key to the `application.properties` file:
    ```properties
    STRIPE_API_KEY=your_stripe_api_key_here
    ```

## Usage

1. Run the application:
    ```sh
    mvn spring-boot:run
    ```

2. The application will start on `http://localhost:8080`.

## Endpoints

### Create Payment Link

- **URL:** `/payments`
- **Method:** `POST`
- **Request Body:**
    ```json
    {
        "orderId": 12345
    }
    ```
- **Response:**
    ```json
    {
        "url": "https://checkout.stripe.com/pay/cs_test_a1b2c3d4e5"
    }
    ```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
