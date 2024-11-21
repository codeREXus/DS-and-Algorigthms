#method 1

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        int i;
        while(d>0){
            int temp =arr[0];
            for(i=1;i<arr.length;i++)
            {
                arr[i-1]=arr[i];
            }
            arr[i-1]=temp;
            d-=1;
        }
    }
}

#Method 2
class Solution{
  static void rotateArr(int arr[], int d) {
        // add your code here
        int n= arr.length;
        d=d%n;
        
        int arrlen=gcd(n,d);
        for(int i=0;i<arrlen;i++){
            int temp = arr[i];
            int curr_idx=i;
            while(true){
                int next_idx = (curr_idx+d)%n;
                if(next_idx==i){
                    break;
                }
                arr[curr_idx]=arr[next_idx];
                curr_idx=next_idx;
            }
            arr[curr_idx]=temp;
        }
        
    }
    static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
