
package Config

import java.io.File
import java.util.Properties

import Pattern.{PattarnClass, _}
import _root_.Pattern.PattarnClass.{AbstractFactory, Builder}


/**
  * =bject Config=
  *
  * @author Dynamic
  * @version 1.0
  * @constructor не предусмотрен
  * Является фабрикой для всех объектов в приложении
  * Конфигурирует и внедряет зависимости всех классов
  */

object ConfigApp {


  /** =Singleton=
    * @author Dynamic
    * @version 1.0
    * @constructor не предусмотрен
    * @return SingletonClass
    *
    */

  def getSingletonClass: PattarnClass.Singleton ={

    var t = new PattarnClass.Singleton

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
    * @return Builder
    */

  def getBuilderClass: Builder ={

    var t = new Builder

    t


  }














}
