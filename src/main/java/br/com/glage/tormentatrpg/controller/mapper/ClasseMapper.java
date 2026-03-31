package br.com.glage.tormentatrpg.controller.mapper;

import br.com.glage.tormentatrpg.controller.dto.ClasseDTO;
import br.com.glage.tormentatrpg.model.Classe;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        CaracteristicaMapper.class,
        HabilidadeDetalhadaMapper.class,
        ProgressoNivelMapper.class
})
public interface ClasseMapper {
    Classe toEntity(ClasseDTO dto);

    ClasseDTO toDTO(Classe entity);
}
