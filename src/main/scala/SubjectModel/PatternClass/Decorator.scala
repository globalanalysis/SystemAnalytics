
/** == Шаблон Decorator==
  * @author Dynamic
  * @return name, category, description
  * @constructor отсуствует
  **/


package SubjectModel.PatternClass

import SubjectModel.Pattern

class Decorator extends Pattern {

  override  var name: String = "Decorator"

  override  var category: String = "Структурные паттерны"

  override  var description: String = "Декоратор (Decorator) представляет структурный шаблон проектирования, который позволяет динамически подключать к объекту дополнительную функциональность."

}


