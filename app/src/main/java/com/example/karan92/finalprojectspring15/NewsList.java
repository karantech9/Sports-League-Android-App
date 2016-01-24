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

        title ="Super Marsh beats RR, eyes CSK";
        place = "Punjab";
        date = "04/22/2015";
        details ="Fantastic! As Shaun Marsh said, was the apt word to describe Kings XI Punjab’s win over the Rajasthan Royals in the Super Over at the Sardar Patel Stadium in Motera. Also fantastic was the way the Australian batsman himself batted; firstly while piloting the run-chase with a 40-ball 65 that took the game into the Super Over, and then again when he took on Chris Morris in the Super Over itself to set the hosts a 16-run target. Playing his first match of the Pepsi IPL 2015, Marsh’s both knocks were crucial in handing the Shane Watson-led side their first defeat of the season. Pleased with his own performance after the thrilling win, Marsh told iplt20.com that the victory would be a big boost to the team’s confidence as they move forward in the tournament. We sort of had no choice but to continue on and play really positively while chasing a decent total. Me and Davy (David Miller) in the middle, we knew that we were just one or two big overs away to get back in the mix and we did that. Davy did that and carried on and batted fantastically after I got out. To get to a Super Over was fantastic and I guess anything can happen. But we were lucky enough, we obviously got over the line (and) we are a happy team at the moment. We have got lot of confidence in our tail. They can all play good cricket. They are all really good batters; so that’s wasn’t an issue. We just had to keep going, I think the run rate got to 13 (runs per over) so we just had no choice but to take the game on and try and get as close as we could. We always knew that, and like I said we were only a few big overs away and then we were back in the game. It worked out well to get a four off the last ball, get a Super Over and it was just fantastic! ";
        newsList.add(item(title,place,date,details,R.drawable.smarsh));

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

        title ="I was confident Shreyas can open: Amre";
        place = "Delhi";
        date = "04/23/2015";
        details ="Chants of ‘Delhi Delhi’ echoed at the Ferozeshah Kotla Stadium as the Delhi Daredevils cantered to a comprehensive win over the Mumbai Indians and ended their nine-match losing streak at their home ground. The player who led them to the momentous win was the 20-year old Shreyas Iyer. In his first season playing in the Indian Premier League, the youngster from Mumbai, who was contributing vital runs in the previous matches too, converted his innings into a match-winning performance. The performance came on the back of a lot of painstaking work put in by both - the lad and his coach. Instrumental in Iyer’s success is DD’s assistant coach, Pravin Amre, who has been grooming him since he was a 13-year old. I really wanted Shreyas to do well simply because he has never opened before. I had that confidence that he can open in this particular format and so I convinced my head coach that he will do the job for our team. I was really happy because I got the opportunity to take on the bowlers. It was difficult at the start to face the new bowlers, but I am always up for challenges.";
        newsList.add(item(title,place,date,details,R.drawable.iyer));


        title ="When Bhuvi & Co. reigned supreme";
        place = "Hyderabad";
        date = "04/23/2015";
        details ="Over number ten, 37 runs are required from 18 balls. Bhuvneshwar Kumar is handed the ball. David Warner wants one of Manish Pandey or Yusuf Pathan to take the walk back to the pavilion. Bhuvneshwar Kumar marked his run up, let off a huge breath and geared himself to bowl. At the end of six deliveries, he had given away just five runs. Kumar walked back to his fielding position at the boundary ropes and got a huge cheer for his commendable effort with the ball. He wants to wave to the crowd and acknowledge their applause but a job at hand makes him refrain from doing so. He then watched his bowling idol Praveen Kumar bowl a champion penultimate over giving away just seven runs. Kumar had 25 runs to defend in the final over and as he walked back to bowl the final over, he had confidence beaming in his eyes. He knew the job had been done and the Sunrisers’ first win at home was on the cards. It went according to script and in the end the home team registered a win by 16 runs in a rain curtailed match. The crowd at Visakhapatham was caught in a frenzy, David Warner had an aggressive fist pump; he knew the value of the win and Bhuvneshwar Kumar walked back with loads of pats on the back and a sense of appreciation from his captain and coach. It was indeed job well done. Here’s Bhuvneshwar Kumar talking about nerves, his idol Praveen Kumar and his side’s first victory at Vizag in a chat with iplt20.com. Yes, it gives immense pleasure to have sealed a win at Vizag. The crowd has been really supportive. When you play your games at home, you would want such backing and support from the crowd. Going into the game we hadn’t won anything here and in a way we wanted to end Vizag on a high. It is always important to win home games and it is wins like these that boost the morale of the team to go ahead and qualify in the top four. We just wanted to win our final game desperately and I am happy we could do that. This win will give us good momentum in the games to come. ";
        newsList.add(item(title,place,date,details,R.drawable.bkumar));



        title ="Surf’s the way for Kane";
        place = "Hyderabad";
        date = "04/23/2015";
        details ="There is something very welcoming about Visakhapatnam. You are greeted with the broadest of smiles and treated to some pristine clear beaches. Drives to the stadium or the nearest sightseeing spots are at most times accompanied by the sea on your side with a gentle breeze bowling across your face. It is a tourist’s delight and one can truly discover their love for the water with a short trip to Vizag. Kiwi top order batsman and Sunrisers Hyderabad’s latest recruit young Kane Williamson will vouch for that. After all he along with his teammates, Dale Steyn and Trent Boult to name a few, have been hitting the coast of Rushikonda (considered one amongst the best beaches in Andhra Pradesh) during their free time for a calm session of surfing. Giving him good company with the surfboard is fast bowler Dale Steyn. Steyn is no stranger to thrill and adventure. In fact, Williamson says it was Steyn and the local staff here who did a bit of a research on the places where you could go surfboarding. It is a good opportunity to get away and take a mental break from cricket for a day. There has been such a huge volume of cricket of late that it is good to find a bit of balance by getting away from the game and doing activities. It is just something that I enjoy doing along with Trent and a few other guys in our spare time if we can. We don’t always have that luxury. So it is good to do a bit of surfing in our time off and just relax. Not just surfing, we have been doing some team activities as well like quizzes and team bonding meetings. The boys are having a good time and if we can keep that positive energy and take it to the pitch, nothing like it.";
        newsList.add(item(title,place,date,details,R.drawable.kwilliamson));



        title = "Need to hit the ground running: Watson";
        place = "Jaipur";
        date = "04/22/2015";
        details =" The Rajasthan Royals, who have often been referred to as ‘underdogs’ and are often seen punching above their weights, will this time around sport a star-studded line-up, including players from the 2015 ICC World Cup winning team. Leading the way will be captain Shane Watson, besides James Faulkner and Steven Smith. One of their key batsmen, Ajinkya Rahane has also earned immense respect on the international circuit. Amongst others, they have Tim Southee, who featured in the New Zealand side that finished runner-up in World Cup 2015. In his interaction with the media ahead of the Pepsi Indian Premier League 2015, the RR captain was asked if the rise in expectations from his team added to the pressure. “I don’t think it adds more pressure. I think it’s just very exciting. In the squad that we have got this IPL season, we have match-winners all the way, more than in the past. We have world-class match-winners as well,” he explained. “The most important thing in the IPL is to get off to a good start and we know we have to hit the ground running. But we know we have the players capable of doing that.The RR captain explained that the team was bustling with energy and all geared for the season. “We have players from the team that won the World Cup here. After enjoying the week that we spent at home celebrating (the success in the World Cup), we are all ready and fresh to go at the IPL,” he mentioned.Speaking about the team’s line-up, mentor Rahul Dravid said, “We have a good team. It is well balanced. We have batsmen batting as low as No. 7 and 8. We have all-rounders in the line-up like James Faulkner, Shane Watson. We also have Dhawal Kulkarni in the team. So we have a balanced team but at the same time I will say that all eight teams are good. There are one or two areas that all can improve on or are critical areas, but all teams are good. But even if you have a good team you have to play well as well. They are high-pressure, high-intensity games and the team that does well in those close situations wins more matches in this tournament. We are very happy with our team but we do know that whoever we play against will also be a good team.”When asked about the team’s batting order, Watson maintained the team’s plans close to his chest. “It’s something I will sit and talk with everyone, the coaching staff and the group and do what works well for us. I have my own thoughts and (I would like to) let the other guys share theirs as well. We will try and get the best results. We are incredibly lucky to have some of the best batsmen in our squad.””";
        newsList.add(item(title,place,date,details,R.drawable.news_watson));


        title ="Starc keen to turn RCB’s fortunes around";
        place = "Punjab";
        date = "04/21/2015";
        details ="Royal Challengers Bangalore have had a tough time at home so far in Pepsi IPL 2015. They have lost both their home games, allowing Sunrisers Hyderabad and Mumbai Indians to take away two points from their respective matches. Ahead of their third home game, against Chennai Super Kings, the RCB camp was boosted by the arrival of Mitchell Starc. Australia’s World Cup hero was sidelined right after winning the cup with a knee injury, forcing him to miss the initial part of the IPL. A day after joining his IPL team Starc said he looked forward to playing cricket again and changing his team’s fortunes. Their last loss, against MI, in particular, exposed the chinks in RCB’s bowling attack. Now, as they face one of their toughest opponents in the tournament, RCB’s bowling has received a shot in the arm. Starc was a revelation in the World Cup, ending it as the tournament’s highest wicket-taker. His pace accompanied by the ability to swing the ball did many a batsman in. He credited this success over the last 12 months to the work he put in with Australia’s bowling coach, Craig McDermott.";
        newsList.add(item(title,place,date,details,R.drawable.mstarc));



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
