package appexperts.com.theworldofmarvelapp.rest;

import appexperts.com.theworldofmarvelapp.constants.Constants;
import appexperts.com.theworldofmarvelapp.models.Characters;
import retrofit2.http.GET;
import rx.Observable;


public interface ApiInterface {
    @GET(Constants.CHARACTERS_URL)
    Observable<Characters> getCharacters();
//
//    @GET(Constants.PRODUCTS_BY_CATEGORY_URL)
//    Observable<ProductsByCategoryResult> getProductsByCategory(@Query("catid") String id);




}
