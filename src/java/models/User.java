
import java.io.Serializable;
import models.Role;

public class User implements Serializable {
    String email;
    String firstName;
    String lastName;
    String password;
    Role role;
}