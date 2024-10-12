package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        byte humanAge;
        humanAge = 20;
        if (humanAge >= 18) {
            System.out.println("Человек достиг совершеннолетия");
        } else {
            System.out.println("Человек еще не достиг совершеннолетия, нужно ещё подождать");
        }


        byte temperature;
        temperature = -1;
        if (temperature < 5) {
            System.out.println("Сегодня холодно, температура на улице: " + temperature + ". Следует надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, температура на улице: " + temperature + ". Можно выходить без шапки");
        }


        short speed = 40;
        short speedLimit = 60;
        boolean speeding = speed > speedLimit;

        if (speeding) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }


        byte yearsOld = 20;
        boolean kindergartenAge = (yearsOld > 2 && yearsOld < 7);
        boolean schoolAge = (yearsOld > 7 && yearsOld < 17);
        boolean universityAge = (yearsOld > 17 && yearsOld < 24);
        boolean workAge = (yearsOld > 24);
        if (kindergartenAge) {
            System.out.println("Если возраст человека равен " + yearsOld +", то ему нужно ходить в детский сад");
        }
        if (schoolAge) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (universityAge) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить университет");
        }
        if (workAge) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }


        byte childAge = 8;
        if (childAge < 5) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если ребёнку уже исполнилось " + childAge + ", то ему можно посещать аттракцион без сопровождения взрослого");
        }


        byte carriageCapacity = 102;
        byte seatingPlaces = 60;
        int standingPlaces = carriageCapacity - seatingPlaces;
        byte occupiedStandingPlaces = 40;
        byte occupiedSeatingPlaces = 60;
        int occupiedPlaces = occupiedSeatingPlaces + occupiedStandingPlaces;
        int remainingPlaces = carriageCapacity - (occupiedSeatingPlaces + occupiedStandingPlaces);
        int remainingSeatingPlaces = seatingPlaces - occupiedSeatingPlaces;
        int remainingStandingPlaces = standingPlaces - occupiedStandingPlaces;
        boolean freePlaces = occupiedPlaces < carriageCapacity;
        boolean freeSeats = occupiedSeatingPlaces < seatingPlaces;
        boolean freeStandingPlaces = occupiedStandingPlaces < standingPlaces;
        if (freePlaces) {
            System.out.println("В вагоне свободны " + remainingPlaces + " места");
        }
        else {
            System.out.println("В вагоне отсутствуют места");
        }
        if (freeSeats) {
            System.out.println( remainingSeatingPlaces + " мест для сидения свободно");
        }
        else {
            System.out.println("Мест для сидения нет");
        }
        if (freeStandingPlaces) {
            System.out.println( remainingStandingPlaces + " стоячих места свободно");
        }


        int one;
        one = 1000;
        int two;
        two = 500;
        int three;
        three = 10000;
        if (one > two && one > three) {
            System.out.println( "Число one больше остальных" );
        }
        else if (two > one && two > three) {
            System.out.println( "Число two больше остальных" );
        }
        else {
            System.out.println("Число three больше остальных");
        }


    }
}