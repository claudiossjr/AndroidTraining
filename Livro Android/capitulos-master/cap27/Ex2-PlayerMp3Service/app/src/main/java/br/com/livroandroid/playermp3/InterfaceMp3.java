package br.com.livroandroid.playermp3;

/**
 * Interface para fazer o bind do Service MediaPlayerService que a implementa
 * 
 * @author ricardo
 *
 */
public interface InterfaceMp3 {
	// Inicia a m�sica
	void play(String mp3);
	// Faz pause da m�sica
	void pause();
	// Para a m�sica
	void stop();
	// true se est� tocando
	boolean isPlaying();
	// Caminho da m�sica
	String getMp3();
}
