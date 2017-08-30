/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubLib.Api;


/**
 *
 * @author harsh
 */
public interface API {
    
    public void insertBook(Book book);
    public Book searchBook(String tag, String tagValue);
    public Book updateBook(int  ISBN,String tag,String tagValue);
    public void deleteBook(int ISBN);
}


