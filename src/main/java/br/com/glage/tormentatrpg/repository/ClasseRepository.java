package br.com.glage.tormentatrpg.repository;

import br.com.glage.tormentatrpg.model.Classe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClasseRepository extends MongoRepository<Classe, String> {

    Optional<Classe> findByNome(String nome);
}
