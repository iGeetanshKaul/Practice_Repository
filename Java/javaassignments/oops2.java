public class oops2 {
    public static void main(String[] args) {
        class Student{
            int roll;
            float marks;
            String name;

        Student() {
           this();
        }

        Student(int roll,float marks,String name){
            this.roll=roll;
            this.marks=marks;
            this.name=name;

            }
            //taking from one constructor to another
//        Student(Student other){
//            this.roll=other.roll;
//            this.marks= other.marks;
//            this.name=other.name;
//
//        }


        }
        Student geetansh = new Student();

        System.out.println(geetansh.roll);
        System.out.println(geetansh.name);
        System.out.println(geetansh);

        geetansh.roll=53;
        geetansh.marks=45.54f;
        geetansh.name="kaul";

        System.out.println(geetansh.roll);
        System.out.println(geetansh.marks);
        System.out.println(geetansh.name);


        Student versace = new Student();
        System.out.println(versace.marks);
        System.out.println(versace.roll);
        System.out.println(versace.name);


        Student gucci = new Student(15,56.5f,"grg");
    }
}