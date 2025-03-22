package api.shopping_cart_api.service.cart;

import api.shopping_cart_api.entity.Cart;
import api.shopping_cart_api.entity.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
