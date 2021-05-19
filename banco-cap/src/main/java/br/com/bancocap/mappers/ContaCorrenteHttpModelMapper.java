package br.com.bancocap.mappers;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.entities.httpModel.ContaCorrenteHttpModel;
import org.springframework.stereotype.Component;

@Component
public class ContaCorrenteHttpModelMapper {

    public ContaCorrenteHttpModel convertToHttpModel(ContaCorrenteEntity contaCorrenteEntity) {
        if(contaCorrenteEntity == null) return null;
        return new ContaCorrenteHttpModel(
                contaCorrenteEntity.getIdContaConrrente(),
                contaCorrenteEntity.getCodigoBanco(),
                contaCorrenteEntity.getAgencia(),
                contaCorrenteEntity.getTipoDeConta(),
                contaCorrenteEntity.getNumeroDaConta(),
                contaCorrenteEntity.getDigitoVerificador(),
                contaCorrenteEntity.getSaldoDaConta()
        );
    }

    public ContaCorrenteEntity convertToEntity(ContaCorrenteHttpModel contaCorrenteHttpModel) {
        if(contaCorrenteHttpModel == null) return null;
        return new ContaCorrenteEntity(
                contaCorrenteHttpModel.getIdContaConrrente(),
                contaCorrenteHttpModel.getCodigoBanco(),
                contaCorrenteHttpModel.getAgencia(),
                contaCorrenteHttpModel.getTipoDeConta(),
                contaCorrenteHttpModel.getNumeroDaConta(),
                contaCorrenteHttpModel.getDigitoVerificador(),
                contaCorrenteHttpModel.getSaldoDaConta()
        );
    }
}
