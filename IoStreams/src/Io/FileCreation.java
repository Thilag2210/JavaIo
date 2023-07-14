package Io;
import java.io.File;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh\\squad.txt");
		File f1=new File("F:\\Wolfdinesh\\squad1.txt");
		
			try {
		f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


