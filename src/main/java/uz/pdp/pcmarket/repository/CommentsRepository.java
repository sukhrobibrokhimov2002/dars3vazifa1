package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.Comments;
import uz.pdp.pcmarket.projection.CustomCategory;
import uz.pdp.pcmarket.projection.CustomComment;

@RepositoryRestResource(path = "comment", excerptProjection = CustomComment.class)
public interface CommentsRepository extends JpaRepository<Comments, Integer> {
}
