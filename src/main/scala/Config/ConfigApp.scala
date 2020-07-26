package Config

import Pattern.Singleton

object ConfigApp {

  def getSingletonClass: Singleton ={

    var t = new Singleton

    t


  }



}
