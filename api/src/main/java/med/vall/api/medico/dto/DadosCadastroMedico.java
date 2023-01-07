package med.vall.api.medico.dto;

import med.vall.api.comum.dto.endereco.DadosEndereco;
import med.vall.api.medico.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
