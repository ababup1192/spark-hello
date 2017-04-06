package org.ababup1192;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        // access to http://localhost:4567/hello in browser
        get("/hello", (req, res) -> "Hello World");
    }
}
