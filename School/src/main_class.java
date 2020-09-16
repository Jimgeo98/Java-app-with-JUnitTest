
import java.util.Scanner;

public class main_class {
	
	private static Scanner sc;
	public static void main(String[] args)
	{		
//----------------------------------------------------------------------//	
		sc=new Scanner(System.in);
		System.out.print("Enter a Course Name:");
		String coursename = sc.next();
//----------------------------------------------------------------------//	
		sc=new Scanner(System.in);	
		String studentname = null,studentname2 = null,studentname3 = null;
		double num1 = 0,num2= 0,num3= 0,num4= 0,num5= 0,num6= 0,num7= 0,num8= 0,num9= 0;
		int flag= 0,apantisi= 0,ofeiles1= 0,ofeiles2= 0,ofeiles3= 0,k= 0,b= 0,q= 0;
		
	    
      for (int i=1; i<4; i++)
      {  
    	  System.out.print("If Student is graduate press  '1' or press  '0'   if he is Postgraduate: ");
    	  	while (true) {		
	            try{
	                  apantisi = Integer.parseInt(sc.nextLine());
	                  if(apantisi == 0 | apantisi == 1 )
					 	  break;
					  else
	            		  throw new NumberFormatException();
	                  
	             } catch (NumberFormatException nfe) {
	                  System.out.print("Please try again and give the right inputs: ");
	              }
	          } 
    	  	
 		 if (apantisi== 1 & i==1)
 		 {
 			 k++;
 			 sc=new Scanner(System.in); 
 			 System.out.print("give the credits of graduate Student: ");
 			 while (true) {
	            try{
	            	ofeiles1 = Integer.parseInt(sc.nextLine());
	            	if(ofeiles1 > 0 )
					 	break;
					else
	            		throw new NumberFormatException();
	                  
	             } catch (NumberFormatException nfe) {
	                  System.out.print("Please try again and give the right inputs: ");
	              }
	          } 
 			 
 		 }else if(apantisi== 0 & i==1){
 			 sc=new Scanner(System.in); 
 			 System.out.print("give the years for Postgraduate Student: ");
	 			 while (true) {
	 				 try{
	 					 	ofeiles1 = Integer.parseInt(sc.nextLine());
	 					 	if(ofeiles1 == 1 | ofeiles1 == 2 )
	 					 		break;
	 					 	else
		            		throw new NumberFormatException();
		            
		             } catch (NumberFormatException nfe) {
		                  System.out.print("Please try again and give the right inputs: ");
		              }
		          	}
 		 }else if (apantisi== 1 & i==2){
 			 b++;
			 sc=new Scanner(System.in); 
			 System.out.print("give the credits of graduate Student: ");
			 while (true) {
		            try{
		            	  ofeiles2 = Integer.parseInt(sc.nextLine());
		            	  if(ofeiles2 > 0 )
	 					 	  break;
	 					  else
		            	      throw new NumberFormatException();
		            	  	                  
		             } catch (NumberFormatException nfe) {
		                  System.out.print("Please try again and give the right inputs: ");
		              }
		          }
			 
		 }else if(apantisi== 0 & i==2){
			 sc=new Scanner(System.in); 
			 System.out.print("give the years for Postgraduate Student: ");
			 while (true) {
		            try{
			            	ofeiles2 = Integer.parseInt(sc.nextLine());
			            	if(ofeiles2==1 | ofeiles2==2)
	 					 		break;
	 					 	else
		            		throw new NumberFormatException();
		             
		             } catch (NumberFormatException nfe) {
		                  System.out.print("Please try again and give the right inputs: ");
		              }
		          }
		 }else if (apantisi== 1 & i==3){
			 q++;
			 sc=new Scanner(System.in); 
			 System.out.print("give the credits of graduate Student: ");
			 while (true) {
		            try{
		            	ofeiles3 = Integer.parseInt(sc.nextLine());
		            	if(ofeiles3 > 0 )
 					 		break;
 					 	else
	            		throw new NumberFormatException();
		            	
		             } catch (NumberFormatException nfe) {
		                  System.out.print("Please try again and give the right inputs: ");
		              }
		          }
			 
		 }else if(apantisi== 0 & i==3){
			 sc=new Scanner(System.in); 
			 System.out.print("give the years for Postgraduate Student: ");
			 while (true) {
		            try{
			            	ofeiles3 = Integer.parseInt(sc.nextLine());
			            	if(ofeiles3==1 | ofeiles3==2)
	 					 		break;
	 					 	else
		            		throw new NumberFormatException();
		                
		             } catch (NumberFormatException nfe) {
		                  System.out.print("Please try again and give the right inputs: ");
		              }
		          }
		 }
 		 
 		 
 		   sc=new Scanner(System.in);
 		 
    	  System.out.print("Enter the name for the "+ i +"st Student: ");
    	  if(i==1)
    		   studentname = sc.nextLine();
    	  else if(i==2)
    		   studentname2 = sc.nextLine();
    	  else
    		  studentname3 = sc.nextLine();  
    	  
    
        for (int j=0; j<3; j++)
        {
        	if (i==1)
        		System.out.print("Enter the Assigment for student "+studentname+":");
        	else if (i==2)
        		System.out.print("Enter the Assigments for student "+studentname2+":");
        	else
        		System.out.print("Enter the Assigments for student "+studentname3+":");
        	
        	
        	while (true) {
                 try {
                	      if (j==0 & flag==0)
                	    	num1 = Double.parseDouble(sc.nextLine());
	                      if (j==1 & flag==1)
	                	    num2 = Double.parseDouble(sc.nextLine());
	                	  if (j==2 & flag==2)
	                		num3 = Double.parseDouble(sc.nextLine());
	                	  if (j==0 & flag==3)
	                		num4 = Double.parseDouble(sc.nextLine());
	                	  if (j==1 & flag==4)
	                		num5 = Double.parseDouble(sc.nextLine());
	                	  if (j==2 & flag==5)
	                		num6 = Double.parseDouble(sc.nextLine());
	                	  if (j==0 & flag==6)
	                		num7 = Double.parseDouble(sc.nextLine());
	                	  if (j==1 & flag==7)
	                		num8 = Double.parseDouble(sc.nextLine());
	                	  if (j==2 & flag==8)
	                		num9 = Double.parseDouble(sc.nextLine());
	                	 flag++;
	                	 break;
                 }catch(NumberFormatException nfe) {
                		  System.out.print("Please try again and give the right inputs: ");
                	  }
                 } 
            }
      }
            
//----------------------------------------------------------------------//	
		Course c1 =new Course(coursename);
//----------------------------------------------------------------------//			
		CourseRecord cr = new CourseRecord();
		CourseRecord cr2 = new CourseRecord();
		CourseRecord cr3 = new CourseRecord();
//----------------------------------------------------------------------//		
		Graduate s1 = new Graduate(studentname,ofeiles1);
		Postgraduate s2 = new Postgraduate(studentname2,ofeiles2);
		Graduate s3 = new Graduate(studentname3,ofeiles3);
//----------------------------------------------------------------------//	
		c1.addCourseRecord(cr);
		c1.addCourseRecord(cr2);
		c1.addCourseRecord(cr3);
//----------------------------------------------------------------------//	
		cr.setStudent(s1);
		cr2.setStudent(s2);
		cr3.setStudent(s3);
//----------------------------------------------------------------------//	
		Assignment a1 = new  Assignment(num1);
		Assignment a2 = new  Assignment(num2);
		Assignment a3 = new  Assignment(num3);
		Assignment a4 = new  Assignment(num4);
		Assignment a5 = new  Assignment(num5);
		Assignment a6 = new  Assignment(num6);
		Assignment a7 = new  Assignment(num7);
		Assignment a8 = new  Assignment(num8);
		Assignment a9 = new  Assignment(num9);
//----------------------------------------------------------------------//
		
		cr.addAssignment(a1);
		cr.addAssignment(a2);
		cr.addAssignment(a3);
		
		cr2.addAssignment(a4);
		cr2.addAssignment(a5);
		cr2.addAssignment(a6);
		
		cr3.addAssignment(a7);
		cr3.addAssignment(a8);
		cr3.addAssignment(a9);
//----------------------------------------------------------------------//
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("The Title of the course is: "+c1.getTitle()+".");
			
		System.out.println("This course has "+ c1.getcourseRecords().size() +" records.");
		

    System.out.println("---------------------------------------------------------------");
//--------------------------------------------------------------------------------------------//
			
		CourseRecord cr11 = c1.getcourseRecords().get(0);
		Student st11 = cr11.getstudent();
		String name1 = st11.getName();	
		
		if(k==1)
			System.out.println("The First record refers to student "+ name1+" and he is graduate.");	
		else
			System.out.println("The First record refers to student "+ name1+" and he is Postgraduate.");
		
		System.out.println(c1.getcourseRecords().get(0).getstudent().getName() +" has "+ 
		    c1.getcourseRecords().get(0).getAssignment().size() +" assignments.");
	
	    System.out.println("The 1st assignment has mark: "+
				c1.getcourseRecords().get(0).getAssignment().get(0).getMark());
		
		System.out.println("The 2nd assignment has mark: "+
				c1.getcourseRecords().get(0).getAssignment().get(1).getMark());
				
		System.out.println("The 3rd assignment has mark: "+
				c1.getcourseRecords().get(0).getAssignment().get(2).getMark());
						
		System.out.println("M.O assignments: "+ cr.average());
		
		System.out.println("Fees are: "+ s1.printFees()+"€");
		
		System.out.println("Can "+name1+" Take part in Final Exams ?? :"+cr.canTakeFinalExam());
		
		
//-------------------------------------------------------------------------------------------//	
	System.out.println("---------------------------------------------------------------");
//-------------------------------------------------------------------------------------------//	
				
		CourseRecord cr22 = c1.getcourseRecords().get(1);
		Student st22 = cr22.getstudent();
		String name2 = st22.getName();	
				
		if(b==1)
			System.out.println("The Second record refers to student "+ name2+" and he is graduate.");	
		else
			System.out.println("The Second record refers to student "+ name2+" and he is Postgraduate.");	
				
		System.out.println(c1.getcourseRecords().get(1).getstudent().getName() +" has also "+ 
		    c1.getcourseRecords().get(1).getAssignment().size() +" assignments.");
				
		System.out.println("The 1st assignment has mark: "+
				c1.getcourseRecords().get(1).getAssignment().get(0).getMark());
						
		System.out.println("The 2nd assignment has mark: "+
				c1.getcourseRecords().get(1).getAssignment().get(1).getMark());
						
		System.out.println("The 3rd assignment has mark: "+
				c1.getcourseRecords().get(1).getAssignment().get(2).getMark());	
		
		System.out.println("M.O assignments: "+ cr2.average());
		
		System.out.println("Fees are: "+ s2.printFees()+"€");
		
		System.out.println("Can "+name2+" Take part in Final Exams ?? :"+cr2.canTakeFinalExam());
		
//-------------------------------------------------------------------------------------------//	
	 System.out.println("---------------------------------------------------------------");
//-------------------------------------------------------------------------------------------//	
							
	    CourseRecord cr33 = c1.getcourseRecords().get(2);
	    Student st33 = cr33.getstudent();
			String name3 = st33.getName();	
					
			if(q==1)
				System.out.println("The Third record refers to student "+ name3+" and he is graduate.");	
			else
				System.out.println("The Third record refers to student "+ name3+" and he is Postgraduate.");	
					
		System.out.println(c1.getcourseRecords().get(2).getstudent().getName() +" has also "+ 
			c1.getcourseRecords().get(2).getAssignment().size() +" assignments.");
					
		System.out.println("The 1st assignment has mark: "+
				c1.getcourseRecords().get(2).getAssignment().get(0).getMark());
							
		System.out.println("The 2nd assignment has mark: "+
			    c1.getcourseRecords().get(2).getAssignment().get(1).getMark());
							
		System.out.println("The 3rd assignment has mark: "+
				c1.getcourseRecords().get(2).getAssignment().get(2).getMark());
		
		System.out.println("Fees are: "+ s3.printFees()+"€");
		
		System.out.println("M.O assignments: "+ cr3.average());
		
		System.out.println("Can "+name3+" Take part in Final Exams ?? :"+cr3.canTakeFinalExam());
		
//-------------------------------------------------------------------------------------------//
     System.out.println("---------------------------------------------------------------");
//-------------------------------------------------------------------------------------------// 
     System.out.println("Best Student is "+c1.printBestStudent()+" with score "+c1.printBestmo());   
//-------------------------------------------------------------------------------------------// 
     System.out.println("---------------------------------------------------------------");
//-------------------------------------------------------------------------------------------//
     c1.printFinalExamStudent();
//--------------------------------------------//
	}
}
