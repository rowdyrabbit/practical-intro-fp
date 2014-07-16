
object Exercise4v2 {

  val bands: List[Map[String, Any]] = List(Map("name" -> "sunset rubdown", "country" -> "UK", "active" -> true),
  Map("name" -> "women", "country" -> "Germany", "active" -> false),
  Map("name" -> "a silver mt. zion", "country" -> "Spain", "active" -> true))


  def set_canada_as_country(band: Map[String, Any]): Map[String, Any] = {
    Map("name" -> band.get("name").get, "country" -> "Canada", "active" -> band.get("active").get )
  }

  def strip_punctuation_from_name(band: Map[String, Any]): Map[String, Any] = {
    Map("name" -> band.get("name").get.toString.replace(".", ""), "country" -> band.get("country").get, "active" -> band.get("active").get )
    //mkString above is kinda gross and could cause a class cast exception
    //do I have to handle all the case matching on some/none for all the above calls to get?
  }

  def capitalize_names(band: Map[String, Any]): Map[String, Any] = {
    Map("name" -> band.get("name").get.toString.toUpperCase, "country" -> band.get("country").get, "active" -> band.get("active").get )
    //same again - don't like the mkString
  }


  def pipeline_each(data: List[Map[String, Any]], fnList: List[Map[String, Any] => Map[String, Any]]): List[Map[String, Any]] = {
    fnList.foldLeft(data) {(bandList, currFn) => bandList.map(currFn)}
  }


}
