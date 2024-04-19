public class Lasagna {
   
    public int expectedMinutesInOven()
    {
        return 40;
    }
    
    public int remainingMinutesInOven(int inoven)
    {
        return expectedMinutesInOven()-inoven;
    }
    
    public int preparationTimeInMinutes(int layer)
    {

        return layer*2;
    }
    
    public int totalTimeInMinutes(int layer , int totaltime)
    {
        return (preparationTimeInMinutes(layer) + totaltime);
    }
}
