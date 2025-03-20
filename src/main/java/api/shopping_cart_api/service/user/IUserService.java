package api.shopping_cart_api.service.user;

import api.shopping_cart_api.dto.UserDto;
import api.shopping_cart_api.entity.User;
import api.shopping_cart_api.request.CreateUserRequest;
import api.shopping_cart_api.request.UpdateUserRequest;

public interface IUserService {
    User createUser(CreateUserRequest request);

    User updateUser(UpdateUserRequest request, Long userId);

    User getUserById(Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
