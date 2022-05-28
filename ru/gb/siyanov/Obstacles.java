package ru.gb.siyanov;

public class Obstacles {
    public Obstacles(Treadmill treadmill) {

    }

    public Obstacles(Wall wall1) {

    }

    public static void main(String[] args) {
        Wall wall = new Wall(2);
        Wall wall1 = new Wall(20);
        Treadmill treadmill = new Treadmill(10);
        Treadmill treadmill1 = new Treadmill(8);

        Obstacles [] obstacles = new Obstacles[4];
        obstacles[0] = new Obstacles(wall);
        obstacles[1] = new Obstacles(wall1);
        obstacles[2] = new Obstacles(treadmill);
        obstacles[3] = new Obstacles(treadmill1);


    }






    }

    class Wall{
        private int height;

        public Wall(int height) {
            this.height = height;
        }
    }
    class Treadmill{
        int lenght;

        public Treadmill(int lenght) {
            this.lenght = lenght;
        }
    }





