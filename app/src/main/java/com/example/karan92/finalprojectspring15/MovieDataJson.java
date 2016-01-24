package com.example.karan92.finalprojectspring15;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieDataJson {

    List<Map<String,?>> moviesList;

    public List<Map<String, ?>> getMoviesList() {
        return moviesList;
    }

    public int getSize(){
        return moviesList.size();
    }
    public void deleteItem(int position)
    {
        moviesList.remove(position);
    }
    public void addItem(int position)
    {
        //  movieList.add(position+1,movieList.get(position));
        HashMap<String, ?> movie = (HashMap<String, ?>) moviesList.get(position);
        moviesList.add(position+1, (HashMap<String, ?>) movie.clone());
    }

    public int findFirst(String s){
        List<Map<String, ?>> list = getMoviesList();
        int size = getSize();
        String ss = s.toLowerCase();
        System.out.println("Position :" +ss);
        int location=0;
        for(int i=0; i<size; i++){
            HashMap<String, ?> movie = (HashMap<String, ?>) list.get(i);
            String name = (String) movie.get("name");
            String lname = name.toLowerCase();
            System.out.println("Position :" +lname);
            if(lname.contains(ss)){
                location = i;
                break;
            }
            else
                location = -1;
        }
        System.out.println("Position :" +location);
        return location;
    }

    public HashMap getItem(int i){
        if (i >=0 && i < moviesList.size()){
            return (HashMap) moviesList.get(i);
        } else return null;
    }

    public MovieDataJson(Context context) throws JSONException {
        String description = null;
		String length = null;
		String year = null;
		double rating = 0.0;
		String director = null;
		String stars = null;
		String url = null;
        String name = null;
        String drawablename = null;
        int resID = 0;
        JSONArray moviesJsonArray = null;
        JSONObject movieJsonObj = null;
        moviesList = new ArrayList<Map<String,?>>();
        String moviesArray = loadMovieJSONFromAsset(context);
        moviesJsonArray = new JSONArray(moviesArray);
        for(int i = 0; i <moviesJsonArray.length();i++){
            movieJsonObj = (JSONObject) moviesJsonArray.get(i);
            if(movieJsonObj != null) {
                name = (String) movieJsonObj.get("name");
                year = (String) movieJsonObj.get("year");
                length = (String) movieJsonObj.get("length");
                rating = Double.parseDouble(movieJsonObj.get("rating").toString());
                director = (String) movieJsonObj.get("director");
                stars = (String) movieJsonObj.get("stars");
                url = (String) movieJsonObj.get("url");
                description = (String) movieJsonObj.get("description");
                drawablename = (String) movieJsonObj.get("image");
                resID = context.getResources().getIdentifier(drawablename, "drawable", context.getPackageName());
            }
            moviesList.add(createMovie(name, resID, description, year, length, rating, director, stars, url));

        }
    }


    private HashMap createMovie(String name, int image, String description, String year,
                                String length, double rating, String director, String stars, String url) {
        HashMap movie = new HashMap();
        movie.put("image",image);
        movie.put("name", name);
        movie.put("description", description);
		movie.put("year", year);
		movie.put("length",length);
		movie.put("rating",rating);
		movie.put("director",director);
		movie.put("stars",stars);
		movie.put("url",url);
        movie.put("selection",false);
        return movie;
    }

    public String loadMovieJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("movie.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
