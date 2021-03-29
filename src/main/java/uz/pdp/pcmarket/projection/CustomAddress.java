package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Address;
import uz.pdp.pcmarket.entity.District;

@Projection(name = "CustomAddress", types = Address.class)
public interface CustomAddress {
    Integer getId();

    String getStreet();

    String getHomeNumber();

    District getDistrict();
}
