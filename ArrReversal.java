class ArrReversal{

    //this is the o(1) solution to the reversing an array
    public static void main(String args[]){
        int []arr = {1,2,3,4};
          int [] reversedArr = reverseArray(arr);
          printArray(reversedArr);
          
    }

    static int [] reverseArray(int []arr){
          
        //create a new Array same size as arr
        int [] brr = new int[arr.length];
        int j=arr.length-1;
        //iterate the array arr and append the elements
        //in reverse to the array brr
        for(int i=0;i<arr.length;i++){
            brr[j] =arr[i];
            j--;
        }
        return brr;
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}