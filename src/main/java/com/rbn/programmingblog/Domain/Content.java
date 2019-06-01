package com.rbn.programmingblog.Domain;


import javax.persistence.*;

@Entity
@Table(name="content")
public class Content {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="content_id")
    private Integer contentId;

    private String title;

    private String details;

    private String category;

    @Column(name="sub_category")
    private String subCategory;

    private String author;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
