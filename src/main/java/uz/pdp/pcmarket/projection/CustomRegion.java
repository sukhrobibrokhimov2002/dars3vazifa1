package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Region;

@Projection(name = "customRegion", types = Region.class)
public interface CustomRegion {

    public Integer getId();
    public String getName();
}
