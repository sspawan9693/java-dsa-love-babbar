package binarySearch;

public class BinarySearch {
    public static int binarySearch(int[]arr, int target){
        int n = arr.length;
        int start= 0;
        int end = n-1;
        int mid = (start + end)/2;

        while (start <= end){
            if (arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            mid = (start + end ) / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int target = 9;
        System.out.println("target index:"+ binarySearch(arr,target));
    }
}
