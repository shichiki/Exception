import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[][] = new int [7][7] ;
		  File fo = new File("../Bai3/out.txt");
		  FileWriter write = new FileWriter(fo);
	
         
          
		
		for(int i = 0; i < 7; i++)
		{
			arr[i] = new int[i + 1];
			String s=" ";
			for(int j = 0; j <= i; j++){
			if(j == 0 || j == i)
				arr[i][j] = 1;
			else{
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			
			}
			int k = arr[i][j];
			 String tam  = String.valueOf(k);
			s=s+tam+"\t";
			
		}
			s=s+"\r\n";
		  write.write(s);
		  //write.write("\n");
		  write.flush();
	
	}
		write.close();

	}
}
