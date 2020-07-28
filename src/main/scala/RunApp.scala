import Config.ConfigApp
import LooggerPlatform.RunLogger
import TestApp.CollectionTestClass

object RunApp {


  def main(args: Array[String]): Unit = {


  CollectionTestClass.exucuteAllTest()
  ConfigApp.getRunLogger.infoLoogger("Cтарт тестов")



  }



}
