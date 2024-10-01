package br.com.caelum.eats.pagamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class PagamentoConfirmadoEvent {
    private Long pagamentoId;
    private Long pedidoId;
}