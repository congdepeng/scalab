package lang.akka.proxy

import akka.actor.{Props, ActorSystem}
import akka.dispatch.MessageDispatcher
import lang.akka.first.FirstActor

object ProxyApp extends App{

  private val student: Student = new Student("depeng")

  println("------------------ hello actor ---------------------------------")

  val system = ActorSystem("myActorSystem")

  private val proxyActor = system.actorOf(Props[ProxyToFirstActor],"ProxyToFirstActor")
    proxyActor.toString()
    proxyActor.tell("he", proxyActor)
    proxyActor.tell(new Student("depeng"), proxyActor)

}
