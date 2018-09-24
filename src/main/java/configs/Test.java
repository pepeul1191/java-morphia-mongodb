package configs;

import models.Message;

public class Test {
    public static void main(String[] args) {
        
        Message m1 = new Message("hola 1", "5ba84a28686d3e4988a57b64");
        Database db = new Database();
        try{
            db.getDatastore().save(m1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
