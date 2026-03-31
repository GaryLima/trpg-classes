package br.com.glage.tormentatrpg.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Classe {
    @MongoId()
    private String id;
    private String nome;
    private List<Caracteristica> caracteristicas;
    private List<ProgressoNivel> tabelaProgressao;
    private List<HabilidadeDetalhada> habilidadesDetalhadas;
    private String imagemUrl;
    private String fonte;
}