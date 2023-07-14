package Io;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class BufferedWriterBufferedReader {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh\\squad.txt");
		try {
			f.createNewFile();
			FileWriter f1=new FileWriter(f);
			BufferedWriter b1=new BufferedWriter(f1);
			b1.write("i am here");
			b1.newLine();
			b1.write("varatta");
			b1.flush();
			b1.close();
			FileReader f2=new FileReader(f);
			BufferedReader b2=new BufferedReader(f2);
			String a=b2.readLine();
			while(a!=null) {
				System.out.println(a);
				 a=b2.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
