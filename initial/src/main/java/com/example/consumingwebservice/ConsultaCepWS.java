package com.example.consumingwebservice;


import com.example.consumingwebservice.wsdl.ConsultaCEP;
import com.example.consumingwebservice.wsdl.ConsultaCEPResponse;
import com.example.consumingwebservice.wsdl.EnderecoERP;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;


public class ConsultaCepWS extends WebServiceGatewaySupport {

    private final ObjectMapper mapper;

    public ConsultaCepWS(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public String getEndereco(String cep) {

        ConsultaCEP request = new ConsultaCEP();
        request.setCep(cep);

        JAXBElement<ConsultaCEPResponse> responseValue = (JAXBElement<ConsultaCEPResponse>) getWebServiceTemplate()
                .marshalSendAndReceive("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente", request);
        EnderecoERP aReturn = responseValue.getValue().getReturn();
        String sb = aReturn.getCep() + " " +
                aReturn.getEnd() + " " +
                aReturn.getComplemento2() + " " +
                aReturn.getBairro() + " " +
                aReturn.getCidade() + " " +
                aReturn.getUf();

        return sb;
    }

}
