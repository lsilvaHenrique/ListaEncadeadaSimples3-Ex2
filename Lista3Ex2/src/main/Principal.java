package main;

import java.util.ArrayList;
import java.util.List;
import sp.fateczl.lucas.listaInt.*;

public class Principal {

    public static void main(String[] args) {
        // Definindo as listas Prim e Sec
        Lista prim = new Lista();
        prim.addFirst(1);
        prim.addLast(7);
        
        Lista sec = new Lista();
        sec.addFirst(3);
        sec.addLast(4);
        sec.addLast(8);
        
        // Criando a lista Terc a partir das listas Prim e Sec
        Lista terc = new Lista();
        terc.addAll(prim);
        terc.addAll(sec);
        
        System.out.println("Lista Terc antes da ordenação:");
        System.out.println(terc);
        
        // Ordenando a lista Terc com bubble sort
        int n = terc.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (terc.get(j) > terc.get(j + 1)) {
                    int temp = terc.get(j);
                    terc.set(j, terc.get(j + 1));
                    terc.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("Lista Terc depois da ordenação:");
        System.out.println(terc);
    }

}
