fun main() {
    fun part1(input: List<String>): Int {

        /** Initial Values based on the question information:
         *  A if our opponent chooses rock, X if we choose rock
         *  B if our opponent chooses paper, Y if we choose paper
         *  C if our opponent chooses scissors, Z if we choose scissors **/

        //Losing conditions: +0 score
        val rockLosingCondition = "B X"       //+1 rock score      0 + 1 = 1
        val paperLosingCondition = "C Y"      //+2 paper score     0 + 2 = 2
        val scissorsLosingCondition = "A Z"   //+3 scissors score  0 + 3 = 3
        //Equal conditions: +3 score
        val rockEqualCondition = "A X"        //+1 rock score      3 + 1 = 4
        val paperEqualCondition = "B Y"       //+2 paper score     3 + 2 = 5
        val scissorsEqualCondition = "C Z"    //+3 scissors score  3 + 3 = 6
        //Winning conditions: +6 score
        val rockWinningCondition = "C X"      //+1 rock score      6 + 1 = 7
        val paperWinningCondition = "A Y"     //+2 paper score     6 + 2 = 8
        val scissorsWinningCondition = "B Z"  //+3 scissors score  6 + 3 = 9

        var totalScore = 0
        var index = 0
        val emptyList: MutableList<String> = mutableListOf()

        while (index < input.size) {
            for (element in input) {
                emptyList.add(element)

                when {
                    rockLosingCondition in emptyList -> totalScore += 1
                    paperLosingCondition in emptyList -> totalScore += 2
                    scissorsLosingCondition in emptyList -> totalScore += 3
                    rockEqualCondition in emptyList -> totalScore += 4
                    paperEqualCondition in emptyList -> totalScore += 5
                    scissorsEqualCondition in emptyList -> totalScore += 6
                    rockWinningCondition in emptyList -> totalScore += 7
                    paperWinningCondition in emptyList -> totalScore += 8
                    scissorsWinningCondition in emptyList -> totalScore += 9
                }
                index++
                emptyList.clear()
            }
        }
        return totalScore
    }

    fun part2(input: List<String>): Int {

        /** Initial values based on the question information:
         *  A if our opponent chooses rock, X if we lose
         *  B if our opponent chooses paper, Y if we draw
         *  C if our opponent chooses scissors, Z if we win **/

        //Losing conditions: +0 score
        val rockLosingCondition = "B X"       //+1 rock score      0 + 1 = 1
        val paperLosingCondition = "C X"      //+2 paper score     0 + 2 = 2
        val scissorsLosingCondition = "A X"   //+3 scissors score  0 + 3 = 3
        //Equal conditions: +3 score
        val rockEqualCondition = "A Y"        //+1 rock score      3 + 1 = 4
        val paperEqualCondition = "B Y"       //+2 paper score     3 + 2 = 5
        val scissorsEqualCondition = "C Y"    //+3 scissors score  3 + 3 = 6
        //Winning conditions: +6 score
        val rockWinningCondition = "C Z"      //+1 rock score      6 + 1 = 7
        val paperWinningCondition = "A Z"     //+2 paper score     6 + 2 = 8
        val scissorsWinningCondition = "B Z"  //+3 scissors score  6 + 3 = 9

        var totalScore = 0
        var index = 0
        val emptyList: MutableList<String> = mutableListOf()

        while (index < input.size) {
            for (element in input) {
                emptyList.add(element)

                when {
                    rockLosingCondition in emptyList -> totalScore += 1
                    paperLosingCondition in emptyList -> totalScore += 2
                    scissorsLosingCondition in emptyList -> totalScore += 3
                    rockEqualCondition in emptyList -> totalScore += 4
                    paperEqualCondition in emptyList -> totalScore += 5
                    scissorsEqualCondition in emptyList -> totalScore += 6
                    rockWinningCondition in emptyList -> totalScore += 7
                    paperWinningCondition in emptyList -> totalScore += 8
                    scissorsWinningCondition in emptyList -> totalScore += 9
                }
                index++
                emptyList.clear()
            }
        }
        return totalScore
    }

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
