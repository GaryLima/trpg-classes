package br.com.glage.tormentatrpg.controller.dto;

import br.com.glage.tormentatrpg.model.SubSubCaracteristica;

import java.util.List;

public record SubCaracteristicaDTO(
        String nome,
        String descricao,
        List<SubSubCaracteristicaDTO> subCaracteristicas
){
}
