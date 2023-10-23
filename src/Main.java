import Turista.Turista;

public class Main {
    public static void main(String[] args) {

        Turista mochileiro = new Turista();

        //definindo formato do objeto

        mochileiro.nome = "Anderson";
        mochileiro.cpf = "123";

        String retorno = mochileiro.viajar();
        System.out.println(retorno);
    }
}