package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Characteristics;
import uz.pdp.pcmarket.projection.CustomCharasteristics;

@RepositoryRestResource(path = "charasteristics", excerptProjection = CustomCharasteristics.class)
public interface CharasteristicsRepository extends JpaRepository<Characteristics, Integer> {

}
