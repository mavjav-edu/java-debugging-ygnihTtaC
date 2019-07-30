public abstract class DebugBoat
{
   protected String boatType = new String();
   protected int passengers;
   protected String power = new String();
   public DebugBoat(String bt)
   {
      boatType = bt;
   }
   // override equals() method to satisfy
   // requirements of Debug Exercise 3.
   public boolean equals(DebugBoat otherBoat)
   {
      boolean result;
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false;
      return result;
   }
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   protected abstract void setPower();
   protected abstract void setPassengers();
}
