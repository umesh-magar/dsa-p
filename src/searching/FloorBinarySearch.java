package searching;

public class FloorBinarySearch {
    public static void main(String[] args) {
        int[] arr={11,13,16,18,19,45,67};
        int target=70;
        int ans=floorBinarySearch(arr,target);
        System.out.println(ans);
    }
    static int floorBinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[start]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}

