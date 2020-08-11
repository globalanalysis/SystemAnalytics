package CachingPlatform

import scala.collection.mutable.ArrayBuffer


/** == CacheFunction==
  *
  * @author Dynamic
  * Встроеная система кеширования платформы
  *
  **/
trait CacheFunction [T] {

  def cacheCollection[T](): ArrayBuffer[T]

  /**
    * @author Dynamic
    *         Метод проверяет есть ли элемент в коллекции
    **/
  def findItemCache(add: T): Boolean


    /**
      * @author Dynamic
      *         Метод добавдяет элемент в коллецию кеша
      **/
    def addItemToCache(add: T): Unit


    /**
      * @author Dynamic
      *         Метод принудительного обнуления кеша
      **/
    def cacheReset(): Unit

  /**
    * @author Dynamic
    * Получить элемент с коллекции кеша
    **/
  def cacheElmReceive(res:T): Unit





  }

