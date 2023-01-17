package com.example.demo.repository;

import com.example.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

    @Query(value ="select pr from Produto pr where pr.codigo = ?1")
    List<Produto> findByCodigo (int cod);

    @Query(value ="select pr from Produto pr where pr.descricao like ?1")
    List<Produto> findByDescricao (String descricao);

    @Query(value ="select pr from Produto pr where pr.marca like ?1")
    List<Produto> findByMarca (String marca);

    @Query(value ="select pr from Produto pr where pr.preco = ?1")
    List<Produto> findByPreco (float preco);

    @Query(value ="select pr from Produto pr where pr.descricao like ?1%")
    List<Produto> findByParteDescricao (String descricao);

    @Query(value ="select pr from Produto pr where pr.marca like ?1%")
    List<Produto> findByParteMarca (String marca);

    @Query(value ="select pr from Produto pr where pr.preco > ?1")
    List<Produto> findByPrecoMaior (float preco);

    @Query(value ="select pr from Produto pr where pr.preco < ?1")
    List<Produto> findByPrecoMenor (float preco);

    @Query(value ="select pr from Produto pr where pr.descricao like %?1% and pr.marca like %?2%")
    List<Produto> findByDescricaoMarca (String descricao, String marca);

    @Query(value ="select pr from Produto pr where pr.descricao like %?1% and pr.preco <= ?2")
    List<Produto> findByDescricaoPrecoMenor (String descricao, float preco);

}
