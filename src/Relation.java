package src ;

public class Relation < A extends Relationnable , B extends Relationnable >
{
    private final A relatedA ;
    private final B relatedB ;

    public Relation (A relatA, B relatB)
    {
        this.relatedA = relatA ;
        this.relatedB = relatB ;
    }

    public A relatedA ()
    {
        return this.relatedA ;
    }

    public B relatedB ()
    {
        return this.relatedB ;
    }
    
    public void breakUp () 
    {
        
    }
}
