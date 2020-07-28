
/** == Шаблон  Factory Method==
  * @author Dynamic
  * @return name, category, description
  *
  **/


package SubjectModel.PatternClass

import SubjectModel.Pattern

class Factory_Method extends Pattern {

  override  var name: String = " Factory Method"

  override  var category: String = "Порождающий шаблон проектирования"

  override  var description: String = "Шаблон делегирует создание объектов наследникам родительского класса. Это позволяет использовать в коде программы не специфические классы, а манипулировать абстрактными объектами на более высоком уровне."

}


