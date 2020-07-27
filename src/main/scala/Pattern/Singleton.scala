
/** == Паттерн Singleton==
  * @author Dynamic
  * @return name, category, description
  * @constructor отсуствует
  **/

package Pattern



class Singleton extends Pattern {



   override  var name: String = "Singleton"

   override  var category: String = "Порождающий шаблон проектирования"

   override  var description: String = "порождающий шаблон проектирования, гарантирующий, что в " +
     "однопоточном приложении будет " +
     "единственный экземпляр некоторого класса, " +
     "и предоставляющий глобальную точку доступа к этому экземпляру."

}


