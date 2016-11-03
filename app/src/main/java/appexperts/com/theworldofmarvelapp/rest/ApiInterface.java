package appexperts.com.theworldofmarvelapp.rest;

import appexperts.com.theworldofmarvelapp.constants.Constants;
import appexperts.com.theworldofmarvelapp.models.Hero;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


public interface ApiInterface {
    @GET(Constants.CHARACTERS_URL)
    Observable<Hero> getCharacters();

    @GET(Constants.COMICS_URL)
    Observable<Hero.Data.Result.Comics> getComics(@Query("catid") int id);

//
//    @GET(Constants.PRODUCTS_BY_CATEGORY_URL)
//    Observable<ProductsByCategoryResult> getProductsByCategory(@Query("catid") String id);




}
