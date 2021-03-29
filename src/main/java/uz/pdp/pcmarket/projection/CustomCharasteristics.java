package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Characteristics;

import java.util.List;

@Projection(name = "CustomCharasteristics", types = Characteristics.class)
public interface CustomCharasteristics {
    Integer getId();

    String getValue();

    List getTypes();
}
