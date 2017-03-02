package com.wyb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wyb on 2017/2/25.
 */
@Entity
@Table(name = "pointcaptial")
public class Captial {
    @Id
    @Column(name = "gid")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "pinyin")
    private String pinyin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
