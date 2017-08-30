/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.exception;

/**
 *
 * @author harsh
 */

public class InternalErrorException extends RuntimeException {
    
    private static final long serialVersionUID = 1169426381288170661L;

    public InternalErrorException(String message) {
        super(message);
    }
    
    
    
    
    
}