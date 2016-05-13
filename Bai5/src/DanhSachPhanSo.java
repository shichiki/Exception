import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import sun.awt.windows.WWindowPeer;

public class DanhSachPhanSo {
	public void bai5(String path) throws IOException
	{
		// cau a: doc file input
		String s2="" ;
		String s3="";
		File file = new File(path);
		try {
			FileInputStream in = new FileInputStream(file);
			BufferedReader read = new BufferedReader(new InputStreamReader(in));
			String s = new String();
			s = read.readLine();
			s2= s;
			 s3= new String();
			while (s!=null)
			{
				s=read.readLine();
				if(s!=null)
				{
					s3=s;
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result1[] = s2.split(",");
		String result2[] = s3.split(",");
		PhanSo a[]= new PhanSo[result1.length];
		PhanSo b[] = new PhanSo[result2.length];
		for(int i=0;i<result1.length;i++)
		{
			String mai[]=result1[i].split("/");
			a[i]= new PhanSo(1, 1);
			int m= Integer.parseInt(mai[0]);
			int n =Integer.parseInt(mai[1]);
			a[i].SetMau(n);
			a[i].SetTu(m);
			
		}
		for(int j=0;j<result2.length;j++)
		{
			String mai[]=result1[j].split("/");
			b[j]= new PhanSo(1, 1);
			int m= Integer.parseInt(mai[0]);
			int n =Integer.parseInt(mai[1]);
			b[j].SetMau(n);
			b[j].SetTu(m);
			
		}
		PhanSo c[] = new PhanSo[result2.length];
		PhanSo d[]= new PhanSo[result1.length];
		// cau b :thuc hien cong va nhan
		for(int i=0;i<result1.length;i++)
		{
			c[i]= new PhanSo(1, 1);
			c[i]=a[i].add(b[i]);
		}
		for(int i=0;i<result1.length;i++)
		{
			d[i]= new PhanSo(1, 1);
			d[i]=a[i].Multi(b[i]);
		}
		// cau c: sap xep va ghi vao file
		sort(c);
		sort(d);
		  File fo = new File("../Bai5/output.txt");
		  FileWriter write = new FileWriter(fo);
		  String s5="";
		for(int i=0;i<c.length;i++)
		{
			s5 =  String.valueOf(c[i].getTu())+"/"+String.valueOf(c[i].getmau())+",";
			if (i==c.length-1)
			{
				s5 =  String.valueOf(c[i].getTu())+"/"+String.valueOf(c[i].getmau());
			}
			if(s5!=null)
			{
				write.write(s5);
				write.flush();
			}
			
		}
		write.write("\r\n");
		write.flush();
		
		for(int i=0;i<d.length;i++)
		{
			
			s5 =  String.valueOf(d[i].getTu())+"/"+String.valueOf(d[i].getmau())+",";
			if (i==c.length-1)
			{
				s5 =  String.valueOf(d[i].getTu())+"/"+String.valueOf(d[i].getmau());
			}
			if(s5!=null)
			{
				write.write(s5);
				write.flush();
			}
		}
		write.close();
		
	}
	public void sort(PhanSo c[])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i].SoSanh(c[j])==1)
				{
					PhanSo tam;
					tam=c[i];
					c[i]=c[j];
					c[j]=tam;
				}
			}
		}
	}


}
