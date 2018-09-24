package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("messages")
public class Message {
    @Id 
    private ObjectId id;
    private String content;
    private ObjectId usuarioId;

    public Message(String content, String usuarioId) {
        this.content = content;
        this.usuarioId = new ObjectId(usuarioId);
    }    
}
