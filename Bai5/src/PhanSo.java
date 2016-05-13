
public class PhanSo {
	private int tu;
	private int mau;
	public PhanSo(int tu,int mau)
	{
		this.tu=tu;
		this.mau=mau;
	}
	public void SetTu(int tu)
	{
		this.tu=tu;
	}
	public void SetMau(int mau)
	{
		this.mau=mau;
	}
	public int getTu()
	{
		return tu;
	}
	public int getmau()
	{
		return mau;
	}
	public PhanSo add( PhanSo a)
	{
		PhanSo kq = new PhanSo(1,1);
		kq.tu = this.tu*a.mau+ a.tu*this.mau;
		kq.mau = this.mau*a.mau;
		kq=kq.RutGon();
		return kq;
	}
	public PhanSo Multi(PhanSo b)
	{
		PhanSo kq = new PhanSo(1, 1);
		kq.tu=this.tu*b.tu;
		kq.mau = this.mau*b.mau;
		kq.RutGon();
		return kq;
	}
	public PhanSo RutGon()
	{
		PhanSo kq = new PhanSo(1,1);
    	int min = this.ucln();
    	kq.tu=this.tu/min;
    	kq.mau=this.mau/min;
    	return kq;
	}
	public int ucln()
    {
		int t=this.tu;
		int m=this.mau;
     
		 while(t!=m){
             
             if(t>m) t-=m;
             else m-=t;
             }
            return t;
   }
	public int SoSanh(PhanSo b)
	{
		if (this.tu*b.mau < b.tu*this.mau)
			return 1;
		else
			return 0;
	}
}
