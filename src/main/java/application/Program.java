package application;

import entities.Alunos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);

        Set<Alunos> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int A = sc.nextInt();
        for (int i=0;i<A;++i){
            int value = sc.nextInt();
            set.add(new Alunos(value));
        }

        System.out.print("How many students for course B? ");
        int B = sc.nextInt();
        for (int i=0;i<B;++i){
            int value = sc.nextInt();
            set.add(new Alunos(value));
        }

        System.out.print("How many students for course C? ");
        int C = sc.nextInt();
        for (int i=0;i<C;++i){
            int value = sc.nextInt();
            set.add(new Alunos(value));
        }

        System.out.println("Total Alunos: " + set.size());

        sc.close();
    }
}
