package first;

class one {
    String name;
    int marks;
    int rno;
    static int numberOfObjects = 0;

    public one(String name, int marks, int rno) {
        this.name = name;
        this.marks = marks;
        this.rno = rno;
        this.numberOfObjects += 1;
    }
}