package CachingPlatform

import scala.collection.mutable.ArrayBuffer


/** == CacheFunction==
  *
  * @author Dynamic
  * Встроеная система кеширования платформы
  *
  **/
trait CacheFunction [T] {

val cacheCollection: ArrayBuffer[T] = new scala.collection.mutable.ArrayBuffer[T]

  /**
    * @author Dynamic
    * Метод поиска элемента в коллекции
    **/
  def findItemCache(add:T): T = {


   add
  }



  /**
    * @author Dynamic
    * Метод добавдяет элемент в коллецию кеша
    **/
  def addItemToCache(add:T): Unit = {



  }



  /**
    * @author Dynamic
    * Метод принудительного обнуления кеша
    **/
 def cacheReset: Unit = {



  }

  /**
    * @author Dynamic
    * Автоматическое обнуление кеша
    * @param timeCache устанавливает время в минутах
    **/
  def cacheResetAuto(timeCache:Int): Unit = {



  }







}
