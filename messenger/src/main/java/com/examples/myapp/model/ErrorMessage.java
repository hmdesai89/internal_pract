/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ErrorMessage {

    private String errorMessage;
    private int errorCode;
    private String document;
    

    public ErrorMessage() {

    }
    
    public ErrorMessage(String errorMessage, int errorCode, String document) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.document = document;
    }
    
        public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    
    
    
}
