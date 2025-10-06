public class principalProduto {
    public static void main(String[] args) {
        produto p1 = new produto(1, "Mouse Gamer", 150.0, 10, 5);
        produto p2 = new produto(2, "Teclado Mecânico", 300.0, 20, 10);
        produto p3 = new produto(3, "Monitor 24", 800.0, 15, 7);

        p1.exibirInfo();

        p1.vender(3);         
        p1.vender(10);
        p1.aplicarDesconto(15);
        p1.repor(8);
        p1.vender(12);
        p1.exibirInfo();

        p2.exibirInfo();
        p2.vender(25);
        p2.aplicarDesconto(10);
        p2.repor(10);
        p2.exibirInfo();

        p3.exibirInfo();
        p3.vender(12); 
        p3.aplicarDesconto(24);
        p3.repor(7);
        p3.exibirInfo();
    }
}   
