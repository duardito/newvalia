package com.nva.persistence.mongodb.entities.logger;

import com.nva.persistence.mongodb.entities.MongoAuditedDocument;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by edu on 30/12/2014.
 */
@Document(collection="logs")
public class Log extends MongoAuditedDocument {

    private Date date;

    @Field(value="message")
    private String errorMessage;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
