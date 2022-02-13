/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList <TreeNode> queue = new LinkedList<>(); //Creating queue for keeping track of unvisited nodes
        List<List<Integer>> Result = new ArrayList<List<Integer>>(); //Storing final order of BFS
        
        if(root == null){
            return Result;
        }
        
        queue.add(root);  //root node is added to the queue
        
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>(); //creating sublist for each level
            
            for(int i=0; i<levelNum; i++){
                TreeNode current_node = queue.peek(); //visiting a node in the queue
                if(current_node.left !=null) queue.add(current_node.left); //adding the node's left child to the queue
                if(current_node.right!=null) queue.add(current_node.right); //adding the node's right child to the queue
                subList.add(queue.poll().val); //dequeuing the node and adding it to sublist indicating that it's visited
                }
            Result.add(subList);  //adding the sublists to the final result
        }
        return Result;
    }
}