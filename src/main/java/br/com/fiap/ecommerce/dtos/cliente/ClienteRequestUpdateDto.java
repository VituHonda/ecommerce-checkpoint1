package br.com.fiap.ecommerce.dtos.cliente;


import br.com.fiap.ecommerce.model.Cliente;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ClienteRequestUpdateDto {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final ModelMapper modelMapper = new ModelMapper();

    private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;

    public Cliente toModel(Long id) {
        Cliente result = modelMapper.map(this, Cliente.class);
        result.setId(id);
        return result;
    }
}
