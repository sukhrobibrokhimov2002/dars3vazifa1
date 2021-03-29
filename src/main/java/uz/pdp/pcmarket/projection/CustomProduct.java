package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.Characteristics;
import uz.pdp.pcmarket.entity.Product;

@Projection(name = "Product", types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getModel();

    String getDescription();

    String getPrice();

    Category getCategory();

    boolean getActive();

    Characteristics getCharacteristics();
}
