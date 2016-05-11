package bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		Scanner scan = new Scanner (System.in);
		x = scan.nextInt();
		File file = new File("../bai2/c.txt");
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
		int count =1;
		for(int i=0;i<n;i++)
		{
			if(x==a[i])
				count =2;
				
			}
		if (count==2)
			System.out.println(" ton tai x trong c.txt");
		else
			System.out.println("khong ton tai x trong c.txt");

	}

}
