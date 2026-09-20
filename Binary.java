import java.util.Arrays;

class BiSearch{

    public static int[] firstOcc(int[] arr, int target){
        int l=0,h=arr.length-1;
        int[] first={-1,-1};
        int mid;

        while(l<=h){
            mid= l+(h-l)/2;
            if(arr[mid]==target){
                first[0]=mid;
                h=mid-1;
            } 
            else if(arr[mid]>target)h=mid-1;
            else l=mid+1;
        }
        l=0;h=arr.length-1;
        while(l<=h){
            mid= l+(h-l)/2;
            if(arr[mid]==target){
                first[1]=mid;
                l=mid+1;
            }
            else if(arr[mid]>target)h=mid-1;
            else l=mid+1;
        }
        return first;
    }

    public static int binarySearch(int[] arr,int target){
        int l=0,h=arr.length-1;
        int mid;

        while(l<=h){
            mid= l+(h-l)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target)h=mid-1;
            else l=mid+1;
        }
        return -1;
    }

}

public class Binary{
     
    public static void main(String[] args) {
        int[] arr={2,8,8,8,8,8,11,13};
        int ans[]=BiSearch.firstOcc(arr,8);
        System.out.println(Arrays.toString(ans)); 
    }
}