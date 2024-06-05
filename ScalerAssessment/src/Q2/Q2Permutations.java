package Q2;

import java.util.ArrayList;
import java.util.Collections;

public class Q2Permutations {

	public static void main(String[] args) {
		 ArrayList<Integer> input = new ArrayList<>();
	        input.add(1);
	        input.add(2);
	        input.add(3);
//	                [1, 2, 3]
//	        		[1, 3, 2]
//	        		[2, 1, 3]
//	        		[2, 3, 1]
//	        		[3, 2, 1]
//	        		[3, 1, 2]

	        
	        ArrayList<ArrayList<Integer>> result= permuteList(input);
	        
	        for (ArrayList<Integer> list : result) {
	            System.out.println(list);
	        }

	}
	
	static ArrayList<ArrayList<Integer>> permuteList(ArrayList<Integer> A){
		 ArrayList<ArrayList<Integer>> input2 = new ArrayList<>();
	        
	        if(A.size()==0){
	            return input2;
	        }
	        permute(A,0,input2);
	        return input2;
	}
	
	
	static public void permute(ArrayList<Integer> num, int start, ArrayList<ArrayList<Integer>> result){
		if(start == num.size()) {
			result.add(new ArrayList<>(num));
			return;
		}
		
	for(int i=start; i<num.size(); i++) {
		Collections.swap(num, i, start);
		permute(num, start+1, result);
		Collections.swap(num, i, start);
	}
	}

}

/*Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. 
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= N <= 9



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible permutation of the array.



Example Input
A = [1, 2, 3]


Example Output
[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3] 
  [2, 3, 1] 
  [3, 1, 2] 
  [3, 2, 1] ]


Example Explanation
All the possible permutation of array [1, 2, 3].*/
