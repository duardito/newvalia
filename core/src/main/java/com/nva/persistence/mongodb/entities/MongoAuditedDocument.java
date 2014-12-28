package com.nva.persistence.mongodb.entities;

import org.springframework.data.annotation.Transient;

/**
 * Created by edu on 07/12/2014.
 */
public class MongoAuditedDocument extends MongoDocument{

    @Transient
    private long modifiedDate;

    @Transient
    private int version;

    public long getModifiedDate() {
        return modifiedDate;
    }
    public void setModifiedDate(long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
}
