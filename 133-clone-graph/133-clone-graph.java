/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> hm = new HashMap<>();
    public Node cloneGraph(Node node) {
        
        if(node == null)return node;
        if(hm.containsKey(node))return hm.get(node);
        
        ArrayList<Node> neigh = new ArrayList<>();
        
        Node temp = new Node(node.val, neigh);
        
        hm.put(node, temp);
        
        for(Node n : node.neighbors)
        {
            temp.neighbors.add(cloneGraph(n));
        }
        return temp;
        
    }
}