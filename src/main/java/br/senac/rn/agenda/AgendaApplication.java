package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;
import com.sun.javaws.progress.PreloaderPostEventListener;

public class AgendaApplication {

    public static void main(String[] args) {


//        Contato tiago = new Contato();
//        tiago.setNome("Tiago Felipe");
//        tiago.setFone("11111-2222");
//        ContatoRepository repository = new ContatoRepository();
//        repository.save(tiago);

//        Contato mateus  = new Contato();
//        mateus.setNome("Mateus  Sátiro");
//        mateus.setFone("99999-5454");
//        ContatoRepository repository = new ContatoRepository();
//        repository.save(mateus);

        //==================//
        ContatoRepository repository = new ContatoRepository();
        for (Contato contato : repository.findAll() ){
            System.out.println(contato.getNome());
        }

    }

}
