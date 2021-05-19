package br.com.bancocap.useCase;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.gateway.ContaCorrenteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EfetuarSaqueContaUseCase {

    private ContaCorrenteGateway contaCorrenteGateway;

    @Autowired
    public EfetuarSaqueContaUseCase(ContaCorrenteGateway contaCorrenteGateway) {
        this.contaCorrenteGateway = contaCorrenteGateway;
    }

    public ContaCorrenteEntity efetuarSaque(Long idConta, Double valorSaque) throws Exception {
        try {
            ContaCorrenteEntity resut = this.verificaSaldoConta(idConta);

            if(resut != null && valorSaque <= resut.getSaldoDaConta()) {
                resut.setSaldoDaConta(resut.getSaldoDaConta() - valorSaque);
            } else {
                throw new Exception("Age must be between 20 to 60");
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
