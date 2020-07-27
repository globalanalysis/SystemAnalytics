package TestApp

import TestApp.PackageTestClass.{AbstractFactoryTestClass, SingeltonTestClass}

import scala.collection.mutable.ArrayBuffer

object CollectionTestClass {

  var collectonTest: ArrayBuffer[Plasma] = new ArrayBuffer[Plasma]

  collectonTest.+=(SingeltonTestClass())
  collectonTest.+=(AbstractFactoryTestClass())

  def exucuteAllTest() : Unit =  collectonTest.foreach(x => println(x.runTest()))


}
