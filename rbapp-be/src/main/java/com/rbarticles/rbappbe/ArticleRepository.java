package com.rbarticles.rbappbe;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends MongoRepository<Article, ObjectId> {
    Optional<Article> getArticleByArticleId(Integer articleId);
}
