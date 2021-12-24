package org.api;

import java.sql.SQLException;

import static spark.Spark.*;

public class Api {

    public static void main(String[] args) {
//
        get("/Api", (req, res) -> "Hello World");

        get("/Api1/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        get("/say/*/to/*", (request, response) -> {
            return "Number of splat parameters: " + request.splat().length;
        });

    }
}