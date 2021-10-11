// MemoryCell class
//  AnyType read( )         -->  Returns the stored value
//  void write( AnyType x ) -->  x is stored

public class GenericMemoryCell<AnyType extends Comparable> implements Comparable<GenericMemoryCell>
{
        // Public methods
    public AnyType read( )         { return storedValue; }
    public void write( AnyType x ) { storedValue = x; }


        // Private internal data representation
    private AnyType storedValue;

    @Override
    public int compareTo(GenericMemoryCell o) {
        return this.storedValue.compareTo(o.storedValue);
    }
}
