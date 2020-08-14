package SubjectModel.PatternClass

/** == Шаблон AbstractFactory==
 *
  * @author Dynamic
  * @return name, category, description
  *
  **/




class AbstractFactory extends Pattern {

  override  var name: String = "Abstract factory"

  override  var category: String = "Порождающий шаблон проектирования"

  override  var description: String = "Шаблон реализуется созданием абстрактного класса Factory, " +
    "который представляет собой интерфейс для создания компонентов системы, например, " +
    "для оконного интерфейса он может создавать окна и кнопки. Затем пишутся классы," +
    " реализующие этот интерфейс"

}


