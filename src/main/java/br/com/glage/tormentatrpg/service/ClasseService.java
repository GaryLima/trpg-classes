package br.com.glage.tormentatrpg.service;

import br.com.glage.tormentatrpg.model.Classe;
import br.com.glage.tormentatrpg.repository.ClasseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClasseService {

    private final ClasseRepository classeRepository;

    public void salvar(Classe classe) {
        classeRepository.save(classe);
    }

    public Optional<Classe> buscaPorId(String id) {
        return classeRepository.findById(id);
    }
    public Optional<Classe> buscarPorNome(String nome) {
        return classeRepository.findByNome(nome);
    }
    public List<Classe> listarClasses() {
        return classeRepository.findAll();
    }

    public void deletar(Classe classe) {
        classeRepository.delete(classe);
    }

    public void atualizar(Classe classe) {
        classeRepository.save(classe);
    }
}
