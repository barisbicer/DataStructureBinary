
class BinarySearch { 
	
	public static boolean binarySearchRecursive(int[] arr,int x,int left,int right ) {
		
		if(left>right)
			return false;
		
		int mid=(left+right)/2;
		
		if(arr[mid]==x)
			return true;
		else if(arr[mid] < x)
		    return binarySearchRecursive(arr,x,mid+1,right);
		else
		    return binarySearchRecursive(arr,x,left,mid-1);
		
		
		
	}
 
  
    public static void main(String args[]) { 
      
        int arr[] = { 1, 3, 5, 7, 9 ,10,11,12,14,16,25,26,28}; 
        
        System.out.println(binarySearchRecursive(arr,11,0,arr.length-1));
        
    } 
} 