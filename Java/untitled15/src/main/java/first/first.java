package first;

class first {
    int a = 0;
    int b = 8;

    first(int i, int j){
        a = i;
        b = j;
    }

    void method(first O){
        O.a *= 2;
        O.b /= 2;
    }
}