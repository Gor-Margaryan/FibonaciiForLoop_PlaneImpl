package service;

import model.Plane;

public class PlaneServiceIMPL implements PlaneService {
    @Override
    public void Task1(Plane p1) {
        System.out.println(p1.getModel());
        System.out.println(p1.getCountry());
        System.out.println(p1.getYear());
        System.out.println(p1.getHours());
        System.out.println(p1.isMilitary() ? "Military" : "Civil");
        System.out.println(p1.getWeight() + "KG");
        System.out.println(p1.getWingspan());
        System.out.println(p1.getTopSpeed() + "KM/H");
        System.out.println(p1.getSeats());
        System.out.println(p1.getCost() + "$");
    }

    @Override
    public void Task2(Plane p1) {
        if (p1.isMilitary()) {
            System.out.println(p1.getCost() + " " + p1.getTopSpeed());
        } else {
            System.out.println(p1.getModel() + " " + p1.getCountry());
        }
    }

    @Override
    public Plane Task3(Plane p1, Plane p2) {
        if (p1.getYear() >= p2.getYear()) {
            return p1;
        }
        return p2;
    }

    @Override
    public String Task4(Plane p1, Plane p2) {
        if (p2.getWingspan() >= p1.getWingspan()) {
            return p2.getModel();
        }
        return p1.getModel();
    }

    @Override
    public void Task5(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p3.getSeats()) {
            System.out.println(p1.getCountry());
        } else if (p2.getSeats() <= p1.getSeats() && p2.getSeats() <= p3.getSeats()) {
            System.out.println(p2.getCountry());

        } else {
            System.out.println(p3.getCountry());
        }
    }

    @Override
    public void Task6(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) {
                System.out.println(planes[i].getModel() + " " + i + " ");
            }

        }
    }

    @Override
    public void Task7(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHours() > 100) {
                System.out.println(planes[i].getModel() + " " + i);
            }

        }
    }

    @Override
    public Plane Task8(Plane[] planes) {
        Plane minimumQash = planes[0];
        for (int i = 1; i < planes.length; i++) {

            if (planes[i].getWeight() >= minimumQash.getWeight()) {
                minimumQash = planes[i];

            }

        }
        return minimumQash;
    }

    @Override
    public Plane Task9(Plane[] planes) {
        Plane amenaEjanSam = null;
        for (int i = 0; i < planes.length; i++) {


            if (amenaEjanSam == null) {
                if (planes[i].isMilitary()) {
                    amenaEjanSam = planes[i];
                }
            } else if (planes[i].isMilitary() && planes[i].getCost() < amenaEjanSam.getCost()) {
                amenaEjanSam = planes[i];

            }

        }
        if (amenaEjanSam != null) {
            System.out.println(amenaEjanSam.getCountry());
        } else {
            System.out.println("Vayenni samalyot chka");
        }
        return amenaEjanSam;

    }

    @Override
    public Plane Task10(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length ; j++) {
                if (planes[j-1].getYear()<planes[j].getYear()){
                    Plane temp = planes[j];
                    planes[j]= planes[j-1];
                    planes[j-1]=temp;

                }

            }
        }
        for (Plane pl:planes){
            System.out.println(pl.getCountry());
        }
        return planes[planes.length-1];


    }
}