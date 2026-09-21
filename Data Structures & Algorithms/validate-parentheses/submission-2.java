class Solution {
    public boolean isValid(String s) {
        Stack<String> b = new Stack<>();
        Map<String, String> brackets = Map.of("(",")","{","}","[","]");
        for(String c : List.of(s.split(""))){
            if(brackets.keySet().contains(c)){
                b.push(c);
            }else if (brackets.values().contains(c)){
                if(b.empty() || !c.equals(brackets.get(b.peek()))){
                    return false;
                }else{
                    b.pop();
                }
            }
        }
        return b.empty();
    }
}
