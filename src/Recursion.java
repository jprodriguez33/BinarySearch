public class Recursion {

    public static int BinarySearch(int[] arr, int first, int last, int target) {
       if (last>=first){
           int mid = first+(last - first)/2;
           if (arr[mid] == target){
               return mid;
           }
           if (arr[mid] > target) {
               return BinarySearch(arr, first, mid - 1, target);
           }else{
               return BinarySearch(arr,mid+1,last,target);
           }
           }
       return -1;
        }
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int first = 0;
        int last = arr.length-1;
        int target = 565;
        int result = BinarySearch(arr,0,last,target);

        if(result == -1)
            System.out.println("Element was not found");
        else
            System.out.println("Element found at: "+result);



    }
}
