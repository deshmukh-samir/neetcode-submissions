class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<Integer>();
        for(int i=0;i<operations.length;i++){
            String op = operations[i];
            if(op.equals("+")){
                int head = record.pop();
                int newHead = head + record.peek();
                record.push(head);
                record.push(newHead);
            }else if (op.equals("C")){
                record.pop();
            }else if (op.equals("D")){
                record.push(2* record.peek());
            }else{
                            record.push(Integer.valueOf(operations[i]));
            }

        }
        int sum = 0;
        for(Integer i : record){
            sum +=i;
        }
        return sum;
        
    }
}