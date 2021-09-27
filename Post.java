package com.company;

public class Post {
    private String namePost;
    private String definition;
    private String url;

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Post(String namePost, String definition, String url) {
        this.namePost = namePost;
        this.definition = definition;
        this.url = url;
    }
}
