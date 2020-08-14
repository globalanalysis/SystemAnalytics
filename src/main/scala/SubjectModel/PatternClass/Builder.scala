
/** == Шаблон Builder==
  * @author Dynamic
  * @return name, category, description
  * @constructor отсуствует
  **/


package SubjectModel.PatternClass

class Builder extends Pattern {

  override  var name: String = "Builder"

  override  var category: String = "Порождающий шаблон проектирования"

  override  var description: String = "Шаблон позволяет вам создавать различные виды объекта, избегая засорения конструктора. Он полезен, когда может быть несколько видов объекта" +
    " или когда необходимо множество шагов, связанных с его созданием."

}


