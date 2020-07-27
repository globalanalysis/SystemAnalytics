package TestApp.PackageTestClass

import Config.ConfigApp
import TestApp.Plasma

class AbstractFactoryTestClass extends Plasma {

  override def runTest: Unit = {

  var g = ConfigApp.getAbstractFactoryClass

    println("Тестирование класса AbstractFactory и вывод name класса на консоль: " + g.name)
    println("Тестирование класса AbstractFactory и вывод category класса на консоль: " + g.category)
    println("Тестирование класса AbstractFactory и вывод category класса на консоль: " + g.description)

  }
}

object AbstractFactoryTestClass {

  def apply(): AbstractFactoryTestClass = new AbstractFactoryTestClass()
}