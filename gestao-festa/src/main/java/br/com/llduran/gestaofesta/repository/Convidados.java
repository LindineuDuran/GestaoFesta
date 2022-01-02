package br.com.llduran.gestaofesta.repository;

import br.com.llduran.gestaofesta.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long>
{
}
