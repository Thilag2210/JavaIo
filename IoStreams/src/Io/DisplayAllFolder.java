package Io;
import java.io.File;
public class DisplayAllFolder {

	public static void main(String[] args) {
		File f=new File("F:");
		String[] listoffolders=f.list();
		for(String s:listoffolders) {
			System.out.println(s);
		}
	}

}
