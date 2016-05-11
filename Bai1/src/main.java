import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.sun.javafx.scene.paint.GradientUtils.Parser;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.stream.Entity.ScannedEntity;

import javafx.scene.Parent;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// câu 1 
		File file = new File("../Bai1/a.txt");
		int n=0;
		int a[] = new int[n];
		FileInputStream in;
		try {
			in = new FileInputStream(file);
			BufferedReader buferReader = new BufferedReader( new InputStreamReader(in));
			String s= new String();
			s = buferReader.readLine().trim();
			n = new Integer(s);
			 a = new int[n];
			
				 s= buferReader.readLine().trim();
				 String [] B = s.split(" ");
				 for(int i=0;i< n;i++)
				 {
				 a[i]= new Integer(B[i].trim());
				 }
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		
		// câu b 
		Scanner scan = new Scanner(System.in);
		int m ;
		System.out.println("nhap vao so phan tu cua m");
		m=scan.nextInt();
		int B[] = new int [m];
		Random  rand = new Random();
		for(int i=0;i<m;i++)
		{
			
			B[i]= rand.nextInt(1000);
		}
		for(int i=0;i<m;i++)
		{
			System.out.println("B["+i+"]");
			System.out.println(B[i]+"\t");
		}
		// câu c : xuat mang b vao b.txt
		File file1 = new File("b.txt");
		Write_File(B,file1);
		
		// câu d : Create c copy from array A
		   int[] c = Arrays.copyOf(a, a.length);
		 // câu e replace
		   if (c.length > 4 && B.length >4)
		   {
		   System.arraycopy(B, B.length-3 , c, 1, 3);
			System.out.println(" xuat mang C  : " +Arrays.toString(c));
		   }
		   else
		   {
			   System.out.println(" khong du phan tu de replace");
		   }
		 // câu f sort array c , write c.txt
		   for(int i=0;i<c.length;i++)
		   {
			   for(int j =0;j<c.length;j++)
			   {
				   if (c[j]<c[i])
				   {
					   int tam ;
					   tam=c[i];
					   c[i]=c[j];
					   c[j]=tam;
				   }
			   }
		   }
		   File file2 = new File("c.txt");
		   Write_File(c, file2);
		          
	}

	
	
	public static void Write_File ( int k[], File file) throws IOException
	{
	
	      // tao file
	      file.createNewFile();
	      // Tao mot doi tuong FileWriter
	      FileWriter writer = new FileWriter(file); 
	      // ghi noi dung vao file
	      String s = Arrays.toString(k);
	      String str_Separator = " ";
	     s= s.replaceAll(", ", str_Separator).replace("[", "").replace("]", "");
	      writer.write(s); 
	      writer.flush();
	      writer.close();

	 
	     
	}
}
