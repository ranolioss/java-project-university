package com.company;
import java.util.ArrayList;

public class ShipDemo {

    public static void main(String[] args) {

        ArrayList<Ship> ships = new ArrayList<>();
        CargoShip cargo_ship = new CargoShip("CargoShip", "2000", 1000);
        CruiseShip cruise_ship = new CruiseShip("CruiseShip", "2021", 30);
        Ship normal_ship = new Ship("NormalShip", "1998");
        ships.add(cargo_ship);
        ships.add(cruise_ship);
        ships.add(normal_ship);

        for (Ship element_ship : ships) {
            System.out.print(element_ship);
        }

        // alternative way of array creation and different ship assignment
//        Ship[] ship_array = new Ship[2];
//        ship_array[0] = new CruiseShip("CruiseShip", "2000", 3);
//        //ship_array[0].setShipName("CruiseShip");
//        //ship_array[0].setYearBuilt("2000");
//
//        ship_array[1] = new CargoShip("CargoShip", "2021", 13);
//        //ship_array[1].setShipName("CargoShip");
//        //ship_array[1].setYearBuilt("2021");
//
//        for (int i=0; i <= ship_array.length - 1; i++) {
//            System.out.print(ship_array[i]);
//        }


    }

}
