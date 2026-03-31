package br.com.glage.tormentatrpg.controller.dto;

import java.util.List;

public record HabilidadeDetalhadaDTO (
        String nome,
        String descricao,
        List<SubCaracteristicaDTO> subCaracteristicas
){
}
