package configs;

import java.util.ArrayList;
import java.util.List;
import models.Conversation;
import models.Message;

public class Test {
    public static void main(String[] args) {
        
        
        Database db = new Database();
        try{
            List<Message> messages = new ArrayList<>();
            Message m1 = new Message("hola 1", "5ba84a28686d3e4988a57b64");
            Message m2 = new Message("hola 1", "5ba84a28686d3e4988a57b65");
            Message m3 = new Message("hola 1", "5ba84a28686d3e4988a57b66");
            messages.add(m1);
            messages.add(m2);
            messages.add(m3);
            
            Conversation c1 = new Conversation();
            c1.setMessages(messages);
            db.getDatastore().save(c1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
