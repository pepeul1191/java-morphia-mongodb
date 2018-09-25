# MongoDB Java - Morphia

#### Consultas MongoDB:

Query si elementos existen en arreglo:

```
db.getCollection('conversations').find({
  "$and":[
    {
      members: {  
        "$in": [
          ObjectId("5ba84a28686d3e4988a57b64"),
        ]
      }
    },
    {
      members: {
        "$in": [
          ObjectId("5ba84a28686d3e4988a57b65"),
        ]
      }
    },   
  ]
})

```
```
db.system.js.save({
    _id: "echoFunction",
    value: function (usuario_id_1, usuario_id_2) {
        var doc = db.getCollection('conversations').find({
          "$and":[
            {
              members: {  
                "$in": [
                  ObjectId(usuario_id_1),
                ]
              }
            },
            {
              members: {
                "$in": [
                  ObjectId(usuario_id_2),
                ]
              }
            },   
          ]
        }).toArray();
        return doc;
    }
})
```
---

Fuentes:

+ https://stackoverflow.com/questions/24186263/how-to-create-mongodb-objectid-in-java
+ http://morphiaorg.github.io/morphia/1.3/getting-started/quick-tour/
+ https://www.javacodegeeks.com/2011/11/using-mongodb-with-morphia.html
+ https://dzone.com/articles/using-morphia-map-java-objects
+ https://stackoverflow.com/questions/42507272/java-to-mongo-document-date