
public class Postgraduate extends Student{
	
	private
		int year;
	
	
	public
		
		Postgraduate()
		{
			this.year=0;
			
		}//Default Constructor for Postgraduate
	
		
		Postgraduate(String n,int y)
		{
			super(n);
			this.year = y;
		
		}//Constructor for Postgraduate
		
		
		void setYear(int y)
		{
			this.year = y;
			
		}//modifier to set the years
		
		
		int getYear()
		{
			return this.year;
			
		}//access to get the years
	
		
		
		@Override
		long printFees() 
		{
			if(year == 1)
				return 6000;
			else
				return 3000;
		
		}//print Fees method


}
