package com.mycompany.do2;
import java.util.Scanner;
public class Principal {
    private static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
      
     
//      Metodos.menu();
      
      Musica musica1=new Musica("Toxicity", "System of down", 4.32, Metodos.aleatorio());
      Musica musica2=new Musica("Runaway", "Kanye West", 8.22, Metodos.aleatorio());
      Musica musica3=new Musica("Alright", "Kendrick Lamar", 5.25, Metodos.aleatorio());
      Musica musica4=new Musica("November Rain", "Guns N Roses", 10.2, Metodos.aleatorio());
      Musica musica5=new Musica("Dream on", "Aerosmith", 4.2, Metodos.aleatorio());
      Musica musica6=new Musica("Crazy", "Aerosmith", 4.2, Metodos.aleatorio());
      
      Metodos.inserir(musica1);
      Metodos.inserir(musica5);
      Metodos.inserir(musica3);
      Metodos.inserir(musica2);
      Metodos.inserir(musica4);
      Metodos.inserir(musica6);
      Metodos.exibir();
      
      
        System.out.println("Digite o nome da musica que quer pesquisar: ");
        String nome = leitor.nextLine();
      
      Musica musica = Metodos.pesquisaBinaria(nome);
      if(musica!=null){
        System.out.println(musica);
        
          System.out.println("Deseja excluir esse musica?\n1 - Sim\n0 - Não");
          int cond = leitor.nextInt();
        if(cond == 1){
            Metodos.removerMusica(musica);
            System.out.println("Musica removida");
        }
        else{
            Metodos.exibir();
            System.out.println("Obrigado!");
        }
      }
      else{
        System.out.println("Não existe!");
      }
    };
    
}
