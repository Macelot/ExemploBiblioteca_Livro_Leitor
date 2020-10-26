/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.exemplobiblioteca.Livro;
import org.testng.annotations.Test;
/**
 *
 * @author marce
 */
public class TestaClasses {
    Livro livro;
    
    //vamos carregar um arquivo com livros
    //o arquivo completo deve ter 9 livros
    @Test
    public void Test_carregaLivros(){
        livro = new Livro(); //
        Livro[] livros;
        livros = livro.carregaLivros("livros.txt");
        assert livros.length == 9;
    }
    
    //vamos se a lista tem 9 livros
    @Test
    public void Test_listaLivros(){
        livro = new Livro(); //
        Livro[] livros;
        livros = livro.carregaLivros("livros.txt");
        int total = livro.listaLivros(livros);
        assert total == 9;
    }
    
    //verificar se esta ordenado por titulo
    @Test
    public void Test_listaOrdenado(){
        livro = new Livro(); //
        Livro[] livros;
        livros = livro.carregaLivros("livros.txt");
        Livro[] livroOrdenados = livro.listaOrdenado(livros);
        assert livroOrdenados[0].getTitulo().trim().charAt(0) < livroOrdenados[livroOrdenados.length-1].getTitulo().trim().charAt(0);
    }

    //Testar a busca
    @Test
    public void Test_buscarPorId(){
        livro = new Livro(); //
        Livro[] livros;
        livros = livro.carregaLivros("livros.txt");
        Livro livroConsultado = livro.buscarPorId(livros,1);
        assert livroConsultado.getTitulo().trim().equals("A Lei do triunfo");
    }   
}