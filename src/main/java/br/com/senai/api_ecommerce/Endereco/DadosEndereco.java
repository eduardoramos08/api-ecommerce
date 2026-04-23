package br.com.senai.api_ecommerce.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DadosEndereco(
        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank
        String cidade,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,


        String numero,
        String complemento,

        @NotBlank
        @Pattern(regexp = "[a-z][A-Z]{2}")
        String uf
) {
}
