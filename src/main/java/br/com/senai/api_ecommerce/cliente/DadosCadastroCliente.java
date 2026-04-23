package br.com.senai.api_ecommerce.cliente;

import br.com.senai.api_ecommerce.endereco.DadosEndereco;
import br.com.senai.api_ecommerce.Endereco.Endereco;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DadosCadastroCliente(
        @NotBlank
        @Size(min = 3, max = 100)
        @Column(unique = true)
        String nome,

        @NotBlank
        @Size(max=255)
        @Column(unique = true)
        @Email
        String email,

        @NotBlank
        @Size(min = 11, max = 11)
        @Column(unique = true)
        String cpf,

        @Size(max=20)
        String telefone,

        @Valid
        @NotNull
        DadosEndereco endereco
) {
}
