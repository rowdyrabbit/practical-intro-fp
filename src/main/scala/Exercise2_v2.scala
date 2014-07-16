object Exercise2_v2 {

  class Person(val name: String, val height: Int = 0)

  val people = List(new Person("Mary", 160),
                    new Person("Isla", 80),
                    new Person("Sam"))


  def ex2_imperative(): Int = {
    var height_total = 0
    var height_count = 0
    var average_height = 0
    for (person <- people) {
       height_total += person.height; height_count += 1
    }

    if (height_count > 0 ) {
      average_height = height_total / height_count
    }

    average_height
  }

  def ex2_functional(): Int = {
    val heights = people.filter(p => p.height > 0)

    val total:Int = heights.foldLeft(0){(acc, curr) => acc + curr.height}

    total / heights.length
  }
}
