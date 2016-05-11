import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	static int[][] A;
	static int n,m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadFile("../Bai4/MaTran.txt");
		WriFile("../Bai4/out.txt");

	}
	public static void  ReadFile(String path) throws IOException
	{
		try {
			FileInputStream file = new FileInputStream(path);
			InputStreamReader a = new InputStreamReader(file);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(file));
			 String s = new String();

	                s = br.readLine().trim();
	                m = new Integer(s); //rows
	                s = br.readLine().trim();
	                n = new Integer(s); //cols
	                
	                A = new int[m][n];
	                for(int i = 0; i < m; i++)
	                {
	                    s = br.readLine().trim();
	                    String[] B = s.split(" ");
	                    for(int j = 0; j < n; j++)
	                    {
	                        A[i][j] = new Integer(B[j].trim());
	                    }
	                }            
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void WriFile(String Path) throws IOException
	{
		int max =A[0][0];
		int min =A[0][0];
		int tong =0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(A[i][j]>max)
				{
					max=A[i][j];
					
				}
				if(A[i][j]<min)
				{
					min=A[i][j];
				}
				tong =tong +A[i][j];
			}
		}
		File file = new File(Path);
		FileWriter out = new FileWriter(file);
		BufferedWriter bufer = new BufferedWriter(out);
		 String tam  = String.valueOf(max);
		String s= " phan tu lon nhat trong : ";
		s=s+tam+"\r\n";
		bufer.write(s);
		bufer.flush();
		
		String s2 =" phan tu nho nhat trong :";
		String tam2 =String.valueOf(min);
		s2=s2+tam2+"\r\n";
		bufer.write(s2);
		bufer.flush();
		String s3 =" tong cac phan tu trong ma tran" + String.valueOf(tong)+"\r\n";
		bufer.write(s3);
		bufer.flush();
		String s4 = " danh sach so nguyen to : ";
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(check_nguyento(A[i][j])==1)
				{
					s4=s4+String.valueOf(A[i][j])+"\t";
				}
					
			}
		}
		bufer.write(s4);
		bufer.flush();
		
	}
	public static int check_nguyento(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return 0;
		}
		return 1;
	}

}
