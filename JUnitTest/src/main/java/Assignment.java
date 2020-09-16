
public class Assignment {

	private
		double mark;
	
	public
	
	 Assignment() 
	{
		this.mark=0.0;
		
	}//Default Constructor for Assignment
	
	
	 Assignment(double m)
	{
		this.mark=m;
		
	}//Constructor for Assignment
	
	
	 void setMark(double m)
	{
		this.mark=m;
		
	}//modifier to set the mark
	
	
	 double getMark()
	{
		return this.mark;
		
	}//access to get the mark	
	
}
