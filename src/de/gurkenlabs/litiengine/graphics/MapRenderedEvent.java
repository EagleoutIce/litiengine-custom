package de.gurkenlabs.litiengine.graphics;

import java.awt.Graphics2D;
import java.util.EventObject;

import de.gurkenlabs.litiengine.environment.tilemap.IMap;

public class MapRenderedEvent extends EventObject {
  private static final long serialVersionUID = -562565518335076236L;
  private final transient IMap map;
  private final transient Graphics2D graphics;

  public MapRenderedEvent(final Graphics2D graphics, final IMap map) {
    super(map);
    this.graphics = graphics;
    this.map = map;
  }

  /**
   * Gets the graphics object on which the map is rendered.
   * 
   * @return The graphics object on which the map is rendered.
   */
  public Graphics2D getGraphics() {
    return graphics;
  }

  /**
   * Get the map involved with the rendering process.
   * 
   * @return The map involved with the rendering process.
   */
  public IMap getMap() {
    return map;
  }
}
