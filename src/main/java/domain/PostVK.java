package domain;

import java.util.Date;

public class PostVK {
    private int idPost;
    private String nameGroup;
    private String textPost;
    private String urlArticle;
    private String imageUrl;
    private Date date;
    private Date time;

    public PostVK (int idPost, String nameGroup, String textPost, String urlArticle, String imageUrl, Date date, Date time) {
        this.idPost = idPost;
        this.nameGroup = nameGroup;
        this.textPost = textPost;
        this.urlArticle = urlArticle;
        this.imageUrl = imageUrl;
        this.date = date;
        this.time = time;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getUrlArticle() {
        return urlArticle;
    }

    public void setUrlArticle(String urlArticle) {
        this.urlArticle = urlArticle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}