package TestApp

import TestApp.PackageTestClass.{AbstractFactoryTestClass, CachePatternTestClass, SingletonTestClass}

import scala.collection.mutable.ArrayBuffer


  // Основной класс запуска всех тестов. В коолецию добавляем все тестовые классы
  // Запуск осуществляется методом итерации всех элеметов коллекции и стартом основного метода.

object CollectionTestClass {

  var collectonTest: ArrayBuffer[Plasma] = new ArrayBuffer[Plasma]

  collectonTest.+=(SingletonTestClass())
  collectonTest.+=(AbstractFactoryTestClass())
  collectonTest.+=(CachePatternTestClass())

  def executeAllTest() : Unit =  collectonTest.foreach(x => println(x.runTest()))


}
