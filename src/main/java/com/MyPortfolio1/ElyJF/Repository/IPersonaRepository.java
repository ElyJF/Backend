/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyPortfolio1.ElyJF.Repository;

import com.MyPortfolio1.ElyJF.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}

