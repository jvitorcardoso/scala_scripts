/*
 * path: ../scripts/script02_collectionsOverview.scala
 * author: jvitorcardoso
 * date: 2024-09-19
*/

object collectionsOverview:

  @main def m(): Unit =
  
    // Arrays, Listas e Maps

    val fruits: List[String] = List("apple", "banana", "orange")

    // Acessando elementos da lista pelo índice
    
    val secondFruit: String = fruits(1)
    println(s"Segundo item na lista: $secondFruit")

    val ages = Map(
      "Alice" -> 30,
      "Bob" -> 25,
      "Carol" -> 35
    )

    val carolAge = ages("Carol")

    // Acessando elementos do dicionário pela chave

    println(s"Idade da Carol: $carolAge")

    // Tratamento de Exceções
    
    // Método tradicional
    try {
    
      val tenDividedByZero = 10 / 0

    } catch {

      case e: ArithmeticException => println(s"Método tradicional -> Divisão por zero: $e")

    }

    // Usando Try para tratamento de erros mais seguro
    import scala.util.Try

    val tenDividedByZeroWithTry = Try(10 / 0)
    println(s"Valor capturado na variável criada a partir do Try: $tenDividedByZeroWithTry")

    tenDividedByZeroWithTry match {

      case scala.util.Success(value) => println(s"Resultado via Try: $value")

      case scala.util.Failure(exception) => println(s"Erro capturado no exception: ${exception.getMessage}")

    }


