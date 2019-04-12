package JUnitTesting;

/*
 *The constructor creates a Triangle object, where only the lengths of the sides
 *are recorded and the private variable p is the longest side.
 *We can write the test methods before the code. This has advantages in separating coding from testing.
 */

public class Triangle {
	private int p; // Longest edge
	private int q;
	private int r;

	public Triangle(int s1, int s2, int s3) {
		if (s1>s2) {
			p = s1; q = s2;
		} else {
			p = s2; q = s1; }
		if (s3>p) {
			r = p; p = s3;
		} else {
			r = s3;
		} }
	/*
	 * 
	 *  The isScalene method returns true if the triangle is scalene or
	 *  False when is not.
	 */
	public boolean isScalene() {
		return ((r>0) && (q>0) && (p>0) &&
				(p<(q+r))&& ((q>r) || (r>q)));
	}

	/*
	 *  The isEquilateral method returns true if the triangle is equilateral or
	 *  False when is not 
	 */
	public boolean isEquilateral() {
		return p == q && q == r;
	} 
	 
		 
	
}