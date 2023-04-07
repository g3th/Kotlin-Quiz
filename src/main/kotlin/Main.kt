fun main() {
    val quizAnswer1 = 15
    val quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47
    var points = 0
    var correctQuestions = 0
    var partlyCorrect = 0
    println("What is 75 / 5?")
    val studentAnswer1 = readLine()!!.toInt()

    if (studentAnswer1 == quizAnswer1){
        correctQuestions += 1
        points += 25
    }

    println("What is the value of y in the equation: 6 * 2y = 36?")
    val studentAnswer2 = readLine()!!.toInt()

    if (studentAnswer2 is Int){
        if (studentAnswer2 == quizAnswer2+1 || studentAnswer2 == quizAnswer2-1){
            println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
            partlyCorrect += 1
            points += 20
        }
        else if (studentAnswer2 == quizAnswer2){
            correctQuestions += 1
            points += 25
        } else {
            points += 1
        }
    }

    println("What is the type of triangle that has two equal sides?")
    val studentAnswer3 = readLine()

    if (studentAnswer3 is String){
        if (studentAnswer3 == quizAnswer3){
            correctQuestions += 1
            points += 25
        }
        else if (studentAnswer3 == "equilateral"){
            partlyCorrect += 1
            points += 10
        }
        else {
            points += 1
        }
    }

    println("What is the value of 8 * 6 - (3 - 2)?")
    val studentAnswer4 = readLine()!!.toInt()

    if (studentAnswer4 is Int){
        if (studentAnswer4 == quizAnswer4){
            correctQuestions += 1
            points += 25
        }
        else if(studentAnswer4 in 44..54){
            partlyCorrect += 1
            points += 20
        } else {
            points += 1
        }
    }

    println("Total Correct: $correctQuestions out of 4. Partly Correct: $partlyCorrect out of 4.\nTotal Points: $points")

    if (points in 0..59){
        println("Grade F")
    }

    if (points in 60..69){
        println("Grade D")
    }

    if (points in 70..79){
        println("Grade C")
    }

    if (points in 80..89){
        println("Grade B")
    }

    if (points in 90..100){
        println("Grade A")
    }

    if (points in 101..110){
        println("Grade A*")
    }
}