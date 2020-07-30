import Config.ConfigApp
import LoggerPlatform.RunLogger
import TestApp.CollectionTestClass

object RunApp {


  def main(args: Array[String]): Unit = {


  CollectionTestClass.exucuteAllTest()
  ConfigApp.getRunLogger.infoLogger("Cтарт тестов")



  }



}
