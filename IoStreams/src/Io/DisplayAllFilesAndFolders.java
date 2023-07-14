package Io;
import java.io.File;
public class DisplayAllFilesAndFolders {

	public static void main(String[] args) {
		File f=new File("F:");
		File[] filefolderlist=f.listFiles();
		for(File F:filefolderlist) {
			System.out.println(F);
		}
	}

}
