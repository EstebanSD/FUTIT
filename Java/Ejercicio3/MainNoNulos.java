package Ejercicio3;

import java.util.ArrayList;

public class MainNoNulos {

    public static void main ( String[] args) {

        ArrayList<Integer> arreglo1 = new ArrayList<>();
        arreglo1.add(0, 1);
        arreglo1.add(1, 0);
        arreglo1.add(2, -2);
        arreglo1.add(3, 0);
        arreglo1.add(4, 0);
        arreglo1.add(5, 3);
        arreglo1.add(6, 4);
        arreglo1.add(7, 0);
        arreglo1.add(8, 0);

        int count,pos,i;

        count = pos = i = 0;
        while(i < arreglo1.size()){
            if(arreglo1.get(i) == 0){
                i ++;
            }
            else{
                arreglo1.set(pos, arreglo1.get(i));
                i ++;
                count ++;
            }
        }
        System.out.println("El numero de elementos no nullos es: " + count);
    }
}