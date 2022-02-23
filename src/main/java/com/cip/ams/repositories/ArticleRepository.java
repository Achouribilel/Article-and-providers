package com.cip.ams.repositories;

//import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cip.ams.entities.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
