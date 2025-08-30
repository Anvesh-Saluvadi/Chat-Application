Real-Time Chat Application
Overview

This is a real-time chat application that enables multiple users to send and receive messages instantly. The system stores messages in a MySQL database and provides a responsive user interface, showing messages from the sender on one side and messages from the receiver on the other for clarity. It’s designed for seamless user interaction and modern UI experience.

Features

Real-time messaging using WebSocket

Message history stored in MySQL database

Responsive chat interface with distinct sender/receiver alignment

Modern UI design with color-coded messages

Timestamp displayed for each message

Technologies

Backend: Java, Spring Boot

Frontend: HTML, CSS, JavaScript

Database: MySQL

Real-Time Communication: WebSocket

Installation

Clone the repository:

git clone <repository-url>


Navigate to the project directory:

cd ChatApp


Configure MySQL connection in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/chatdb
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update


Build the project using Maven:

mvn clean install


Run the application:

mvn spring-boot:run

Usage

Open your browser and navigate to: http://localhost:8080/chat.html

Enter a username and type your message in the input box

Messages will appear in real-time; sender messages on the right, receiver messages on the left

Scroll to view previous messages from the chat history
