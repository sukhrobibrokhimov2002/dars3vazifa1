package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Type;

@Projection(name = "CustomType", types = Type.class)
public interface CustomType {
    Integer getId();

    String getName();

}
