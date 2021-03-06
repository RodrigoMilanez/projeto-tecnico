package com.RodrigoMilanez.projetotecnico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RodrigoMilanez.projetotecnico.domain.Equipamento;

@Repository
public interface EquipamentosRepository extends JpaRepository<Equipamento, Integer>{

}
