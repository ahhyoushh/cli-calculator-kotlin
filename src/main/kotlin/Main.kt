import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    print("choose your option (1 for addition, 2 for subtraction, 3 for multiplication and 4 for division:")
    val option = reader.nextInt()

    if(option == 1){
        print("first Number:")
        val firstNum = reader.nextInt()

        print("Second Number:")
        val secNum = reader.nextInt()

        add(firstNum, secNum)
    }

    if(option == 2){
        print("First Number:")
        val firstNum = reader.nextInt()

        print("Second Number:")
        val secNumber = reader.nextInt()

        sub(firstNum, secNumber)
    }

    if(option == 3){
        print("First Number:")
        val firstNum = reader.nextInt()

        print("Second Number:")
        val secNum = reader.nextInt()

        multiply(firstNum, secNum)
    }

    if(option == 4){
        print("First Number:")
        val firstNum = reader.nextInt()

        print("Second Number:")
        val secNum = reader.nextInt()

        divide(firstNum ,secNum)
    }
}

fun divide(a: Int, b: Int){
    val ans = a / b
    println("$a divided by $b is $ans")
    return main()
}

fun multiply(a: Int, b: Int){
    val ans = a * b
    println("$a multiplied $b is $ans")
    return main()
}

fun sub(a: Int, b: Int) {
    val ans = a - b
    println("$b subtracted from $a is $ans")
    return main()
}

fun add(a: Int, b: Int) {
    val ans = a + b
    println("$a added to $b is $ans")
    return main()

}