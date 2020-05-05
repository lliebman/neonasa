package liebman.nasa.neo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NeoService {

    @GET("/neo/rest/v1/feed?api_key=DEMO_KEY")
    Call<NeoFeed> getAsteroids(@Query("start_date") String startDate,
                               @Query("end_date") String endDate);

    @GET("neo/rest/v1/neo/{id}?api_key=DEMO_KEY")
    Call<NeoFeed.nearEarthObjects> getAsteroid(@Path("id") String id);
}