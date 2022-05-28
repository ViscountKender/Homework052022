package ru.gb.siyanov;
public class Members implements Characteristics {
    int height;
    int lenght;
    int max;


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
        arrayMembers[5] = new Members(robot1);




        }


        @Override
    public void jump(int maxJump) {
        String name = "";




        System.out.println(name + " прыгнул " );

    }

    @Override
    public void run(int maxRun) {
        String name = "";



        System.out.println(name + " пробежал " );

    }
}


      class  Cat   {
          private String name;
          private int maxJump;
          private int maxRun;

          public Cat(String name, int maxJump, int maxRun) {
              this.name = name;
              this.maxJump = maxJump;
              this.maxRun = maxRun;
          }


      }

     class Robot  {
         public Robot(String name, int maxJump, int maxRun) {
             this.name = name;
             this.maxJump = maxJump;
             this.maxRun = maxRun;
         }

         private String name;
         private int maxJump;
         private int maxRun;

        }

     class Human   {
         public Human(String name, int maxJump, int maxRun) {
             this.maxJump = maxJump;
             this.maxRun = maxRun;
             this.name = name;
         }

         private String name;
         private int maxJump;
         private int maxRun;


    }


