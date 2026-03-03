fun printCube(number: Int) {
    val cube = number * number * number
    println("The cube of $number is $cube")
}

// Task 01
fun sumOfEvens(numbers: List<Int>) {
    var sum = 0
    for (i in numbers) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println("Sum of evens: $sum")
}

// Task 02
fun maxNum(num:List<Int>){
    var max = num[0]
    for (i in num) {
        if (i > max)
            max = i
    }
    println("The maximum number is: $max")
}

//Task 03
fun fizzBuss(){
    for (i in 1..50){
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } else if (i % 3 == 0){
            println("Fizz")
        } else if (i % 5 == 0){
            println("Buzz")
        } else {
            println(i)
        }
    }
}

//Task 04
fun countVowels(input: String) {
    val vowels = "aeiouAEIOU"
    var count = 0
    for (char in input) {
        if (char in vowels)
            count++
    }
    println("Vowel count: $count")
}

//Task 05
fun removeDuplicates(numbers: List<Int>) {
    val uniqueList = mutableListOf<Int>()
    for (n in numbers) {
        if (n !in uniqueList) uniqueList.add(n)
    }
    println("Unique list: $uniqueList")
}

//TAsk 06
fun reverseList(strings: List<String>) {
    val reversed = mutableListOf<String>()
    for (i in strings.size - 1 downTo 0) {
        reversed.add(strings[i])
    }
    println("Reversed: $reversed")
}

//Task 07
fun calculateFactorial(n: Int) {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    println("Factorial of $n: $result")
}

//Task 08
fun sumPositives(numbers: List<Int>) {
    var sum = 0
    for (n in numbers) {
        if (n > 0) sum += n
    }
    println("Sum of positives: $sum")
}

//Task 09
fun guessingGame() {
    val target = 7
    var guess: Int? = null

    while (guess != target) {
        print("Guess a number (1-10): ")
        guess = readLine()?.toIntOrNull()
        if (guess == target) println("Correct!") else println("Try again.")
    }
}

//Task 10
fun printPattern() {
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
fun main() {
     printPattern()
}