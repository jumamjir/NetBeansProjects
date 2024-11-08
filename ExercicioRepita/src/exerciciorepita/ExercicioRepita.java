/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author estagiario
 */
public class ExercicioRepita {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n, s = 0;
        do {
       n = Integer.parseInt(JOptionPane.showInputDialog(null,
               "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
       s += n;
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html> Resultado Final<hr>" +
                 "<br>Somatório vale: " + s + "</html>");
         
        int cont=0,valor,soma=0,totp=0,toti=0,acima_cem=0;
        float media;
        do{
        //Recebe um valor informado
valor=Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um valor<hr><em>(0 interrompe)</em></html>"));
       //Se o resto da divisao por 2 for 0, armazena +1 na variavel. Portanto é Par.
        if((valor%2==0)&&(valor!=0)){
            totp+=1;
        }
        //Se o resto da divisao por 2 for 1, armazena +1 na variavel. Portanto é Impar.
        if((valor%2==1)&&(valor!=0)){
            toti+=1;
        }
        //Se o valor for maior que 100, armazena +1 na variavel.
        if(valor>100){
            acima_cem+=1;
        }
        //Sai da estrutura de repetição.
        if(valor!=0){
            cont+=1;
        }
        //Soma todos o valores, para depois ser usado para achar a média.
        soma+=valor;
        }while(valor!=0);
        DecimalFormat num = new DecimalFormat("#");
        //Calcula a média, dividindo o total de todos os valores pela quantidade de valores informados.
        media=soma/cont;
        JOptionPane.showMessageDialog(null, "Total de Valores: "+cont+
                "\nTotal de Pares: "+totp+
                "\nTotal de Impares: "+toti+
                "\nAcima de 100: "+acima_cem+
                "\nMédia dos Valores: "+num.format(media),"Resultado",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
