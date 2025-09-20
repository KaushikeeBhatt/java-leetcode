class Solution {
    public String removeDuplicateLetters(String s) {
     //last index
     int[] lastindex=new int[26];
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        lastindex[c-'a']=i;
     }   
     boolean[] visited=new boolean[26];
     Stack<Character> stack = new Stack<>();
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(visited[c-'a']==true) continue;
        while(!stack.isEmpty() && c<stack.peek() && lastindex[stack.peek()- 'a']>i){
            visited[stack.pop()- 'a']=false;
        }
        stack.push(c);
        visited[c - 'a'] = true;
     }
        StringBuilder sb = new StringBuilder(); for (char cc : stack) sb.append(cc);
        return sb.toString();
    }
}