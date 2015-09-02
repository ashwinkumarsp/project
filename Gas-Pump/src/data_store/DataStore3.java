package data_store;

public class DataStore3 extends DataStore{
	public float temp_a;
	public float temp_b;
	public float cash;
	public float price;
	public int L;
	public int flag;
	public float total;
	
	public float gettemp_a()
	{
		return temp_a;
	}
	
	public void settemp_a(float a)
	{
		temp_a=a;
	}
	
	public float gettemp_b()
	{
		return temp_b;
	}
	
	public void settemp_b(float b)
	{
		temp_b=b;
	}
	
	public float getL()
	{
		return L;
	}
	
	public void setL()
	{
		L=L+1;
	}
	
	public float gettotal()
	{
		return total;
	}
	
	public void settotal()
	{
		total =  price*L;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float t)
	{
		
			price = t;
		
	}
	
	public float getCash()
	{
		return cash;
	}
	
	public void setCash(float t)
	{
		
			cash = t;
		
	}
	
}
