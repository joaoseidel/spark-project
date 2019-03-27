package me.spark;

import me.spark.user.UserController;

import static spark.Spark.port;

public class HelloWorld {
    public static void main(String[] args) {
        port(4567);

        UserController userController = new UserController();
    }

}