public class display {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60};
        displayArray(arr,0);
    }
    public static void displayArray(int arr[], int idx){
        if(idx==arr.length) return;
        System.out.println(arr[idx]+" ");
        displayArray(arr, idx+1);
    }
    
}
