
package revisão1;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Revisão1 {

    public static void main(String[] args) {
               /*A padaria Hotpão vende uma certa quantidade de pães franceses e uma 
quantidade de broas acada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50.
Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães
e broas (juntos), e quanto deve guardar numa conta de poupança 
(10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. 
Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e 
de broas, e depois calcular os dados solicitados. */
       
       double pão, broa, ValorP, ValorB, ValorTotal, poupança;
       int quantidadeP, quantidadeB;
       
       pão = 0.12;
       broa = 1.50;
       ValorP = 0;
       ValorB = 0;
            
      quantidadeP = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Pães Vendidos: "));
       quantidadeB = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Broas Vendidas: "));
       
       ValorP = pão * quantidadeP;
       ValorB = broa * quantidadeB;
       
       ValorTotal = ValorP + ValorB;
       poupança = ValorTotal * 0.10;
       
       JOptionPane.showMessageDialog(null, "Quantidade de pães vendidos: "+quantidadeP+
               "\n Quantidade de Broas vendidas: "+quantidadeB+ "\n Valor total dos pães vendidos: R$"+ValorP+
               "\n Valor total das Broas vendidas: R$"+ValorB+ "\n Valor total adquirido ao final do dia: R$"+ValorTotal+
               "\n Valor que deverá guardar em uma poupança R$"+poupança);
        
    }
    
}
