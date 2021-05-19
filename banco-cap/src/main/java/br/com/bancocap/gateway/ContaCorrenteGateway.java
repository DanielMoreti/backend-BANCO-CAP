package br.com.bancocap.gateway;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;

public interface ContaCorrenteGateway {

    public ContaCorrenteEntity verificaSaldoContaById(Long idConta) throws Exception;

    public ContaCorrenteEntity verificaSaldoConta(String codigoBanco, String numeroDaConta, String digitoVerificador) throws Exception;

    public ContaCorrenteEntity alteraValorSaldoConta(ContaCorrenteEntity entity) throws Exception;

}
