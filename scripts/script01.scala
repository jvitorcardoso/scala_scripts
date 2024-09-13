// Criando alguns scripts básicos

object creatingVariables {

  def main(args: Array[String]): Unit = {

    // Declarando variáveis imutáveis

    val name: String = "Alice"
    println(s"1 - My name is $name\n")

    // Type inference: automaticamente determinado pelo compilador
    
    val pi = 3.14159
    println(s"2 - Pi value = $pi\n")
    
    val isStudent: Boolean = true
    val resultIsStudent: String = if(isStudent) "3 - Yes, I'm a student!\n" else "3 - Not a student.\n"
    println(resultIsStudent)

    // Estruturas de Controle e Loops

    val numbers: List[Int] = List(1, 2, 3, 4, 5)

    // Experimentando um if-else

    val result = if(numbers.contains(3)) "Número 3 encontrado" else "Número 3 não encontrado"
    println(s"4 - $result")

    // Usando pattern matching
    
    val message = numbers match {

      case Nil => "Empty list"

      case 1 :: _ => "Starts with 1"

      case _ => "Something else"

    }

    // Looping usando funções de maior ordem

    val doubled = numbers.map(_ * 2)

    // Definindo uma função
    
    def add(x: Int, y: Int): Int = {
      x + y
    }

    // Usando a função

    val sum = add(5, 9)

    // Função anônima (famoso Lambda)
    
    var increment = (x: Int) => x + 1

    increment(5)

    // Usando Lambda com map

    val incrementedNumbers = numbers.map(increment)

  }

}

