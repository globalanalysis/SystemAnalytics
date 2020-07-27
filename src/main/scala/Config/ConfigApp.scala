package Config

import java.io.File
import java.util.Properties

import Pattern._

object ConfigApp {

  def getSingletonClass: Singleton ={

    var t = new Singleton

    t


  }

    // AbstractFactory

  def getAbstractFactoryClass: AbstractFactory ={

    var t = new AbstractFactory

    t


  }


  // Property

  def getPropertiesClass: Properties  = {

    val file = new File ("src/main/scala/Config/DataConfig.properties").getPath()

    val properties =  new Properties()

    import java.io.FileReader
    properties.load(new FileReader(file))

    properties

  }



}
