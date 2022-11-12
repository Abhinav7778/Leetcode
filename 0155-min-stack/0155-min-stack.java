class MinStack {

    Node head;
    
    public MinStack()
    {
        head = null;
    }
    
    public void push(int val) {
        if(head == null)
        {
            head = new Node(null, val, val);
        }
        else
        {
            head = new Node(head, val, Math.min(val, head.min));
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
class Node
{
    int val, min;
    Node next;
    
    Node(Node next, int val, int min)
    {
        this.next = next;
        this.val = val;
        this.min = min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */