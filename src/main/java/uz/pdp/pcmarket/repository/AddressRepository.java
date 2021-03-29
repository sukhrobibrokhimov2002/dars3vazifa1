package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Address;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.projection.CustomAddress;
import uz.pdp.pcmarket.projection.CustomCategory;

@RepositoryRestResource(path = "address", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
