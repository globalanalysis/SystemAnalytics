package CachingPlatform

import SubjectModel.PatternClass.Pattern

import scala.collection.mutable.ArrayBuffer

 class ClassCache extends CacheFunction [Pattern]{

  val cacheCollection: ArrayBuffer[Pattern] = new ArrayBuffer[Pattern]()

  /**
    * @author Dynamic
    *         Метод проверяет есть ли элемент в коллекции
    **/
  override def findItemCache(add: Pattern): Boolean = cacheCollection contains add

  /**
    * @author Dynamic
    *         Метод добавдяет элемент в коллецию кеша
    **/
  override def addItemToCache(add: Pattern): Unit = cacheCollection += add

  /**
    * @author Dynamic
    *         Метод принудительного обнуления кеша
    **/
  override def cacheReset(): Unit = cacheCollection.clear()

  /**
    * @author Dynamic
    *         Получить элемент с коллекции кеша
    **/
  override def cacheElmReceive( res: Pattern):Option [Pattern]=
   cacheCollection.find(_==res)











}

object ClassCache {

}
