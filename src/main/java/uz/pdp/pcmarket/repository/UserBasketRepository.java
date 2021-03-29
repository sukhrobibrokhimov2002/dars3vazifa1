package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.UserBasket;
import uz.pdp.pcmarket.projection.CustomCategory;
import uz.pdp.pcmarket.projection.CustomUserBasket;

@RepositoryRestResource(path = "userBasket", excerptProjection = CustomUserBasket.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {
}
