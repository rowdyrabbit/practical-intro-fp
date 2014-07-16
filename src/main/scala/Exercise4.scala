
object Exercise4 {

  class Band(val name: String, val country: String, val active: Boolean)

  def set_canada_as_country(band: Band): Band = {
    new Band(band.name, "Canada", band.active)
  }

  def strip_punctuation_from_name(band: Band): Band = {
    new Band(band.name.replace(".", ""), band.country, band.active)
  }

  def capitalize_names(band: Band): Band = {
    new Band(band.name.toUpperCase, band.country, band.active)
  }

  def pipeline_each(data: List[Band], fnList: List[Band => Band]): List[Band] = {
    fnList.foldLeft(data) {(bandList, currFn) => bandList.map(currFn)}
  }



}
