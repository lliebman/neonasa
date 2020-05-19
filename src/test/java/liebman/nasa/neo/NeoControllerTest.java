package liebman.nasa.neo;

import org.junit.Test;
import retrofit2.Call;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class NeoControllerTest {

    @Test
    public void requestData() {
        //given
        NeoService service = mock(NeoService.class);
        NearEarthObjectView view = mock(NearEarthObjectView.class);
        Call<NeoFeed> call = mock(Call.class);
        NeoController controller = new NeoController(service, view);


        //when
        controller.requestData();

        //then
    }
}