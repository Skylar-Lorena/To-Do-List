package org.project;

import static spark.Spark.staticFileLocation;

public class App { //responsible for the front-end user interface of the application.
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";    }
}