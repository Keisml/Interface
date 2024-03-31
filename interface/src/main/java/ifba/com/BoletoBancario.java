import java.time.LocalDate;

public class BoletoBancario {
    String codigodebarras;
    LocalDate datadevencimento;

    @Override
     public void efetuarPagamento(){
            System.out.println("O Pagamento foi efetuado com sucesso!!!");
        }
        @Override
        public void extornarPagamento(){
            System.out.println("O Pagamento foi extornado com sucesso!!1");
        }
        @Override
        public void agendarPagamento(){
            System.out.println("O Pagamento foi agendado com sucesso!!!");
        }
        @Override
        public void imprimirComprovante(){
            System.out.println("O Pagamento foi impresso com sucesso!!!");
        }
        @Override
        public void gerarSegundavia(){
            System.out.println("Segunda via gerada com sucesso!!!");
        }
        @Override
        public void emitir(){
            System.out.println("Recibo do Pagamento emitido com sucesso!!!");
        }
        @Override
        public void dispararEmailproxvencimento(){
            System.out.println("Email:Seu Pagamento está proximo do vencimento!!!");
        }
    



    
}