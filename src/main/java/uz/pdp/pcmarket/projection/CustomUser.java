package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Address;
import uz.pdp.pcmarket.entity.User;

@Projection(name = "CustomUser", types = User.class)
public interface CustomUser {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();
}
