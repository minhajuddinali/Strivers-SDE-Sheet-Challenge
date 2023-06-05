https://www.codingninjas.com/codestudio/problems/pascal-s-triangle_8230805?challengeSlug=striver-sde-challenge
solution 2
  import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> res=new ArrayList<>();
				 ArrayList<Long> arr,last=null;
				 for(int i=0;i<n;i++)
				 {
					 arr=new ArrayList<>();
					 for(int j=0;j<=i;j++)
					 {
						 if(j==0||j==i)
						 arr.add(1L);
						 else
						 arr.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
					 }
					 
					 res.add(arr);
				 }
		return res;
	}
}
