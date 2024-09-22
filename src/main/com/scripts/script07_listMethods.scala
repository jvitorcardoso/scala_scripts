/*
 * path: ..scala/src/main/com/scripts/script07_listMethods.scala
 * author: jvitorcardoso
 * date: 2024-09-21
*/

object listMethods:

  @main def m(): Unit =
  
    val list_01_empty: List[Int] = List.empty
    println(s"\n\t- List 1: Empty list: $list_01_empty\n")
    // List()

    val list_02_not_empty: List[String] = List("Cool", "tools", "role")
    println(s"\t- List 2: Not empty list: $list_02_not_empty\n")
    // List(Cool, tools, role)

    val list_03_with_concat_str: List[String] = "Matthew" :: "Mark" :: "Luke" :: "John" :: Nil // <- Nil is required
    println(s"\t- List 3: List with string concatenation: $list_03_with_concat_str\n")
    // List(Matthew, Mark, Luke, John)

    val list_04_with_concat_int: List[Int] = 1 :: 2 :: 3 :: Nil // <- Nil is required
    println(s"\t- List 4: List with integer concatenation: $list_04_with_concat_int\n")
    // List(1, 2, 3)

    val list_05_with_new_concat_str: List[String] = list_03_with_concat_str ::: List("Acts", "Romans", "I Corinthians", "II Corinthians")
    println(s"\t- List 5: New list with string concatenation, reusing the third list: $list_05_with_new_concat_str\n")
    // List(Matthew, Mark, Luke, John, Acts, Romans, I Corinthians, II Corinthians)

    val int_01_with_element_2_of_list_04: Int = list_04_with_concat_int(2)
    println(s"\t- Integer 1: Element at index 2 of list_04: $int_01_with_element_2_of_list_04\n")
    // 3
    
    val int_02_count_elements_in_list_05_that_have_lenght_4: Int = list_05_with_new_concat_str.count(book => book.length == 4)
    println(s"\t- Integer 2: How many books has four letters? $int_02_count_elements_in_list_05_that_have_lenght_4\n")
    // 4

    val list_06_which_books_in_list_5_that_have_four_letters: List[String] = list_05_with_new_concat_str.filter(book => book.length == 4)
    println(s"\t- List 6: Which books has four letters? $list_06_which_books_in_list_5_that_have_four_letters\n")
    // List(Mark, Luke, John, Acts)

    val list_07_with_list_04_without_its_2_first_elements: List[Int] = list_04_with_concat_int.drop(2)
    println(s"\t- List 7: List 4 without its 2 first elements: $list_07_with_list_04_without_its_2_first_elements\n")
    // List(3)

    val list_08_with_list_04_without_its_2_last_elements: List[Int] = list_04_with_concat_int.dropRight(2)
    println(s"\t- List 8: List 4 without its 2 last elements: $list_08_with_list_04_without_its_2_last_elements\n")
    // List(1)

