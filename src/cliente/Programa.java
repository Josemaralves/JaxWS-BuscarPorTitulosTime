package cliente;

public class Programa {

    public static void main(String[] args) {
        Echo echo = new EchoService().getEchoPort();
        System.out.println(echo.echo("adsadas"));
    }


}
