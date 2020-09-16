import java.util.ArrayList;

public class CourseRecord
{
	private 
		Student student;
	
	 	ArrayList<Assignment> assignments =	new ArrayList<Assignment>();
	
	
	public

	 CourseRecord() 
	{ 

	}// Default Constructor for CourseRecord
	
	
	
	 void setStudent(Student s)
	{
       this.student=s;
       
	}//modifier to set the Student
	
	

	 Student getstudent()
	{
	   return this.student;
	   
	}//access to get the Student
	
	
	
	 void addAssignment(Assignment a)
	{
	   this.assignments.add(a);
	 
	}// addAssignment method
	
	
	
	 ArrayList<Assignment> getAssignment()
	{
		return  assignments;
		
	}// getAssignment method

	
	
	 double average()
	{
		double times = 0.0;
		double sum =0.0;
		
		for (int l=0; l<assignments.size(); l++ )
		{
			times=getAssignment().get(l).getMark();	
			sum += times;
		}
		
		return  sum/assignments.size();	
	
	}//average method
	
	
	
	 boolean canTakeFinalExam()
	{
		if (average()>=5)
			return true;
		else
			return false;
		
	}// canTakeFinalExam method
}
