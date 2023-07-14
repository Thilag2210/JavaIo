package Io;
import java.io.File;
public class FolderCreation {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh");
boolean present=f.exists();
System.out.println(present);
if(present==false) {
	f.mkdir();
	present=f.exists();
	System.out.println(present);
}

	}

}
