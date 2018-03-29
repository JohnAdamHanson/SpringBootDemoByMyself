package com.jqzhu.entity;

import lombok.Data;

/**
 * Created by zhujq18 on 2018/3/28.
 */

@Data
public class LearnResource {
    private String author;
    private String title;
    private String url;

    public LearnResource(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
