/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.messenger.client;

import java.util.List;

/**
 *
 * @author harsh
 */
public interface IGenericClient <E>{
    
    E get(String id);
    void put(E entity);
    void post(E entity);
    void delete(E entity);
    List<E> getAll();
}
