package me.spark;

import me.spark.authentication.AuthenticationDetails;
import me.spark.authentication.BasicAuthenticationFilter;
import me.spark.user.UserController;

import static spark.Spark.before;
import static spark.Spark.port;

public class HelloWorld {
    public static void main(String[] args) {
        port(4567);

        before(
                new BasicAuthenticationFilter("/path/*",
                        new AuthenticationDetails("expected-username", "expected-password"))
        );


        UserController userController = new UserController();
    }

}