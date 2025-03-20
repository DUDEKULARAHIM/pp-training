
import java.util.*;
public class practice1 {
    public static void main(String[] args) {


        largestelement();
        System.out.println();
        secondlargest();
        System.out.println();
        thirdlargest();


    }

    public static void largestelement(){
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
        System.out.println("largest number : "+largest);
        System.out.println("Arry is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void secondlargest(){
        System.out.println("hello second second largest");
        int[] arr = {1,3,4,7,6,8};
        int n=arr.length;
        int largest = arr[0];
        int secondlargest  = 0;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("forst largest element is : "+largest);
        System.out.println("Seocnd largest element is : "+secondlargest);
    }


    public static void thirdlargest(){
        System.out.println("hello second second largest");
        int[] arr = {1,3,4,7,6,8};
        int n=arr.length;
        int largest = arr[0];
        int secondlargest  = Integer.MIN_VALUE;
        int thirdlargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]<largest){
                thirdlargest=secondlargest;
                secondlargest=arr[i];
            }else if(arr[i]>thirdlargest && arr[i]<secondlargest){
                thirdlargest=arr[i];
            }
        }
        System.out.println("forst largest element is : "+largest);
        System.out.println("Seocnd largest element is : "+secondlargest);
        System.out.println("Third largest element is : "+thirdlargest);
    }
}
