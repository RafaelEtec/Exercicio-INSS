package calculardesconto;

import javax.swing.*;

public class calculardesconto {

    public static void main(String args[]) {
        double salario = 0, aliquota = 0, desconto = 0, valorliq = 0;
        
        String aux = "", erro = "", aliquotap = "";
        
        aux = JOptionPane.showInputDialog(null, "insira seu salário: ", "Inserir salário", 3);
        aux = aux.replace(',', '.');
        
        try{
        salario = Double.parseDouble(aux);       
        if (salario <= 965.67) {
            aliquota = 0.92;
            valorliq = salario * aliquota;
            aliquotap = " 8 %";
        }else 
        if (salario > 965.68 && salario < 1609.45) {
            aliquota = 0.91;
            valorliq = salario * aliquota;
            aliquotap = " 9 %";
        }else 
        if (salario > 1609.46 && salario < 3218.90) {
            aliquota = 0.89;
            valorliq = salario * aliquota;
            aliquotap = " 11 %";
        }
        desconto = salario - valorliq;
        if (salario < 465.00 || salario >= 3218.91 ) {
            JOptionPane.showMessageDialog(null, "Salário  Inválido \n O mínimo é: R$ 465,00 \n O máximo é: R$ 3218.90 ", "Salário inválido", 0);
        }else {
            JOptionPane.showMessageDialog(null, "\n\nSalário:    R$ " + salario + "\n\nAliquota: " + aliquotap + "\n\nDesconto: R$ " + desconto + "\n\nA receber: R$ " + valorliq+ "\n\n", "Dados" , 1);
        }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Valor não numérico!", "Erro", 0);
            System.exit(0);
        }
          
    }
    
}
