package com.hc.model;


import javax.persistence.*;

@Entity
public class Tree {
    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String pid;

    @Column
    private String text;

    @Column
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
