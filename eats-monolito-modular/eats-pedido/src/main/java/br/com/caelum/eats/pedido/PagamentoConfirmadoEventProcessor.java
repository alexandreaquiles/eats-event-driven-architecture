package br.com.caelum.eats.pedido;

import br.com.caelum.eats.PedidoStreamConfig;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class PagamentoConfirmadoEventProcessor {

  private final PedidoRepository pedidoRepository;

  @StreamListener(PedidoStreamConfig.PagamentoConfirmadoSink.PAGAMENTOS_CONFIRMADOS_TOPIC)
    void pagamentoConfirmado(PagamentoConfirmadoEvent pagamentoConfirmadoEvent) {
        Long pedidoId = pagamentoConfirmadoEvent.getPedidoId();
        Pedido pedido = pedidoRepository.porIdComItens(pedidoId);
        pedidoRepository.atualizaStatus(Pedido.Status.PAGO, pedido);
    }

  }
