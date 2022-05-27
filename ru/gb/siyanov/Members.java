package ru.gb.siyanov;
public class Members  {


    public Members(Cat cat) {

    }

    public Members(Human human) {

    }

    public Members(Robot robot) {

    }

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1,5);
        Cat cat1 = new Cat("Tiger",2,7);
        Human human = new Human("Ivan", 4,11 );
        Human human1 = new Human("Vika",3,9);
        Robot robot = new Robot("Zeleboba",8,20);
        Robot robot1 = new Robot("Bochka",6,22);

        Members [] arrayMembers = new Members[6];
        arrayMembers[0] = new Members(cat);
        arrayMembers[1] = new Members(cat1);
        arrayMembers[2] = new Members(human);
        arrayMembers[3] = new Members(human1);
        arrayMembers[4] = new Members(robot);
        arrayMembers[5] = new Members(robot);








    }

//    private String name;
//    private int maxJump;
//    private int maxRun;
//    private Cat cat;
//    private Robot robot;
//    private Human human;


//            {   name = "";
//                cat = new Cat();
//                System.out.println("Создан экземпляр класса Cat");
//
//
//
//              }


     static class  Cat  implements Characteristics {
         public Cat(String name, int maxJump, int maxRun) {
             this.name = name;
         }

         private String name;

         @Override
        public void jump(int height) {
            System.out.println("Кошка " + name + " прыгнула ");

        }

        @Override
        public void run(int length) {
            System.out.println("Кошка " + name + "пробежала");

        }
    }

    static class Robot implements Characteristics {

        public Robot(String name, int maxJump, int maxRun) {
            this.name = name;
        }
        private String name;

        @Override
        public void jump(int height) {
            System.out.println("Человек " + name + " прыгнул ");

        }

        @Override
        public void run(int length) {
            System.out.println("Человек " + name + "пробежал");

        }



    }

    static class Human implements Characteristics {
         Human(String name, int maxJump, int maxRun) {
            this.name = name;
         }

        private String name;

        @Override
        public void jump(int height) {
            System.out.println("Человек " + name + " прыгнул ");

        }

        @Override
        public void run(int length) {
            System.out.println("Человек " + name + "пробежал");

        }
    }
}

