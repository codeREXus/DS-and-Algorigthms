#The Under written code is done through string and string builder classses and methods, we can use direct approach by arithmatic operations too.

class Solution {
    public boolean isPalindrome(int x) {
       String str=Integer.toString(x);
       StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str))
            return true;
        return false;
    }
}
