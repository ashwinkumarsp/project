package data_store;

public class DataStore1 extends DataStore
{
	public int temp_a;
	public int temp_w;
	public int cash;
	public int price;
	public int G;
	public int total;
	public int flag;
	
	public int gettemp_a()
	{
		return temp_a;
	}
	
	public void settemp_a(int a)
	{
		temp_a=a;
	}
	
	
	public int gettemp_w()
	{
		return temp_w;
	}
	
	public void settemp_w(int w)
	{
		temp_w=w;
	}
	
	public int getcash()
	{
		return cash;
	}
	
	public void setcash(int c)
	{
		cash = c;
	}
	
	public int getprice()
	{
		return price;
	}
	
	public void setprice()
	{
		price = temp_a;
	}
	
	public int getG()
	{
		return G;
	}
	
	public void setG()
	{
		G = G+1;
	}
	
	public int getTotal()
	{
		return total;
	}
	
	public void setTotal()
	{
		total = price*G;
	}
}
