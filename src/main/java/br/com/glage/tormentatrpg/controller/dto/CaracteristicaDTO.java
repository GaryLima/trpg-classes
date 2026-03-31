package br.com.glage.tormentatrpg.controller.dto;


import java.util.List;

public record CaracteristicaDTO (
        String titulo,
        String descricao,
        List<SubCaracteristicaDTO> subCaracteristicas
){
}
