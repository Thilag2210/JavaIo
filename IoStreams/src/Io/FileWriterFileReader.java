package Io;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;

public class FileWriterFileReader {

	public static void main(String[] args) {
	File f=new File("F:\\Wolfdinesh\\squad.txt");

	try {
		f.createNewFile();
		FileWriter f1=new FileWriter(f);
		f1.write("Thilagaraj");
		f1.flush();
		f1.close();
		FileReader f2=new FileReader(f);
		int a=f2.read();
		while(a!=-1) {
			System.out.print((char)a);
			a=f2.read();
		}

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
