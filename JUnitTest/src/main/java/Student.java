
public abstract class Student 
{
	private
    	String name;
    
	public
	
	 Student() 
	{
		this.name="EMPTY";
		
	}//Default Constructor for Student
	
	
	 Student(String n)
	{
		this.name=n;
		
	}//Constructor for Student
	
	
	 void setName(String n) 
	{
		this.name=n;
		
	}//modifier to set the name
	
	
	 String getName()
	{
		return this.name;
		
	}//access to get the name
	
	 abstract long printFees();
	
}
