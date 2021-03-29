package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Order;
import uz.pdp.pcmarket.entity.UserBasket;

import java.util.Date;

@Projection(name = "order", types = Order.class)
public interface CustomOrder {
    Integer getId();

    Date getDate();

    UserBasket getUserBasket();

    String getDetails();


}
