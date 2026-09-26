class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}




class MyLinkedList {

    ListNode head;
    private int size;


    public MyLinkedList() {
        head = new ListNode(0, null);
        size = 0;
    }

    /** Move 1 place behind the called index**/
    private ListNode getPrev(int index){
        ListNode curr = head;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        return curr;
    }
    
    public int get(int index) {
        if(index >= size){
            return -1;
        }
        return getPrev(index).next.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        ListNode prev = getPrev(index);
        ListNode newNode = new ListNode(val, prev.next);
        prev.next =newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size){
            return;
        }
        ListNode prev = getPrev(index);
        ListNode indexNode = prev.next;
        prev.next = indexNode.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */