object Exercise2 {

  val people = List(Map[String, Any]("name" -> "Mary", "height" -> 160),
                    Map[String, Any]("name" -> "Isla", "height" -> 80),
                    Map[String, Any]("name" -> "Sam"))


  def ex2_imperative(): Int = {
    var height_total = 0
    var height_count = 0
    var average_height = 0
    for (person <- people) {
      person.get("height") match  {
        case Some(height) => height_total += height.asInstanceOf[Int]; height_count += 1 //bad code, shouldn't be casting here, the data structure should define the types
        case None => //do nothing
      }
    }

    if (height_count > 0 ) {
      average_height = height_total / height_count
    }

    average_height
  }

  def ex2_functional(): Int = {
    val heights = people.filter(p => p.contains("height"))

    val total = heights.foldLeft(0){(acc, curr) => acc + (curr.get("height")).asInstanceOf[Int]}

    total / heights.length

  }
}
