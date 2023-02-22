package br.com.gabriels.webplayground.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UmController {

    @Autowired
    UmSeriviceQualquer umSeriviceQualquer;

    @GetMapping("/exc")
    public String x() {
//        umSeriviceQualquer.umMetodo().orElse(NotFoundException::new); // ISSO RETORNARIA O 404
        umSeriviceQualquer.umMetodo();
        return "xyz";
    }
    
}
