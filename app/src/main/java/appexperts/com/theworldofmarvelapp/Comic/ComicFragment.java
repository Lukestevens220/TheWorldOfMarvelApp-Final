package appexperts.com.theworldofmarvelapp.Comic;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import appexperts.com.theworldofmarvelapp.R;

import static android.content.ContentValues.TAG;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by TheAppExperts on 04/11/2016.
 */

public class ComicFragment extends Fragment implements ComicContract.ViewContract{

    private static final String CATEGORY_ID = "categoryId";

    private int categoryId;
    private RecyclerView comicsRecyclerView;
    private ComicContract.PresenterContract presenterContract;
    private ComicPresenter presenter;
    private ArrayList<Result> results;
    private ProgressDialog progressDialog;

    public ComicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param categoryId Parameter 1.
     * @return A new instance of fragment ProductsByCategoryFragment.
     */
    public static ComicFragment newInstance(String categoryId) {
        ComicFragment fragment = new ComicFragment();
        Bundle args = new Bundle();
        args.putString(CATEGORY_ID, categoryId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            categoryId = getArguments().getInt(CATEGORY_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_comic, container, false);
        initialiseRecyclerView(v);

        presenter = new ComicPresenter(getActivity(), this);
        presenter.start();
        presenter.getComics(categoryId);

        return v;
    }

    private void initialiseRecyclerView(View v){
        comicsRecyclerView = (RecyclerView) v.findViewById(R.id.comic_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        comicsRecyclerView.setLayoutManager(linearLayoutManager);
//        SnapHelper snapHelper = new LinearSnapHelper();
//        snapHelper.attachToRecyclerView(productImageRecyclerView);
    }


    @Override
    public void startProgressDialog() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    @Override
    public void dismissProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

    @Override
    public void displayError() {
        Toast.makeText(getActivity(), "Problem fetching products", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setProductDetails(Result productDetails) {

    }

    @Override
    public void setPresenter(ComicContract.PresenterContract presenter) {
        Log.d(TAG, "setPresenter starting");
        this.presenterContract = checkNotNull(presenter);
        Log.d(TAG, "setPresenter ending");
    }
}
