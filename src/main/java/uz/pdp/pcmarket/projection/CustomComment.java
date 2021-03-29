package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Comments;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.entity.User;

@Projection(name = "CustomComment", types = Comments.class)
public interface CustomComment {

    Integer getId();

    String getBody();

    User getUser();

    Product getProduct();

    Integer getNumberStar();

}
