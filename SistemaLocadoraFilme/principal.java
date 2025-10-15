package locadora;

public class Principal {
    public static void main(String[] args) {
        Filme[] catalogoFilmes = new Filme[10];
        catalogoFilmes[0] = new Filme("O Senhor dos Anéis", 2001, "Fantasia", 8.00);
        catalogoFilmes[1] = new Filme("Matrix", 1999, "Ficção Científica", 7.50);
        catalogoFilmes[2] = new Filme("Salt", 2010, "Ação", 7.00);
        catalogoFilmes[3] = new Filme("Os infiltrados", 2006, "Drama", 5.00);
        catalogoFilmes[4] = new Filme("Planeta dos Macacos", 2011, "Ação", 5.00);
        catalogoFilmes[5] = new Filme("Um sonho de Liberdade", 1994, "Crime", 6.00);
        catalogoFilmes[6] = new Filme("A Origem", 2010, "Ficção Científica", 8.50);
        catalogoFilmes[7] = new Filme("Interestelar", 2014, "Ficção Científica", 9.00);
        catalogoFilmes[8] = new Filme("Toy Story", 1995, "Animação", 4.00);
        catalogoFilmes[9] = new Filme("Parasita", 2019, "Suspense", 9.50);

        Cliente c1 = new Cliente("Gustavo Santos", "111.111.111-11", "Rua A, 100", "(81) 98765-4321");
        Cliente c2 = new Cliente("Vanessa Melo", "222.222.222-22", "Av. B, 200", "(81) 99876-5432");
        Cliente c3 = new Cliente("Francisco Lima", "333.333.333-33", "Travessa C, 300", "(81) 97654-3210");

        Conta conta1 = new Conta(c1, 1001);
        Conta conta2 = new Conta(c2, 1002);
        Conta conta3 = new Conta(c3, 1003);

        // Locações para Gustavo Santos (4 locações)
        Filme[] l1 = {catalogoFilmes[2], catalogoFilmes[3]};
        conta1.locarFilmes(l1);

        Filme[] l2 = {catalogoFilmes[4]};
        conta1.locarFilmes(l2);

        Filme[] l3 = {catalogoFilmes[5], catalogoFilmes[6], catalogoFilmes[8]};
        conta1.locarFilmes(l3);

        Filme[] l4 = {catalogoFilmes[0], catalogoFilmes[1], catalogoFilmes[7], catalogoFilmes[9], catalogoFilmes[5]};
        conta1.locarFilmes(l4);
        
        // Locações para Vanessa Melo (3 locações)
        Filme[] m1 = {catalogoFilmes[9]};
        conta2.locarFilmes(m1);
        
        Filme[] m2 = {catalogoFilmes[0], catalogoFilmes[1], catalogoFilmes[4], catalogoFilmes[6]};
        conta2.locarFilmes(m2);

        Filme[] m3 = {catalogoFilmes[2], catalogoFilmes[3], catalogoFilmes[4], catalogoFilmes[5], catalogoFilmes[6]};
        conta2.locarFilmes(m3);
        
        // Locações para Francisco Lima (4 locações)
        Filme[] j1 = {catalogoFilmes[0], catalogoFilmes[1], catalogoFilmes[2], catalogoFilmes[3], catalogoFilmes[4]};
        conta3.locarFilmes(j1);
        
        Filme[] j2 = {catalogoFilmes[5], catalogoFilmes[9]};
        conta3.locarFilmes(j2);

        Filme[] j3 = {catalogoFilmes[6], catalogoFilmes[7], catalogoFilmes[8], catalogoFilmes[9]};
        conta3.locarFilmes(j3);

        Filme[] j4 = {catalogoFilmes[0]};
        conta3.locarFilmes(j4);

        System.out.println("\n--- Pagamento de Débito (Conta 1) ---");
        System.out.println("Débito anterior de Danilo: " + String.format("%.2f", conta1.getSaldoDevedor()));
        conta1.pagarDebito(20.0);
        System.out.println("Débito atual de Danilo: " + String.format("%.2f", conta1.getSaldoDevedor()));

        System.out.println("\n==================================================");
        System.out.println("--- EXTRATO DE LOCAÇÃO - CLIENTE 1 (Gustavo Santos) ---");
        System.out.println("==================================================");
        System.out.println(conta1.extratoHistorico());

        System.out.println("\n==================================================");
        System.out.println("--- EXTRATO DE LOCAÇÃO - CLIENTE 2 (Vanessa Melo) ---");
        System.out.println("==================================================");
        System.out.println(conta2.extratoHistorico());

        System.out.println("\n==================================================");
        System.out.println("--- EXTRATO DE LOCAÇÃO - CLIENTE 3 (Francisco Lima) ---");
        System.out.println("==================================================");
        System.out.println(conta3.extratoHistorico());
    }
}