package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/21/2015.
 */
public class NewsList {

    List<Map<String,?>> newsList;

    public List<Map<String, ?>> getItemList() {
        return newsList;
    }

    public int getSize(){
        return newsList.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < newsList.size()){
            return (HashMap) newsList.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public NewsList(){
        String title;
        String details;
        String place;
        String date;
        newsList = new ArrayList<Map<String,?>>();

        title = "Want to improve my finishing skills: Anderson";
        place = "Mumbai";
        date = "04/23/2015";
        details ="Corey Anderson has spent the last year or so striving to be the best finisher for his team. He has been drafted into this role by New Zealand and his IPL franchise, Mumbai Indians. Although in Pepsi IPL 2015, Anderson has played the role of a pivot for MI due to their non-firing top-order. And he has adapted well to this fickle role, as reflected in his two fifty-plus scores in three matches so far. Even as MI slipped to their third defeat in a row, against Rajasthan Royals, Anderson played his part admirably with a 38-ball fifty. Most of those runs came in his 104-run partnership with Kieron Pollard (70 off 34 balls) and together the two ball-bashers took MI from a precarious 45 for 3 to 164 for 5. The total was not a winning one but Anderson had been good with the bat. With the regular top-order collapses in the MI batting, the New Zealander has been left to balance the art of consolidating and finishing. In a chat with iplt20.com after MI’s seven-wicket defeat at the hands of the Royals, Anderson spoke about his own batting form and expressed his intention of developing into a batsman who takes his team home with smart power-hitting. He also conveyed his joy at seeing more and more New Zealand players doing well in the IPL.";
        newsList.add(item(title,place,date,details,R.drawable.news_anderson));


        title = "Need to hit the ground running: Watson";
        place = "Jaipur";
        date = "04/22/2015";
        details =" The Rajasthan Royals, who have often been referred to as ‘underdogs’ and are often seen punching above their weights, will this time around sport a star-studded line-up, including players from the 2015 ICC World Cup winning team. Leading the way will be captain Shane Watson, besides James Faulkner and Steven Smith. One of their key batsmen, Ajinkya Rahane has also earned immense respect on the international circuit. Amongst others, they have Tim Southee, who featured in the New Zealand side that finished runner-up in World Cup 2015. In his interaction with the media ahead of the Pepsi Indian Premier League 2015, the RR captain was asked if the rise in expectations from his team added to the pressure. “I don’t think it adds more pressure. I think it’s just very exciting. In the squad that we have got this IPL season, we have match-winners all the way, more than in the past. We have world-class match-winners as well,” he explained. “The most important thing in the IPL is to get off to a good start and we know we have to hit the ground running. But we know we have the players capable of doing that.The RR captain explained that the team was bustling with energy and all geared for the season. “We have players from the team that won the World Cup here. After enjoying the week that we spent at home celebrating (the success in the World Cup), we are all ready and fresh to go at the IPL,” he mentioned.Speaking about the team’s line-up, mentor Rahul Dravid said, “We have a good team. It is well balanced. We have batsmen batting as low as No. 7 and 8. We have all-rounders in the line-up like James Faulkner, Shane Watson. We also have Dhawal Kulkarni in the team. So we have a balanced team but at the same time I will say that all eight teams are good. There are one or two areas that all can improve on or are critical areas, but all teams are good. But even if you have a good team you have to play well as well. They are high-pressure, high-intensity games and the team that does well in those close situations wins more matches in this tournament. We are very happy with our team but we do know that whoever we play against will also be a good team.”When asked about the team’s batting order, Watson maintained the team’s plans close to his chest. “It’s something I will sit and talk with everyone, the coaching staff and the group and do what works well for us. I have my own thoughts and (I would like to) let the other guys share theirs as well. We will try and get the best results. We are incredibly lucky to have some of the best batsmen in our squad.””";
        newsList.add(item(title,place,date,details,R.drawable.news_watson));

        title = "Sunday's knock was long overdue, thanks supporters: Unmukt";
        place = "Mumbai";
        date = "04/18/2015";
        details ="The Indian Premier League wasnt a happy-hunting territory for Indias Under-19 World Cup winning captain, Unmukt Chand, until Sunday. Before the game against RCB in Bengaluru, Chand had played 15 IPL matches spread over five seasons without a significant score to his name.In Pepsi IPL 2015, donning the Mumbai Indians jersey, he played one match before being dropped for the next and then picked again. And this time, the young batsman was determined to make it count. And so he did, with an innings of 58 from 37 balls that helped MI to a total of 209 and eventually their first win of the tournament.After MI\u0092s 18-run win over RCB, Chand told iplt20.com how relieved he was to finally set the ball rolling in his IPL career. He also gave an insight into the coaching style of Ricky Ponting. When we first saw the wicket we thought it was quick and there would be something for the fast bowler. But when I walked there and bowled the first ball, I realised that it is not the kind of wicket that we thought it would be. I am a fast bowler and I have the ability to swing, so I was trying to bowl on the length only. I was just trying to swing the ball for first two-three overs and get wickets. And I got the first wicket (in the very first over). Every time I came back to bowl my thoughts were to get wickets and give the team breakthroughs. ";
        newsList.add(item(title,place,date,details,R.drawable.news_unmukt));

        title = "Sunrisers look to take significant strides";
        place = "Hydrabad";
        date = "04/20/2015";
        details ="Just a couple of days ago, the Sunrisers Hyderabad put up a stellar performance against the Royal Challengers Bangalore in an away fixture. They handed RCB an 8-wicket thrashing owing to a confident batting display from openers Shikhar Dhawan and David Warner and middle-order batsman KL Rahul, and chased down 167 with 16 balls to spare. For SRH coach Tom Moody, it was heartening to see young Rahul rise up to the occasion. “KL’s (KL Rahul’s) innings in the last match was a very good innings. He showed the quality that he possesses as a young aspiring player,” Moody said. “We have a lot of confidence and faith in his capabilities. We are hoping that the last game is the beginning of an exciting tournament for him.”With a win and some good performances under their belt, the team now moves to Visakhapatnam to play their first home game of the season. The Sunrisers play three games here over the week, something that will help them gain momentum going forward according to Moody. “After a successful game against the Royal Challengers Bangalore we have taken a lot of confidence from that performance. We are very much looking forward to playing here in Vizag. We have had a couple of warm-up games at this venue; it is a terrific venue in itself. To get three games in a row here is going to be great. We are hoping that tomorrow night is going to be the beginning of some good momentum at home. “ So will the three games at home help the side in building momentum? Moody agreed. “We have got a little window now where we have got three games after coming off a really positive win against Royal Challengers Bangalore. We can consolidate on that performance and having three in the same venue over a short period of time is a healthy situation for us. So, we are looking forward to it. We have seen in any tournament how important momentum is. It is a word that is used a lot in sport and I think it is used frequently because it is important.”";
        newsList.add(item(title,place,date,details,R.drawable.news_sun));

        title = "Difficult to bowl to Glenn Maxwell: Umesh Yadav";
        place = "Punjab";
        date = "04/19/2015";
        details ="The Kolkata Knight Riders cantered to a comprehensive win but it wasn’t a smooth ride all the way. The defending champions were left reeling at 60 for five chasing the 156-run target before Andre Russell and Yusuf Pathan took them over the finish line. However, it was courtesy the Umesh Yadav-led attack, that KKR didn’t have a mountainous task to overcome. While the spinners kept the Kings XI Punjab batsmen in check after Gautam Gambhir had elected to bowl, the pace trio of Yadav and co. had applied the brakes with some key wickets. Umesh Yadav claimed Murali Vijay upfront and the explosive Glenn Maxwell, besides later sending back Gurkeerat Singh Mann to keep the hosts to a reasonable score. Speaking to iplt20.com, the pacer spoke about drawing on the experience from being with the Indian team, bowling with Morne Morkel and learning from Wasim Akram. It is difficult to bowl to him because when he comes to bat he just moves too much from the wicket, sometimes to the off-side or sometimes to the leg-side. So it is difficult to bowl to him. But I knew and I was confident that when he moves I will not follow him but I will just I keep at the wicket only. So my target was to bowl at the three stumps only so whenever he is going down the leg I am bowling at the wicket. And when he came towards the off-stump I was trying to vary the deliveries, bowl a slower one or yorker, whichever is required. So I bowled the slower ball and got him. That’s the variation, because there wasn’t much in the wicket if you didn’t get the yorker perfect you would get hit for a six. The wicket was flat and good for batting. The ball was coming on to the bat nicely; so whatever variations I had I backed myself to bowl one length and one area.  ";
        newsList.add(item(title,place,date,details,R.drawable.news_umesh));

        title = "See the ball not the bowler: Deepak Hooda";
        place = "Delhi";
        date = "04/21/2015";
        details ="While James Faulkner’s 33-ball 46 was pertinent to Rajasthan Royals’ setting Kings XI Punjab a stiff target, debutant Deepak Hooda’s 15-ball 30 proved to be equally crucial in the team getting off to a winning start in the Pepsi Indian Premier League 2015. After RR were reduced to 75 for five, Hooda and Faulkner added 51 runs for the sixth wicket to revive the innings.Speaking about the partnership, Hooda said, “The only thing we were talking about was that if the ball is in our range then we will hit it. If not then we (decided that we) will take ones and twos and keep rotating the strike. So I kept playing my normal game. So what I thought was in my range, I hit it. Discussing the game and what would have been a good score, Hooda mentioned, “175 would have been a decent score and that was what Faulkner and I were looking to get. But we couldn’t. But our bowlers bowled really well.”When asked if they had decided that he would go after the bowlers while Faulkner rotated the strike, Hooda who had struck three sixes and a boundary before returning to the dug-out replied, “No, there was no discussion like that. It was just that (we decided) if it’s in the range we will go hit it. Luckily I got the loose balls and I hit them. Although he made a vital contribution to the side, Hooda said he could have done a little better. “I could have (stayed on till the end) and finished (the game).”Reflecting on the match and the notes he could take away from the match, Hooda said, “Positive attitude (is what he would take from the game) and now I will not get nervous. When I went in to bat I was nervous a bit. (Mitchell) Johnson was bowling, but then (later on) I was okay. So what was he thinking when he came out to bat in an over which Johnson claimed two wickets, “Nothing much, just that if it’s in the range I will play.” See the ball not the bowler,” is what the batsman says he keeps in mind while batting. Hooda, who finished on the winning side in his first IPL game, said he was told that he would be making his debut the day before the match, “Yesterday, after practice I came to know that I would be playing today. Paddy Upton and Rahul (Dravid) sir came and told me that. So I was very excited to play. Last season I was on the bench. So I was also eagerly waiting to play. Speaking about his preparation leading up to the tournament he said, “It was good because Rajasthan Royals held several camps. Even before the main camp there were a few other camps and I attended all of them.";
        newsList.add(item(title,place,date,details,R.drawable.news_deepak));



    }
    private HashMap item(String title,String place, String date, String details,int image) {
        HashMap item = new HashMap();
        item.put("title",title);
        item.put("image", image);
        item.put("details", details);
        item.put("place",place);
        item.put("date",date);
        return item;
    }
}
