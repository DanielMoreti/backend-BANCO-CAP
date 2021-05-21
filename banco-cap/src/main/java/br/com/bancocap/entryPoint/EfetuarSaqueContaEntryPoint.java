package br.com.bancocap.entryPoint;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.entities.httpModel.ContaCorrenteHttpModel;
import br.com.bancocap.mappers.ContaCorrenteHttpModelMapper;
import br.com.bancocap.useCase.EfetuarSaqueContaUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
@CrossOrigin(origins = "http://localhost:4200")
public class EfetuarSaqueContaEntryPoint {

    private EfetuarSaqueContaUseCase efetuarSaqueContaUseCase;
    private ContaCorrenteHttpModelMapper contaCorrenteHttpModelMapper;

    public EfetuarSaqueContaEntryPoint(EfetuarSaqueContaUseCase efetuarSaqueContaUseCase, ContaCorrenteHttpModelMapper contaCorrenteHttpModelMapper) {
        this.efetuarSaqueContaUseCase = efetuarSaqueContaUseCase;
        this.contaCorrenteHttpModelMapper = contaCorrenteHttpModelMapper;
    }

    /**
     * Campos necessários
     * @codigoBanco
     * @numeroDaConta
     * @digitoVerificador
     * */
    @PutMapping("/realizarSaque")
    public ResponseEntity<ContaCorrenteHttpModel> realizarSaqueConta(
            @RequestBody ContaCorrenteHttpModel contaCorrente) throws Exception {

        ContaCorrenteEntity response = efetuarSaqueContaUseCase.efetuarSaque(
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
