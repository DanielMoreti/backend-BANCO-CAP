package br.com.bancocap.dataProvider;

import br.com.bancocap.entities.entity.ContaCorrenteEntity;
import br.com.bancocap.gateway.ContaCorrenteGateway;
import br.com.bancocap.mappers.ContaCorrenteTableMapper;
import br.com.bancocap.repository.ContaCorrenteRepository;
import org.springframework.stereotype.Component;

@Component
public class ContaCorrenteDataProvider implements ContaCorrenteGateway {

    private ContaCorrenteRepository contaCorrenteRepository;
    private ContaCorrenteTableMapper contaCorrenteTableMapper;

    public ContaCorrenteDataProvider(ContaCorrenteRepository contaCorrenteRepository, ContaCorrenteTableMapper contaCorrenteTableMapper) {
        this.contaCorrenteRepository = contaCorrenteRepository;
        this.contaCorrenteTableMapper = contaCorrenteTableMapper;
    }

    @Override
    public ContaCorrenteEntity verificaSaldoContaById(Long idConta) throws Exception {
        try {
            return contaCorrenteTableMapper.convertToEntity(contaCorrenteRepository.getOne(idConta));
        } catch (Exception ex) {
            throw new Exception();
        }
    }

    @Override
    public ContaCorrenteEntity verificaSaldoConta(String codigoBanco, String numeroDaConta, String digitoVerificador) throws Exception {
        try {
            return contaCorrenteTableMapper.convertToEntity(
                    contaCorrenteRepository.findByCodigoBancoAndNumeroDaContaAndDigitoVerificador(codigoBanco, numeroDaConta, digitoVerificador));
        } catch (Exception ex) {
            throw new Exception();
        }
    }

    @Override
    public ContaCorrenteEntity alteraValorSaldoConta(ContaCorrenteEntity entity) throws Exception {
        try {
            return contaCorrenteTableMapper.convertToEntity(
                    contaCorrenteRepository.save(contaCorrenteTableMapper.convertToTable(entity)));
        } catch (Exception ex) {
            throw new Exception();
        }
    }
}
