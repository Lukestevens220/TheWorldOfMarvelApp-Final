package appexperts.com.theworldofmarvelapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import appexperts.com.theworldofmarvelapp.R;
import appexperts.com.theworldofmarvelapp.models.Characters;
import appexperts.com.theworldofmarvelapp.utilities.ItemClickListener;

//
//public class CoverFlowAdapter extends RecyclerView.Adapter<CoverFlowAdapter.MovieViewHolder> {
//
//    private List<Characters.Data.Result> characters;
//    String title, description;
//    private int rowLayout;
//    int size=0;
//    private Context context;
//    private final static String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";
//
//    /**
//     * 3 Implement interface: this will create two methods click and long click
//     */
//    public static class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{
//        LinearLayout moviesLayout;
//        TextView movieTitle;
//        TextView data;
//        /**
//         * 1 Add itemClickListerner Interface
//         * 2 Create object
//         */
//        private ItemClickListener clickListener;
//
//
//        TextView movieDescription;
//        TextView rating;
//
//        public void setClickListener(ItemClickListener itemClickListener) {
//            this.clickListener = itemClickListener;
//        }
//
//        /**
//         * 4 click methods
//         * @param view
//         */
//        @Override
//        public void onClick(View view) {
//            clickListener.onClick(view, getPosition(), false);
//        }
//
//        @Override
//        public boolean onLongClick(View view) {
//            clickListener.onClick(view, getPosition(), true);
//            return true;
//        }
//        public MovieViewHolder(View v) {
//            super(v);
//            moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
//            movieTitle = (TextView) v.findViewById(R.id.title);
//            data = (TextView) v.findViewById(R.id.subtitle);
//            movieDescription = (TextView) v.findViewById(R.id.description);
//            rating = (TextView) v.findViewById(R.id.rating);
//
//            /**
//             * 5 Most important: add Listener
//             */
//            itemView.setTag(itemView);
//            itemView.setOnClickListener(this);
//            itemView.setOnLongClickListener(this);
//        }
//    }
//
//    public CoverFlowAdapter(List<Characters.Data.Result> movies, int rowLayout, Context context) {
//        this.characters = movies;
//        this.rowLayout = rowLayout;
//        this.context = context;
//    }
//
//
//
//    @Override
//    public CoverFlowAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
//                                                            int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
//        return new MovieViewHolder(view);
//    }
//
//
//    @Override
//    public void onBindViewHolder(MovieViewHolder holder, final int position) {
//
//        holder.movieTitle.setText(characters.get(position).getName());
//        holder.data.setText(characters.get(position).getDescription());
//        holder.movieDescription.setText(characters.get(position).getDescription());
//        holder.rating.setText(characters.get(position).getId().toString());
//
//        /**
//         * 6 Call click here
//         */
//        holder.setClickListener(new ItemClickListener() {
//            @Override
//            public void onClick(View view, final int position, boolean isLongClick) {
//                if(isLongClick){
//
//                }else{
//                    //clicked
//                }
//
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return characters.size();
//    }
//}