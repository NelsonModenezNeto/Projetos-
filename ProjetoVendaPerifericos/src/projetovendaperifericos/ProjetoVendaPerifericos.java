/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovendaperifericos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */

public class ProjetoVendaPerifericos {
    Scanner leitor = new Scanner(System.in);
    private ArrayList <Cliente> listaCliente = new ArrayList();
    private ArrayList <Funcionario> listaFuncionario = new ArrayList();
    private ArrayList <Produto> listaProduto = new ArrayList();
    int cod=0;
    int codf=0;
    int codp=0;
    
    public void cadastrarCliente()
        {
            int idade;
            int telefone = 0;
            int cep = 0;
            
            System.out.println("Digite o nome do cliente: ");
            String nome = leitor.nextLine();
            System.out.println("\n");
            
            System.out.println("Digite a idade do cliente: ");
            try{
            idade = leitor.nextInt();
            System.out.println("\n");
            if(idade<0)
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para Idade! Digite Novamente: ");
                leitor.nextLine();
                idade = leitor.nextInt();
                System.out.println("\n");
                
            }
            
            System.out.println("Digite o email do cliente: ");
            leitor.nextLine();
            String email = leitor.nextLine();
            System.out.println("\n");
            
            System.out.println("Digite o telefone do cliente: ");
            try{
                telefone = leitor.nextInt();
                System.out.println("\n");
            if(telefone<0)
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para Telefone! Digite Novamente: ");
                leitor.nextLine();
                telefone = leitor.nextInt();
                System.out.println("\n");
                
            }
            
            System.out.println("Digite o cep do cliente: ");
            try{
                cep = leitor.nextInt();
                System.out.println("\n");
            if(cep<0)
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para CEP! Digite Novamente: ");
                leitor.nextLine();
                cep = leitor.nextInt();
                System.out.println("\n");
                
            }
            
            cod++;
            
            Cliente c1 = new Cliente(nome, idade, email, telefone, cep, cod);
            listaCliente.add(c1);
        }
        
        public void exclusaoCliente()
        {
            int code;
            System.out.println("Digite o Código do Cliente: "); 
            code = leitor.nextInt();
            
            for(Cliente c : listaCliente)
            {
                if(c instanceof Cliente)
                {
                    if(code == c.getCod())
                    {
                        listaCliente.remove(c);
                        break;
                    }
                    else
                    {
                        System.out.println("Não existe nenhum cliente compativel com esse código digitado");
                    }
                }
            }
        }
        public void exibirClientes()
        {
            for(Cliente c: listaCliente)
            {
                c.exibir();
            }
        }
        
        public void cadastrarFuncionario()
        {
            String nome;
            int idade;
            double salario;
            String email;
            
            System.out.println("Digite o nome do funcionário: ");
            nome = leitor.nextLine();
            System.out.println("\n");
            
            System.out.println("Digite a idade do funcionário: ");
            try{
                idade = leitor.nextInt();
                System.out.println("\n");
            if(idade<0)
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para Idade! Digite Novamente: ");
                leitor.nextLine();
                idade = leitor.nextInt();
                System.out.println("\n");
                
            }
            
            System.out.println("Digite o email do funcionário: ");
            leitor.nextLine();
            email = leitor.nextLine();
            System.out.println("\n");
            
            System.out.println("Digite o salário do funcionário: ");
            try{
            salario = leitor.nextDouble();
            System.out.println("\n");
            
            if(salario<0)
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para Salario! Digite Novamente: ");
                leitor.nextLine();
                salario = leitor.nextDouble();
                System.out.println("\n");
                
            }
            codf++;
             
            
            Funcionario f1 = new Funcionario(nome, idade, codf, salario, email);
                
            listaFuncionario.add(f1);
        }
        
        public void exclusaoFuncionario()
        {
            int codf;
            System.out.println("Digite o Código do Cliente: "); 
            codf = leitor.nextInt();
            
            for(Funcionario f : listaFuncionario)
            {
                if(f instanceof Funcionario)
                {
                    if(codf == f.getCodf())
                    {
                        listaFuncionario.remove(f);
                        break;
                    }
                    else
                    {
                        System.out.println("Não existe nenhum funcionário compativel com esse código digitado: ");
                    }
                }
            }
        }
        
        public void exibirFuncionarios()
        {
            for(Funcionario f: listaFuncionario)
            {
                f.exibir();
            }
        }
        
        public void cadastrarProduto()
        {
            double preco=0;
            String descricao;
            String marca;
            boolean rgb = false;
            String rgb1;
            
            System.out.println("Digite o preço do produto: ");
            try{
                preco = leitor.nextDouble();
                System.out.println("\n");
            if(preco<0)
            {
                throw new IllegalArgumentException();
            }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para Preco! Digite Novamente: ");
                leitor.nextLine();
                preco = leitor.nextDouble();
                System.out.println("\n");
            }
            
            System.out.println("Digite a descrição do produto: ");
            leitor.nextLine();
            descricao = leitor.nextLine();
            System.out.println("\n");
            
            System.out.println("Digite a marca do produto: ");
            marca = leitor.nextLine();
            System.out.println("\n");
            
            System.out.println("Tem RGB? S/N");
            try{
                rgb1 = leitor.nextLine();
                System.out.println("\n");
                if(rgb1 != "S" || rgb1 != "N")
                {
                   throw new IllegalArgumentException();
                }   
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Valor Incorreto para RGB! Digite Novamente: S/N ");
                rgb1 = leitor.nextLine();
                System.out.println("\n");
            }
            switch(rgb1)
                {
                    case "S":
                        rgb=true;
                        break;
                    case" N":
                        rgb=false;
                        break;
                    default:
                        System.out.println("Erro!");
                }
            System.out.println("\n");
            
            codp++;
            
            Produto p1 = new Produto(preco, descricao, codp, marca, rgb);
            listaProduto.add(p1);
        }
        
        public void exclusaoProduto()
        {
            int codp;
            System.out.println("Digite o Código do Produto: "); 
            codp = leitor.nextInt();
            
            for(Produto p : listaProduto)
            {
                if(p instanceof Produto)
                {
                    if(codp == p.getCodp())
                    {
                        listaProduto.remove(p);
                        break;
                    }
                    else
                    {
                        System.out.println("Não existe nenhum produto compativel com esse código digitado");
                    }
                }
            }
        }
        
        public void exibirProdutos()
        {
            for(Produto p: listaProduto)
            {
                p.exibir();
            }
        }
        
        public void buscaCliente()
        {
            String busca;
            System.out.println("Digite o nome do Cliente: ");
            busca = leitor.nextLine();
            
            for(Cliente c : listaCliente)
            {
                if(c.getNome().contains(busca))
                {
                    System.out.println("Nome: "+c.getNome()+"\nIdade: "+c.getIdade()+"\nEmail: "
                    +c.getEmail()+"\nTelefone: "+c.getTelefone()+"\nCep: "+c.getCep()+"\nCodigo "+c.getCod()+"\n");
                }
            }
        }
        
        public void buscaFuncionario()
        {
            String busca;
            System.out.println("Digite o nome do Funcionario: ");
            busca = leitor.nextLine();
            
            for(Funcionario f : listaFuncionario)
            {
                if(f.getNome().contains(busca))
                {
                    System.out.println("Nome: "+f.getNome()+"\nIdade: "+f.getIdade()+"\nEmail: "
                    +f.getEmail()+"\nCodigo: "+f.getCodf()+"\nSalario: "+f.getSalario()+"\n");
                }
            }
        }
        
        public void buscaProdutoDescricao()
        {
            String busca;
            System.out.println("Digite a Descricao do produto: ");
            busca = leitor.nextLine();
            
            for(Produto p : listaProduto)
            {
                if(p.getDescricao().contains(busca))
                {
                    System.out.println("Preço: "+p.getPreco()+"\nDescrição: "+p.getDescricao()+"\nCódigo: "
                    +p.getCodp()+"\nMarca: "+p.getMarca()+"\nRGB: "+p.isRgb()+"\n");
                }
            }
        }
        
        public void buscaProdutoPreco()
        {
            double busca;
            System.out.println("Digite o preco do produto: ");
            busca = leitor.nextDouble();
            
            for(Produto p : listaProduto)
            {
                if(p.getPreco()==busca)
                {
                    System.out.println("Preço: "+p.getPreco()+"\nDescrição: "+p.getDescricao()+"\nCódigo: "
                    +p.getCodp()+"\nMarca: "+p.getMarca()+"\nRGB: "+p.isRgb()+"\n");
                }
            }      
        }
        
        public void buscaProdutoCodigo()
        {
            int cod;
            System.out.println("Digite o preco do produto: ");
            cod = leitor.nextInt();
            
            for(Produto p : listaProduto)
            {
                if(p.getCodp()==cod)
                {
                    System.out.println("Preço: "+p.getPreco()+"\nDescrição: "+p.getDescricao()+"\nCódigo: "
                    +p.getCodp()+"\nMarca: "+p.getMarca()+"\nRGB: "+p.isRgb()+"\n");
                }
            }      
        }
        
        public void informaMaiorIdade()
        {
            int maior=0;
            for(Cliente c: listaCliente)
            {
                if(c.getIdade()>maior)
                {
                    maior=c.getIdade();
                }
            }
            System.out.println("A maior idade é: "+maior);
        }
        
        public void informaMenorIdade()
        {
            int menor=108;
            for(Cliente c: listaCliente)
            {
                if(c.getIdade()<menor)
                {
                    menor=c.getIdade();
                }
            }
            System.out.println("A menor idade é: "+menor);
        }
        public void informaQuantidadeMenores()
        {
           int menor=0;
           for(Cliente c: listaCliente)
            {
                if(c.getIdade()<18)
                {
                    menor++;
                }
            }
            System.out.println("Tem "+menor+" menores de 18 anos"); 
        }
        public void informaQuantidadeMaiores()
        {
           int maior=0;
           for(Cliente c: listaCliente)
            {
                if(c.getIdade()>60)
                {
                    maior++;
                }
            }
            System.out.println("Tem "+maior+" maiores de 60 anos"); 
        }
                
        public void informaMediaIdade()
        {
            double media=0;
            for(Cliente c: listaCliente)
            {
                media +=c.getIdade();
            }
            media = media/listaCliente.size();
            System.out.println("A media e: "+media);
        }
        
        public void produtoMaisCaro()
        {
           double maior=0;
           for(Produto p: listaProduto)
            {
                if(p.getPreco()>maior)
                {
                    maior = p.getPreco();
                }
            }
            System.out.println("O Produto Mais Caro é: "+maior); 
        }
        
        public void produtoMaisBarato()
        {
           double menor=1000000000;
           for(Produto p: listaProduto)
            {
                if(p.getPreco()<menor)
                {
                    menor = p.getPreco();
                }
            }
            System.out.println("O Produto Mais Barato é: "+menor); 
        }
        
        public void mediaPrecoProduto()
        {   
            double media=0;
            for(Produto p: listaProduto)
            {
                media += p.getPreco();
            }
            media = media/listaProduto.size();
            System.out.println("A Média de Preço é: "+media);
            
        }
        
        public void quantidadeProdutosAcimaMedia()
        {
            double media=0;
            int produtos=0;
            for(Produto p: listaProduto)
            {
                media += p.getPreco();
            }
            media = media/listaProduto.size();
            for(Produto p: listaProduto)
            {
                if(media>p.getPreco())
                {
                    produtos++;
                }
            }
            System.out.println("A Quantidade de Produtos Acima na Media é: "+produtos);
            
        }
        public void Interface()
        { 
            int numero=1;
            while(numero != 0)
            {
                System.out.println("Digite um Numero: \n");

                System.out.println("|0| Sair\n|1| Cadastrar Cliente\n|2| Excluir Cliente\n"
                + "|3| Exibir Clientes\n|4| Cadastrar Funcionario\n|5| Excluir Funcionario\n|6| Exibir"
                + " Funcionario\n|7| Cadastrar Produto\n|8| Excluir Produto\n|9| Exibir Produto\n|10| Buscar Cliente\n|11| Buscar Funcionario\n"
                + "|12| Buscar Produto por Descrição\n|13| Buscar Produto por Preço\n|14| Buscar Produto por Codigo\n|15| Informar Cliente Com Maior Idade\n"
                + "|16| Informar Cliente com Menor Idade\n|17| Informar Quantidade de Clientes Menores de 18 Anos\n|18| Informar Quantidade de Clientes Maiores de 60 \n"
                + "|19| Informar Media de Idade dos Clientes\n|20| Informar Produto Mais Caro\n|21| Informar Produto Mais Barato\n|22| Informar Media de Preços dos Produtos\n"
                + "|23| Informar Quantidade de Produtos com o Preço Acima da Media");

                numero = leitor.nextInt();
                switch(numero)
                {
                    case 0:
                        break;
                    case 1:
                        leitor.nextLine();
                        cadastrarCliente();
                        break;

                    case 2:
                        exclusaoCliente();
                        break;
                    case 3:
                        exibirClientes();
                        break;
                    case 4:
                        leitor.nextLine();
                        cadastrarFuncionario();
                        break;
                    case 5:
                        exclusaoFuncionario();
                        break;
                    case 6:
                        exibirFuncionarios();
                        break;
                    case 7:
                        leitor.nextLine();
                        cadastrarProduto();
                        break;
                    case 8:
                        exclusaoProduto();
                        break;
                    case 9:
                        exibirProdutos();
                        break;
                    case 10:
                        leitor.nextLine();
                        buscaCliente();
                        break;
                    case 11:
                        leitor.nextLine();
                        buscaFuncionario();
                        break;
                    case 12:
                        leitor.nextLine();
                        buscaProdutoDescricao();
                        break;
                    case 13:
                        leitor.nextLine();
                        buscaProdutoPreco();
                        break;
                    case 14:
                        leitor.nextLine();
                        buscaProdutoCodigo();
                        break;
                    case 15:
                        leitor.nextLine();
                        informaMaiorIdade();
                        break;
                    case 16:
                        leitor.nextLine();
                        informaMenorIdade();
                        break;
                    case 17:
                        leitor.nextLine();
                        informaQuantidadeMenores();
                        break;
                    case 18:
                        leitor.nextLine();
                        informaQuantidadeMaiores();
                        break;
                    case 19:
                        leitor.nextLine();
                        informaMediaIdade();
                        break;
                     case 20:
                        leitor.nextLine();
                        produtoMaisCaro();
                        break;
                     case 21:
                        leitor.nextLine();
                        produtoMaisBarato();
                        break;
                     case 22:
                        leitor.nextLine();
                        mediaPrecoProduto();
                        break;
                     case 23:
                        leitor.nextLine();
                        quantidadeProdutosAcimaMedia();
                        break;
                        
                }
            }
        }
    public static void main(String[] args) {
        ProjetoVendaPerifericos p1 = new ProjetoVendaPerifericos();
        p1.Interface();
    }
}
