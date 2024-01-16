public class maxTwoDim {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 4},
                {45, 65, 333},
                {35, 85, 679, -34, 356, -34}
                      };
         int element = 85;
         System.out.println(searchElement(arr));


    }
    static int searchElement(int[][] array){
        int minValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] <minValue){
                    minValue = array[i][j];
                }
            }
        }
        return minValue;
    }
}