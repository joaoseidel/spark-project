package me.spark.user;


import static spark.Spark.get;

public class UserController {
    public UserController(final UserService userService) {
        get("/users", (request, response) -> userService.getAllUsers(), json());

        get("/users/:user", ((request, response) -> userService.getUserByUsername(request.params(":user"))));
    }
}
