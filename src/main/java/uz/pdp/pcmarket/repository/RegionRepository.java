package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Region;
import uz.pdp.pcmarket.projection.CustomRegion;

@RepositoryRestResource(path = "region", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
