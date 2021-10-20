import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateGradeTest {

	@Test
	void shouldReturnTotalMarksWhenGivenCorrectMarks() {
		double[] marks= {50.0, 50.0, 50.0, 50.0, 50.0};
		double obtainedTotal = CalculateGrade.calculateTotalMarks(marks);
		assertEquals(250.0, obtainedTotal);
	}
	
	@Test
	void shouldThrowExceptionWhenGivenIncorrectNumberOfMarks() {
		double[] marks= {50.0, 50.0, 50.0};
		Assertions.assertThrows(ArithmeticException.class, 
				() -> CalculateGrade.calculateTotalMarks(marks)
		);
	}
	
	@Test
	void shouldThrowExceptionWhenGivenObtainedMarksExceedsTotalMarks() {
		double[] marks= {120.0, 120.0, 120.0, 120.0, 120.0};
		Assertions.assertThrows(ArithmeticException.class, 
				() -> CalculateGrade.calculateTotalMarks(marks)
		);
	}
	
	@Test
	void shouldReturnAverageMarksWhenGivenCorrectMarks() {
		double[] marks= {50.0, 50.0, 50.0, 50.0, 50.0};
		double obtainedTotal = CalculateGrade.calculateAverageMarks(marks);
		assertEquals(50.0, obtainedTotal);
	}
	
	@Test
	void shouldReturnGradeWhenGivenCorrectMarks() {
		double[] gradeAPlusMarks = {91,91,91,91,91};
		double[] gradeAMarks = {81,81,81,81,81};
		double[] gradeBPlusMarks = {71,71,71,71,71};
		double[] gradeBMarks = {61,61,61,61,61};
		double[] gradeCPlusMarks = {51,51,51,51,51};
		double[] gradeCMarks = {41,41,41,41,41};
		double[] gradeDMarks = {31,31,31,31,31};
		assertAll(
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeAPlusMarks),"A+"),
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeBPlusMarks),"B+"),
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeCPlusMarks),"C+"),
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeAMarks),"A"),
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeBMarks),"B"),
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeCMarks),"C"),
				()->assertEquals(CalculateGrade.calculateGradeForMarks(gradeDMarks),"D")
		);
	}
	

}
