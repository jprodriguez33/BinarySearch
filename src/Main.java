public class Main {
    public static void main(String[] args) {

        int target = 565;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int first = 0;
        int last = 31;
        int mid = (first+last)/2;

        if (target == array[mid]) {
            System.out.print(mid);
        }else if (target > array[mid]) {
            first = mid + 1;
        }else {
            last = mid - 1;
        }
        if (target > last) {
            System.out.println("Target number not found!");
        }

    }
}