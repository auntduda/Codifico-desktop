package pair;

public class Pair<T1, T2> {
    T1 p1;
    T2 p2;

    public void setValue(T1 a, T2 b){
        this.p1 = a;
        this.p2 = b;
    }

    public T1 getKey(){
        return p1;
    }

    public T2 getValue(){
        return p2;
    }
}