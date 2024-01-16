package fourth;

public class first {
    String name;
    int marks;
    int rno;
    static int studyingIn;

    first(String name, int marks, int rno) {
        this.name = name;
        this.marks = marks;
        this.rno = rno;
        first.studyingIn += 1;
    }
}

class third{
    public static void main(String[] args) {
        first one = new first("Geetansh", 50, 50);
        first two = new first("Kunal", 50, 50);
        System.out.println(one.studyingIn);
        System.out.println(two.studyingIn);
    }

}