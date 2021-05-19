package br.com.bancocap.useCase;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.gateway.ContaCorrenteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EfetuarDepositoContaUseCase {

    private ContaCorrenteGateway contaCorrenteGateway;

    @Autowired
    public EfetuarDepositoContaUseCase(ContaCorrenteGateway contaCorrenteGateway) {
        this.contaCorrenteGateway = contaCorrenteGateway;
    }

    public ContaCorrenteEntity efetuarDeposito(Long idConta, Double valorDeposito) throws Exception {
        try {
            ContaCorrenteEntity resut = this.verificaSaldoConta(idConta);

            if(resut != null) {
                resut.setSaldoDaConta(resut.getSaldoDaConta() + valorDeposito);
            } else {
                throw new Exception("Ocorreu um erro");
            }

            return contaCorrenteGateway.alteraValorSaldoConta(resut);

        } catch (Exception ex) {
            throw new Exception();
        }
    }

    private ContaCorrenteEntity  verificaSaldoConta(Long idConta) throws Exception {
        return contaCorrenteGateway.verificaSaldoContaById(idConta);
    }
}
