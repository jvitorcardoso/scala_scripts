/*
 * path: ..scala/src/main/com/scripts/script07_listMethods.scala
 * author: jvitorcardoso
 * date: 2024-09-21
*/

object listMethods:

  @main def m(): Unit =
  
    val list_01_empty: List[Int] = List.empty
    println(s"\nEmpty list: $list_01_empty\n")
    // List()

    val list_02_not_empty: List[String] = List("Cool", "tools", "role")
    println(s"Not empty list: $list_02_not_empty\n")
    // List(Cool, tools, role)

    val list_03_with_concat_str: List[String] = "Matthew" :: "Mark" :: "Luke" :: "John" :: Nil // <- Nil is required
    println(s"List with string concatenation: $list_03_with_concat_str\n")
    // List(Matthew, Mark, Luke, John)

    val list_04_with_concat_int: List[Int] = 1 :: 2 :: 3 :: Nil // <- Nil is required
    println(s"List with integer concatenation: $list_04_with_concat_int\n")
    // List(1, 2, 3)

    val list_05_with_new_concat_str: List[String] = list_03_with_concat_str ::: List("Acts", "Romans", "I Corinthians", "II Corinthians")
    println(s"New list with string concatenation, reusing the third list: $list_05_with_new_concat_str\n")
    // List(Matthew, Mark, Luke, John, Acts, Romans, I Corinthians, II Corinthians)

