package CachingPlatform

import scala.collection.mutable.ArrayBuffer


/** == CacheFunction==
  *
  * @author Dynamic
  * Встроеная система кеширования платформы
  *
  **/
trait CacheFunction [T] {

  def cacheCollection[T](): ArrayBuffer[T] = new scala.collection.mutable.ArrayBuffer[T]

  /**
    * @author Dynamic
    *         Метод проверяет есть ли элемент в коллекции
    **/
  def findItemCache(add: T): Boolean = {

      cacheCollection.contains(add)

     }


    /**
      * @author Dynamic
      *         Метод добавдяет элемент в коллецию кеша
      **/
    def addItemToCache[T](add: T): Unit = {
      cacheCollection.+=(add)


    }


    /**
      * @author Dynamic
      *         Метод принудительного обнуления кеша
      **/
    def cacheReset(): Unit = {

      cacheCollection.clear()
    }


  /**
    * @author Dynamic
    * Получить элемент с коллекции кеша
    **/
  def cacheElmReceive(res:T): T = {

    cacheCollection.foreach(x->{x==res x})
  }



  }

