package third;

public class singleton {
    int num = 0;

   private static singleton instance;

   public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
   }


}