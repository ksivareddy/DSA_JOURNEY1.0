package Linear_Search;

public class simpleLinearSearch {
    public static void main(String[] args) {
        int[] nums = {52,63,7,0,6,4,5};
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //search innthe array: return the index if item found
    // otherwise if item found return -1  
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0 ; index < arr.length ; index++){
            int element = arr[index];
            if (element == target ){
                return index;
            }
        }
        return -1;
    }
}
