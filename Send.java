import java.io.*;

class Send{
	public static void serializeToFile(Object SentObject, String filename){
		try{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			System.out.println("Serialized " + SentObject.toString() + " to " + filename);
			out.writeObject(SentObject);
			
			out.close();
			file.close();
		}catch(Exception e){
			System.out.println("Error: " + e.toString());
		}
	}
	public static void main(String args[]){
		SentObject s1 = new SentObject();

		s1.key = "THREAD";
		
		String file = "s1.ser";
		
		serializeToFile(s1, file);
	}
}