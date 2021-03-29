package uz.pdp.pcmarket.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Category;

@Projection(name = "customCategory", types = Category.class)
public interface CustomCategory {

    Integer getId();

    public String getNameUz();

    public String getNameRu();

    public String getNameEng();


    //    @Value("#{target.category.id}")
    Category getParentCategory();
}
