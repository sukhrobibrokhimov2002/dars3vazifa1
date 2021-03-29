package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.MyTeam;
import uz.pdp.pcmarket.projection.CustomArticle;
import uz.pdp.pcmarket.projection.CustomTeam;

@RepositoryRestResource(path = "myTeam", excerptProjection = CustomTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {
}
