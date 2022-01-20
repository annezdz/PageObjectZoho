package memoriasArraysListas;

public class ExemploForeach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria","Bob","Alex"};

        // exemplo com for normal
        for(int i = 0; i < vect.length;i++){
            System.out.println(vect[i]);
        }

        //Exemplo foreach

        for(String obj : vect) {
            System.out.println(obj);
        }
    }
}
