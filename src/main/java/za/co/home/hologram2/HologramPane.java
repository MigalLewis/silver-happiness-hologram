/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.home.hologram2;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaView;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author migal
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HologramPane extends GridPane {
  private MediaView topLeft;
  private MediaView topRight;
  private MediaView bottomLeft;
  private MediaView bottomRight;

  public HologramPane() {
    topLeft=new MediaView();
    topRight=new MediaView();
    bottomLeft=new MediaView();
    bottomRight=new MediaView();
    add(topLeft, 0, 0);
    add(topRight, 0, 1);
    add(bottomLeft, 1, 0);
    add(bottomRight, 1, 1);
  }

  @Override
  public final void add(Node child, int columnIndex, int rowIndex) {

  }
  
}
