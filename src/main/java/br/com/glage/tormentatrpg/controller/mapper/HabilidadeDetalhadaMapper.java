package br.com.glage.tormentatrpg.controller.mapper;

import br.com.glage.tormentatrpg.controller.dto.HabilidadeDetalhadaDTO;
import br.com.glage.tormentatrpg.model.HabilidadeDetalhada;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SubCaracteristicaMapper.class})
public interface HabilidadeDetalhadaMapper {
    HabilidadeDetalhada toEntity(HabilidadeDetalhadaDTO dto);

    HabilidadeDetalhadaDTO toDTO(HabilidadeDetalhada entity);
}
