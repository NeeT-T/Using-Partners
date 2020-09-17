package atividadeparadigma;

import javax.swing.JOptionPane;

public class AtividadeParadigma {
    public static void main(String[] args) throws ClassNotFoundException {
        TryMakeFactory factory = TryMakeFactory.getInstance();
        try{
            IDiscountCalculatorAdapter adapter = factory.getDiscount("INSIRA AQUI O TIPO DE DESCONTO");
            Sale sale = new Sale(adapter);
            System.out.println(sale.DiscountCalculator());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"<html>Invalid or empty text<br> Use: 'No discount' <br> 'Twenty percent discount' or <br> 'Fifty percent discount'<br> </html>");
        }
    }
}
