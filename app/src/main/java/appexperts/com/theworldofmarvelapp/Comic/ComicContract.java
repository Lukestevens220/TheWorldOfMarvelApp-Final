package appexperts.com.theworldofmarvelapp.Comic;

import appexperts.com.theworldofmarvelapp.mvp.BasePresenter;
import appexperts.com.theworldofmarvelapp.mvp.BaseView;

/**
 * Created by TheAppExperts on 04/11/2016.
 */

public interface ComicContract {

    interface PresenterContract extends BasePresenter {

        void start();
        void getComics(int productId);

    }

    interface ViewContract extends BaseView<ComicContract.PresenterContract> {

        void startProgressDialog();
        void dismissProgressDialog();
        void displayError();
        void setProductDetails(Result productDetails);

    }
}
