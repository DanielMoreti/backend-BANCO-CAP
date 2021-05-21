package br.com.bancocap.entryPoint;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.entities.httpModel.ContaCorrenteHttpModel;
import br.com.bancocap.mappers.ContaCorrenteHttpModelMapper;
import br.com.bancocap.useCase.EfetuarDepositoContaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
@CrossOrigin(origins = "http://localhost:4200")
public class EfetuarDepositoContaEntryPoint {


    private EfetuarDepositoContaUseCase efetuarDepositoContaUseCase;
    private ContaCorrenteHttpModelMapper contaCorrenteHttpModelMapper;

    @Autowired
    public EfetuarDepositoContaEntryPoint(EfetuarDepositoContaUseCase efetuarDepositoContaUseCase, ContaCorrenteHttpModelMapper contaCorrenteHttpModelMapper) {
        this.efetuarDepositoContaUseCase = efetuarDepositoContaUseCase;
        this.contaCorrenteHttpModelMapper = contaCorrenteHttpModelMapper;
    }

    /**
     * Campos necessários
     * @idContaConrrente
     * @saldoDaConta
     * */
    @PutMapping("/realizarDeposito")
    public ResponseEntity<ContaCorrenteHttpModel> realizarDepositoConta(
            @RequestBody ContaCorrenteHttpModel contaCorrente) throws Exception {

        ContaCorrenteEntity response = efetuarDepositoContaUseCase.efetuarDeposito(
                contaCorrente.getIdContaConrrente(),
                contaCorrente.getSaldoDaConta());

        if (response == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(
                    contaCorrenteHttpModelMapper.convertToHttpModel(response));
        }
    }
}
