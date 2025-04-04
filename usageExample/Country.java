package usageExample ;

import java.util.HashSet;
import java.util.Set;

import src.Relation;
import src.Relationnable;


class Country implements Relationnable
{
    private final String name ;
    private final Set<City> cities ;

    private Relation <Country , City> capitalRelation ; 

    Country (String name, City capital) 
    {
        this.name = name ;
        this.cities = new HashSet<City> () ;

        this.capitalRelation = null ;

        this.relateTo(capital) ;
    }
    
    // Setters 
    
    public void capital (Relation < Country , City > capitalRelation)
    {
        if ( this.capitalRelation == null )
        { 
            this.capitalRelation = capitalRelation ;

            this.cities.add ( capitalRelation.relatedB() ) ;
        }
        else 
        {
            throw new IllegalStateException( "The Country " + this + " already have a capital relation with " + this.capitalRelation.relatedA().toString() ) ; 
        }
    }

    // Getters

    public String name ()
    {
        return this.name ;
    }

    public void add (City city)
    {
        this.cities.add(city) ;
    }

    @Override
    public String toString ()
    {   
        StringBuilder sb = new StringBuilder () ;

        sb.append ( "\n------------------------------------------------\nCountry : " ) ;
        
        sb.append ( this.name () ) ;
        sb.append ( " | Capital is ") ;
        sb.append ( this.capitalRelation.relatedB().toString() ) ;

        sb.append ( "\n------------------------------------------------\n" ) ;


        return sb.toString() ;
    }

    @Override
    public void breakUP ()
    {   
        // this.capitalRelation.relatedB().breakUP() ;
        this.capitalRelation = null ;
    }

    @Override 
    public void relateTo(Relationnable relatee)
    {
        if ( relatee instanceof City )
        {
            this.capitalRelation = new Relation<Country, City>(this, (City) relatee) ;

            this.cities.add( (City) relatee ) ;

            ( (City) relatee ).capital(capitalRelation); ;
        }
    }

}