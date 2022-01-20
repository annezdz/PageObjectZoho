package memoriasArraysListas;

public class ExemploBoxingUnboxingWrapper {
    public static void main(String[] args) {

        //Exemplo de Boxing
        int x = 20;

        Object obj = x;
        System.out.println(obj);

        //Exemplo de Unboxing

        int y = (int)obj;
        System.out.println(y);

        //Exemplo com Wrapper

        Integer j = x;
        int k = j * 2;
        System.out.println(k);


    }
}
