package MathWorks;

public class MathWorks {

	public static void main(String[] args) {
		// The objective of this is to create formulas that are geometric shapes
		// Perimeter: 2 2 P LW = +
		// W = width
		// L = length
		// Area: A LW
		//	
	
		int length = 5; // replace the value here
		int width = 6; // replace the value here
		
		int rectanglePerimeter = calculateRectanglePerimeter(length, width);
		int rectangleArea = calculateRectangleArea(length, width);
		
		System.out.println("This is the perimeter of a rectangle: " + rectanglePerimeter);
		System.out.println("This is the area of a rectangle: " + rectangleArea);
		
	
	// Triangle Area: A =1/2 ⋅ b h
		int base = 5; // replace the value here
		int height = 6; // replace the value here
	
		int triangleArea = calculateTriangleArea(base, height);
	
		System.out.println("This is the area of the triangle: " + triangleArea);
	
	// Triangle Perimeter: legA + legB + legC
		int legA = 4; // replace value here
		int legB = 4; // replace value here
		int legC = 4; // replace value here
	
		int trianglePerimeter = calculateTrianglePerimeter(legA, legB, legC);
		
		System.out.println("This is the perimeter of the Triangle: " + trianglePerimeter);
	
	// Right Triangle: sqrt(legA^2+legB^2)
		int leg1 = 5; // replace value here
		int leg2 = 9; // replace value here
	
		double rightTriangleHyp = calculateRightTriangleHyp(leg1, leg2);
		
		System.out.println("This is the hyp of the right triangle: " + rightTriangleHyp);
	}
	
	
		// The following is the method to calculate a rectangles perimeter
		public static int calculateRectanglePerimeter(int length, int width) {
			return 2 * (length + width);
	
		}
		// The following is the method to calculate a rectangles area
		public static int calculateRectangleArea(int length, int width) {
			return length * width;
		}
	
		// The following is the method to calculate the triangle area
		public static int calculateTriangleArea(int base, int height) {
			return (int) (.5 * base * height);
		}
		
		// The following is the method for calculating the triangle perimeter
		public static int calculateTrianglePerimeter(int legA, int legB, int legC) {
			return legA + legB + legC;
		}
		
		// The following is the method for calculating right triangle hyptonese
		public static double calculateRightTriangleHyp(int leg1, int leg2) {
			return Math.sqrt(leg1 * leg1 + leg2 * leg2);
		}
}
