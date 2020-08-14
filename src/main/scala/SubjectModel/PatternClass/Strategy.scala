

package SubjectModel.PatternClass


/** == Шаблон Strategy==
 *
  * @author Dynamic
  * @return name, category, description
  *
  **/

class Strategy extends Pattern {

  override var name: String = "Strategy"

  override var category: String = "Паттерны поведения"

  override var description: String = "Паттерн Стратегия (Strategy) представляет шаблон проектирования, который определяет набор алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость. В зависимости от ситуации мы можем легко заменить один используемый алгоритм другим. При этом замена алгоритма происходит независимо от объекта, который использует данный алгоритм."


}