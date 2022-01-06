import java.io.*;

public class SentObject implements Serializable{
	public String key;
	
	private void readObject(ObjectInputStream in){
		try{
			in.defaultReadObject();
			System.out.println("key readObject");
		}catch(Exception e){
			System.out.println("Error: " + e.toString());
		}
	}
}