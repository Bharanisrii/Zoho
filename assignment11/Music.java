package assignment11;

interface Playable{
	void play();
	void pause();
	void stop();
}
class MP3player implements Playable{
	
	public void play() {
        System.out.println("MP3 Player: Playing music");
    }
	public void pause() {
		System.out.println("MP3 Player: Pausing music");
	}
	public void stop() {
		System.out.println("MP3 Player: Stoping music");
	}

}
class CDplayer implements Playable{
	public void play() {
		System.out.println("CD Player: Playing music");
        }
	public void pause() {
		System.out.println("CD Player: Pausing music");
        }
	public void stop() {
		System.out.println("CD Player: Stoping music");
        }
}
class Streamingplayer implements Playable{
	public void play() {
		System.out.println("Streaming Player: Playing music");
		}
	public void pause() {
		System.out.println("Streaming Player: Playing music");
        }
	public void stop() {
		System.out.println("Streaming Player: Playing music");

	}
}
public class Music{
	public static void main(String[]args) {
	Playable mp3player = new MP3player();
	Playable cdplayer = new CDplayer();
	Playable streamingplayer = new Streamingplayer();

	mp3player.play();
	mp3player.pause();
	mp3player.stop();
	
	cdplayer.play();
	cdplayer.pause();
	cdplayer.stop();
	
	streamingplayer.play();
	streamingplayer.pause();
	streamingplayer.stop();
}
}