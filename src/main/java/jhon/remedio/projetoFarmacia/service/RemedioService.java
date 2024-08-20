package jhon.remedio.projetoFarmacia.service;


import jhon.remedio.projetoFarmacia.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemedioService {

    @Autowired
    private RemedioRepository remedioRepository;
}
