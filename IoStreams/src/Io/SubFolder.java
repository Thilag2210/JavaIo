package Io;
import java.io.File;
public class SubFolder {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh\\Bgmi\\pubg");
		f.mkdirs();
		System.out.println("sub folder created");

	}

}
