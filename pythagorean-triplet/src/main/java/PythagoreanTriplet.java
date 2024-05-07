import java.util.*;
public class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String toString() {
        return String.format("(%d, %d, %d)", a, b, c);
    }

    //To check if the same triplet is not being added again
    public boolean equals(Object triplet) {
        
        if ( this == triplet ) {
            return true;
        } 
        else if ( triplet instanceof PythagoreanTriplet ) {
            PythagoreanTriplet pythagoreanTriplet = (PythagoreanTriplet) triplet;
            return a == pythagoreanTriplet.a && b == pythagoreanTriplet.b && c ==             pythagoreanTriplet.c;
        } 
        else {
            return false;
        }
    }

    
    public static TripletsList makeTripletsList() {
        return new TripletsList();
    }
    
    public static class TripletsList {
        private int perimeter;
        private Integer maxFactor = null;
        
        /*1. If a=b then a+b+c = sum
             or 2a + c = sum. Since, in a right angled triangle, sum of the sides is smaller than
             the hypotenues. Thus 2a<c.
             a² + b² = c² => c² = 2a² 
             Thus we have written this as the permiter limit:
             perimeter = a+b+c => 2a+2^(1/2)a
             or perimeter = a(2+2^(1/2)) which is used as the lower limit
         2. If 2a<perimeter then it gives us the upper limit as:
            a<(perimeterSum)/(2+2^(1/2))
        */
      
        private static final double PERIMETER_RATIO_LIMIT = 1 + 1 + Math.sqrt(2);
        
        public TripletsList withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }
        
        public TripletsList thatSumTo(int perimeter) {
            this.perimeter = perimeter;
            
            if ( maxFactor == null ) {
                maxFactor = perimeter;
            }
            return this;
        }

        /* Assuming that a + b + c = perimeter and a² + b² = c²,
          b+c = perimeter-a
          Adding c² + 2bc on both sides we get:
               a² + b² + c² + 2bc = c² + 2bc + c²
               a² + (b + c)² = 2bc + 2c²
                   
                a² + (b + c)²
               ------------- = c
                  2(b + c)

              Substituting (n-a):
                a² + (n - a)²
               ------------- = c
                  2(n-a)
       */
        
        public List<PythagoreanTriplet> build() {
            
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            
            for (int a = 1; a <= Math.floor(perimeter / PERIMETER_RATIO_LIMIT); a++) {
                
                int numerator = a * a + (int) Math.pow(perimeter-a, 2);
                int denominator = 2 * (perimeter - a);
                
                if ( numerator % denominator == 0 ) {
                    
                    int c = numerator / denominator;
                    
                    if ( c <= maxFactor ) {
                        
                        int b = perimeter - a - c;
                        triplets.add(new PythagoreanTriplet(a, b, c));
                        
                    }
                }
            }
            
            return triplets;
        }
    }
}