package com.nva.persistence.mongodb.entities.users;

import com.nva.persistence.mongodb.entities.MongoAuditedDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by edu on 14/12/2014.
 */
@Document(collection="users")
public class User extends MongoAuditedDocument {

    private String password;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
