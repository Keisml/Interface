import java.time.LocalDate;

public class Cartaodecredito implements PagamentoInterface {
        String numero;
        LocalDate validade;
        String cvv;

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
}