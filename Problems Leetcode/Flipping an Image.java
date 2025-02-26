class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            image[i]=swap(image[i]);
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0)
                image[i][j]=1;
                else
                image[i][j]=0;
            }
        }
        System.gc();
        return image;
    }
    int[] swap(int[] arr){
        int start=0,end;
        end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
