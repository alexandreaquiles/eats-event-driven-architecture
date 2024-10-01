package br.com.caelum.eats.pagamento;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;

@EnableBinding(StreamConfig.PagamentoConfirmadoSource.class)
@Configuration
class StreamConfig {
    interface PagamentoConfirmadoSource {
        @Output
        MessageChannel pagamentosConfirmados();
    }
}