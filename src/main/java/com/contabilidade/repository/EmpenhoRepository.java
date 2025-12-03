package com.contabilidade.repository;

import com.contabilidade.entity.Empenho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpenhoRepository extends JpaRepository<Empenho, Long> {
}
