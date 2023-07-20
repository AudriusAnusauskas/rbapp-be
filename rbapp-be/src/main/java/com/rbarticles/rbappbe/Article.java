package com.rbarticles.rbappbe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "articles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    private ObjectId id;
    private Integer articleId;
    private String title;
    private String publicationTitle;
    private String location;
    private String year;
    private String url;
    private String imgUrl;
    private  String text;
    private String photoAuthor;

}
