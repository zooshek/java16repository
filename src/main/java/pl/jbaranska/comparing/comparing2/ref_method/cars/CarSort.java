package pl.jbaranska.comparing.comparing2.ref_method.cars;

public class CarSort {
    public static int orderByColorNextYearNextModel(Car first, Car second)
    {
       int firstsort =  first.getColor().compareTo(second.getColor());
       if (firstsort == 0 )
       {
         int secondsort = first.getYear().compareTo(second.getYear());
         if (secondsort == 0)
         {
             int thirdsort = first.getModel().compareTo(second.getModel());
           return thirdsort;
         }
         else return secondsort;
       }
        else return firstsort;
    }
}
