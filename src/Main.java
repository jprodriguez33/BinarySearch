public class Main {
    public static void main(String[] args) {

        int target = 565;
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int first = 0;
        int last = array.length-1;
        int mid = (first+last)/2;

    while(first <= last) {
        if (array[mid] < target) {
            first = mid + 1;
        } else if (array[mid] == target) {
            System.out.println(" The target number is "+ mid);
            break;
        } else {
            last = mid - 1;
        }
        mid = (first + last) / 2;
         }
        if (first > last) {
            System.out.println("Target number is out of bounds");
        }

    }
}