import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class JavaMongoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{  
			//   Make a Connection
			
			//explicitly specify the hostname and the port
			
			MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
			 MongoClient mongoClient = new MongoClient(connectionString);
			 
			 MongoDatabase database = mongoClient.getDatabase("school"); //school db name
			 
			 MongoCollection<Document> collection = database.getCollection("students"); //collections details
			
			 //insert data into Documents
			 //==========================================================================================
			 
			/* Document doc = new Document("name", "MongoDB")
		                .append("type", "database")
		                .append("count", 1)
		                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
		                .append("info", new Document("x", 203).append("y", 102));*/
			 
			/* Document doc = new Document("StudentNo", "10")
             .append("FirstName", "Mukesh Kumar")
             .append("LastNmae", "Yadav")
             .append("Age", "27");
			 
			 collection.insertOne(doc);*/
			 
			 //=========================================================================================================
			 //===================Find Data================================================
			/* Document myDoc = collection.find().first(); //get first Data
			 System.out.println(myDoc.toJson());*/
			 
			 //Get all data (FinadAll)
			/* MongoCursor<Document> cursor = collection.find().iterator();
			 try {
			     while (cursor.hasNext()) {
			         System.out.println(cursor.next().toJson());
			     }
			 } finally {
			     cursor.close();
			 }*/
			 
			/* for (Document cur : collection.find()) {
				    System.out.println(cur.toJson());
				}*/
			
			 //-------------get single data according to id------------------
			/* Document myDoc = collection.find(eq("StudentNo","10")).first();
			 System.out.println(myDoc.toJson());*/
			 
			 Block<Document> printBlock = new Block<Document>() {
			     @Override
			     public void apply(final Document document) {
			         System.out.println(document.toJson());
			     }
			};

			collection.find(gt("StudentNo","1")).forEach(printBlock);
			 
			
			}catch(Exception e){  
			System.out.println(e);  
			}  
		
		

	}

}
