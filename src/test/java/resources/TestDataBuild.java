package resources;

import pojo.AddPlace;
import pojo.Location;

import java.util.Arrays;

public class TestDataBuild {

    public AddPlace addPlacePayload(String name, String language, String address) {
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setName(name);
        p.setPhone_number("(+91) 983 893 3937");
        p.setAddress(address);
        p.setWebsite("http://rahulshettyacademy.com");
        p.setLanguage(language);
        p.setTypes(Arrays.asList("shoe park", "shop"));
        Location l = new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        p.setLocation(l);
        return p;
    }
}
