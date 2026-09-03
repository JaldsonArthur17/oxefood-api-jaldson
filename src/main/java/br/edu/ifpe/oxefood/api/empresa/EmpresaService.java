package br.edu.ifpe.oxefood.api.empresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public List<Empresa> listar() {
        return repository.findAll();
    }

    public Empresa buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }

    public Empresa salvar(Empresa empresa) {
        return repository.save(empresa);
    }

    public Empresa atualizar(Long id, Empresa dados) {
        Empresa empresa = buscarPorId(id);
        empresa.setSite(dados.getSite());
        empresa.setCnpj(dados.getCnpj());
        empresa.setInscricaoEstadual(dados.getInscricaoEstadual());
        empresa.setNomeEmpresarial(dados.getNomeEmpresarial());
        empresa.setNomeFantasia(dados.getNomeFantasia());
        empresa.setFone(dados.getFone());
        empresa.setFoneAlternativo(dados.getFoneAlternativo());
        return repository.save(empresa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}