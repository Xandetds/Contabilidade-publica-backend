package com.contabilidade.repository;

import com.contabilidade.entity.Credor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredorRepository extends JpaRepository<Credor, Long> {
}
