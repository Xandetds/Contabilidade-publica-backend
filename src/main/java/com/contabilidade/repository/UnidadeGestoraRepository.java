package com.contabilidade.repository;

import com.contabilidade.entity.UnidadeGestora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeGestoraRepository extends JpaRepository<UnidadeGestora, Long> {
}
