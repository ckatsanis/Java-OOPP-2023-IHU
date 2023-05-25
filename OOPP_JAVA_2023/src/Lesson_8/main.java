package Lesson_8;

import global.UserInput;

public class main {

    public static void main(String[] args) {
        int n=0; // User length
        int aCar = 0, aTruck, aMot;
        int tmp_thesi, tmp_car=0, tmp_truck =0, tmp_moto =0;

        final float cars = 0.7f;
        final float trucks = 0.15f;

        aCar = Math.round( n * cars);
        aTruck = Math.round( n * trucks);
        aMot = Math.round( n * trucks);

        System.out.println("Give Array length");
        n = UserInput.getInteger();

        Vehicle[] v = new Vehicle[n];

        while (tmp_car < aCar) {
            tmp_thesi = (int) (Math.random()* n);

            if (v[tmp_thesi] == null) {
                Car tmpCar = new Car();

                v[tmp_thesi] = tmpCar;
                v[tmp_thesi].setEtos(12345);
                v[tmp_thesi].setOwner("Idioktitis Oximatos " + tmp_thesi);
                v[tmp_thesi].arSet("Pinakida" + ((tmp_thesi) * 1000 + tmp_thesi));
                v[tmp_thesi].setArThyrwn(4);
                tmp_car++;
            }
        }

        while (tmp_truck < aTruck) {
            tmp_thesi = (int) (Math.random()* n);

            if (v[tmp_thesi] == null) {
                Truck tmpTruck = new Truck();

                v[tmp_thesi] = tmpTruck;
                v[tmp_thesi].setEtos(12345);
                v[tmp_thesi].setOwner("Idioktitis Oximatos " + tmp_thesi);
                v[tmp_thesi].arSet("Pinakida" + ((tmp_thesi) * 1000 + tmp_thesi));
                v[tmp_thesi].setarAxonon(4);
                tmp_truck++;
            }
        }

        while (tmp_moto < aMot) {
            tmp_thesi = (int) (Math.random()* n);

            if (v[tmp_thesi] == null) {
                Motorcycle tmpMot = new Motorcycle();

                v[tmp_thesi] = tmpMot;
                v[tmp_thesi].setEtos(12345);
                v[tmp_thesi].setOwner("Idioktitis Oximatos " + tmp_thesi);
                v[tmp_thesi].arSet("Pinakida" + ((tmp_thesi) * 1000 + tmp_thesi));
                v[tmp_thesi].setkalathi(true);
                tmp_moto++;
            }
        }

        tmp_car =0;
        tmp_moto = 0;
        tmp_truck = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] instanceof Car)
                tmp_car++;
            else if (v[i] instanceof Truck)
                tmp_truck++;
            else
                tmp_moto++;

            System.out.println("To Oxima[" + i + "]" + " einai: " + v[i].getClass());
            System.out.println(v[i]);
            v[i].drive();
        }

    }

}
