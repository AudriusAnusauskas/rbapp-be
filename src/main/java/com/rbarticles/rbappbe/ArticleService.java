package com.rbarticles.rbappbe;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> allArticles(){
        return articleRepository.findAll();
    }

    public Optional<Article> singleArticle (Integer articleId){
        return articleRepository.getArticleByArticleId(articleId);
    }

    public Article postArticle( Integer articleId, String title, String publicationTitle, String location, String year, String url, String imgUrl, String text, String photoAuthor){
        Article article = articleRepository.insert( new Article(articleId, title, publicationTitle, location, year, url, imgUrl, text, photoAuthor));

        return article;
    }
}
