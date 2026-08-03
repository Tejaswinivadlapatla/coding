import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int[] arr = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]= sc.nextInt();
		        
		    }
		    int max= arr[0];
		    for(int k=0;k<n;k++){
		        if(arr[k]>max){
		            max=arr[k];
		        }
		    }
		    System.out.println(max);
		}
		

	}
}
