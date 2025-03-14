
import java.util.*;
public class practice1 {
    public static void main(String[] args) {
        int[] arr = {1,3,7,5,6};
        int n=arr.length;

        //printing largest element in array
        //brute force approach
        Arrays.sort(arr);
        System.out.println(arr[n-1]);

        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println("Arry is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
