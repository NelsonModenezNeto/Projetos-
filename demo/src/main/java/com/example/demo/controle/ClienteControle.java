package com.example.demo.controle;

import com.example.demo.model.Cliente;
import com.example.demo.model.Produto;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/apiCliente")
public class ClienteControle {
    @Autowired
    ClienteRepository clRepo;

    @DeleteMapping("/excluir")
    public void ExcluirCliente(@RequestBody Cliente cl)
    {
        clRepo.delete(cl);
    }

    @PostMapping("/Cadastrar")
    public void CadastrarCliente(@RequestBody Cliente cl)
    {
        clRepo.save(cl);
    }

    @GetMapping ("/buscar")
    public List<Cliente> buscarCliente()
    {
        return clRepo.findAll();
    }

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody Cliente cl)
    {
        clRepo.save(cl);
    }

    @GetMapping("/buscarCodigo/{codigo}")
    public List<Cliente> buscarCodigo(@PathVariable(value="codigo")int codigo)
    {
        return clRepo.findByCodigo(codigo);
    }

    @GetMapping("/buscarEmail/{email}")
    public List<Cliente> buscaremail(@PathVariable(value="email")String email)
    {
        return clRepo.findByEmail(email);
    }

    @GetMapping("/buscarNome/{nome}")
    public List<Cliente> buscarNome(@PathVariable(value="nome")String nome)
    {
        return clRepo.findByNome(nome);
    }

    @GetMapping("/buscarParteNome/{nome}")
    public List<Cliente> buscarParteNome(@PathVariable(value="nome")String nome)
    {
        return clRepo.findByParteNome(nome);
    }

    @GetMapping("/buscarCodigoMaior/{codigo}")
    public List<Cliente> buscarCodigoMaior(@PathVariable(value="codigo")int codigo)
    {
        return clRepo.findByCodigoMaior(codigo);
    }

    @GetMapping("/buscarInicialEmail/{email}")
    public List<Cliente> buscarInicialEmail(@PathVariable(value="email")String email)
    {
        return clRepo.findByInicialEmail(email);
    }

    @GetMapping("/buscarInicialEmailNome/{email}/{nome}")
    public List<Cliente> buscarInicialEmailNome(@PathVariable(value="email")String email, @PathVariable(value="nome")String nome)
    {
        return clRepo.findByInicialEmailNome(email,nome);
    }
}