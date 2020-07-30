

package SubjectModel.PatternClass

import SubjectModel.Pattern


/** == Шаблон Iterator==
 *
  * @author Dynamic
  * @return name, category, description
  *
  * */

class Iterator extends Pattern {

  override var name: String = "Iterator"

  override var category: String = "Паттерны поведения"

  override var description: String ="Паттерн Итератор (Iterator) предоставляет абстрактный интерфейс для последовательного доступа ко всем элементам составного объекта без раскрытия его внутренней структуры."


}