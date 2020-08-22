package SubjectModel.AnalysisParameters

/** == class Parameters==
  *
  * @author Dynamic
  * Содержит все параметры для анализа системы
  *
  **/

class Parameters {

  /**
    * @author Dynamic
    * Определяем тип приложения веб или сервис
    *
    **/

  var webapps: Boolean =_
  var backspace: Boolean =_


  /**
    * @author Dynamic
    * Определяем какой тип сервера
    *
    **/
  var server: String=_

  /**
    * @author Dynamic
    * Определяем базу данных
    *
    **/

  var typeDataBase: String=_

  /**
    * @author Dynamic
    * Определяем тестовую среду
    *
    **/

  var typeTestEnvironment: String=_


  /**
    * @author Dynamic
    * Определяем роль Администратора системы
    *
    **/

  //var typeAdmin: String=_



  /**
    * @author Dynamic
    * Определяем необходимость Api
    *
    **/

  var typeAPI: Boolean =_


  /**
    * @author Dynamic
    * Определяем необходимость системы кеширования
    *
    **/

  var typeCache: Boolean =_


  /**
    * @author Dynamic
    * Определяем необходимость системы резервирования
    *
    **/

  var typeReserve: Boolean =_


  /**
    * @author Dynamic
    * Определяем необходимость системы диагностики
    *
    **/

  var typeDiagnostics: Boolean=_


  /**
    * @author Dynamic
    * Определяем необходимость интеграции
    *
    **/

  var typeExternalSystems: Boolean =_


  /**
    * @author Dynamic
    * Определяем наличие внешнего интерфейса - приложение, браузер, апи клиент
    *
    **/

  var typeFrontEnd: Boolean =_

















}
