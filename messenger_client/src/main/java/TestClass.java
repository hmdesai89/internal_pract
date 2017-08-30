
import com.examples.messenger.client.MessageClientImpl;
import com.examples.messenger.client.RestClient;
import com.examples.messenger.client.model.Message;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class TestClass {
    
    public static void main(String[] args) {
        Message message = new Message(5l, "Trying Client", "Harsh");
        MessageClientImpl mci  = new MessageClientImpl();
        mci.post(message);
        Message newMessage = (Message) mci.get("2");
        List<Message> messages = mci.getAll();
        for(Message ms : messages) {
            System.out.println(ms.getAuthor());
        
        }
        
    }
    
}
