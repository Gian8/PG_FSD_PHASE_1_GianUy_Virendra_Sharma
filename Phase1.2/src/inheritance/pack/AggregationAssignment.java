package inheritance.pack;

class Operation {
	int square(int n) {
		return n*n;
	}
}
public class AggregationAssignment {
	double pi = 3.14;
	Operation op;
	double area(int radius) {
		op = new Operation();
		int rSquare = op.square(radius);
		return pi*rSquare;
	}
//	double areaOfRectangle(int LOrB) {
//		op = new Operation();
//		int recSideSquare = op.square(LOrB);
//		return recSideSquare;
//	}
	double areaOfRectangle(int a, int b) {
		op = new Operation();
		int diagonalSquare = (op.square(a) + op.square(b)); //get diagonal(squared) via length(squared) + width(squared)
		double recSideSquare = (Math.sqrt(diagonalSquare-op.square(b))) * b; //area = width x square root of (diagonal squared - width squared)
		return recSideSquare;
	}
	double areaOfSquare(int side) {
		op = new Operation();
		int sideSquare = op.square(side);
		return sideSquare;
	}
	public static void main(String args[]) {
		AggregationAssignment c = new AggregationAssignment();
		double result = c.area(5);
		System.out.println("Area of circle is: " + result);
//		double AORresult = c.areaOfRectangle(8);
//		System.out.println("Area of rectangle is: " + AORresult);
		double AORresult = c.areaOfRectangle(8,3);
		System.out.println("Area of rectangle is: " + AORresult);
		double AOSresult = c.areaOfSquare(6);
		System.out.println("Area of square is: " + AOSresult);
	}
}
