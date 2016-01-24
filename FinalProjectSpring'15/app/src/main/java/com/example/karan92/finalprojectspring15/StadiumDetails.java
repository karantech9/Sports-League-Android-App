package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/15/2015.
 */
public class StadiumDetails {
    List<Map<String,?>> stadium;

    public List<Map<String, ?>> getItemList() {
        return stadium;
    }

    public int getSize(){
        return stadium.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < stadium.size()){
            return (HashMap) stadium.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public StadiumDetails(){
        String about;
        String title;
        String location;
        String seatingCapacity;
        String end1;
        String end2;
        double latitude;
        double longitude;
        stadium = new ArrayList<Map<String,?>>();

        about = "Sardar Patel Stadium (Motera Stadium) is one of the premier cricket stadiums of India in the Motera locality of Ahmedabad. Because of its location, the stadium is commonly called 'Motera Stadium' to avoid confusion with another stadium of the same name in Navrangpura, Ahmedabad. Sardar Patel stadium is owned by Gujarat Cricket Association and comes under the aegis of the West Zone. It is the largest stadium in the state of Gujarat with an official capacity of 54,000 spectators.[1] It is equipped with floodlights for day-and-night games and is a regular venue for Test cricket and One Day Internationals (ODI) matches.";
        title = "Motera, Ahmedabad";
        seatingCapacity = "54,000";
        location = "Ahmedabad";
        end1 = "Pavilion End, Pavilion End";
        end2 = "";
        latitude = 23.04217;
        longitude = 72.56440;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venahmedabad));

        about = "The M. Chinnaswamy Stadium, located in Bengaluru, Karnataka, is one of the cricket stadiums of India. Flanked by the picturesque Cubbon Park, Queen's Road, Cubbon and uptown MG Road, this four decade old stadium is situated in the heart of the city of Bangalore. Formerly known as the Karnataka State Cricket Association (KSCA) stadium, the ground was later rechristened in tribute to Mr. M. Chinnaswamy, who had served the KSCA for four decades and was also president of the Board of Control for Cricket in India (BCCI) from 1977–1980. This stadium with a seating capacity of around 36,000 not only regularly hosts Test cricket, One Day Internationals (ODI) and other First-class cricket matches, but also other musical and cultural events. The stadium is also the home ground of the Karnataka state cricket team and the Indian Premier League franchise Royal Challengers Bangalore. It is owned by the Government of Karnataka and has been leased out to the KSCA for a period of 99 years.";
        title = "Chinnaswamy, Bengaluru";
        seatingCapacity = "36,760";
        location = "Bengaluru";
        end1 = "Pavilion End, BEML End";
        end2 = "";
        latitude = 12.9788;
        longitude = 77.5996;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venbangalore));

        about = "The M. A. Chidambaram Stadium or Chepauk Stadium is a cricket stadium in Chennai (formerly Madras), India. The stadium was established in 1916 and it the oldest continuously used cricket stadium in the country. Named after M. A. Chidambaram, former President of BCCI, the stadium was formerly known as Madras Cricket Club Ground. It is the home ground of the Tamil Nadu cricket team and the most successful Indian Premier League team Chennai Super Kings. Cheupak hosted its first test match played on 10 February 1934, the first ever Ranji Trophy match in 1936 and Indian cricket team's first ever test victory in 1952 against England. The 1986 India-Australia match held at Cheupak was only the second ever Tied Test in the history of the game.";
        title = "Chidambaram, Chennai";
        seatingCapacity = "37,220";
        location = "Chennai";
        end1 = "Anna Pavilion End, V Pattabhiraman Gate End";
        end2 = "";
        latitude = 13.0628;
        longitude = 80.2794;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venchennai));

        about = "The Feroz Shah Kotla is a cricket ground located at Bahadur Shah Zafar Marg, Delhi. It was established in 1883 and is the second oldest international cricket stadium still functional in India, after the Eden Gardens in Kolkata. It is located close to the 20,000 capacity Ambedkar Stadium, the home of association football club New Delhi Heroes FC. In the 21st century, the Feroz Shah Kotla is famed for its cauldron-like atmosphere. The vociferous home support has led to a great winning sequence for India in Test matches, and the India national cricket team has been undefeated for over 20 years at this ground.[2]The ground is most famously known for Anil Kumble's 10 wickets in an innings against Pakistan, Sachin Tendulkar's 35th test ton to overcome Sunil Gavaskar to become the batsman with the most international Test centuries, and formerly Gavaskar's 29th test ton to equal Don Bradman's tally of 29 centuries.";
        title = "Ferozeshah Kotla, Delhi";
        seatingCapacity = "55,000";
        location = "Delhi";
        end1 = "Stadium End, Pavilion End";
        end2 = "";
        latitude = 28.6378;
        longitude = 77.2431;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.vendelhi));

        about = "Rajiv Gandhi International Cricket Stadium, is the principal cricket stadium in Hyderabad, India and is the home ground of the Hyderabad Cricket Association. It is located in Uppal, an eastern suburb of the city. It has a capacity of 55,000 spectators presently and extends across 16 acres (65,000 m2) of land. The ends are named Pavilion End and North End. On the retirement of VVS Laxman, the HCA decided to honour the state hero by naming the North End after him.";
        title = "RGI Stadium, Hyderabad";
        seatingCapacity = "55,000";
        location = "Hyderabad";
        end1 = "Pavilion End, VVS Laxman End";
        end2 = "";
        latitude = 17.4065;
        longitude = 78.5504;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venhydrabad));

        about = "Eden Gardens is a cricket ground in Kolkata, India. It is the home of the Bengal cricket team and the Indian Premier League's Kolkata Knight Riders, as well as being a venue for Test, One Day International and Twenty20 International matches.[2] The largest cricket stadium in India by seating capacity, it is widely acknowledged to be one of the most iconic cricket stadiums in the world.[3] Eden Gardens has been called \"cricket's answer to the Colosseum.";
        title = "Eden Gardens, Kolkata";
        seatingCapacity = "66,349";
        location = "Kolkata";
        end1 = "High Court End, Pavilion End";
        end2 = "PAVILION END";
        latitude = 22.5644;
        longitude = 88.3433;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venkolkatta));

        about = "The Punjab Cricket Association Stadium (Punjabi: ਪੰਜਾਬ ਕ੍ਰਿਕੇਟ ਏਸੋਸਿਏਸ਼ਨ ਸਟੇਡਿਅਮ) is located in Mohali, near Chandigarh. It is popularly referred to as the Mohali Stadium. The stadium is home to the Punjab team. Punjab's second international cricket stadium has been approved by BCCI in Bathinda, Punjab. The construction of the stadium took around INR 25 crore and 3 years to complete.[1] The stadium has an official capacity of 26,950[2] spectators. The stadium was designed by Arun Loomba and Associates, Panchkula and constructed by R.S. Construction Company, Chandigarh.";
        title = "PCA Stadium, Mohali";
        seatingCapacity = "40,000";
        location = "Mohali";
        end1 = "Pavilion End, City End";
        end2 = "CITY END";
        latitude = 30.6909;
        longitude = 76.7373;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venpunjab));

        about = "The Wankhede Stadium is a cricket stadium in the Indian city of Mumbai. The stadium now has capacity of 32,000, following renovations for the 2011 Cricket World Cup. Before the upgrade, the capacity was approximately 45,000.[3] The Wankhede stadium has been host to numerous high profile cricket matches in the past, including the match in which Ravi Shastri hit six sixes in an over. The stadium also hosted the 2011 Cricket World Cup Final, in which India defeated Sri Lanka by 6 wickets, apart from many other matches in both the 1996 as well as 2011 Cricket World Cup. The stadium witnessed the last match of Sachin Tendulkar's international career.";
        title = "Wankhede, Mumbai";
        seatingCapacity = "33,482";
        end1 = "Garware Pavilion End, Tata End";
        end2 = "";
        latitude = 18.9389;
        longitude = 72.8257;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venmumbaiw));

        about = "The Brabourne Stadium is a cricket ground in the Indian city of Mumbai. The ground is owned by the Cricket Club of India (CCI). Brabourne Stadium is India's first permanent sporting venue. The North Stand of the Brabourne housed the Board of Control for Cricket in India (BCCI) headquarters and the 1983 Cricket World Cup trophy until 2006 when both were moved to the newly built Cricket Centre at the nearby Wankhede Stadium. Brabourne Stadium hosted Test matches from 1948 to 1972, and was the venue for Bombay Pentangular matches from 1937 until 1946. After disputes over ticketing arrangements with the CCI, the Bombay Cricket Association (BCA) built the Wankhede Stadium a few hundred metres north of Brabourne. After the Wankhede was built, Brabourne was no longer used for Test matches, although visiting teams played a few first-class matches at the ground. Apart from cricket, the ground has played host to tennis and football matches as well as music shows and concerts.";
        title = "Brabourne, Mumbai";
        seatingCapacity = "20,000";
        location = "Mumbai";
        end1 = "Pavilion End, Church Gate End";
        end2 = "";
        latitude = 18.9322;
        longitude = 72.8247;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venmumbaibb));

        about = "The Maharashtra Cricket Association Stadium is a cricket stadium located at Gahunje near Pimpri-Chinchwad, India. It served as the home stadium for the Maharashtra cricket team including headquarters for the Maharashtra Cricket Association and Indian Premier League team Pune Warriors India now defunct. With India having the largest cricket audience in the world and Indian influence in international cricket growing, the MCA decided a new stadium was needed. Hopkins Architects of London was commissioned to design a new 36,000 seat stadium in Pune and the stadium was the result. The new MCA Stadium was inaugurated in April 2012 and the first match was played between Kings XI Punjab and Pune Warriors in April 2012. The first 20-20 International match at the stadium was played between India and England in December 2012.";
        title = "MCA Stadium, Pune";
        seatingCapacity = "36,000";
        location = "Pune";
        end1 = "Pavilion End, Pavilion End";
        end2 = "";
        latitude = 18.6744;
        longitude = 73.7064;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venpune));

        about = "The Shaheed Veer Narayan Singh International Cricket Stadium or Raipur International Cricket Stadium is a cricket field in the city of Naya Raipur, Chhattisgarh, India. The stadium has a seating capacity of 65,000. Inaugurated in 2008, this ground hosted its first ever match in 2010, when the Canada national cricket team arrived in India and played a practice match against the Chhattisgarh state team. In 2013, the stadium was declared as a second host venue for Delhi Daredevils in the Indian Premier League (IPL) and hosted two of its matches.";
        title = "Shaheed Veer, Raipur";
        seatingCapacity = "50,000";
        location = "Raipur";
        end1 = "North End, South End";
        end2 = "";
        latitude = 21.2042;
        longitude = 81.8233;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venraipur));

        about = "ACA-VDCA Cricket Stadium formerly Andhra Cricket Association-Vishakapatnam District Cricket Association Cricket Stadium or ACA-VDCA Cricket Stadium is a multi-purpose stadium in Visakhapatnam, India. The picturesque ACA-VDCA ground, set on the outskirts of Visakhapatnam midst scenic hills, has hosted 5 ODI and a T20I so far apart from hosting IPL matches. The stadium has a two-tier architecture and designed in such a way that view of the match in action is not obstructed regardless of the seating location.";
        title = "ACA-VDCA, Visakhapatnam";
        seatingCapacity = "25,000";
        location = "Vishakapatnam";
        end1 = "Vizzy End, DV Subba Rao End";
        end2 = "";
        latitude = 17.7974;
        longitude = 83.3519;
        stadium.add(item(about,title,location,seatingCapacity, end1, end2, latitude, longitude,R.drawable.venvisakhapatnam));

    }


    private HashMap item(String about,String title,String location,String seatingCapacity, String end1, String end2, double latitude, double longitude, int image) {
        HashMap item = new HashMap();
        item.put("about",about);
        item.put("title",title);
        item.put("location",location);
        item.put("seatingCapacity",seatingCapacity);
        item.put("end1",end1);
        item.put("end2",end2);
        item.put("latitude",latitude);
        item.put("longitude",longitude);
        item.put("image", image);

        return item;
    }
}
