

package SubjectModel.PatternClass

import SubjectModel.Pattern


/** == Шаблон Visitor==
 *
  * @author Dynamic
  * @return name, category, description
  *
  * */

class Visitor extends Pattern {

  override var name: String = "Visitor"

  override var category: String = "Паттерны поведения"

  override var description: String = "Паттерн Посетитель (Visitor) позволяет определить операцию " +
    "для объектов других классов без изменения этих классов." +
    "При использовании паттерна Посетитель определяются две иерархии классов: одна для элементов, для которых надо определить новую операцию, " +
    "и вторая иерархия для посетителей, описывающих данную операцию."


}