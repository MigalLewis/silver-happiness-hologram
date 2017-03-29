/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.home.hologram2;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import lombok.Getter;

/**
 *
 * @author migal
 */
public class VideoPlayer extends MediaView {

  @Getter
  private final Media media;
  private final MediaPlayer mediaPlayer;
  @Getter
  private final String videoFile;

  public VideoPlayer(String videoFile) {
    this.videoFile = videoFile;
    media = new Media(new File(videoFile).toURI().toString());

    mediaPlayer = new MediaPlayer(media);
    mediaPlayer.setAutoPlay(true);
    setMediaPlayer(mediaPlayer);
  }
}
