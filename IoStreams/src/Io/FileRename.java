package Io;
import java.io.File;
public class FileRename {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh\\squad.txt");
		File f1=new File("F:\\Wolfdinesh\\Mysquad.txt");
		f.renameTo(f1);

	}

}
