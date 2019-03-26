import static spark.Spark.port;

import me.spark.user.UserController;
import me.spark.user.UserService;

public class HelloWorld {
    public static void main(String[] args) {
        port(4567);

        new UserController(new UserService());
    }
}
