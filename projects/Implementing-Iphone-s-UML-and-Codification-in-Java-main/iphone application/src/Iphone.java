public class Iphone implements InternetBrowser, MusicPlayer, Phone{

    @Override
    public void call() {
        System.out.println("calling...");
    }

    @Override
    public void answer() {
        System.out.println("answeering...");
    }

    @Override
    public void play() {
        System.out.println("playing...");
    }

    @Override
    public void pause() {
        System.out.println("pausing...");
    }

    @Override
    public void displayPage() {
        System.out.println("displaying Page...");
    }

    @Override
    public void newTab() {
        System.out.println("creating new tab...");
    }


    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.answer();
        iphone.call();
        iphone.play();
        iphone.pause();
        iphone.displayPage();
        iphone.newTab();
    }
}
