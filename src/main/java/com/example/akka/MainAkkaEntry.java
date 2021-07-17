package com.example.akka;

import akka.actor.typed.ActorSystem;

public class MainAkkaEntry {

    public static void main(String arg[]) {

      ActorSystem<String> actorSystem =  ActorSystem.create(FirstBehaviour.create(), "firstactor");
      actorSystem.tell("hello");
      actorSystem.tell("welcome");
      actorSystem.tell("nice");
      actorSystem.terminate();
    }
}
