package med.vall.api.pacientes.dto;

import med.vall.api.comum.dto.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
) {
}