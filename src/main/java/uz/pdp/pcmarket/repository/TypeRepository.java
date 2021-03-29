package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Supplier;
import uz.pdp.pcmarket.entity.Type;
import uz.pdp.pcmarket.projection.CustomSupplier;
import uz.pdp.pcmarket.projection.CustomType;

@RepositoryRestResource(path = "type", excerptProjection = CustomType.class)
public interface TypeRepository extends JpaRepository<Type, Integer> {
}
