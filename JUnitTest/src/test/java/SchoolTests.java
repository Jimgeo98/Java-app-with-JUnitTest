
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.*;


public class SchoolTests {
	
		@BeforeClass
		public static void BeforeClass() {
			System.out.println("Before Class");
		}
	
		@Before
		public void before() {
			System.out.println("Before Test Case");
		}
		
//-----------------------------------------------------------------------------------------//
		
		Graduate s1 = new Graduate("Dimitris Georgiadis",9);
		Graduate s2 = new Graduate("Maria Palami",10);
		Graduate s3 = new Graduate("Kostas Perperoglou",30);
		Graduate s4 = new Graduate("Akis Takis",31);
		
		@Test
		public void testcalculateFeeG() {
			assertEquals(4000, s1.calculateFee(), "9 credits must be 4000");
			assertEquals(2000, s2.calculateFee(), "10 credits must be 2000");
			assertEquals(2000, s3.calculateFee(), "30 credits must be 2000");
			assertEquals(1000, s4.calculateFee(), "31 credits must be 1000");			
		}
		
//----------------------------------------------------------------------------------------//	

		Postgraduate s5 = new Postgraduate("Anna karotou",1);
		Postgraduate s6 = new Postgraduate("Markos Katsos",2);
		
		@Test
		public void testcalculateFeeP() {
			assertEquals(6000, s5.calculateFee(), "1 credits must be 6000");
			assertEquals(3000, s6.calculateFee(), "2 or anything else credits must be 3000");
		}
		
//----------------------------------------------------------------------------------------//
		
		
		@Test
		public void testfindFinalExamStudents() {
			
			
			Course c1 =new Course("Chemistry");
		
			CourseRecord cr = new CourseRecord();
			CourseRecord cr2 = new CourseRecord();
			
			c1.addCourseRecord(cr);
			c1.addCourseRecord(cr2);
			
			cr.setStudent(s1);
			cr2.setStudent(s2);
			
			Assignment a1 = new  Assignment(8.5);
			Assignment a2 = new  Assignment(6.5);
			Assignment a3 = new  Assignment(7.5);
			
			Assignment a4 = new  Assignment(4.0);
			Assignment a5 = new  Assignment(5.0);
			Assignment a6 = new  Assignment(3.0);
			
			cr.addAssignment(a1);
			cr.addAssignment(a2);
			cr.addAssignment(a3);
			
			cr2.addAssignment(a4);
			cr2.addAssignment(a5);
			cr2.addAssignment(a6);
			
			ArrayList<String> names = new ArrayList<String>();
			names.add("Dimitris Georgiadis");
			//names.add("Maria Palami"); auti den exei perasei opote tha vgalei failures
			
		    assertEquals(c1.findFinalExamStudents(),names,"expected 'Dimitris Georgiadis'");
		}
			
//-----------------------------------------------------------------------------------------------------//	
		
		
		@Test
		public void testaverage() {
			
			Course c1 =new Course("Chemistry");
			
			CourseRecord cr = new CourseRecord();
			CourseRecord cr2 = new CourseRecord();
			
			c1.addCourseRecord(cr);
			c1.addCourseRecord(cr2);
			
			cr.setStudent(s1);
			cr2.setStudent(s2);
			
			Assignment a1 = new  Assignment(8.5);
			Assignment a2 = new  Assignment(7.5);
			Assignment a3 = new  Assignment(6.5);
			
			Assignment a4 = new  Assignment(4.5);
			Assignment a5 = new  Assignment(3.5);
			Assignment a6 = new  Assignment(2.5);

			
			cr.addAssignment(a1);
			cr.addAssignment(a2);
			cr.addAssignment(a3);
			
			cr2.addAssignment(a4);
			cr2.addAssignment(a5);
			cr2.addAssignment(a6);

			assertEquals(7.5, cr.average(), "M.O must be 7.5");
			assertEquals(3.5, cr2.average(), "M.O must be 3.5");
			
		}
		
//-----------------------------------------------------------------------------------------------------//		
		
		
		@Test
		public void testcanTakeFinnalExam() {
			
			Course c1 =new Course("Chemistry");
			
			CourseRecord cr = new CourseRecord();
			CourseRecord cr2 = new CourseRecord();
			
			c1.addCourseRecord(cr);
			c1.addCourseRecord(cr2);
			
			cr.setStudent(s1);
			cr2.setStudent(s2);
			
			Assignment a1 = new  Assignment(8.5);
			Assignment a2 = new  Assignment(7.5);
			Assignment a3 = new  Assignment(6.5);
			
			Assignment a4 = new  Assignment(4.5);
			Assignment a5 = new  Assignment(3.5);
			Assignment a6 = new  Assignment(2.5);

			
			cr.addAssignment(a1);
			cr.addAssignment(a2);
			cr.addAssignment(a3);
			
			cr2.addAssignment(a4);
			cr2.addAssignment(a5);
			cr2.addAssignment(a6);
			
			 
			Assert.assertEquals(cr.canTakeFinalExam(),true);
			Assert.assertSame (cr2.canTakeFinalExam(),false);
			
		}
		
//-----------------------------------------------------------------------------------------------------//	
		
		
		@Test
		public void testfindBestStudent() {
			
			Course c1 =new Course("Chemistry");
			
			CourseRecord cr = new CourseRecord();
			CourseRecord cr2 = new CourseRecord();
			
			c1.addCourseRecord(cr);
			c1.addCourseRecord(cr2);
			
			cr.setStudent(s1);
			cr2.setStudent(s2);
			
			Assignment a1 = new  Assignment(8.5);
			Assignment a2 = new  Assignment(7.5);
			Assignment a3 = new  Assignment(6.5);
			
			Assignment a4 = new  Assignment(4.5);
			Assignment a5 = new  Assignment(3.5);
			Assignment a6 = new  Assignment(2.5);

			
			cr.addAssignment(a1);
			cr.addAssignment(a2);
			cr.addAssignment(a3);
			
			cr2.addAssignment(a4);
			cr2.addAssignment(a5);
			cr2.addAssignment(a6);
			
			
			Assert.assertEquals("Dimitris Georgiadis",c1.findBestStudent());  //he is the best
			//Assert.assertEquals("Maria Palami",c1.findBestStudent());  

		}
		
		
//-----------------------------------------------------------------------------------------------------//			
		@After
		public void after() {
			System.out.println("After Test Case");
		}
		
		
		@AfterClass
		public static void afterClass() {
			System.out.println("After Class");
		}	
}
