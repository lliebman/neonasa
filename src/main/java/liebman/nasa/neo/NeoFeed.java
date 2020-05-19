package liebman.nasa.neo;


import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class NeoFeed {

    @SerializedName("near_earth_objects")
    HashMap<String, List<NearEarthObject>> nearEarthObjects;

    class NearEarthObject
    {
        String id;
        String name;
        @SerializedName("nasa_jpl_url")
        String nasaJplUrl;
        @SerializedName("is_potentially_hazardous_asteroid")
        boolean hazardous;
        List<CloseApproachData> closeApproachData;

        public double closestLunarDistance() {
            return closeApproachData.get(0).missDistance.lunar;
        }
    }

    class CloseApproachData {
        @SerializedName("close_approach_data")
        String closeApproachDate;
        @SerializedName("miss_distance")
        MissDistance missDistance;
    }

    class MissDistance {
        double lunar;
    }

}
