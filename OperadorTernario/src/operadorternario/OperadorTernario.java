/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author Juarez jr
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 , n2 , r  ; 
        n1 = 40 ; 
        n2 = 800 ; 
       /** operador ternario funciona com 3 partes , 1° parte ele executa 
         // a condição que esta no começa da operação , 2° (?) a interrogação caso
         a expressao seja verdadeira , 3° passo (:) 2 pontos , caso seja falso
         * O operador ternario aceita formulas dentro dele ex next line
         *  r =(n1>n2)?n1+n2: n1-n2;
          */
                   
        r =(n1>n2)?n1+n2:n2-n1;
        System.out.println(r);
        
        
    }
    
}
