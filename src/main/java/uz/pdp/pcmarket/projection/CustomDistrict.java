package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.District;
import uz.pdp.pcmarket.entity.Region;

@Projection(name = "CustomDistrict", types = District.class)
public interface CustomDistrict {

    Integer getId();
    String getName();
    Region getRegion();
}
