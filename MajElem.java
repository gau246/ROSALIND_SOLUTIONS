import java.util.*;
import java.io.*;
import java.lang.*;

class MajElem{
	public static int majority(int k, int n, int[] a){
		HashMap <Integer,Integer> A=new HashMap <Integer,Integer>();
    		for(int x:a){
    			if(A.containsKey(x)){
    				A.put(x,A.get(x)+1);
    			}
    			else {
    				A.put(x,1);
    			}
    			
    			
    		}

    		for(Map.Entry <Integer,Integer> e:A.entrySet()){
    			if(e.getValue()>n/2){
    				int elem=e.getKey();
    				return elem;
    			}
    			
    		}

    		return -1;


	}
	

	

	public static void main(String [] args) throws IOException{
    	try{
    		FileInputStream f = new FileInputStream("/Users/gud135/Documents/CSE-465/ROSALIND_SOLUTIONS/rosalind_maj.txt");
    		//FileOutputStream out=new FileOutputStream("/Users/gud135/Documents/CSE-465/ROSALIND_SOLUTIONS/BinarySearch2");
    		BufferedReader br=new BufferedReader(new InputStreamReader(f));
    		String line;
    		
    		line=br.readLine();

    		String [] temp=line.split(" ");
    		int k=Integer.parseInt(temp[0]);
    		//System.out.println(k);
    		
    		int n=Integer.parseInt(temp[1]);
    		
    		//System.out.println(n);
    		for(int i=0;i<k;i++){
    			line=br.readLine(); 
    			String [] arr= line.split(" ");
    		    int [] G=new int[arr.length];
    		    for(int j=0;j<arr.length;j++){
    				G[j]=Integer.parseInt(arr[j]);
    				//int element=majority(k,n,G);
    				//System.out.print(element);

    			}

    		int element=majority(k,n,G);
    		System.out.print(element +" ");

    		}

    		
    		
    		
    		
    		

    	} catch(IOException e){
    		e.printStackTrace();
    	}
    	
    		
    	
    	
    }
}