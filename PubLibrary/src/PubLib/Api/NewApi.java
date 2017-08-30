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
public class NewApi implements API {
    
    
    ORM myORM ;
    
    public NewApi(ORM newORM) {
        myORM = newORM;
    }
    
    public Book checkForBook(int ISBN) {
        Book b ;
        return myORM.get(ISBN);
        //return b;
    }

    @Override
    public void insertBook(Book book) {
        System.out.println("Added book. New Count : "+ book.getCount() );
        Book b = checkForBook(book.getISBN());
        if (b == null) {
            //book.setCount(1);
            System.out.println("Added book. New Count : "+ book.getCount() );
            myORM.put(book);  
            System.out.println("Added book. New Count : "+ book.getCount() );
        } else {
            int count = b.getCount();
            b.setCount(count++);
            myORM.put(b);
            System.out.println("Incresed count. New Count : "+ b.getCount());
            
        }
    }

    @Override
    public Book searchBook(String tag, String tagValue) {
        if (tag == "code" ) {
            return searchBook("code", tagValue);
        } else if (tag == "Author"){
            return searchBook("code", tagValue);
        } //else {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //}
        return null;
        
    }

    @Override
    public Book updateBook(String tag,String tagValue ) {
        if (tag == "code" ) {
            return searchBook("code", tagValue);
        } else if (tag == "Author"){
            return searchBook("code", tagValue);
        } //else {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //}
        return null;
    }

    @Override
    public void deleteBook(int ISBN) {
        Book b = checkForBook(ISBN);
        int count  = b.getCount();
        if (b != null) {
            if (count > 1) {                
                b.setCount(count --);
                myORM.put(b);
                System.out.println("Decreased count. New Count : "+ b.getCount());
                return;

            }
            myORM.delete(b);
            System.out.println("Deleted book : "+ b.getName());
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
