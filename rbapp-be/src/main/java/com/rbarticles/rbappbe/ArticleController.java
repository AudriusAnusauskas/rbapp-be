package com.rbarticles.rbappbe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @GetMapping
    public ResponseEntity<List<Article>> getAllArticles(){
        return new ResponseEntity<List<Article>>(articleService.allArticles(), HttpStatus.OK) ;
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<Optional<Article>> getSingleArticle(@PathVariable Integer articleId){
        return new ResponseEntity<Optional<Article>>(articleService.singleArticle(articleId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Article> postArticle(@RequestBody Article article){
        return new ResponseEntity<Article>(articleService.postArticle(
                article.getArticleId(),
                article.getTitle(),
                article.getPublicationTitle(),
                article.getLocation(),
                article.getYear(),
                article.getUrl(),
                article.getImgUrl(),
                article.getText(),
                article.getPhotoAuthor()
                ), HttpStatus.CREATED);
    }
}
