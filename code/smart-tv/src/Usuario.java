public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Tv está ligada: " + smartTv.turnedOn);
        System.out.println("Qual canal a tv está: " + smartTv.channel);
        System.out.println("Qual volume a tv está: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("Tv está ligada: " + smartTv.turnedOn);
        smartTv.decreaseVolume();
        System.out.println("Qual volume a tv está: " + smartTv.volume);
        smartTv.increaseVolume();
        System.out.println("Qual volume a tv está: " + smartTv.volume);
        smartTv.increaseChannel();
        System.out.println("Qual canal a tv está: " + smartTv.channel);
        smartTv.decreaseChannel();
        System.out.println("Qual canal a tv está: " + smartTv.channel);


    }
}
