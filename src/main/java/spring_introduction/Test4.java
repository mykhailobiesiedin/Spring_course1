package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Spayk");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Yasya");
////
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

//        System.out.println(myDog);
//        System.out.println(yourDog);
//        System.out.println(myDog.hashCode() == yourDog.hashCode());

        context.close();
    }
}
