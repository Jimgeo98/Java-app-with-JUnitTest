
public class Graduate extends Student{

	private 
		double credits;
	
	
	public
	
	Graduate()
	{
		this.credits=0.0;
		
	}//Default Constructor for Graduate
	
	
	
	Graduate(String n,double cr)
	{
		super(n);
		this.credits=cr;
		
	}//Constructor for Graduate
	
	
	
	void setcredits(double cr)
	{
		this.credits=cr;
		
	}//modifier to set the credits
	
	
	
	double getcredits()
	{ 
		return this.credits;
		
	}//access to get the credits


	 @Override
	 long printFees()
	{
		 if (credits < 10)
			 return 4000;
		 
		 else if (credits >=10 && credits <=30)
			 return 2000;
		 
		 else
			 return 1000;
		 
	}// print Fees method
	
}
