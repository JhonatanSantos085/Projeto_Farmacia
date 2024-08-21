package jhon.remedio.projetoFarmacia.controller;


import jhon.remedio.projetoFarmacia.service.RemedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios_api")
public class RemedioController {

    @Autowired
    private RemedioService remedioService;


}
