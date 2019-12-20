package com.willian.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
