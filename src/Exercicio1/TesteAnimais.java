package Exercicio1;


public class TesteAnimais {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Duda", "Canina");
        Gato gato1 = new Gato();
        Gato gato2 = new Gato("Nina", "Felino");

        Cachorro cachorro3 = new Cachorro("Pimpo", "Castanho", "Canina", "Vira-lata");
        Gato gato3 = new Gato("Mingual", "Preto", "Felino", "Vira-lata");

        cachorro3.registro(cachorro3.nome, cachorro3.cor, cachorro3.especie, cachorro3.raca );
        cachorro2.fazerSom();
        cachorro1.fazerSom("Canino");
        gato1.fazerSom();
        gato2.fazerSom("Felino");
        gato3.registro(gato3.nome, gato3.cor, gato3.especie, gato3.raca );

        cachorro1.registro("Duda ", "tricolor ", "Canino ", "Papillon");
        gato1.registro("Nina ", "Bege ", "Felino ", "Siâmes");

    }
}
