package atividadeparadigma;

import javax.swing.JOptionPane;

public class AtividadeParadigma {
    public static void main(String[] args) throws ClassNotFoundException {
        TryMakeFactory factory = TryMakeFactory.getInstance();
        try{
            //OBS: Não coloquei os nomes das classes quando setei as funções no factory
            //Coloquei nomes mais usuais de alto nivel
            //Pode-se encontrar esses nomes na função privada sem retorno setSystem() dentro da classe TryMakeFactory
            //Ou executando o programa.
            IDiscountCalculatorAdapter adapter = factory.getDiscount("INSIRA AQUI O TIPO DE DESCONTO");
            Sale sale = new Sale(adapter);
            System.out.println(sale.DiscountCalculator());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"<html>Invalid or empty text<br> Use: 'No discount' <br> 'Twenty percent discount' or <br> 'Fifty percent discount'<br> </html>");
        }
    }
}
