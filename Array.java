import java.util.Scanner;

public class Array {
    
    //input array
    public void inputArray(int arr[], int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]  = scanner.nextInt();
            }
    }
    // print array
    public void printArray(int arr[], int n){
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    //reverse array
    public void reverseArray(int arr[], int n){
        int start = 0;
        int end = n-1;
        System.out.println("the reversed array is: ");
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Linear Search
    public void linearSearch(int arr[], int n, int s){
        for (int i = 0; i < n; i++) {   
            if (s == arr[i]) {
                System.out.println("The element found at " + i + " index.");
            }
        }
    }
    //binary search
    public int binarySearch(int arr[], int n, int s){
        int start = 0;
        int end = n-1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if (arr[mid] == s) {
                return mid;
                
            }
            else if(arr[mid] < s){
                start = mid + 1;
            }
            else if (arr[mid] > s) {
                end = mid -1;
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
       int n = scanner.nextInt();
       Array arrayops = new Array();
       int array[] = new int[n];
       //input array
       arrayops.inputArray(array, n);
       // print array
       arrayops.printArray(array, n);
       //reverse array
       arrayops.reverseArray(array, n);
       arrayops.printArray(array, n);
        //linear search
        System.out.println("Enter the element you want to search: ");
        int s = scanner.nextInt();
        arrayops.linearSearch(array, n, s);
        //binary search
        int result = arrayops.binarySearch(array, n, s);
        if (result == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("The element found at " + result + " index.");
        }
        
        //prime number, 0-100 no of primes
        //buterfly structuure in * pattern
        //reverse a number
        //binary to descimal
        //desimal to binary


        
    }
}