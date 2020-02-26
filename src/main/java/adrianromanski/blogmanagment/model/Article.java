package adrianromanski.blogmanagment.model;

import lombok.Data;
import org.elasticsearch.client.security.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;


@Document(indexName = "blog_article", type = "article")
@Data
public class Article {

    @Id
    private String id;

    private String title;
    private String link;
    private String summary;
    private String body;

    @Field(type = FieldType.Nested)
    private User author;

    @Field(type = FieldType.Date)
    private Date createdDate = new Date();
}