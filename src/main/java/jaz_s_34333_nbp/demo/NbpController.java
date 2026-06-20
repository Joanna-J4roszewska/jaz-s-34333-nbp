package jaz_s_34333_nbp.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NbpController {
    private final NBPServiceMistake nbpServiceMistake;


    public NbpController(NBPServiceMistake nbpServiceMistake) {
        this.nbpServiceMistake = nbpServiceMistake;
    }
    @GetMapping("/NBP/{id}")
    public ResponseEntity<NbpRate> getNBPById(@PathVariable int id){
        NbpRate nbpRate = NbpRate.getId(id);
    }
}
