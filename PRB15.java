/*
15.	Program to Sort first half in ascending order and second half in descending order in an array
*/
import java.util.Arrays;

public class PRB15 {
    
    public static int[] customSort(int arr[]){
        int n = arr.length;
        int mid = n/2;
        for(int i=0; i<mid-1; i++){
            for(int j=0; j<mid-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }           
        }
        
        for(int i=0; i<mid-1; i++){            
            for(int j=mid; j<n-i-1; j++){                
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,5,77,3,5,22,66,8,6,45,13};
        System.out.println(Arrays.toString(arr));
        arr  = customSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
