
object controlStructures {

  def main(args: Array[String]): Unit = {

    val day: String = "Wednesday"

    val message: String = day match {

      case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "weekday"

      case "Saturday" | "Sunday" => "weekend"

      case _ => "Unknown"

    }

    println(s"\n1 - Today is $day, and it's a $message!\n")

    // Loops with for Comprehensions

    val numbers = List(1, 2, 3, 4, 5)

    val doubled = for (n <- numbers) yield n * 2

    val evenNumbers = for (n <- numbers if n % 2 == 0) yield n

    println(s"2 - val numbers: $numbers\n")
    println(s"3 - val doubled: $doubled\n")
    println(s"4 - val evenNumbers: $evenNumbers\n")

    // While

    var count = 0

    while (count < 5) {

      println(s"\t5.${count+1} - Count: $count")
      count += 1

    }

    println()

    // Functional Programming

    val squared = numbers.map(n => n * n)

    val evenSquared = squared.filter(n => n % 2 == 0)
    
    val sum = evenSquared.reduce((x, y) => x + y)

    println(s"6 - val squared: $squared\n")
    println(s"7 - val evenSquared: $evenSquared\n")
    println(s"8 - val sum: $sum\n")

  }

}
