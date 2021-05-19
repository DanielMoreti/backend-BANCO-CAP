package br.com.bancocap.mappers;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.entities.table.ContaCorrenteTable;
import org.springframework.stereotype.Component;

@Component
public class ContaCorrenteTableMapper {

    public ContaCorrenteTable convertToTable(ContaCorrenteEntity contaCorrenteEntity) {
        if(contaCorrenteEntity == null) return null;
        return new ContaCorrenteTable(
                contaCorrenteEntity.getIdContaConrrente(),
                contaCorrenteEntity.getCodigoBanco(),
                contaCorrenteEntity.getAgencia(),
                contaCorrenteEntity.getTipoDeConta(),
                contaCorrenteEntity.getNumeroDaConta(),
                contaCorrenteEntity.getDigitoVerificador(),
                contaCorrenteEntity.getSaldoDaConta()
        );
    }

    public ContaCorrenteEntity convertToEntity(ContaCorrenteTable contaCorrenteTable) {
        if(contaCorrenteTable == null) return null;
        return new ContaCorrenteEntity(
                contaCorrenteTable.getIdContaConrrente(),
                contaCorrenteTable.getCodigoBanco(),
                contaCorrenteTable.getAgencia(),
                contaCorrenteTable.getTipoDeConta(),
                contaCorrenteTable.getNumeroDaConta(),
                contaCorrenteTable.getDigitoVerificador(),
                contaCorrenteTable.getSaldoDaConta()
        );
    }
}
