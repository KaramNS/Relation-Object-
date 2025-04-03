package usageExample ;

public class Test 
{
    public static void main (String [] args)
    {
        
        var paris = new City ("Paris") ;
        var cf = new City ("Clermont Ferrand") ;

        var france = new Country("France", paris) ;
        
        france.add(cf);

        System.out.println( france.toString() ) ;
    }
}
