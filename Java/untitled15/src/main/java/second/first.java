package second;

class first {
    int a = 0;

    first(int i){
        a = i;
    }

    first incrByTen(){
        first temp = new first(a+10);
        return temp;
    }
}