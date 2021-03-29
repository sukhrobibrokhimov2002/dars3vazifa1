package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.UserBasket;

import java.util.List;

@Projection(name = "CustomUserBasket", types = UserBasket.class)
public interface CustomUserBasket {
    Integer getId();

    List getOutputProduct();

}
