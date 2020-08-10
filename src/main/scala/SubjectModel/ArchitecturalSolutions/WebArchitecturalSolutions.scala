package SubjectModel.ArchitecturalSolutions

class WebArchitecturalSolutions extends ApplicationClass {
  override val serviceClass: String = "Web App"
  override val architecturalSolutions: String = "Model-View-Controller pattern"
  override val description: String = "Cхема разделения данных приложения, пользовательского интерфейса и управляющей логики на три отдельных компонента: модель, представление и контроллер — таким образом, что модификация каждого компонента может осуществляться независимо"
}
