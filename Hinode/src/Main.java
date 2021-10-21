public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Silvio Santos", 3);
        func1.vender(2);

        Vendedor afi1 = new Afiliado("Fausto Silva");
        afi1.vender(1);
        Vendedor afi2 = new Afiliado("Renato Aragão");
        afi2.vender(4);

        func1.addAfiliado(afi1);
        func1.addAfiliado(afi2);

        Vendedor estag1=new Estagiario("Yudi Tamashiro");
        estag1.vender(8);

        Vendedor estag2=new Estagiario("Ratinho");
        estag2.vender(18);

        System.out.println(func1.mostrarCategoria());

        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());

        System.out.println(estag1.mostrarCategoria());
        System.out.println(estag2.mostrarCategoria());
    }
}
