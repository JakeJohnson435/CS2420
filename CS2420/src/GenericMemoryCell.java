// MemoryCell class
//  AnyType read( )         -->  Returns the stored value
//  void write( AnyType x ) -->  x is stored

public abstract class GenericMemoryCell<AnyType extends Comparable<? super AnyType>> implements Comparable<GenericMemoryCell>
{
        // Public methods
    public AnyType read( )         { return storedValue; }
    public void write( AnyType x ) { storedValue = x; }



        // Private internal data representation
    private AnyType storedValue;
}
