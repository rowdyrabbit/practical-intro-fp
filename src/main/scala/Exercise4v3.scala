
/**
 * This object serves as a 'what not to do' - even worse than the v2 implementation :)
 */
object Exercise4v3 {

  abstract class BandData
  case class StringData(name: String) extends BandData
  case class BoolData(bool: Boolean) extends BandData

  val bands: List[Map[String, BandData]] = List(Map("name" -> StringData("sunset rubdown"), "country" -> StringData("UK"), "active" -> BoolData(true)),
  Map("name" -> StringData("women"), "country" -> StringData("Germany"), "active" -> BoolData(false)),
  Map("name" -> StringData("a silver mt. zion"), "country" -> StringData("Spain"), "active" -> BoolData(true)))


  def set_canada_as_country(band: Map[String, Any]): Map[String, Any] = {
    Map("name" -> band.get("name").get, "country" -> "Canada", "active" -> band.get("active").get )
  }

  def strip_punctuation_from_name(band: Map[String, BandData]): Map[String, BandData] = {
    val bandData = band.get("name") match {
      case StringData(s) => StringData(s.asInstanceOf[StringData].name.replace(".", ""))
      case BoolData(b) => throw Exception //how do I even handle this? I never expected to see a bool here - will throw an exception
    }
    band.updated("name", bandData)
  }

  def capitalize_names(band: Map[String, Any]): Map[String, Any] = {
    Map("name" -> band.get("name").get.toString.toUpperCase, "country" -> band.get("country").get, "active" -> band.get("active").get )
    //same again - don't like the mkString
  }


  def pipeline_each(data: List[Map[String, Any]], fnList: List[Map[String, Any] => Map[String, Any]]): List[Map[String, Any]] = {
    fnList.foldLeft(data) {(bandList, currFn) => bandList.map(currFn)}
  }

  //case classes and also update the map, rather than creating a new one
  //also consider using compose instead of the map?

}
