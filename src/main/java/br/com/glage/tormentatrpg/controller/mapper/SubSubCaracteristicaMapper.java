package br.com.glage.tormentatrpg.controller.mapper;

import br.com.glage.tormentatrpg.controller.dto.SubCaracteristicaDTO;
import br.com.glage.tormentatrpg.controller.dto.SubSubCaracteristicaDTO;
import br.com.glage.tormentatrpg.model.SubCaracteristica;
import br.com.glage.tormentatrpg.model.SubSubCaracteristica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubSubCaracteristicaMapper {
    SubCaracteristica toEntity(SubSubCaracteristicaDTO dto);

    SubCaracteristicaDTO toDTO(SubSubCaracteristica entity);
}
