package br.com.gabriels.webplayground;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ScopeController {

    private DefaultScopeService defaultScopeService;
    private RequestScopeService requestScopeService;
    private ApplicationContext applicationContext;

    public ScopeController(DefaultScopeService defaultScopeService, RequestScopeService requestScopeService, ApplicationContext applicationContext) {
        this.defaultScopeService = defaultScopeService;
        this.requestScopeService = requestScopeService;
        this.applicationContext = applicationContext;
    }

    @ResponseBody
    @GetMapping("/beans")
    public String[] amostraOsBeans() {
        return applicationContext.getBeanNamesForAnnotation(Service.class);
    }

    @GetMapping("/scope")
    public String scope(Model model) {

        model.addAttribute("defaultScope", defaultScopeService);
        model.addAttribute("REQscopinho", requestScopeService);
        return "oi";
    }
}
