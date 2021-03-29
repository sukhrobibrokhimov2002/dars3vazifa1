package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Supplier;

@Projection(name = "CustomSupplier", types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessageBody();

}
