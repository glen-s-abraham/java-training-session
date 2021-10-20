
public class CalculateGrade {
	private static int NUMBER_OF_SUBJECTS;
	private static int TOTAL_MARKS;
	static {
		NUMBER_OF_SUBJECTS=5;
		TOTAL_MARKS =500;
	}
	
	public static double calculateTotalMarks(double[] marks) throws ArithmeticException {
		if(marks.length!=NUMBER_OF_SUBJECTS) 
			throw new ArithmeticException("Number of Subjects incorrect");
		double totalMarksObtained = 0;
		for(double mark:marks) {
			totalMarksObtained += mark;
		}
		if(totalMarksObtained>TOTAL_MARKS)
			throw new ArithmeticException("Invalid Mark entries");
		return totalMarksObtained;
	}
	
	public static double calculateAverageMarks(double[] marks) {
		return calculateTotalMarks(marks)/NUMBER_OF_SUBJECTS;
	}
	
	public static String calculateGradeForMarks(double[] marks) {
		double averageMarksObtained = calculateAverageMarks(marks);
		if(averageMarksObtained>90) return "A+";
		if(averageMarksObtained>80 && averageMarksObtained<=90) return "A";
		if(averageMarksObtained>70 && averageMarksObtained<=80) return "B+";
		if(averageMarksObtained>60 && averageMarksObtained<=70) return "B";
		if(averageMarksObtained>50 && averageMarksObtained<=60) return "C+";
		if(averageMarksObtained>40 && averageMarksObtained<=50) return "C";
		return "D";
	}
}
