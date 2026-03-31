package br.com.glage.tormentatrpg.controller.dto;

import br.com.glage.tormentatrpg.model.Caracteristica;
import br.com.glage.tormentatrpg.model.HabilidadeDetalhada;
import br.com.glage.tormentatrpg.model.ProgressoNivel;

import java.util.List;

public record ClasseDTO(
        String nome,
        List<CaracteristicaDTO> caracteristicas,
        List<ProgressoNivelDTO> tabelaProgressao,
        List<HabilidadeDetalhadaDTO> habilidadesDetalhadas,
        String imagemUrl,
        String fonte
) {
}