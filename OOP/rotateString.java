class Solution {
    public boolean rotateString(String s, String goal) {
        if (goal.length()!=s.length())
            return false;


        String joined=s+s;
        
        if(joined.contains(goal))
            return true;
        return false;

        
    }
}
class RotateString {
    public static void main(String[] args){
        String s = "abcde";
         String goal = "cdeab";
        Solution sol=new Solution();
        System.out.println(sol.rotateString(s,goal));
    }
    
}
