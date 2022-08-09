class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        
        if(pushed.length==0)
        {
            return true;
        }
        
        int j= 0;
        
        for(int i=0;i<pushed.length;i++)
        {
            st.push(pushed[i]);
            while(st.isEmpty() == false && j<popped.length && st.peek() == popped[j])             {
                st.pop();
                j++;
            }
        }
        
        if(st.size()==0)
        {
            return true;
        }
        
        return false;
    }
}
