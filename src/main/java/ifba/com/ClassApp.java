public class class.app {
    public static void main(String[] args) {
        CartaoCredito cart = new CartaoCredito();
        cart.efetuarPagamento();
        cart.agendarPagamento();
        cart.imprimirPagamento();
        cart.extornarPagamento();

        BoletoBancario bol = new BoletoBancario();
        bol.efetuarPagamento();
        bol.agendarPagamento();
        bol.imprimirPagamento();
        bol.extornarPagamento();
        bol.efetuarPagamento();
        bol.gerarSegundaVia();
        bol.dispararEmailProxVencimento();
    }
    
}