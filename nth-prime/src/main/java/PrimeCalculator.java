class PrimeCalculator {

    int nth(int nth) {

        if(nth==0)
           throw new IllegalArgumentException("Number less than two");
        
        int iterator = 2;
        int num = nth;
        
        while(num>0)
            {
                if(isPrime(iterator))
                    num--;
                
                iterator++;
            }
        
        iterator-=1;
        return iterator;
    }

    boolean isPrime(int number)
    {
        boolean div_by_two = (number%2 ==0);
        boolean div_by_three = (number%3 == 0);
        
        
        if(number == 2|| number == 3)
            return true;
        
        if(div_by_two || div_by_three)
            return false;

        for(int iterator = 5; iterator*iterator<=number; iterator = iterator+6)
            {
                if(number%iterator == 0 || number%(iterator+2)==0)
                    return false;
            }
        return true;
        
    }

}
