public class Array {

    int[][] numero = new int [7][3];

    public Array(){
    }

    public void modificarArray(){

            for(int i = 0;i < numero.length; i++){
                for(int j = 0; j < numero[0].length; j++){
                    numero[i][j] = j;
                }
            }
        }

    public void mostrarArray(){
        for (int i = 0; i < numero.length;i++)
            for(int j = 0;j < numero[0].length;i++) 
                System.out.println(numero[i][j]);
    }

}
