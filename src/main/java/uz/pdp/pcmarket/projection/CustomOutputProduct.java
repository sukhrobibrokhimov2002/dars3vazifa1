package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.OutputProduct;
import uz.pdp.pcmarket.entity.Product;

@Projection(name = "CustomOutputProduct", types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProduct();

    Integer getAmount();

}
