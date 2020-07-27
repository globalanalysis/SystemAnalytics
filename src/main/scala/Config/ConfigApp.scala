/**
  * @author Dynamic
  * @version 1.0
  * @constructor не предусмотрен
  * Является фабрикой для всех объектов в приложении
  * Конфигурирует и внедряет зависимости всех классов
  */


package Config

import java.io.File
import java.util.Properties

import Pattern._

object ConfigApp {

  def getSingletonClass: Singleton ={

    var t = new Singleton

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
