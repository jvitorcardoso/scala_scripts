/*
 * path: ../scala/src/main/com/scrips/script01_creatingVariables.scala
 * author: jvitorcardoso
 * date: 2024-09-19
*/

// Criando alguns scripts básicos

object creatingVariables:

  @main def m(): Unit =

    // Declarando variáveis imutáveis

    val name: String = "Alice"
    println(s"1 - My name is $name\n")

    // Type inference: automaticamente determinado pelo compilador
    
    val pi = 3.14159
    println(s"2 - Pi value = $pi\n")
    
    val isStudent: Boolean = true
    val resultIsStudent: String = if isStudent then "3 - Yes, I'm a student!\n" else "3 - Not a student.\n"
    println(resultIsStudent)

    // Estruturas de Controle e Loops

    val numbers: List[Int] = List(1, 2, 3, 4, 5)

    // Experimentando um if-else

    val result = if numbers.contains(3) then "Número 3 encontrado" else "Número 3 não encontrado"
    println(s"4 - $result\n")

    // Usando pattern matching
    
    val message = numbers match {

      case Nil => "Empty list"

      case 1 :: _ => "Starts with 1"

      case _ => "Something else"

    }

    println(s"5 - What is message?\n\t$message\n")

    // Looping usando funções de maior ordem

    val doubled = numbers.map(_ * 2)

    // Definindo uma função
    
    def add(x: Int, y: Int): Int =
      x + y

    // Usando a função

    val sum = add(5, 9)

    // Função anônima (famoso Lambda)
    
    var increment = (x: Int) => x + 1

    increment(5)

    // Usando Lambda com map

    val incrementedNumbers = numbers.map(increment)

    // Conversão de tipos

    val x: Int = 10
    val y: Double = x // Type conversion automático de Inteiro para Double
    val z: Int = y.toInt // Type casting explícito

    println(s"6 - Valor de x (Inteiro): $x\n    Valor de y (Double criada a partir de um Inteiro): $y\n    Valor de z (Double que foi convertida para Inteiro): $z")

