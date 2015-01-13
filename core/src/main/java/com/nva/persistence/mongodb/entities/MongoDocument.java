package com.nva.persistence.mongodb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by edu on 07/12/2014.
 */
public class MongoDocument implements java.io.Serializable{
    @Id
    private String id;

    /**
     * name of template, must be unique
     */
    @Field(value="name")
    private String name;

    @Field(value="url")
    private String urlName;

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
