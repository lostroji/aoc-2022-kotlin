fun main() {

    var firstPart: List<String>
    var secondPart: List<String>
    var firstPartSequence: List<String>
    var secondPartSequence: List<String>
    val numberListFirstPair: MutableList<Int> = mutableListOf()
    val numberListSecondPair: MutableList<Int> = mutableListOf()

    var totalValue = 0
    var index = 0

    fun part1(input: List<String>): Int {

        while (index < input.size) {
            firstPart = input[index].split(",").subList(0, 1)
            secondPart = input[index].split(",").subList(1, 2)
            firstPartSequence = firstPart[0].split("-")
            secondPartSequence = secondPart[0].split("-")

            for (numbers in firstPartSequence.first().toInt()..firstPartSequence.last().toInt()) {
                numberListFirstPair.add(numbers)
            }
            for (numbers in secondPartSequence.first().toInt()..secondPartSequence.last().toInt()) {
                numberListSecondPair.add(numbers)
            }

            if (numberListFirstPair.containsAll(numberListSecondPair)) {
                totalValue++
            } else if (numberListSecondPair.containsAll(numberListFirstPair)) {
                totalValue++
            }

            numberListFirstPair.clear()
            numberListSecondPair.clear()
            index++
        }
        return totalValue
    }

    fun part2(input: List<String>): Int {

        while (index < input.size) {
            firstPart = input[index].split(",").subList(0, 1)
            secondPart = input[index].split(",").subList(1, 2)
            firstPartSequence = firstPart[0].split("-")
            secondPartSequence = secondPart[0].split("-")

            for (numbers in firstPartSequence.first().toInt()..firstPartSequence.last().toInt()) {
                numberListFirstPair.add(numbers)
            }
            for (numbers in secondPartSequence.first().toInt()..secondPartSequence.last().toInt()) {
                numberListSecondPair.add(numbers)
            }

            if (numberListFirstPair.intersect(numberListSecondPair).isNotEmpty()) {
                totalValue++
            }

            numberListFirstPair.clear()
            numberListSecondPair.clear()
            index++
        }
        return totalValue
    }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}