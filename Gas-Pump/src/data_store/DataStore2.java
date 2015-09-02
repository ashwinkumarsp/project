package data_store;

public class DataStore2 extends DataStore{
	public float temp_a;
	public float temp_b;
	public int G;
	public float total;
	public float price;
	public int flag;
	
	
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
	
	public float getG()
	{
		return G;
	}
	
	public void setG()
	{
		G=G+1;
	}
	
	public float gettotal()
	{
		return total;
	}
	
	public void settotal()
	{
		total =  price*G;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float t)
	{
		
			price = t;

	}
	
}
