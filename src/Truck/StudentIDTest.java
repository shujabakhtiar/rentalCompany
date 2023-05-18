package Truck;

import static org.junit.Assert.*;

import org.junit.Test;


public class StudentIDTest {


	/**
	 * with corret student id format
	 */
	@Test
	public void testGetInstanceCorrect() {
		StudentID sID = StudentID.getInstance("a", "1214");

//		System.out.println(sID.toString());

		assertEquals(sID.toString(), "a1214");

	}

	/**
	 * testing with wrong format of ID, will throw an error
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetInstanceIncorrect() {

		StudentID.getInstance("a", "1234");
		StudentID.getInstance("a", "1234");

	}

	@Test
	public void testGetNumberOfStudentIds() {
		StudentID.getInstance("a", "1234");
		StudentID.getInstance("a", "1254");

		StudentID.getInstance("a", "1244");

		System.out.println(StudentID.getNumberOfStudentIds());

		//will be 4 as we have already added somme in this test function
		assertEquals(StudentID.getNumberOfStudentIds(), 5);
	}

	@Test
	public void testGetfirstComponent() {
		StudentID sID = StudentID.getInstance("a", "1114");

		assertEquals(sID.getfirstComponent(), "a");
	}

	@Test
	public void testGetsecondComponent() {
		StudentID sID = StudentID.getInstance("a", "1118");

		assertEquals(sID.getsecondComponent(), "1118");
	}

	@Test
	public void testGetStudentID() {
		StudentID sID = StudentID.getInstance("a", "1148");

		assertEquals(sID.getStudentID(), "a1148");
		
	}
}
