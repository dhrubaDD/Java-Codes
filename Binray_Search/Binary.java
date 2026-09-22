import java.util.Arrays;

class BiSearch{

    public static int nthRoot(int x, int n){
        int low=0,high=x;
        while (low<=high) {
            int mid=(low+high)/2;
            int exp=(int)Math.pow(mid,n);
            if(exp==x) return mid;
            else if(exp>x) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

    public static int rotatedSearch(int[] arr, int target){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>arr[low]){
                if(arr[low]==target) return low;
                else if(arr[low]<target && target<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(arr[high]==target) return high;
                else if(arr[mid]<target && target<arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;

    }

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
        // int[] arr={2,8,8,8,8,8,11,13};
        // int ans[]=BiSearch.firstOcc(arr,8);
        // System.out.println(Arrays.toString(ans)); 

        // int[] a={7,8,9,1,2,3,4,5,6};
        // int ind=BiSearch.rotatedSearch(a,8);
        // System.out.println(ind);
        int ans=BiSearch.nthRoot(64,3);
        System.out.println(ans);

    }
}