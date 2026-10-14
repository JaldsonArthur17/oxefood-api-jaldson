package br.edu.ifpe.oxefood.api.categoriaproduto;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CategoriaProdutoService {

    private final CategoriaProdutoRepository repository;

    public CategoriaProdutoService(CategoriaProdutoRepository  repository) {
        this.repository = repository;
    }

    public CategoriaProduto build(CategoriaProdutoDTO dto) {
        CategoriaProduto categoriaProduto = null;

      if (dto.getId() == null) { //Montado para o cadastro

         categoriaProduto = new CategoriaProduto();

      } else { //Consultado para a alteração

         categoriaProduto = repository.findById(dto.getId()).get();
      }

        categoriaProduto.setDescricao(dto.getDescricao());
        return categoriaProduto;
    }

    @Transactional
    public CategoriaProduto cadastrar(CategoriaProdutoDTO dto) {

        CategoriaProduto categoriaProduto = build(dto);
        categoriaProduto.setHabilitado(true);
        return repository.save(categoriaProduto);
    }
    public List<CategoriaProduto> listar() {

        return repository.findAll();
    }

    public CategoriaProduto buscarPorId(Long id) {

        return repository.findById(id).get();
    }
    @Transactional
    public CategoriaProduto atualizar(CategoriaProdutoDTO dto) {

    CategoriaProduto categoriaProduto = build(dto);
    return repository.save(categoriaProduto);
}
    @Transactional
    public void remover(Long id) {

    CategoriaProduto categoriaProduto = repository.findById(id).get();
    categoriaProduto.setHabilitado(false);

    repository.save(categoriaProduto);
   }
}