import LooggerPlatform.RunLogger
import TestApp.CollectionTestClass

object RunApp {
import akka.actor.ActorSystem


  def main(args: Array[String]): Unit = {


  CollectionTestClass.exucuteAllTest


    var l = new RunLogger();
    l.infoLoogger("First writer");
    l.infoLoogger("TWO writer");





  }



}
