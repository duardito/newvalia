package com.nva.support.beans.logger;

import com.nva.support.beans.AbstractVO;

import java.util.Date;

/**
 * Created by edu on 30/12/2014.
 */
public class LogVO extends AbstractVO {

    private Date date;

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
