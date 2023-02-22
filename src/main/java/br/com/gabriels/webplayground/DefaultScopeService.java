package br.com.gabriels.webplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DefaultScopeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultScopeService.class);

    private LocalDateTime localDateTime;

    public DefaultScopeService() {
        LOGGER.warn("[DEFAULT SCOPE] FOI INSTANCIADO");
        this.localDateTime = LocalDateTime.now();
    }

    public String vish() {
        LOGGER.warn("[DEFAULT SCOPE] FOI CHAMADO");
        return "[DEFAULT SCOPE] VISH %s".formatted(localDateTime);
    }
}
