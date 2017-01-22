import java.util.*;
import java.io.*;
import java.lang.*;


class binarySearch{
	public static int B_Search(int lower, int upper, int [] a, int k){
		
		//System.out.print(mid);
		if(lower>upper)
			return -1;
		 	
		int mid=(int) Math.floor((lower+upper)/2);

		if(a[mid]==k){
			return mid+1;
		}
		else if(a[mid]>k){
			return B_Search(lower,mid-1,a,k);
		}
		else {
			return B_Search(mid+1,upper,a,k);
		}
		
			
    }

    public static void main(String [] args) throws IOException{
    	try{
    		FileInputStream f = new FileInputStream("file.txt");
    		
    		BufferedReader br=new BufferedReader(new InputStreamReader(f));
    		String line;
    		line=br.readLine();
    		int m=Integer.parseInt(line);
    		//System.out.println(m);
    		line=br.readLine();
    		int n=Integer.parseInt(line);
    		//int lower=0;
    		//int upper=m;
    		//System.out.println(upper);
    		line=br.readLine();
    		String [] arr= line.split(" ");
    		int [] A=new int[arr.length];
    		for(int i=0;i<arr.length;i++){
    			A[i]=Integer.parseInt(arr[i]);
    			//System.out.println(A[i]);
    		}
    		line=br.readLine();
    		//System.out.println(line);
    		br.close();
    		String [] arr2=line.split(" ");
    		int [] keys=new int[arr2.length];
    		for(int i=0;i<arr2.length;i++){
    			keys[i]=Integer.parseInt(arr2[i]);
    			//System.out.print(keys[i]);
    			//System.out.print(" ");
    		}
    		for(int k:keys){
    			//System.out.println(k);
    			int index=B_Search(0,m,A,k);
    			System.out.print(index +" ");

    			//System.out.print(" ");
    		}
            System.out.println();

    		//out.close();



    		//int [] a=
    		//for(int i=)
    		//System.out.println(line);
    		/*while((line = br.readLine()) != null){
    		System.out.println(line);
    		}*/
    		

    	} catch(IOException e){
    		e.printStackTrace();
    	}
    	
    		
    		
    	
    }

}

