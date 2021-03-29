package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Order;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.projection.CustomOrder;
import uz.pdp.pcmarket.projection.CustomProduct;

@RepositoryRestResource(path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
