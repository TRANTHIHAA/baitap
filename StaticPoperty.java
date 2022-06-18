package NGAYNAM;

public class StaticPoperty {


        private String name;

        private String engine;



        public static int numberOfCars;



        public StaticPoperty(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }




    }



