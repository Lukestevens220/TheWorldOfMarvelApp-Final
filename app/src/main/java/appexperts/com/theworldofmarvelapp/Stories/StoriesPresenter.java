package appexperts.com.theworldofmarvelapp.Stories;

//import android.content.Context;
//import android.util.Log;
//
//import appexperts.com.theworldofmarvelapp.models.Hero;
//import appexperts.com.theworldofmarvelapp.rest.ApiClient;
//import appexperts.com.theworldofmarvelapp.rest.ApiInterface;
//import rx.Observer;
//import rx.android.schedulers.AndroidSchedulers;
//import rx.schedulers.Schedulers;
//
///**
// * Created by TheAppExperts on 03/11/2016.
// */
//
//public class StoriesPresenter implements StoriesContract.PresenterContract {
//    private StoriesContract.ViewContract fragment;
//    private ApiInterface observables;
//    private Context context;
//    private int productId;
//    private static final String TAG = "StoriesPresenter";
//
//    public StoriesPresenter(Context context, StoriesContract.ViewContract fragment) {
//        this.context = context;
//        this.fragment = fragment;
//        connectToService();
//    }
//
//    @Override
//    public void start() {
//
//        fragment.setPresenter(this);
//    }
//
//    @Override
//    public void getComics(int productId) {
//        fragment.startProgressDialog();
//        this.productId = productId;
//    }
//
//
//    private void connectToService() {
//        Log.d(TAG, "ConnectToService starting");
//        observables = ApiClient.getClient();
//        Log.d(TAG, "ConnectToService ending");
//    }
//
//    private void getProductDetailsFromInternet() {
//        Log.d(TAG, "getProductDetailsFromInternet starting");
//        Log.i(TAG, "Product ID is " + productId);
//
//        observables.getComics(productId)
//                .onBackpressureBuffer()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        fragment.displayError();
//                        fragment.dismissProgressDialog();
//                        Log.d(TAG, e.toString());
//                    }
//
//                    @Override
//                    public void onNext(Hero productDetailsResult) {
//
//                        Log.d(TAG, "onNext starting");
//
//                        //updateResultsInDatabase(productDetailsResult);
//                        processResults(productDetailsResult);
//
//                    }
//                });
//        Log.d(TAG, "getProductDetailsFromInternet ending");
//    }
//
//    private void processResults(Hero results) {
//        if (results != null) {
//            fragment.setProductDetails(results);
//        } else {
//            fragment.displayError();
//        }
//
//        fragment.dismissProgressDialog();
//    }
//
//
//}
