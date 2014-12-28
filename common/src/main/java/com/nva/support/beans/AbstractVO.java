package com.nva.support.beans;

/**
 * Created by edu on 07/12/2014.
 */
public class AbstractVO {

    private String id;
    private String name;
    private String urlName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }
}
