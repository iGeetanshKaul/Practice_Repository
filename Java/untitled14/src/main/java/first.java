class first {
    String name;
    int roll;
    int marks;



    first(){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    first(String name, int roll, int marks){
         this.name = name;
         this.roll = roll;
         this.marks = marks;
    }

    first(int roll, int marks){
        this.roll = roll;
        this.marks = marks;
    }

    boolean equalsTo(first O){
        if(O.name == name && O.marks == marks){
            return true;
        }else return false;
    }
}