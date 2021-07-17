package com.example.akka;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.*;

public class FirstBehaviour extends AbstractBehavior<String> {


    private FirstBehaviour(ActorContext<String> context) {
        super(context);
    }

    public static Behavior<String> create() {
        return Behaviors.setup(FirstBehaviour::new);
    }





    @Override
    public Receive<String> createReceive() {
        return newReceiveBuilder()
                .onMessageEquals("hello", ()->{
                    System.out.println("how can i help you");
                    return this;
                })
                .onMessageEquals("welcome", ()->{
                    System.out.println("Cool No Problem");
                    return this;
                })
                .onAnyMessage(message ->{
            System.out.println("The message is receieved "+message);
            return this;
        }).build();
    }
}
