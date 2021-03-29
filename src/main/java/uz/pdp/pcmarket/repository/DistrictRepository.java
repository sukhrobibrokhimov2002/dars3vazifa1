package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.District;
import uz.pdp.pcmarket.projection.CustomCategory;
import uz.pdp.pcmarket.projection.CustomDistrict;

@RepositoryRestResource(path = "district", excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
