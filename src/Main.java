public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    String phoneNumber = "+55 (71) 91234-6789"; // fictional phone number

    System.out.println("========================================");
    System.out.println("Testando funcionalidades do telefone \n");
    iphone.call(phoneNumber);
    iphone.answer();
    iphone.startVoiceMail();

    System.out.println("========================================");
    System.out.println("Testando funcionalidades do player de música \n");
    iphone.play();
    iphone.pause();
    String music = "We are The Champions";
    iphone.selectMusic(music);

    System.out.println("========================================");
    System.out.println("Testando funcionalides do navegador  \n");
    iphone.showPage("https://google.com");
    iphone.addNewTab();
    iphone.refreshPage();
  }
}
