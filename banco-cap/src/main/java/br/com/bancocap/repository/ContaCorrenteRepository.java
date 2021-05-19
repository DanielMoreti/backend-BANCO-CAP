package br.com.bancocap.repository;

import br.com.bancocap.entities.table.ContaCorrenteTable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrenteTable, Long> {

    ContaCorrenteTable findByCodigoBancoAndNumeroDaContaAndDigitoVerificador(String codigoBanco, String numeroDaConta, String digitoVerificador);
    
}

