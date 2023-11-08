import java .util.Scanner;
public class Binarysearch{

     public static int binarysearch(int[] arr, int key ){
        int low = 0;
        int high = arr.length-1;

        System.out.println(" key is :" + key);
          
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] == key ){
                return mid;

            }
            else if(arr[mid] < key){
              low = mid + 1;

            }else{
               high = mid - 1;
            }
            
        }
       return -1;
     }


public static void main(String[] args){
         
         Scanner scanner = new Scanner(System.in); 
         int n = scanner.nextInt();
         int arr[] = new int[n];
        
         int key = scanner.nextInt();
         
         for(int i = 0 ;i < n ; i++){
            arr[i] =scanner.nextInt();
         }
         
          int result = binarysearch(arr,key);
          if(result != -1){
            System.out.println("Element is found at" +" "+  result);
          }else{
            System.out.println("Element is not found");
          }

   }
}