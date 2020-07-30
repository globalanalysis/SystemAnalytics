

package SubjectModel.PatternClass

import SubjectModel.Pattern


/** == Шаблон Command==
 *
  * @author Dynamic
  * @return name, category, description
  *
  * */

class Command extends Pattern {

  override var name: String = "Command"

  override var category: String = "Паттерны поведения"

  override var description: String = "Паттерн Команда (Command) позволяет инкапсулировать запрос на " +
    "выполнение определенного действия в виде отдельного объекта. Этот объект запроса на действие и " +
    "называется командой. При этом объекты, инициирующие запросы на выполнение действия," +
    " отделяются от объектов, которые выполняют это действие."



}