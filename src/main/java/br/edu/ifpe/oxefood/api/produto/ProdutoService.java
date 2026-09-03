package br.edu.ifpe.oxefood.api.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizar(Long id, Produto dados) {
        Produto produto = buscarPorId(id);
        produto.setCodigo(dados.getCodigo());
        produto.setTitulo(dados.getTitulo());
        produto.setDescricao(dados.getDescricao());
        produto.setValorUnitario(dados.getValorUnitario());
        produto.setTempoEntregaMinimo(dados.getTempoEntregaMinimo());
        produto.setTempoEntregaMaximo(dados.getTempoEntregaMaximo());
        return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}