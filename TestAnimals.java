import java.util.Scanner;
abstract class Animal
{
   protected int legs;
   protected Animal()
   {
       legs=0;
   }
   abstract void eat();
   void walk()
   {
       System.out.println("Walks with "+legs+" number of legs");
   }


}


class Spider extends Animal
{
   Spider()
   {
       super();
       super.legs=8;
   }
   void eat()
   {
       System.out.println("Spider eats insects");
   }
}


interface Pet
{
   String getName();
   String setName(String name);
   void play();
}


class Cat extends Animal implements Pet
{
   Scanner sc=new Scanner(System.in);
   Cat(String name)
   {
       super();
       super.legs=4;
   }
   Cat()
   {
       super();
       super.legs=4;
   }
   public String getName()
   {
       System.out.println("Enter name :");
       String name1=sc.next();
       return name1;
   }
   public String setName(String name)
   {
       return name;
   }
   public void play()
   {
       System.out.println("Cat plays with ball.");
   }
   void eat()
   {
       System.out.println("Cat eats fish");
   }
}


class Fish extends Animal implements Pet
{
   Scanner sc=new Scanner(System.in);
   Fish(){}
   public String getName()
   {
       System.out.println("Enter name :");
       String name1=sc.next();
       return name1;
   }
   public String setName(String name)
   {
       return name;
   }
   public void play()
   {
       System.out.println("Fish plays with water toys");
   }
   void walk()
   {
       System.out.println("Fish cannot walk");
   }
   void eat()
   {
       System.out.println("Fish eats fish food");
   }
}
public class Main {
   public static void main(String args[])
   {
       Fish d=new Fish();
       Cat c=new Cat("Fluffy");
       Animal a=new Fish();
       Animal e=new Spider();
       Pet p=new Cat();


       d.walk();
       d.eat();
       c.eat();
       a.eat();
       e.eat();


   }
}
