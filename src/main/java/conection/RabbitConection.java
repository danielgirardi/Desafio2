package conection;

import com.south.stockmanagement.constantes.RabbitmqConstantes;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.naming.Binding;
import java.util.Queue;

@Component
public class RabbitConection {

    private static final String NOME_EXCHANGE = "amq.direct";
    //criando a fila

    public AmqpAdmin amqAminn;

    public RabbitConection(AmqpAdmin amqAdmin){
        this.amqAminn = amqAdmin;
    }

    private Queue fila(String nameFila) {
        return new Queue(nameFila, true, false, false);

        }
    private DirectExchange trocadireta(){
        return new DirectExchange(NOME_EXCHANGE);

    }

    private Binding relacionamento (Queue fila, DirectExcahnge troca){
        return new Binding(fila.getName(), Binding.DestinationType.Queue, troca.getName(), arguments null )
    }

    @PostConstruct
    private void adiciona(){  //Criando filas
        Queue filaEstoque = this.fila(RabbitmqConstantes.FILA_ESTOQUE);
        Queue filaPreco = this.fila(RabbitmqConstantes.FILA_PRECO);

        DirectExchange troca = this.trocadireta();

        Binding ligacaoEstoque = this.relacionamento(filaEstoque, troca);
        Binding ligacaoPreco = this.relacionamento(filaPreco, troca);

        //Criando as filas no RabbitMQ
        this.amqAminn.declareQueue(filaEstoque);
        this.amqAminn.declareQueue(filaPreco);

        this.amqAminn.declareExchange(troca);

        this.amqAminn.declareBinding(ligacaoEstoque);
        this.amqAminn.declareBinding(ligacaoPreco);
    }
}