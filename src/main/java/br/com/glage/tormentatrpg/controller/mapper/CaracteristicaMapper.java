package br.com.glage.tormentatrpg.controller.mapper;

import br.com.glage.tormentatrpg.controller.dto.CaracteristicaDTO;
import br.com.glage.tormentatrpg.model.Caracteristica;
import br.com.glage.tormentatrpg.model.SubCaracteristica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = SubCaracteristicaMapper.class)
public interface CaracteristicaMapper {
    Caracteristica toEntity(CaracteristicaDTO dto);

    CaracteristicaDTO toDTO(Caracteristica entity);
}
