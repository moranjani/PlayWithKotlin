package moran.kotlincourse.utils


    fun sum(list: List<Int>): Int {
        var result = 0
        for (i in list) {
            result += i
        }
        return result
    }

    fun List<Int>.mySum() : Int {
        var result = 0
        for (i in this) {
            result += i
        }
        return result
    }

    fun main(args: Array<String>) {
        val sum = sum(listOf(1, 2, 3))
        val mySum = listOf(1, 2, 3).mySum()
        println(sum)    // 6
        println(mySum)
    }

