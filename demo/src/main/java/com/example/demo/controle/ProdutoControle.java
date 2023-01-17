package com.example.demo.controle;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping (value="apiProduto")
public class ProdutoControle {
    @Autowired
    ProdutoRepository prRepo;

    @DeleteMapping("/excluir")
    public void ExcluirProdutos(@RequestBody Produto pr)
    {
      prRepo.delete(pr);
    }

    @PostMapping("/Cadastrar")
    public void CadastrarProduto(@RequestBody Produto pr)
    {
        prRepo.save(pr);
    }

    @GetMapping ("/buscar")
    public List<Produto> buscarProduto()
    {
        return prRepo.findAll();
    }

    @PutMapping("/atualizar")
    public void atualizarProduto(@RequestBody Produto pr)
    {
        prRepo.save(pr);
    }

    @GetMapping("/buscarCodigo/{codigo}")
    public List<Produto> buscarCodigo(@PathVariable(value="codigo")int codigo)
    {
        return prRepo.findByCodigo(codigo);
    }

    @GetMapping("/buscarDescricao/{descricao}")
    public List<Produto> buscarDescricao(@PathVariable(value="descricao")String descricao)
    {
        return prRepo.findByDescricao(descricao);
    }

    @GetMapping("/buscarMarca/{marca}")
    public List<Produto> buscarMarca(@PathVariable(value="marca")String marca)
    {
        return prRepo.findByMarca(marca);
    }

    @GetMapping("/buscarPreco/{preco}")
    public List<Produto> buscarPreco(@PathVariable(value="preco")float preco)
    {
        return prRepo.findByPreco(preco);
    }

    @GetMapping("/buscarParteDescricao/{descricao}")
    public List<Produto> buscarParteDescricao(@PathVariable(value="descricao")String descricao)
    {
        return prRepo.findByParteDescricao(descricao);
    }

    @GetMapping("/buscarParteMarca/{marca}")
    public List<Produto> buscarParteMarca(@PathVariable(value="marca")String marca)
    {
        return prRepo.findByParteMarca(marca);
    }
    @GetMapping("/buscarPrecoMaior/{preco}")
    public List<Produto> buscarPrecoMaior(@PathVariable(value="preco")float preco)
    {
        return prRepo.findByPrecoMaior(preco);
    }
    @GetMapping("/buscarPrecoMenor/{preco}")
    public List<Produto> buscarPrecoMenor(@PathVariable(value="preco")float preco)
    {
        return prRepo.findByPrecoMenor(preco);
    }

    @GetMapping("/buscarDescricaoMarca/{descricao}/{marca}")
    public List<Produto> buscarDescricaoMarca(@PathVariable(value="descricao") String descricao, @PathVariable (value="marca") String marca)
    {
        return prRepo.findByDescricaoMarca(descricao,marca);
    }

    @GetMapping("/buscarDescricaoPrecoMenor/{descricao}/{marca}")
    public List<Produto> buscarDescricaoPrecoMenor(@PathVariable(value="descricao") String descricao, @PathVariable(value="preco") float preco)
    {
        return prRepo.findByDescricaoPrecoMenor(descricao,preco);
    }
}
