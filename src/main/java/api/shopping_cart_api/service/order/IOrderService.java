package api.shopping_cart_api.service.order;

import api.shopping_cart_api.dto.OrderDto;
import api.shopping_cart_api.entity.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
