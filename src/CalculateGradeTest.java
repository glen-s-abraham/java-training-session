import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	@ParameterizedTest
	@CsvSource(value= {
			"91,91,91,91,91,A+",
			"81,81,81,81,81,A",
			"71,71,71,71,71,B+",
			"61,61,61,61,61,B",
			"51,51,51,51,51,C+",
			"41,41,41,41,41,C",
			"31,31,31,31,31,D"
	})
	void shouldReturnGradeWhenGivenCorrectMarks(
			double mark1,
			double mark2,
			double mark3,
			double mark4,
			double mark5,
			String grade
	) {
		double[] marks = {mark1,mark2,mark3,mark4,mark5};
		assertEquals(CalculateGrade.calculateGradeForMarks(marks),grade);
	}
	

}
