import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
	 File file = new File("/home/kajalshahanemph/temp/simplilearn1.txt");
	
	 if(file.createNewFile()) {
		 System.out.println("Files created sucessfully");
	 }else {
		 System.out.println("File is already exist");
	 }
	 String data = "Hello Kajal.....";
	 Files.write(Paths.get("/home/kajalshahanemph/temp/simplilearn1.txt"),data.getBytes());
	 System.out.println("Files written Sucessfully");
	 FileWriter writer = new FileWriter(file);
	    writer.append(data);
		writer.append(data);
		writer.append(data);
		writer.close();
		System.out.println("File Append Operation Done Successfully");
		BufferedReader reader = new BufferedReader(new FileReader("/home/kajalshahanemph/temp/simplilearn1.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		System.out.println("Fiile Readed Successfully");	
	}
}




