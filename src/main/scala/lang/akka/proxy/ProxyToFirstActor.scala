package lang.akka.proxy

import akka.actor.{Actor, ActorRef, Props}
import akka.event.Logging
import lang.akka.first.FirstActor

object ProxyToFirstActor {



}


class ProxyToFirstActor extends Actor {
  val log = Logging(context.system, this)

  override def receive: Actor.Receive = {
    case student: Student =>
        println(student.getClass)
    case _ =>
      log.info("other println")
      val newFirst = context.actorOf(Props[FirstActor])
      newFirst.toString()
  }
}