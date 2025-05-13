# Java TCP Client-Server String Manipulation

## Project Objective

The goal of this assignment is to implement a simple TCP client and server application using Java. The client will send a string to the server, and the server will process this string by:
1.  Reversing all the characters in the string.
2.  Reversing the capitalization of each character in the string.
The modified string is then sent back to the client, which displays it. Both the client and server will exit after one such transaction.

## Features

*   **TCP/IP Communication:** Client and server communicate over a TCP socket connection.
*   **String Transmission:** Client sends a string (up to 80 characters) to the server.
*   **Server-Side Processing:**
    *   Reverses the order of characters in the received string.
    *   Inverts the case of each character (lowercase to uppercase, uppercase to lowercase).
*   **Response to Client:** Server sends the processed string back to the client.
*   **Client Display:** Client displays the string received from the server.
*   **Single Transaction:** Both client and server are designed to handle one string transmission and then exit.

## Prerequisites

*   Java Development Kit (JDK) installed (e.g., JDK 8 or later).

## Files Included

*   `Server.java` (or your chosen server class name): Contains the TCP server implementation.
*   `Client.java` (or your chosen client class name): Contains the TCP client implementation.

## Compilation

To compile the Java source files, navigate to the directory containing the `.java` files and run the following command in your terminal:

```bash
javac Server.java Client.java
