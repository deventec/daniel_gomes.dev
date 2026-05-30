package com.gerenciador.tarefas.repository;

import com.gerenciador.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Métodos CRUD básicos já vêm inclusos pelo JpaRepository
}