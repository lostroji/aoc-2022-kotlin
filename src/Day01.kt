fun main() {
    fun part1(input: List<String>): Int {

        /** have declared a for loop to check each element(calories) of the input list
         * then adds the calories of each elf altogether **/
        var adder = 0
        val elvesTotalCaloriesList: MutableList<Int> = mutableListOf()

        for (elements in input) {
            if (elements == "") {
                elvesTotalCaloriesList.add(adder)
                adder = 0
            } else {
                adder += elements.toInt()
            }
            elvesTotalCaloriesList.add(adder)
        }
        return elvesTotalCaloriesList.max()
    }

    fun part2(input: List<String>): Int {
        var adder = 0
        val elvesTotalCaloriesList: MutableList<Int> = mutableListOf()
        val emptyList: MutableList<Int> = mutableListOf()

        for (elements in input) {
            if (elements == "") {
                elvesTotalCaloriesList.add(adder)
                adder = 0
            } else {
                adder += elements.toInt()
            }
            elvesTotalCaloriesList.add(adder)
            elvesTotalCaloriesList.remove(0)
        }

        elvesTotalCaloriesList.remove(elvesTotalCaloriesList.max())
        var sum = 0
        for (threeMostCalories in 0..2) {
            emptyList.add(elvesTotalCaloriesList.max())
            elvesTotalCaloriesList.remove(elvesTotalCaloriesList.max())
        }

        for (elements in emptyList) {
            sum += elements
        }
        return sum
    }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
