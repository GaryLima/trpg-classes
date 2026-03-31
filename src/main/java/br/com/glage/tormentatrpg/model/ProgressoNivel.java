package br.com.glage.tormentatrpg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgressoNivel {
    private Integer nivel;
    private String bba;
    private String habilidades; // Pode ser um texto único ou separado em lista
    private String magias;
}
