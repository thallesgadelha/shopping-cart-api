package api.shopping_cart_api.request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String email;
    private String password;
}