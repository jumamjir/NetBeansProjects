/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testejava;

/**
 *
 * @author estagiario
 */
public class TesteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	   String nome = “João”;
	   imprimeNome(“Empty”);
}
public static void imprimeNome(String nome) {
	   if(!nome.isEmpty()){
		System.out.println(“Tudo bem ” + nome + “?”);
	   } else { 
		System.out.println(“O nome é ” + nome + “?”);
	   }
}
}
        // TODO code application logic here
    
    

