package br.com.caelum.notafiscal;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(StreamConfig.PagametoConfirmadoSink.class)
@Configuration
class StreamConfig {
    interface PagametoConfirmadoSink {
        String PAGAMENTOS_CONFIRMADOS_TOPIC = "pagamentosConfirmados";
        @Input
        SubscribableChannel pagamentosConfirmados();
    }
}
