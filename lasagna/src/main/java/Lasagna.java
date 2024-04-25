public class Lasagna {
   
    public int expectedMinutesInOven()
    {
        return 40;
    }
    
    public int remainingMinutesInOven(int inOven)
    {
        return expectedMinutesInOven()-inOven;
    }
    
    public int preparationTimeInMinutes(int layer)
    {

        return layer*2;
    }
    
    public int totalTimeInMinutes(int layer , int totalTime)
    {
        return (preparationTimeInMinutes(layer) + totalTime);
    }
}
