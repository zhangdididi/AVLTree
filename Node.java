public class Node {
    int key;

    Node left;
    Node right;
    
    /**
     * 平衡因子
     */
    int bf;

    /**
     * 记录结点的父结点，如果结点是根结点，则 parent == null
     */
    Node parent;

    Node(int key, Node parent) {
        this.key = key;
        this.bf = 0;
        this.left = null;
        this.right = null;
        this.parent = parent;
    }
}
