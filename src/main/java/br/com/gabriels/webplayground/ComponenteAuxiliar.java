package br.com.gabriels.webplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Component
@RequestScope
public class ComponenteAuxiliar {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComponenteAuxiliar.class);

    private LocalDateTime localDateTime;

    public ComponenteAuxiliar() {
        LOGGER.warn("[COMPONENTE AUXILIAR] INSTANCIADO");
        this.localDateTime = LocalDateTime.now();
    }

    public LocalDateTime getI() {
        return LocalDateTime.now();
    }
}
