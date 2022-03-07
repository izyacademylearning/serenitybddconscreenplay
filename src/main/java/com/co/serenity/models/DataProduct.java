package com.co.serenity.models;

public class DataProduct {

    private String title;
    private String description;
    private String body;
    private String tag;

    public DataProduct(String title, String description, String body, String tag) {
        this.title = title;
        this.description = description;
        this.body = body;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
