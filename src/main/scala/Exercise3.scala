object Exercise3 {

  def ruleZero(str: String): Option[String] = {
    if (str.head == '0') Some(str.tail)
    else None
  }

  def ruleOne(str: String): Option[String] = {
    if (str.head == '1') Some(str.tail)
    else None
  }

  def ruleSequence(seq: String, ruleList: List[ String => Option[String] ]): Option[String] = {

    ruleList.foldLeft(Some(seq)) {
        (seqStr, currentRule) => currentRule(seqStr.get) match {
          case Some(remainder) => Some(remainder)
          case None => return None
        }
    }
  }

}
