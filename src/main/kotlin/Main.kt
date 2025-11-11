fun main() {
    // ─── Section 1: Personal Information ────────────────────────────────
    println("──── SECTION 1: PERSONAL INFORMATION ────")
    println("Enter your first name:")
    val firstName = readLine() ?: ""

    println("Enter your last name:")
    val lastName = readLine() ?: ""

    println("Enter your favorite color:")
    val favoriteColor = readLine() ?: ""

    println("Hello, $firstName $lastName! Your favorite color is $favoriteColor.")

    // ─── Section 2: Age After 10 Years ──────────────────────────────────
    println("──── SECTION 2: AGE AFTER 10 YEARS ────")
    println("Enter your current age:")
    var currentAge = readLine()?.toIntOrNull() ?: 0
    currentAge += 10
    println("In 10 years, you will be $currentAge years old.")

    // ─── Section 3: Access Control ──────────────────────────────────────
    println("──── SECTION 3: ACCESS CONTROL ────")
    println("Enter your age to check access permission:")
    val userAge = readLine()?.toIntOrNull() ?: 0
    if (userAge >= 18) {
        println("Access granted: true ✅")
    } else {
        println("Access denied: false ❌")
    }

    // ─── Section 4: Even or Odd ─────────────────────────────────────────
    println("──── SECTION 4: EVEN OR ODD ────")
    println("Enter a number to check if it is even or odd:")
    val inputNumber = readLine()?.toIntOrNull() ?: 0
    if (inputNumber % 2 == 0) {
        println("The number $inputNumber is even.")
    } else {
        println("The number $inputNumber is odd.")
    }

    // ─── Section 5: Reverse String ──────────────────────────────────────
    println("──── SECTION 5: REVERSE STRING ────")
    println("Enter a string to reverse:")
    var textToReverse = readLine() ?: ""
    textToReverse = textToReverse.reversed()
    println("Reversed string: $textToReverse")

    // ─── Section 6: FizzBuzz ────────────────────────────────────────────
    println("──── SECTION 6: FIZZBUZZ ────")
    for (number in 1..100) {
        if (number % 3 == 0 && number % 5 == 0) {
            println("FizzBuzz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else if (number % 3 == 0) {
            println("Fizz")
        } else {
            println(number)
        }
    }

    // ─── Section 7: Sum from 1 to n ─────────────────────────────────────
    println("──── SECTION 7: SUM FROM 1 TO N ────")
    println("Enter a number to calculate the sum from 1 to n:")
    val upperLimit = readLine()?.toIntOrNull() ?: 0
    var totalSum = 0
    for (num in 1..upperLimit) {
        totalSum += num
    }
    println("The sum from 1 to $upperLimit is $totalSum.")

    // ─── Section 8: Temperature Conversion ──────────────────────────────
    println("──── SECTION 8: TEMPERATURE CONVERSION ────")
    println("Enter the temperature in Celsius:")
    val celsiusTemperature = readLine()?.toDoubleOrNull() ?: 0.0
    val fahrenheitTemperature = celsiusTemperature * 9.0 / 5.0 + 32
    println("$celsiusTemperature°C is equal to $fahrenheitTemperature°F.")

    // ─── Section 9: Palindrome Check ────────────────────────────────────
    println("──── SECTION 9: PALINDROME CHECK ────")
    println("Enter a word to check if it is a palindrome:")
    val inputWord = readLine()?.lowercase() ?: ""
    val reversedWord = inputWord.reversed()
    if (reversedWord == inputWord) {
        println("\"$inputWord\" is a palindrome: true ✅")
    } else {
        println("\"$inputWord\" is not a palindrome: false ❌")
    }

    // ─── Section 10: Vowel Counter ──────────────────────────────────────
    println("──── SECTION 10: VOWEL COUNTER ────")
    println("Enter a word to count the vowels:")
    val inputText = readLine()?.lowercase() ?: ""
    var vowelCount = 0
    val vowelsList = listOf('a', 'e', 'i', 'o', 'u')
    for (ch in inputText) {
        if (ch in vowelsList) {
            vowelCount++
        }
    }
    println("The word \"$inputText\" contains $vowelCount vowel(s).")
}
