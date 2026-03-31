package br.com.glage.tormentatrpg.controller.mapper;

import br.com.glage.tormentatrpg.controller.dto.SubCaracteristicaDTO;
import br.com.glage.tormentatrpg.model.SubCaracteristica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = SubSubCaracteristicaMapper.class)
public interface SubCaracteristicaMapper {
    SubCaracteristica toEntity(SubCaracteristicaDTO dto);

    SubCaracteristicaDTO toDTO(SubCaracteristica entity);
}
