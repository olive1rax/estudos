public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a Netflix");
        System.out.println("Filme: Tron - o Legado");

        int anoDeLancamento = 2010;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        double notaDoFilme = 8.1;

        double media = (7.0 + 3.4 + 9.0 + 8.5 + 9.3) /5;
        System.out.println(("Nota: " + media));
        String sinopse;
        sinopse = "Filme de ficção ciêntifica futurista com muita ação";
        System.out.println(sinopse);

        System.out.println(notaDoFilme);

        int stars = (int) (media /2);
        System.out.println(stars);

        System.out.println("Filme retrô que vale a pena assistir!");

        System.out.println("Filme Liberado.");

        double grausC = 30.4;
        double grausF = (grausC * 1.8) + 32;

        String mensagem = String.format("A temperatura %f em celsius é equivalente à %f em fahrenheit ", grausC, grausF);
        System.out.println(mensagem);

        int grausFarInt = (int) grausF;
        System.out.println("A temperatura em Fahrenheit inteira é:  " + grausFarInt);




    }
}