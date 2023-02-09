fun main() {

    fun part1(input: List<String>): String {


        //Initial values
        val firstCargoList = mutableListOf('Q', 'F', 'M', 'R', 'L', 'W', 'C', 'V')
        val secondCargoList = mutableListOf('D', 'Q', 'L')
        val thirdCargoList = mutableListOf('P', 'S', 'R', 'G', 'W', 'C', 'N', 'B')
        val fourthCargoList = mutableListOf('L', 'C', 'D', 'H', 'B', 'Q', 'G')
        val fifthCargoList = mutableListOf('V', 'G', 'L', 'F', 'Z', 'S')
        val sixthCargoList = mutableListOf('D', 'G', 'N', 'P')
        val seventhCargoList = mutableListOf('D', 'Z', 'P', 'V', 'F', 'C', 'W')
        val eighthCargoList = mutableListOf('C', 'P', 'D', 'M', 'S')
        val ninthCargoList = mutableListOf('Z', 'N', 'W', 'T', 'V', 'M', 'P', 'C')

        val floatingList: MutableList<Char> = mutableListOf()
        var splitSubList: List<String>
        val mainInfoSubList = input.subList(10, input.size)
        val finalizedList: MutableList<String> = mutableListOf()

        for (index in 0..mainInfoSubList.size - 1) {

            splitSubList = mainInfoSubList[index].split(" ")
            finalizedList.addAll(splitSubList)
            finalizedList.removeFirst()
            finalizedList.removeAt(1)
            finalizedList.removeAt(2)

            for (stackCount in 1..56) {

                if (stackCount == finalizedList.first().toInt()) {

                    for (counter in 1..stackCount) {
                        when (finalizedList[1].toInt()) {                   //startingPoint
                            1 -> {
                                floatingList += firstCargoList.last()
                                firstCargoList.removeLast()
                            }

                            2 -> {
                                floatingList += secondCargoList.last()
                                secondCargoList.removeLast()
                            }

                            3 -> {
                                floatingList += thirdCargoList.last()
                                thirdCargoList.removeLast()
                            }

                            4 -> {
                                floatingList += fourthCargoList.last()
                                fourthCargoList.removeLast()
                            }

                            5 -> {
                                floatingList += fifthCargoList.last()
                                fifthCargoList.removeLast()
                            }

                            6 -> {
                                floatingList += sixthCargoList.last()
                                sixthCargoList.removeLast()
                            }

                            7 -> {
                                floatingList += seventhCargoList.last()
                                seventhCargoList.removeLast()
                            }

                            8 -> {
                                floatingList += eighthCargoList.last()
                                eighthCargoList.removeLast()
                            }

                            9 -> {
                                floatingList += ninthCargoList.last()
                                ninthCargoList.removeLast()
                            }
                        }
                        when (finalizedList.last().toInt()) {               //destinationPoint
                            1 -> firstCargoList += floatingList
                            2 -> secondCargoList += floatingList
                            3 -> thirdCargoList += floatingList
                            4 -> fourthCargoList += floatingList
                            5 -> fifthCargoList += floatingList
                            6 -> sixthCargoList += floatingList
                            7 -> seventhCargoList += floatingList
                            8 -> eighthCargoList += floatingList
                            9 -> ninthCargoList += floatingList
                        }
                        floatingList.removeLast()
                    }
                } else if (stackCount > finalizedList.first().toInt()) {
                    break
                }
            }
            finalizedList.clear()
        }
        return "${firstCargoList.last()}${secondCargoList.last()}${thirdCargoList.last()}${fourthCargoList.last()}${fifthCargoList.last()}${sixthCargoList.last()}${seventhCargoList.last()}${eighthCargoList.last()}${ninthCargoList.last()}"
    }

    fun part2(input: List<String>): String {
        // Initial values
        val firstCargoList = mutableListOf('Q', 'F', 'M', 'R', 'L', 'W', 'C', 'V')
        val secondCargoList = mutableListOf('D', 'Q', 'L')
        val thirdCargoList = mutableListOf('P', 'S', 'R', 'G', 'W', 'C', 'N', 'B')
        val fourthCargoList = mutableListOf('L', 'C', 'D', 'H', 'B', 'Q', 'G')
        val fifthCargoList = mutableListOf('V', 'G', 'L', 'F', 'Z', 'S')
        val sixthCargoList = mutableListOf('D', 'G', 'N', 'P')
        val seventhCargoList = mutableListOf('D', 'Z', 'P', 'V', 'F', 'C', 'W')
        val eighthCargoList = mutableListOf('C', 'P', 'D', 'M', 'S')
        val ninthCargoList = mutableListOf('Z', 'N', 'W', 'T', 'V', 'M', 'P', 'C')

        val floatingList: MutableList<Char> = mutableListOf()
        var splitSubList: List<String>
        val mainInfoSubList = input.subList(10, input.size)     //changed from 5 to 10
        val finalizedList: MutableList<String> = mutableListOf()

        for (index in 0..mainInfoSubList.size - 1) {

            splitSubList = mainInfoSubList[index].split(" ")
            finalizedList.addAll(splitSubList)
            finalizedList.removeFirst()
            finalizedList.removeAt(1)
            finalizedList.removeAt(2)

            for (stackCount in 1..56) {

                if (stackCount == finalizedList.first().toInt()) {

                    when (finalizedList[1].toInt()) {                   //startingPoint
                        1 -> {
                            floatingList += firstCargoList.subList(
                                fromIndex = firstCargoList.size - stackCount, toIndex = firstCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                firstCargoList.removeLast()
                            }
                        }

                        2 -> {
                            floatingList += secondCargoList.subList(
                                fromIndex = secondCargoList.size - stackCount, toIndex = secondCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                secondCargoList.removeLast()
                            }
                        }

                        3 -> {
                            floatingList += thirdCargoList.subList(
                                fromIndex = thirdCargoList.size - stackCount, toIndex = thirdCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                thirdCargoList.removeLast()
                            }
                        }

                        4 -> {
                            floatingList += fourthCargoList.subList(
                                fromIndex = fourthCargoList.size - stackCount, toIndex = fourthCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                fourthCargoList.removeLast()
                            }
                        }

                        5 -> {
                            floatingList += fifthCargoList.subList(
                                fromIndex = fifthCargoList.size - stackCount, toIndex = fifthCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                fifthCargoList.removeLast()
                            }
                        }

                        6 -> {
                            floatingList += sixthCargoList.subList(
                                fromIndex = sixthCargoList.size - stackCount, toIndex = sixthCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                sixthCargoList.removeLast()
                            }
                        }

                        7 -> {
                            floatingList += seventhCargoList.subList(
                                fromIndex = seventhCargoList.size - stackCount, toIndex = seventhCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                seventhCargoList.removeLast()
                            }
                        }

                        8 -> {
                            floatingList += eighthCargoList.subList(
                                fromIndex = eighthCargoList.size - stackCount, toIndex = eighthCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                eighthCargoList.removeLast()
                            }
                        }

                        9 -> {
                            floatingList += ninthCargoList.subList(
                                fromIndex = ninthCargoList.size - stackCount, toIndex = ninthCargoList.size
                            )
                            for (removal in 1..stackCount) {
                                ninthCargoList.removeLast()
                            }
                        }
                    }
                    when (finalizedList.last().toInt()) {                   //destinationPoint
                        1 -> firstCargoList += floatingList
                        2 -> secondCargoList += floatingList
                        3 -> thirdCargoList += floatingList
                        4 -> fourthCargoList += floatingList
                        5 -> fifthCargoList += floatingList
                        6 -> sixthCargoList += floatingList
                        7 -> seventhCargoList += floatingList
                        8 -> eighthCargoList += floatingList
                        9 -> ninthCargoList += floatingList
                    }
                    floatingList.clear()
                }
            }
            finalizedList.clear()
        }
        return "${firstCargoList.last()}${secondCargoList.last()}${thirdCargoList.last()}${fourthCargoList.last()}${fifthCargoList.last()}${sixthCargoList.last()}${seventhCargoList.last()}${eighthCargoList.last()}${ninthCargoList.last()}"
    }

    val input = readInput("Day05")
    part1(input).println()
    part2(input).println()
}