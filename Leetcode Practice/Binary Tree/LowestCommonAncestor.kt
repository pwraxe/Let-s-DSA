/**ReVisit: ReUnderstand Again**/
class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        
        if(root == null || root == p || root == q) return root
        
        val left = lowestCommonAncestor(root?.left, p,q)
        val right = lowestCommonAncestor(root?.right, p,q)
        
        return when {
            left == null -> right
            right == null -> left
            else -> root
        }
    }
}
