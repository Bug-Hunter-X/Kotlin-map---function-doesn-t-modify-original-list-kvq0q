fun main() {
    val mutableList = mutableListOf(1, 2, 3)
    mutableList.replaceAll { it * 2 }
    println(mutableList) // Output: [2, 4, 6]

    //Alternative using indices
    val list = mutableListOf(1,2,3,4,5)
    for (i in list.indices) {
        list[i] = list[i] * 2
    }
    println(list)//Output: [2, 4, 6, 8, 10]
}