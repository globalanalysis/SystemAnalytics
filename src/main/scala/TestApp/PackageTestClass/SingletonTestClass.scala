package TestApp.PackageTestClass

import Config.ConfigApp
import TestApp.Plasma

class SingletonTestClass extends Plasma {

  override def runTest(): Unit = {

    val g = ConfigApp.getSingletonClass

    println("Тестирование класса Сингелтон и вывод данных класса на консоль: " + g.name)
    println("Тестирование класса Сингелтон и вывод данных класса на консоль: " + g.category)
    println("Тестирование класса Сингелтон и вывод данных класса на консоль: " + g.description)

  }
}

object SingletonTestClass {

  def apply(): SingletonTestClass = new SingletonTestClass()
  
  
  
}