package br.com.glage.tormentatrpg.controller.mapper;

import br.com.glage.tormentatrpg.controller.dto.ProgressoNivelDTO;
import br.com.glage.tormentatrpg.model.ProgressoNivel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProgressoNivelMapper {
    ProgressoNivel toEntity(ProgressoNivelDTO dto);

    ProgressoNivelDTO toDTO(ProgressoNivel entity);
}
