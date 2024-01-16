package second;

class first {
    String name;
    int rno;
    int marks;

    first(String i, int r, int m) {
        this.name = i;
        this.rno = r;
        this.marks = m;
    }

    void changeName(String i){
        this.name = i;
    }

    first(first other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}