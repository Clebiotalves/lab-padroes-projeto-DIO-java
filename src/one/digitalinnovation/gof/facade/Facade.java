package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1crm.CrmService;
import one.digitalinnovation.gof.subsistema2cep.CepApi;

public class Facade {

    public void migrarCliente(String nome ,String cep) {
        String cidade = CepApi.getIntancia().recuperarCidade(cep);
        String estado = CepApi.getIntancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
    
}