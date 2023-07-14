package Io;
import java.io.File;
public class DisplayFileExtensionOnly {

	public static void main(String[] args) {
		File f=new File("F:");
		  File[] F1=     f.listFiles();
		  for(File F2:F1) {
			  if(F2.isFile()) {
			  String s=F2.getName();
		int lastdot =	  s.lastIndexOf(".");
		System.out.println(s.substring(lastdot+1));
		
		  }
		  }
	}

}
