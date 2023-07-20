package com.rbarticles.rbappbe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> allArticles(){
        return articleRepository.findAll();
    }

    public Optional<Article> singleArticle (Integer articleId){
        return articleRepository.getArticleByArticleId(articleId);
    }
}
