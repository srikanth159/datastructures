public class Numtobin {
    public static void main(String[] args) {
        int num = 1041;
        int id = 2;
        int arr[] = new int[num];
        for(int i = num-1;i > 1; i--)
        {
            arr[i] = num % id;
            //num--;
            num = num / 2;
        }
        //System.out.println(arr.length);
        //for(int i = arr.length-1 ;i >= 0;i--){
           // System.out.print(arr[i]);
        //}
         for(int i = arr.length-1 ;i >= 0;i--){
            System.out.print(arr[i]);
        }
    }
}