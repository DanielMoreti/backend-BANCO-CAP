package br.com.bancocap.useCase;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.gateway.ContaCorrenteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VerificarSaladoContaUseCase {

    private ContaCorrenteGateway contaCorrenteGateway;

    @Autowired
    public VerificarSaladoContaUseCase(ContaCorrenteGateway contaCorrenteGateway) {
        this.contaCorrenteGateway = contaCorrenteGateway;
    }

    public ContaCorrenteEntity verificaSaldoConta(String codigoBanco, String numeroDaConta, String digitoVerificador) throws Exception {
        try {
            return contaCorrenteGateway.verificaSaldoConta(codigoBanco, numeroDaConta, digitoVerificador);
        } catch (Exception ex) {
            throw new Exception();
        }
    }
}
