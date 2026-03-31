package br.com.glage.tormentatrpg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabilidadeDetalhada {
    private String nome;
    private String descricao;
    private List<SubCaracteristica> subCaracteristicas;
}
