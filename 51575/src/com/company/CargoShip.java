package com.company;

public class CargoShip extends Ship
{

    private int tonnage;

    public CargoShip(String newName, String newYear, int newTonnage)
   {
      super(newName, newYear);
      this.tonnage = newTonnage;
    }
    public void setCargoCapacity(int newTonnage)
    {
        this.tonnage = newTonnage;
    }
    public int getCargoCapacity()
    {
        return this.tonnage;
    }
    @Override
    public String toString()
    {
        return ("Cargo Ship: " + super.getShipName() + " - tonnage: " + this.tonnage + "\n");
    }
}
