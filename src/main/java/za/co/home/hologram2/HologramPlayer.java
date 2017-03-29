/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.home.hologram2;

import javafx.scene.layout.Pane;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author migal
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HologramPlayer extends Pane {
  private HologramPane hologramPane;
  private final VideoPlayer[] videoPlayers;
  private String file;

  public HologramPlayer(String file) {
    this.file=file;
    hologramPane=new HologramPane();
    videoPlayers=new VideoPlayer[4];
    for(int x=0;x<4;x++){
      videoPlayers[x]=new VideoPlayer(file);
    }
    hologramPane.setTopLeft(videoPlayers[0]);
    hologramPane.setTopRight(videoPlayers[1]);
    hologramPane.setBottomLeft(videoPlayers[2]);
    hologramPane.setBottomRight(videoPlayers[3]);
  }
  
}
