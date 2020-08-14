package CachingPlatform

import SubjectModel.PatternClass.Pattern

import scala.collection.mutable.ArrayBuffer


/** == CacheFunction==
  *
  * @author Dynamic
  * Встроеная система кеширования платформы
  *
  **/
 abstract  trait CacheFunction [T] {

  val cacheCollection: ArrayBuffer[T]

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
  def cacheElmReceive( res:T): Option[T];





  }

