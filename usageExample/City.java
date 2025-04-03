package usageExample;
import src.Relation;
import src.Relationnable;

public class City implements Relationnable
{
    private String name ;

    private Relation < Country , City > countryRelation ;

    public City ( String name )
    {
        this.name = name ;
    }

    public String toString ()
    {
        return this.name ;
    }

    public boolean hasCapital ()
    {
        if (countryRelation != null) 
        {
            return true ;
        }
        else 
        {
           return false  ;
        }
    }

    public void capital (Relation < Country , City > coutnrRelation)
    {
        if ( hasCapital() )
        {
            throw new IllegalStateException( "Object " + this + " already have a relation with Country " + this.countryRelation.relatedA().toString() ) ;
        }
        else 
        {
            this.countryRelation = coutnrRelation ;        
        }
    }

    @Override
    public void breakUP() 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'breakUP'");
    }

    @Override
    public void relateTo(Relationnable other) 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'relateTo'");
    }
}
