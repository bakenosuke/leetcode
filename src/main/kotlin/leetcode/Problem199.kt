package leetcode

// (Medium) https://leetcode.com/problems/binary-tree-right-side-view
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val visible = mutableListOf<Int>()
        if (root == null) return visible

        findWhatsVisible(listOf(root), visible)

        return visible
    }

    fun findWhatsVisible(roots: List<TreeNode>, visible: MutableList<Int>) {
        if (roots.isEmpty()) return

        visible.add(roots.last().`val`)

        val nextLevel = mutableListOf<TreeNode>()
        for (node in roots) {
            node.left?.let { nextLevel.add(it) }
            node.right?.let { nextLevel.add(it) }
        }
        findWhatsVisible(nextLevel, visible)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}

fun main() {
    
}