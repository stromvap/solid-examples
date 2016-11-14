package interfaace.segregation.principle.good;

public class Passenger {
    public void chillAndPlayMusic(Playable playable) {
        playable.startRadio();
        System.out.println("♪ ♪ ♪");
    }
}
