package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,5,-4,8,6,22,54};
        int target = 8;
        System.out.println(linearSearch(arr, target, 1 ,4));
    }
    static int linearSearch(int[] arr, int target, int Start, int End){
       if (arr.length == 0) {
        return -1;
       }
       for (int i = Start; i <= End; i++) {
        int element = arr[i];
        if (element == target) {
            return i;
        }

       }
       return -1;
    } 
}
