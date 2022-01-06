import java.io.*;

class Recieve2{
	public static Object deserializeFromFile(String filename)
	{
		Object obj = new Object();
		
		try{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			System.out.println("Deserializing from " + filename);
			obj = in.readObject();
			
			in.close();
			file.close();
		}catch(Exception e){
			System.out.println("Exception: " + e.toString());
		}
		
		return obj;
	}
	
	public static void main(String args[]){
		String file = "s1.ser";
		
		SentObject s1 = (SentObject)deserializeFromFile(file);
	}
}