package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

    @Query(value ="select cl from Cliente cl where cl.codigo = ?1")
    List<Cliente> findByCodigo (int cod);

    @Query(value ="select cl from Cliente cl where cl.nome like ?1")
    List<Cliente> findByNome (String nome);

    @Query(value ="select cl from Cliente cl where cl.email like %?1%")
    List<Cliente> findByEmail (String email);

    @Query(value ="select cl from Cliente cl where cl.nome like %?1%")
    List<Cliente> findByParteNome (String nome);

    @Query(value="select cl from Cliente cl where cl.codigo>?1")
    List<Cliente> findByCodigoMaior (int cod);

    @Query(value="select cl from Cliente cl where cl.email like ?1%")
    List<Cliente> findByInicialEmail (String email);

    @Query(value="select cl from Cliente cl where cl.email like ?1% and cl.nome like ?2%")
    List<Cliente> findByInicialEmailNome (String email,String nome);

}
