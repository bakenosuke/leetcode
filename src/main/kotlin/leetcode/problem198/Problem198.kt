package leetcode.problem198

import kotlin.math.max

// (Medium) https://leetcode.com/problems/house-robber
class Solution {
    fun rob(nums: IntArray): Int {
        val memo = IntArray(nums.size)
        val maxAtEachPoint = nums.indices.map {
            maxAt(it, nums, memo)
        }
        return maxAtEachPoint.last()
    }

    fun maxAt(index: Int, nums: IntArray, memo: IntArray): Int {
        val result = when (index) {
            0 -> nums.getOrElse(0) { 0 }
            1 -> max(nums.getOrElse(0) { 0 }, nums.getOrElse(1) { 0 })
            else -> {
                val maxPreviousGroup = max(
                    memo.getOrElse(index = index - 2) { 0 },
                    memo.getOrElse(index = index - 3) { 0 }
                )
                val maxCurrentGroup = max(
                    maxPreviousGroup + nums[index],
                    memo.getOrElse(index = index - 1) { 0 }
                )
                maxCurrentGroup
            }
        }
        memo[index] = result
        return result
    }
}

fun main() {

    val nums = intArrayOf(2, 1, 1, 2, 3, 1)
    val result = Solution().rob(nums)

    println(result)
}