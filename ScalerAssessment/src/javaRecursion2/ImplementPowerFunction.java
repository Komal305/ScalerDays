package javaRecursion2;

public class ImplementPowerFunction {
	public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 3;
       // System.out.println(powerMod(A, B, C)); // 2
        //System.out.println(pow(A, B, C)); 
        System.out.println(2%3);
        A = -1;
        B = 1;
        C = 20;
        //System.out.println(powerMod(A, B, C)); //0
    }

    public static int powerMod(int A, int B, int C) {
        if (B == 0)
            return 1 % C;

        long result = 1;
        long base = A % C;

        while (B > 0) {
            if (B % 2 == 1)
                result = (result * base) % C;
            B /= 2;
            base = (base * base) % C;
        }

        return (int) result;
    }
    
    public static int pow(int A, int B, int C) {
        if(A == 0)
            return 0;
        if(B == 0)
            return 1;
        long ans = pow(A, B / 2, C);
        //System.out.println(1/2);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
            ans = (ans * A);
        ans = (ans + C) % C;
        return (int)ans;
    }
}
/*Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.


Problem Constraints
-109 <= A <= 109
0 <= B <= 109
1 <= C <= 109


Input Format
Given three integers A, B, C.


Output Format
Return an integer.


Example Input
Input 1:
A = 2
B = 3
C = 3
Input 2:
A = 3
B = 3
C = 1


Example Output
Output 1:
2
Output 2:
0


Example Explanation
Explanation 1:
23 % 3 = 8 % 3 = 2
Explanation 2:
33 % 1 = 27 % 1 = 0
*/