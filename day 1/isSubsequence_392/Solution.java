//topic : two pointer

public class Solution {
    public boolean IsSubsequence_392(String s, String t) {
        int i=0;
        int j=0;

        while(i<s.length() && j<t.length())
        {
            if (s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return i == s.length();

    }
    public static void main (String args[])
    {
        Solution solution = new Solution();
        System.out.println(solution.IsSubsequence_392("ana","ananya"));
    }

}