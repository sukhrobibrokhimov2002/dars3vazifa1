package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.MyTeam;
import uz.pdp.pcmarket.entity.images.Attachment;

@Projection(name = "CustomTeam", types = MyTeam.class)
public interface CustomTeam {

    Integer getId();

    String getName();

    String getOccupation();

    Attachment getAttachment();
}
