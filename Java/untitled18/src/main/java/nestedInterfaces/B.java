package nestedInterfaces;

public class B implements A.NestedInterface{
    public boolean isNegative(int p){
        return ((p > 0) ? true : false);
    }
}