fun main() {
    fun part1(input: List<String>): Int {

        var priorityAlphabet = 1
        var totalPriority = 0
        val wholeCharacterList: MutableList<Char> = mutableListOf()
        var firstHalfList: MutableList<Char>
        var secondHalfList: MutableList<Char>
        val intersectedList: MutableList<Char> = mutableListOf()

        // For loop for taking each line of the input text
        for (lines in input) {

            for (characters in lines) {
                // This for loop will add each character of each line in a list called wholeCharacterList
                wholeCharacterList.add(characters)
            }

            /** These lines will divide the list into 2 sub lists: firstHalfList, secondHalfList
             * firstHalfList = [wholeCharacterList[0], ..., wholeCharacterList.size/2]
             * secondHalfList = [wholeCharacterList.size/2 , ..., wholeCharacterList.size]
             **/
            firstHalfList = wholeCharacterList.subList(0, wholeCharacterList.size / 2)
            secondHalfList = wholeCharacterList.subList(
                wholeCharacterList.size / 2, wholeCharacterList.size
            )

            // another list to add all the common items in both half lists
            intersectedList.addAll(firstHalfList.intersect(secondHalfList))
            wholeCharacterList.clear()
        }

        /** This part loops until the intersectedList becomes empty
         * First for loop goes from a to z and adds the scores of each that exist in the list
         * Second for loop goes from A to Z and adds the scores of each that exists in the list
         * the calculated character scores are removed afterwards accordingly
         * **/
        while (!intersectedList.isEmpty()) {
            
            for (alphabetLowerCase in 'a'..'z') {
                if (alphabetLowerCase in intersectedList) {
                    totalPriority += priorityAlphabet
                    intersectedList.remove(alphabetLowerCase)
                }
                priorityAlphabet++
            }
            for (alphabetHigherCase in 'A'..'Z') {
                if (alphabetHigherCase in intersectedList) {
                    totalPriority += priorityAlphabet
                    intersectedList.remove(alphabetHigherCase)
                }
                priorityAlphabet++
            }
            priorityAlphabet = 1
        }
        return totalPriority
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val input = readInput("Day03_sample")
//    println(part1(input))
    println(part2(input))
}