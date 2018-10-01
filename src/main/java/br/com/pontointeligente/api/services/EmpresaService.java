package br.com.pontointeligente.api.services;

import br.com.pontointeligente.api.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {

    /**
     * Retorna uma empresa dado um CNPJ
     * @param cnpj
     * @return Optional<Empresa>
     */
    Optional<Empresa> buscarPorCnpj(String cnpj);


    /**
     * Cadastra uma nova empresa
     * @param empresa
     * @return Empresa
     */
    Empresa persistir(Empresa empresa);

}
