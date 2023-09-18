//Binary Search on Descending List by Template 1
class Solution {

    fun doBinSearch(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size-1

        while (start <= end) {
            val midIndex = start + (end - start) / 2
            //println("[$midIndex](${nums[midIndex]}) = $target")
            when {
                nums[midIndex] < target -> end = midIndex - 1
                nums[midIndex] > target -> start = midIndex + 1
                nums[midIndex] == target -> return midIndex
            }
        }
        return -1
    }
}

fun main() {
    Solution().apply {
        println(doBinSearch(intArrayOf(9,8,7,6,5,4,3,2,1),4))   //5
        println(doBinSearch(intArrayOf(9,8,7,6,5,4,3,2,1),5))   //4
        println(doBinSearch(intArrayOf(9,8,7,6,5,4,3,2,1),6))   //3
    }
}
