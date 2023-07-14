package Io;
import java.io.File;
public class PrintingFileName {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh\\squad.txt");
		System.out.println(f.getName());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
	}

}
