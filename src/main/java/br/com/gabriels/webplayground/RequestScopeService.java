package br.com.gabriels.webplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Service
@RequestScope
public class RequestScopeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestScopeService.class);

    private LocalDateTime localDateTime;


    public RequestScopeService() {
        LOGGER.warn("[REQUEST SCOPE] FOI INSTANCIADO");
        this.localDateTime = LocalDateTime.now();

    }

    public String vish() {
        LOGGER.warn("[REQUEST SCOPE] FOI CHAMADO");
        return "[REQUEST SCOPE] VISH SCOPE DE REQUEST %s".formatted(localDateTime);
    }
}
