package javaModularArthmaticGCD;

public class DeleteOne {

	public static void main(String[] args)
	{
	int[] A = {3,9,6,8,3};
	System.out.println(solve(A));
	;
	}
	
	
	
	
	static public int  solve(int[] A) {
		int[] p=prefix(A);
		int[]  s=sufix(A);
		int ans=0;
		for(int i=0; i<A.length; i++) {
			if(i==0)
				ans=Math.max(ans, s[i+1]);
			else if(i==(A.length-1))
				ans=Math.max(ans, p[i-1]);
			else
				ans=Math.max(ans, Gcd(p[i-1], s[i+1]));
		}
		return ans;
		
	}
	static public int[]  prefix(int[] A) {
        int n=A.length;
        int[] P=new int[n];
        P[0]=A[0];
        int val=A[0];
        for(int i=1; i<n; i++){
            P[i]=Gcd(val, A[i]);
            val=P[i];
        }
//for(int p:P)System.out.print(p+",");
//System.out.println("val "+val);
return P;
	}
static public int[] sufix(int[] A) {
    int n=A.length;
        int[] S=new int[n];
        S[n-1]=A[n-1];
        int val2=A[n-1];
        for(int i=n-2; i>=0; i--){
           S[i]=Gcd(val2, A[i]);
           val2=S[i];
        }
        
//        for(int s:S)System.out.print(s+",");   
//        System.out.println("val2 "+val2);
        return S;
    }
	
	static public int Gcd(int a,int b){
        if(b==0) return a;
        return Gcd(b,a%b);
    }

}
/*Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.



Problem Constraints
2 <= N <= 105
1 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the maximum value of GCD.



Example Input
Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]


Example Output
Output 1:

 6
Output 2:

 15


Example Explanation
Explanation 1:

 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum value of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5.
 Maximum value of gcd is 15.*/