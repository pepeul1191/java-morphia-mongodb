package configs;

import com.mongodb.BasicDBList;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.List;
import models.Conversation;
import models.Message;
import org.bson.types.ObjectId;
import org.mongodb.morphia.query.Query;

public class Gestion {
    public void insertarDocumentoSimple(){
        Database db = new Database();
        try{
            Message m1 = new Message("hola 1", "5ba84a28686d3e4988a57b64");
            db.getDatastore().save(m1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertarDocumentoEmdebido(){
        Database db = new Database();
        try{
            // create messages
            List<Message> messages = new ArrayList<>();
            Message m1 = new Message("hola 1", "5ba84a28686d3e4988a57b64");
            Message m2 = new Message("hola 1", "5ba84a28686d3e4988a57b65");
            Message m3 = new Message("hola 1", "5ba84a28686d3e4988a57b66");
            messages.add(m1);
            messages.add(m2);
            messages.add(m3);
            // create members
            List<ObjectId> members = new ArrayList<>();
            ObjectId mb1 = new ObjectId("5ba84a28686d3e4988a57b64");
            ObjectId mb2 = new ObjectId("5ba84a28686d3e4988a57b65");
            members.add(mb1);
            members.add(mb2);
            //crear convesación
            Conversation c1 = new Conversation();
            c1.setMessages(messages);
            c1.setMembers(members);
            c1.setCreated();
            db.getDatastore().save(c1);
            System.out.println("_id generado");
            System.out.println(c1.getId().toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void consultaFuncion(){
        Database db = new Database();
        try{
            BasicDBList myCursor = (BasicDBList) db.getDatastore().getDB().eval("getConversacionFunction('5ba84a28686d3e4988a57b64', '5ba84a28686d3e4988a57b65')");
            System.out.println("1 +++++++++++++++++++++++++++++++++");
            System.out.println(myCursor.size());
            System.out.println("2 +++++++++++++++++++++++++++++++++");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
