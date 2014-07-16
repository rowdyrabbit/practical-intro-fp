object Exercise1 {

  val names = List("Mary", "Isla", "Sam")

  def ex1_imperative(): List[String] = {
    for (i <- names) yield hash(i)
  }

  def hash(str: String) : String = {
    str.hashCode.toString
  }

  def ex1_functional(): List[String] = {
    names.map(i => hash(i))
  }
}
