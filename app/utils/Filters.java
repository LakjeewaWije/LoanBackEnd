package utils;



import com.google.inject.Inject;
import play.filters.cors.CORSFilter;
import play.http.DefaultHttpFilters;

/**
 * Created by dulanjana on 7/5/18.
 */
public class Filters extends DefaultHttpFilters {

    @Inject
    public Filters(CORSFilter corsFilter) {
        super(corsFilter);
    }
}