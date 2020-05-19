package liebman.nasa.neo;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NearEarthObjectViewTest {

    @Test
    public void paintComponent_withNullNeo() {
        //given
        NearEarthObjectView view = new NearEarthObjectView();
        Graphics g = mock(Graphics.class);

        //when
        view.paintComponent(g);

        //then
        verifyNoInteractions(g);

    }

    @Test
    public void paintComponent_withNeoAwayFromMoon() {
        //given
        NearEarthObjectView view = new NearEarthObjectView();
        Graphics g = mock(Graphics.class);

        NeoFeed.NearEarthObject neo = mock(NeoFeed.NearEarthObject.class);
        doReturn(5.0).when(neo).closestLunarDistance();
        view.setNearEarthObjects(neo);

        //when
        view.paintComponent(g);

        //then
        verify(g).fillOval(-2, 200, 25, 25);
    }
}