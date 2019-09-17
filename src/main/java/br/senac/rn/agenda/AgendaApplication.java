package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

public class AgendaApplication {

    public static void main(String[] args) {


        Contato tiago = new Contato();
        tiago.setNome("Tiago Felipe");
        tiago.setFone("11111-2222");
        ContatoRepository repository = new ContatoRepository();
        repository.save(tiago);


    }

}
