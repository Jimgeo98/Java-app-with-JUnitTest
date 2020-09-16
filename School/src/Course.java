import java.util.ArrayList;

public class Course
{

  private
	String title;
  	ArrayList<CourseRecord> corseRecords= new ArrayList<CourseRecord>();
	
  public
  
	 Course() 
	{
		this.title="EMPTY";
		
	}//Default Constructor for Course
	
	
	 Course(String ti)
	{
		this.title=ti;
		
	}//Constructor for Course
	

	 void setTitle(String ti) 
	{
		this.title=ti;
		
	}//modifier to set the title
	
	
	 String getTitle()
	{
		return this.title;
		
	}//access to get the title
	
	 ArrayList<CourseRecord> getcourseRecords()
	{
		return this.corseRecords; 
		
	}//access to get the CourseRecords
	
	
	 void addCourseRecord(CourseRecord c)
	{
		this.corseRecords.add(c);
		
	}// addCourseRecord method
	
	
	public void printCourseStudent()
	{
		System.out.println("Course is: "+ title);
	}
	
	
	public String printBestStudent()
	{
		String n="";
		double max=0.0;
		for (int j=0; j<getcourseRecords().size(); j++)
		{
			double num = getcourseRecords().get(j).average();
		    if (num>max)
		    {
		    	max=num;
		    	n=getcourseRecords().get(j).getstudent().getName();
		    }	    
		}
    	return n;
	}//printBestStudent method
	
	
	public Double printBestmo()
	{
		double max=0.0;
		for (int j=0; j<getcourseRecords().size(); j++)
		{
			double num = getcourseRecords().get(j).average();
		    if (num>max)
		    {
		    	max=num;
		    }	    
		}
    	return max;
	}//printBestmo method
	
	
	
	
	public void printFinalExamStudent()
	{
		for (int j=0; j<getcourseRecords().size(); j++)
		{
			if(getcourseRecords().get(j).canTakeFinalExam())
			      System.out.println("The Student : "+ getcourseRecords().get(j).getstudent().getName()+
					   " Score " + getcourseRecords().get(j).average()+" and he can take part in final exams.");
		}
	}//printFinalExamStudent method
	
}
