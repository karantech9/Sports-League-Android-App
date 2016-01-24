package com.example.karan92.finalprojectspring15;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Home extends Fragment {
    List<HomeScreenItems> content;
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    HomeScreenItemAdapter homeScreenItemAdapter;
    OnListItemSelectedListner mListner;


    public Fragment_Home() {
        // Required empty public constructor
    }

    public interface OnListItemSelectedListner{
        public void onListitemSelected(int position);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            mListner =(OnListItemSelectedListner) activity;
        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"must implement OnfragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
     }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.myRecycler);
        mLayoutManager = new LinearLayoutManager(getActivity());
//        GetHomeItemAsync setUpHomeItems = new GetHomeItemAsync(getActivity(),mRecyclerView,mLayoutManager);
//        setUpHomeItems.execute();
        homeScreenItemAdapter = new HomeScreenItemAdapter(getActivity(),(new HomeScreenItems().getItemList()));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(homeScreenItemAdapter);
        setRetainInstance(true);
        homeScreenItemAdapter.SetOnItemClickListener(new HomeScreenItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                 mListner.onListitemSelected(position);
            }
        });
        return rootView;

//        ParallaxRecyclerAdapter<HomeScreenItems> stringAdapter = new ParallaxRecyclerAdapter<>(content);
//        stringAdapter.setParallaxHeader(getActivity().getLayoutInflater().inflate(R.layout.my_header, myRecycler, false), myRecycler);
//
//        stringAdapter.implementRecyclerAdapterMethods(new ParallaxRecyclerAdapter.RecyclerAdapterMethods() {
//            @Override
//            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
//                ((ViewHolder) viewHolder).itemTitle.setText(content.get(i).getTitle()); // your bind holder routine.
//                ((ViewHolder) viewHolder).itemImage.setImageResource(content.get(i).getImage()); // your bind holder routine.
//            }
//
//            @Override
//            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//                View v;
//                v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_cardview, viewGroup, false);
//                ViewHolder vh = new ViewHolder(v);
//                return vh;
//            }
//
//            @Override
//            public int getItemCount() {
//                return content.size();
//            }
//
//            class ViewHolder extends RecyclerView.ViewHolder {
//
//                public ImageView itemImage;
//                public TextView itemTitle;
//
//                public ViewHolder(final View itemView) {
//                    super(itemView);
//                    itemImage = (ImageView) itemView.findViewById(R.id.homeItemImage);
//                    itemTitle = (TextView) itemView.findViewById(R.id.homeItemTitle);
//                }
//            }
//        });

//        stringAdapter.setOnParallaxScroll(new ParallaxRecyclerAdapter.OnParallaxScroll() {
  //          @Override
 //           public void onParallaxScroll(float percentage, float offset, View parallax) {
//                Drawable c = mToolbar.getBackground();
//                c.setAlpha(Math.round(percentage * 255));
//                mToolbar.setBackground(c);
//            }
//        });
//        stringAdapter.setOnClickEvent(new ParallaxRecyclerAdapter.OnClickEvent() {
//            @Override
//            public void onClick(View view, int i) {
//                switch (i){
//                    case 0:
//                        getFragmentManager().beginTransaction()
//                                .replace(R.id.container, new Fragment_Teams())
//                                .addToBackStack(null)
//                                .commit();
//                        break;
//                    case 1:
//                        getFragmentManager().beginTransaction()
//                                .replace(R.id.container, new Fragment_Venues())
//                                .addToBackStack(null)
//                                .commit();
//                        break;
//                    case 2:
//                        getFragmentManager().beginTransaction()
//                                .replace(R.id.container, new Fragment_Pointtable())
//                                .addToBackStack(null)
//                                .commit();
//                        break;
//                    case 3:
//                        getFragmentManager().beginTransaction()
//                                .replace(R.id.container, new Fragment_About())
//                                .addToBackStack(null)
//                                .commit();
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
//
//        myRecycler.setAdapter(stringAdapter);

    }

//    public Bitmap roundCorner(Bitmap src, float round) {
//        // image size
//        int width = src.getWidth();
//        int height = src.getHeight();
//        // create bitmap output
//        Bitmap result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
//        // set canvas for painting
//        Canvas canvas = new Canvas(result);
//        canvas.drawARGB(0, 0, 0, 0);
//
//        // config paint
//        final Paint paint = new Paint();
//        paint.setAntiAlias(true);
//        paint.setColor(Color.BLACK);
//
//        // config rectangle for embedding
//        final Rect rect = new Rect(0, 0, width, height);
//        final RectF rectF = new RectF(rect);
//
//        // draw rect to canvas
//        canvas.drawRoundRect(rectF, round, round, paint);
//
//        // create Xfer mode
//        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
//        // draw source image to canvas
//        canvas.drawBitmap(src, rect, rect, paint);
//
//        // return final image
//        return result;
//    }
}
