package br.com.bancocap.entryPoint;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.entities.httpModel.ContaCorrenteHttpModel;
import br.com.bancocap.mappers.ContaCorrenteHttpModelMapper;
import br.com.bancocap.useCase.VerificarSaladoContaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class VerificarSaldoContaEntryPoint {

    private VerificarSaladoContaUseCase verificarSaladoContaUseCase;
    private ContaCorrenteHttpModelMapper contaCorrenteHttpModelMapper;

    @Autowired
    public VerificarSaldoContaEntryPoint(VerificarSaladoContaUseCase verificarSaladoContaUseCase, ContaCorrenteHttpModelMapper contaCorrenteHttpModelMapper) {
        this.verificarSaladoContaUseCase = verificarSaladoContaUseCase;
        this.contaCorrenteHttpModelMapper = contaCorrenteHttpModelMapper;
    }

    /**
     * Campos necessários
     * @idContaConrrente
     * @saldoDaConta
     * */
    @PostMapping("/verificarSaldo")
    public ResponseEntity<ContaCorrenteHttpModel> verificarSaldoConta(
            @RequestBody ContaCorrenteHttpModel contaCorrente) throws Exception {

        ContaCorrenteEntity response = verificarSaladoContaUseCase.verificaSaldoConta(
                contaCorrente.getCodigoBanco(),
                contaCorrente.getNumeroDaConta(),
                contaCorrente.getDigitoVerificador());

        if (response == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(
                    contaCorrenteHttpModelMapper.convertToHttpModel(response));
        }
    }
}
