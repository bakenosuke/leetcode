package leetcode.problem518

// (Medium) https://leetcode.com/problems/coin-change-ii
class Solution {
    fun change(amount: Int, coins: IntArray): Int {
        if (amount == 0) return 1
        if (coins.min() > amount) return 0
        val memo = Array(amount) { Array(coins.size) { 0 } } // Memoization table, amount x coins

        (1..amount).forEach { target ->
            coins.forEachIndexed { coinIndex, coin ->
                memo[target - 1][coinIndex] += if (coin == target) 1 else 0
                memo[target - 1][coinIndex] += if (target - 1 - coin >= 0) memo[target - 1 - coin][coinIndex] else 0
                memo[target - 1][coinIndex] += if (coinIndex - 1 >= 0) memo[target - 1][coinIndex - 1] else 0
            }
        }
        return memo.last().last()
    }
}

fun main() {
    Solution().change(500, intArrayOf(1, 2, 5)).also {
        println(it)
    }
}