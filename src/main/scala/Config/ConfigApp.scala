
package Config

import java.io.File
import java.util.Properties

import LoggerPlatform.RunLogger
import SubjectModel.{PatternClass, _}
import _root_.SubjectModel.PatternClass.{AbstractFactory, Builder}


/**
  * =Object ConfigApp=
  *
  * @author Dynamic
  * @version 1.0
  * Является фабрикой для всех объектов в приложении.
  * Конфигурирует и внедряет зависимости всех классов
  */

object ConfigApp {


  /** =Singleton=
    * @author Dynamic
    * @version 1.0
    * @return SingletonClass
    *
    */

  def getSingletonClass: PatternClass.Singleton ={

    var t = new PatternClass.Singleton

    t


  }


  /**
    * @return AbstractFactory
    */

  def getAbstractFactoryClass: AbstractFactory ={

    var t = new AbstractFactory

    t


  }



  /**
    * @return Property
    * @todo Возвращает объект для чтения данных с конфигурационного файла DataConfig
    */

  def getPropertiesClass: Properties  = {

    val file = new File ("src/main/scala/Config/DataConfig.properties").getPath()

    val properties =  new Properties()

    import java.io.FileReader
    properties.load(new FileReader(file))

    properties

  }


  /**
    * @return Logger
    * @todo Возвращает встроенный Logger
    */

  def getRunLogger: RunLogger  = {

    val getLogger = new RunLogger
    getLogger

  }




  /**
    * @return Builder
    */

  def getBuilderClass: Builder ={

    var t = new Builder

    t


  }














}
