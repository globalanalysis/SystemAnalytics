package TestApp.PackageTestClass

import CachingPlatform.ClassCache
import Config.ConfigApp
import SubjectModel.PatternClass.{Decorator, Facade}
import TestApp.Plasma

class CachePatternTestClass extends Plasma {


  ConfigApp.getRunLogger.infoLogger("Cтарт тестов для класса кеша")
  val f = new Facade
  val d = new Decorator

  val c = new ClassCache()

  override def runTest(): Unit = {

    addElm

    findElm

    getelm





  }



 private def addElm= {


    ConfigApp.getRunLogger.infoLogger("Добавляем 2 типа шаблона")

    //c.addItemToCache(f)
   // c.addItemToCache(d)



  }


private def findElm = {

  c.findItemCache(d)
   c.findItemCache(f)


  ConfigApp.getRunLogger.infoLogger("Находим  их в колекции  " + c.findItemCache(d)+ "  " + c.findItemCache(f))





}


  private def getelm = {

    c.cacheElmReceive(d)
    c.cacheElmReceive(f)
    ConfigApp.getRunLogger.infoLogger("Извлекаем их из колекции" + c.cacheElmReceive(d) + "  " + c.cacheElmReceive(f))





  }






}

object CachePatternTestClass {
  def apply(): CachePatternTestClass = new CachePatternTestClass
}
