package br.com.caelum.eats.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class PagamentoConfirmadoEvent {
    private Long pagamentoId;
    private Long pedidoId;
}
