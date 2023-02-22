package br.com.gabriels.webplayground.exception;

import org.springframework.stereotype.Service;

@Service
public class UmSeriviceQualquer {

    public void umMetodo() {
        new UmaDominioClasseQualquer().umMetodo();
    }
}
