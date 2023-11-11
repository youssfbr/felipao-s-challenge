package com.github.youssfbr.hero.application;

import com.github.youssfbr.hero.entities.Hero;

import java.util.Scanner;

/**
 * @author "Alisson Youssf"

 * Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói,
 * depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

 * Se XP for menor do que 1000 = Ferro
 * Se XP for entre 1001 e 2000 = Bronze
 * Se XP for entre 2001 e 5000 = Prata
 * Se XP for entre 5001 e 7000 = Ouro
 * Se XP for entre 5001 e 8000 = Platina Diamante
 * Se XP for entre 8001 e 9000 = Ascendente
 * Se XP for entre 9001 e 10000 = Imortal
 * Se XP for maior ou igual a 10001 = Radiante

 * Ao final deve se exivir uma mensagem:
 * "O Herói de nome **{nome}++ está no nivel **@*"
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char verify = 'y';

        while ( verify == 'y' ||
                verify == 'Y' ||
                verify == 's' ||
                verify == 'S')
        {
            System.out.print("\nNome do Herói: ");
            String name = sc.nextLine();
            System.out.print("Nível do Herói: ");
            int level = sc.nextInt();
            sc.nextLine();

            Hero hero = new Hero(name, level);
            System.out.println("\n" + hero);

            System.out.print("\nDeseja continuar? (y/n) ");
            verify = sc.next().charAt(0);
            sc.nextLine();
        }

        sc.close();
    }
}