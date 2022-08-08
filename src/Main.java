public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("Barsik");
        cat.setColor("black");
        cat.setWeight(5);
        cat.setAge(8);

        String name=cat.getName();
        String color=cat.getColor();
        int weight =cat.getWeight();
        int  age=cat.getAge();
        System.out.println("This is a cat:");
        System.out.println(name);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(age);
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(cat.speak());
        System.out.println("-------------------------");


        Dog dog=new Dog();
        dog.setName1("Barbos");
        dog.setColor1("brown");
        dog.setWeight1(10);
        dog.setAge1(8);

        String name1=dog.getName1();
        String color1=dog.getColor1();
        int weight1=dog.getWeight1();
        int  age1=dog.getAge1();
        System.out.println("This is a dog:");
        System.out.println(name1);
        System.out.println(color1);
        System.out.println(weight1);
        System.out.println(age1);
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        System.out.println(dog.speak());
        System.out.println("-------------------------");

        Fish fish=new Fish();
        fish.setName2("Nurkyz");
        fish.setColor2("pink");
        fish.setWeight2(2);
        fish.setAge2(1);

        String name2=fish.getName2();
        String color2=fish.getColor2();
        int weight2 =fish.getWeight2();
        int  age2=fish.getAge2();
        System.out.println("This is a fish:");
        System.out.println(name2);
        System.out.println(color2);
        System.out.println(weight2);
        System.out.println(age2);
        System.out.println(fish.eat());
        System.out.println(fish.sleep());
        System.out.println(fish.speak());
        System.out.println("-------------------------");

        Parrot parrot=new Parrot();
        parrot.setName3("Piko");
        parrot.setColor3("blue");
        parrot.setWeight3(2);
        parrot.setAge3(1);

        String name3=parrot.getName3();
        String color3=parrot.getColor3();
        int weight3 =parrot.getWeight3();
        int  age3=parrot.getAge3();
        System.out.println("This is a parrot:");
        System.out.println(name3);
        System.out.println(color3);
        System.out.println(weight3);
        System.out.println(age3);
        System.out.println(parrot.eat());
        System.out.println(parrot.sleep());
        System.out.println(parrot.speak());
        System.out.println("-------------------------");

    }
}