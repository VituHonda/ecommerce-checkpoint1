package br.com.fiap.ecommerce.dtos.pedido;

import br.com.fiap.ecommerce.model.Pedido;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PedidoRequestCreateDto {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final ModelMapper modelMapper = new ModelMapper();

    private Long idCliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;

    public Pedido toModel() {
        return modelMapper.map(this, Pedido.class);
    }
}
