package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: " );
        String name = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double price = sc.nextDouble();
        Product produto = new Product(name,price);
        System.out.println(produto);
        System.out.println("Digite o número de produtos para adicionar ao estoque: ");
        int qnt = sc.nextInt();
        produto.addProducts(qnt);
        System.out.println(produto);
        System.out.println("Deseja remover o produtos do estoque? (s/n)");
        char option = sc.next().charAt(0);
        if(option=='s'){
            System.out.println("Digite o número de produtos para remover ao estoque: ");
            qnt = sc.nextInt();
            produto.removeProducts(qnt);
            System.out.println(produto);
        } else {
            System.out.println(produto);
        }

        sc.close();

    }

}
