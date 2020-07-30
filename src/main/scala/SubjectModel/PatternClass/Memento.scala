


package SubjectModel.PatternClass

import SubjectModel.Pattern

/** ==Шаблон Memento==
 *
  * @author Dynamic
  * @return name, category, description
 *
   **/

class Memento extends Pattern {



   override  var name: String = "Memento"

   override  var category: String = "Порождающий шаблон проектирования"

   override  var description: String = "Паттерн Хранитель (Memento) позволяет выносить внутреннее состояние объекта за его пределы для последующего возможного восстановления объекта без нарушения принципа инкапсуляции."

}


