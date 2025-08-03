import contracts.Browser;
import contracts.MusicPlayer;
import contracts.Phone;

public class Iphone implements MusicPlayer, Browser, Phone {

  @Override
  public void call(String numero) {
    System.out.println("Ligando para o número: " + numero);
  }

  @Override
  public void answer() {
    System.out.println("Atendendo a chamada recebida");
  }

  @Override
  public void startVoiceMail() {
    System.out.println("Iniciando o correio de voz");
  }

  @Override
  public void showPage(String url) {
    System.out.println("Exibindo a página: " + url);
  }

  @Override
  public void addNewTab() {
    System.out.println("Adicionando nova aba ao navegador");
  }

  @Override
  public void refreshPage() {
    System.out.println("Atualizando a página atual");
  }

  @Override
  public void play() {
    System.out.println("Tocando a música");
  }

  @Override
  public void pause() {
    System.out.println("Pausando a música");
  }

  @Override
  public void selectMusic(String musica) {
    System.out.println("Selecionando a música: " + musica);
  }

}
