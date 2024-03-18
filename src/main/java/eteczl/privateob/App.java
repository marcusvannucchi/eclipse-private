package eteczl.privateob;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa P1 = new Pessoa ("rodrigao");
        P1.setIdade(15);
        P1.setNome("pedrin");
        Pessoa P2 = new Pessoa ("josezinho");
        P2.setIdade(19);
        P2.setNome("louro");
        System.out.println(P1.getNome() + P1.getIdade());
        System.out.println(P2.getNome() + P2.getIdade() );
    }
}
