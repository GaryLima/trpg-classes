package br.com.glage.tormentatrpg.controller;

import br.com.glage.tormentatrpg.controller.dto.ClasseDTO;
import br.com.glage.tormentatrpg.controller.mapper.ClasseMapper;
import br.com.glage.tormentatrpg.model.Classe;
import br.com.glage.tormentatrpg.service.ClasseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
@RequiredArgsConstructor
public class ClasseController {

    private final ClasseMapper classeMapper;
    private final ClasseService classeService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody ClasseDTO classeDTO) {
        Classe classe = classeMapper.toEntity(classeDTO);

        classeService.salvar(classe);
        return ResponseEntity.ok().build();
    }


    public ResponseEntity<?> buscarPorId(@PathVariable String id) {
        return classeService.buscaPorId(id)
                .map(classe -> {
                    ClasseDTO dto = classeMapper.toDTO(classe);
                    return ResponseEntity.ok(dto);
                }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<?> buscarPorNome(@PathVariable String nome) {
        return classeService.buscarPorNome(nome)
                .map(classe -> {
                    ClasseDTO dto = classeMapper.toDTO(classe);
                    return ResponseEntity.ok(dto);
                }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ClasseDTO>> listar() {
        List<Classe> classes = classeService.listarClasses();
        List<ClasseDTO> classesDTOs = classes
                .stream()
                .map(classeMapper::toDTO)
                .toList();

        return ResponseEntity.ok(classesDTOs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirClasse(@PathVariable("id") String id) {
        return classeService.buscaPorId(id)
                .map(classe -> {
                    classeService.deletar(classe);
                    return ResponseEntity.noContent().build();
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> atualizarClasse(@PathVariable("id") String id, @RequestBody ClasseDTO dto) {
        return classeService.buscaPorId(id)
                .map( classe -> {
                    Classe classeAux = classeMapper.toEntity(dto);

                    classe.setNome(classeAux.getNome());
                    classe.setCaracteristicas(classeAux.getCaracteristicas());
                    classe.setTabelaProgressao(classeAux.getTabelaProgressao());
                    classe.setHabilidadesDetalhadas(classeAux.getHabilidadesDetalhadas());
                    classe.setImagemUrl(classeAux.getImagemUrl());

                    classeService.atualizar(classe);
                    return ResponseEntity.noContent().build();
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
