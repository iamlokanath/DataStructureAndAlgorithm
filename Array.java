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

    public static boolean isPrime(int n){
        if (n <=1 ) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //reverse number
    public int reverseNumber(int num){
        int lastDigit;
        int reversedNumber = 0;
        while (num != 0) {
            lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num /10;

        }
        // System.out.println("Reversed Number is: "+ reversedNumber);
        return reversedNumber;
    }

    public static double powerOfTwo(int n) {
        return Math.pow(2, n);
    }
    //binary to descimal
    public static int binaryToDescimal(int bin){
        int last_digit;
        int descimal =0;
        while (bin != 0) {
            last_digit = bin % 10;
            descimal += last_digit * (powerOfTwo(last_digit));
            bin = bin / 10;
        }
        return descimal;
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
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("The number of prime numbers between 0 to 100 is " + count);
        //buterfly structuure in * pattern
        //reverse a number
        int number = 123;
        System.out.println(arrayops.reverseNumber(number));
        //binary to descimal
        int binary = 1010;
        System.out.println(binaryToDescimal(binary));
        //desimal to binary


        
    }
}