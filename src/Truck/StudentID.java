package Truck;

import java.util.HashSet;
import java.util.Set;


public class StudentID {
	// firstComponenet : a single letter
		// secondComponent : followed by 4 numbers
		private final String firstComponent, secondComponent;

		private static final Set<StudentID> STUDENT_IDS = new HashSet<StudentID>();

		/**
		 * A private constructor used to get object from getInstance method
		 * 
		 * @param firstComponent  a single letter
		 * @param secondComponent exactly 4 numbers
		 */
		private StudentID(String firstComponent, String secondComponent) {
			this.firstComponent = firstComponent;
			this.secondComponent = secondComponent;
		}

		/**
		 * Used to create unique student ID by using a private constructor we increment
		 * the second component for each generated ID from the university class
		 * 
		 * @param firstComponent  a single letter
		 * @param secondComponent exactly 4 numbers
		 * @return StudentID
		 */

		public static StudentID getInstance(String firstComponent, String secondComponent) {

			// verfiying the Student ID components, if they are in correct format
			if (firstComponent.length() != 1 || secondComponent.length() != 4 || !isNumeric(secondComponent)) {
				throw new IllegalArgumentException(
						"invalid Student ID: " + firstComponent + secondComponent + " " + isNumeric(secondComponent));
			}

			StudentID newStudentID = new StudentID(firstComponent, secondComponent);

			if (!STUDENT_IDS.contains(newStudentID)) {
				STUDENT_IDS.add(newStudentID);
				return newStudentID;
			} else
				throw new IllegalArgumentException("student ID already exists");

		}

		/**
		 * @return the size of students map
		 */
		public static int getNumberOfStudentIds() {
			return STUDENT_IDS.size();
		}

		/**
		 * 
		 * @return returns first component
		 */
		public String getfirstComponent() {
			return firstComponent;
		}

		/**
		 * 
		 * @return returns second component
		 */

		public String getsecondComponent() {
			return secondComponent;
		}

		/**
		 * 
		 * @return returns studentID as string
		 */
		public String getStudentID() {
			return firstComponent + secondComponent;
		}

		/**
		 * used to check if the second component is a number or not.
		 * 
		 * @param str String
		 * @return
		 */
		private static boolean isNumeric(String str) {
			try {
				Double.parseDouble(str);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null)
				return false;
			if (this.getClass() != o.getClass())
				return false;
			StudentID sid = (StudentID) o;
			return (firstComponent.equals(sid.firstComponent) && secondComponent.equals(sid.secondComponent));
		}

		@Override
		public int hashCode() {
			int hash = 7;
			hash = 31 * hash + (firstComponent == null ? 0 : firstComponent.hashCode());
			hash = 31 * hash + (secondComponent == null ? 0 : secondComponent.hashCode());
			return hash;
		}

		@Override
		public String toString() {
			return firstComponent + secondComponent;
		}
}
