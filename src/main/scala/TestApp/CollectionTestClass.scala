package TestApp

import scala.collection.mutable.ArrayBuffer

object CollectionTestClass {

  var collectonTest: ArrayBuffer[Plasma] = new ArrayBuffer[Plasma]

  collectonTest.+=(SingeltonTestClass())

  def exucuteAllTest : Unit =  collectonTest.foreach(x => println(x.runTest))


}
