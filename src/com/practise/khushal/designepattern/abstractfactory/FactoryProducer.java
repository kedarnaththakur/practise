package com.practise.khushal.designepattern.abstractfactory;
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      }
      
      return null;
   }
}