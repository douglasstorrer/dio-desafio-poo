package comunicacao;

public class AparelhoTelefonico {
  private void ligar(long numero) {
    System.out.println("Ligando para o n�mero " + numero + ".");
  }
  
  private void atender() {
    System.out.println("Liga��o atendida. Chamada em andamento.");
  }
  
  private void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz.");
  }
}
