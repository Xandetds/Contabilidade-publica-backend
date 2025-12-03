package com.contabilidade.repository;

import com.contabilidade.entity.Liquidacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiquidacaoRepository extends JpaRepository<Liquidacao, Long> {
}
