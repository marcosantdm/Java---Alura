public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Lançamento: " + ano);

        boolean inclusoNoPlano = false;
        double nota = 8.5;
        System.out.println("Inclusão no Plano de Filmes: " + inclusoNoPlano);
        System.out.println("Nota: " + nota);
        String diretor = "James Cameron";
        System.out.println("Diretor: " + diretor);
        String genero = "Ação";
        System.out.println("Gênero: " + genero);
        String atores = "James Cameron, Aaron Paul, David Lynch, Timothy Hough, Tony Soprano, Ryan Reynolds";
        System.out.println("Atores: " + atores);

        double media = (9.8 + 3.1 + 6.4) / 3;
        System.out.println("Média dos Críticos: " + media);

        String sinopse;
        sinopse = "A guerra entre dois grupos de policiais, um dos mais experientes e determinados do mundo, é um tema central do filme. O primeiro grupo, a polícia de San Francisco, é dominado por o ex-agente James Cameron (James Cameron), que é o líder do grupo. O segundo grupo, o Excalibur";
        System.out.println("Sinopse: " + sinopse);

        String descricao;
        descricao = """
                Filme: Top Gun: Maverick
                Lançamento: 2022
                Inclusão no Plano de Filmes: false
                Nota: 8.5
                Diretor: James Cameron
                Gênero: Ação
                Atores: James Cameron, Aaron Paul, David Lynch, Timothy Hough, Tony Soprano, Ryan Reynolds
                Média dos Críticos: 8.0
                """;

        System.out.println(descricao);
    }
}
