import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {
        //Objetos Logger podem ser obtidos por chamadas em um dos métodos de fábrica getLogger.
        // Isso criará um novo Logger ou retornará um Logger existente adequado.
        // É importante observar que o Logger retornado por um dos getLoggermétodos de fábrica
        // pode ser coletado como lixo a qualquer momento se uma referência forte ao Logger não for mantida
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no DB
        LOGGER.info("removeu dados");
    }
}
