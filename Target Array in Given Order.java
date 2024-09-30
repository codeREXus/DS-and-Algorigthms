class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target= new int[0];
        for(int i=0;i<index.length;i++){
            target= insert(target,nums[i],index[i]);
        }
        return target;
    }
    int[] insert(int[] target,int num,int index){
        int[] result= new int[target.length +1];
        for(int i=0;i<target.length;i++){
            if(i<index)
                result[i]=target[i];
            else
                result[i+1]=target[i];
        }
        result[index]=num;
        return result;
    }
}
