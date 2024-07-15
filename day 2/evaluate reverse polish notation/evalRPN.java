import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack= new Stack<>();
        for (String i : tokens)
        {
            if("+".equals(i) || "-".equals(i) || "*".equals(i) || "/".equals(i) )
            {
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(calc(n1,n2,i));
            }
            else
            {
                stack.push(Integer.parseInt(i));
            }git 
        }
        return stack.pop();

    }
    private int calc(int n1,int n2 , String i)
    {
        int ans=0;
        if("+".equals(i))
        {
            ans=n2+n1;
        }
        if("-".equals(i))
        {
            ans=n2-n1;
        }
        if("*".equals(i))
        {
            ans=n2*n1;
        }
        if("/".equals(i))
        {
            ans = n2/n1;
        }
        return ans;

    }
}