package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Address;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.projection.CustomAddress;
import uz.pdp.pcmarket.projection.CustomArticle;

@RepositoryRestResource(path = "article", excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
