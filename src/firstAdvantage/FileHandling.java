package firstAdvantage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		String fileName="sample.txt";
		String data="Hello, this is a sample text message";
		
		try {
			File file=new File(fileName);
			if(file.createNewFile()) {
				System.out.println("File created"+file.getName());
			}else {
				System.out.println("File already exist");
			}
			
			FileWriter writer =new FileWriter(file);
			writer.write(data);
            writer.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e){
            System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
		
		try {
			FileReader reader=new FileReader(fileName);
			BufferedReader bufferReader=new BufferedReader(reader);
			String line;
			
			 System.out.println("\nContents of the file:");
			while((line=bufferReader.readLine()) != null) {
				System.out.println(line);
			} 
			
            bufferReader.close();

		}
		catch(FileNotFoundException e){
			System.out.println("File not Found");
            e.printStackTrace();

		}
		catch(IOException e){
			System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
		}
	}

}
