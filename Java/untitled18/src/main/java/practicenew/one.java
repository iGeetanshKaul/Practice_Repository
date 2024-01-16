package practicenew;

public class one {
    int i = 0;
    int j = 1;
    int area = 0;

    public one(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public one(one other){
        this.i = other.i;
        this.j = other.j;
    }

    public void area(int i, int j){
        this.area = this.i * this.j;
    }

    public boolean isEqualto(one other){
        if(other.i == this.i && other.j == this.j) return true;
        else return  false;
    }

    public class inner{
        static int i = 9;

        public inner(){
            this.i = -1;
        }
        void display(){
            System.out.println("Inner Class");
        }
    }



}