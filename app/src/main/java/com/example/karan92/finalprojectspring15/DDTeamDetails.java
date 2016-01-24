package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/18/2015.
 */
public class DDTeamDetails {

    List<Map<String,?>> ddTeam;

    public List<Map<String, ?>> getItemList() {
        return ddTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return ddTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < ddTeam.size()){
            return (HashMap) ddTeam.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public int findFirst(String s){
        List<Map<String, ?>> list = getItemList();
        int size = getSize();
        String ss = s.toLowerCase();
        System.out.println("Title :" +ss);
        int location=0;
        for(int i=0; i<size; i++){
            HashMap<String, ?> movie = (HashMap<String, ?>) list.get(i);
            String name = (String) movie.get("title");
            String lname = name.toLowerCase();
            System.out.println("Title :" +lname);
            if(lname.contains(ss)){
                location = i;
                break;
            }
            else
                location = -1;
        }
        System.out.println("Title :" +location);
        return location;
    }

    public DDTeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        ddTeam = new ArrayList<Map<String,?>>();

        title = "JP Duminy (c)";
        role = "Batting All-rounder";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "South African";
        profile = "An excellent fielder, JP Duminy possesses the ability to bat according to the situation. The experienced campaigner can be just as fluent with big hits as he is with defensive strokes and is also a handy off-spinner. A calm personality, Duminy propelled South Africa to their first ever Test series win in Australia in 2008-09. But after a sensational first season in international cricket, he struggled with his batting – especially against spinners. However, after consistently scoring runs in domestic cricket, Duminy has forced his way back into the South African team. He previously represented the Mumbai Indians, Deccan Chargers and has been part of the Sunrisers Hyderabad squad. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.duminy));

        title = "Mohammed Shami";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm medium";
        nationality = "Indian";
        profile = "Shami’s ability to swing the ball and accuracy has made him a vital cog in the Indian lineup since his debut in 2013. The medium pacer, who made his Ranji Trophy debut for Bengal against Assam in November 2010, was signed up by the Kolkata Knight Riders in 2011. On his ODI debut, in a low-scoring, high-pressure match against Pakistan in Delhi, he returned match-winning figures of 9-4-23-1. He became the first Indian to bowl four or more maiden overs on debut. The pacer who made an impression on India’s tours abroad will be a player to watch out for in IPL 2014. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.shami));

        title = "Quinton de Kock";
        role = "Wicketkeeper batsman";
        bats = "Left-hand bat";
        bowls = "Right-arm offbreak";
        nationality = "South African";
        profile = "The young South African wicket-keeper batsman from Gauteng has evoked excitement ever since he was a schoolboy. For starters, he went to the same school as Graeme Smith and Neil McKenzie and was earmarked for big things like his senior batsmen. He captained the South Africa Under-19 team for a while before being released of the burden to concentrate on his batting. In the 2012 Under-19 World Cup, Quinton emerged his team’s best batsman with 284 runs in six matches at an average of 48.33. Quinton’s biggest T20 stage was the 2012 CLT20 held in his country. His 51 not-out in a match-winning partnership with McKenzie for Lions against Mumbai Indians earned him recognition among the IPL teams. The Sunrisers snapped this talent up at the 2013 IPL Player Auction but was signed on by DD in the 2014 player auction. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.cock));

        title = "Manoj Tiwary";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "This aggressive batsman, who played for the Delhi Daredevils in the first two seasons of the IPL before being traded to the Kolkata Knight Riders in 2010, will be back in the DD jersey in 2014. Tiwary was one of the top three scorers for the Knight Riders during IPL 2011. His good run continued as he struck his maiden ODI century in the five-match series against West Indies at home. He has also led Bengal in the domestic circuit. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mtiwary));

        title = "Kedar Jadhav";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Kedar Jadhav who made his way back into the Delhi Daredevils in 2013 side after spending a couple of years away, was signed up by the franchise in the IPL 2014 auction. The batsman, who was one of the regulars in the DD side in IPL 2013, had a magnificent domestic season. A powerful batsman, he was the leading run-getter in the Ranji Trophy 2013-14 season and played a crucial role in taking his team to the tournament final. The aggressive middle-order batsman scored his maiden triple ton in the Ranji Trophy 2012-13 season, against Uttar Pradesh and was the second highest run-getter for his team in the season. He first caught the eye with a half century on his IPL debut for Delhi Daredevils against Royal Challengers Bangalore in 2010, off just 29 deliveries. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jadhav));

        title = "Mayank Agarwal";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "An attacking batsman by nature, Mayank Agarwal impressed one and all at the Under-19 level. In the IPL, his big moment came when in 2012 he smashed an unbeaten 64 off 30 balls facing the likes of Malinga, Harbhajan and RP Singh. Although RCB lost, Agarwal showed what he’s worth. Thanks to his flamboyant strokes and habit of posting big scores, comparisons were drawn with the mighty Virender Sehwag very early in Agarwal’s career. The Bangalore-based batsman who also represents Karnataka, will be seen in the DD dressing room in 2014. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mayank));

        title = "Shahbaz Nadeem";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "A left-arm spinner with a classical action, Shahbaz Nadeem hails from the Steel City of Bokaro. Unlike most modern-day spinners, Nadeem isn’t afraid to toss the ball up and bait the batsmen. The left-arm spinner, whose dream was to become a fast bowler like childhood idol Wasim Akram, played a decisive role in Delhi Daredevils’ win over Mumbai Indians and Deccan Chargers in IPL 2012. He has been consistently putting up impressive performances in the domestic circuit as well and led Jharkhand. He was signed by the Delhi Daredevils prior to IPL 2011 and bought back in the 2014 Auction. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nadeem));

        title = "Saurabh Tiwary";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "With his long mane and strapping frame, this hard-hitting Ranchi batsman became a familiar face as part of India’s Under-19 World Cup winning team in 2008. But it was IPL 2010 that made Saurabh Tiwary became a household name, when he plundered 419 runs in 16 games. That performance earned him an India ODI cap before RCB snapped him up for USD 1.6 million in the 2011 IPL Player Auction. Since then he has donned the red and gold. However, despite his undoubted prowess of smoldering the cricket ball, the fizz has died out of Tiwary’s bat. He has had a rather quite IPL in the past few seasons. After being part of the Mumbai Indians and RCB, he will now don the DD jersey. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.tiwary));

        title = "Jayant Yadav";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Bought by the Delhi Daredevils ahead of the 2014 edition of the IPL, the Haryana cricketer is set to make his IPL debut in the seventh edition of the tournament. The off-spinner made his first-class debut in 2011. He averages 22.66 from five T20 matches for Haryana and while he is yet to pick a wicket in the limited exposure to T20, he has one five-wicket haul in first-class cricket. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jyadav));

        title = "Imran Tahir";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "South African";
        profile = "A late entrant into the Australian team, Michael Hussey has made a name for himself in a significantly less amount of time. At 38, Hussey is hardly a spring chicken, but the ever-smiling left-handed batsman from Australia never lets age dictate his performance. Hussey started his international career with a real bang, reaching statistical stratosphere in both Tests and ODIs. ‘Mr. Cricket’, as he is affectionately called, was a real honest worker for CSK since IPL 2008. In IPL 2014, this legendary Australian batsman suited up for Mumbai Indians. Hussey became the second batsman to score a century in IPL when he made 116 against Kings XI Punjab in 2008. He was pivotal in CSK winning the IPL and CLT20 in 2010. Hussey’s value to his team isn’t limited to his cricketing skills. With his work ethics and humility he has established himself as a role model for all the younger players around him. In the 2015 Player Auction, CSK bought the Australian batsman back. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.tahir));

        title = "Nathan Coulter-Nile";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm fast";
        nationality = "Australian";
        profile = "Nathan Coulter-Nile is one of the most promising prospects to emerge from Western Australia in recent years. The right-arm pacer is an integral part of the Perth Scorchers’ attack in the Big Bash League and was part of the Mumbai Indians squad in 2013. He will now be representing the Delhi Daredevils. While he’s primarily known for his bowling skills, he can also score crucial runs while batting down the order. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nile));

        title = "Angelo Mathews";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Sri Lankan";
        profile = "Angelo Mathews is one of the most talented cricketers to emerge from Sri Lanka in recent times. This calm all-rounder from Colombo likes to be in the thick of things. As a right-hand middle-order batsman, Mathews keeps the scoreboard ticking, but is also capable of hitting the ball over the fence. He bowls at what can best be termed as a “lively pace” – generally dishing out cutters. His slower bouncers have deceived even the best batsmen. The 25-year-old moves athletically on the field. He represented the Kolkata Knight Riders in the earlier editions of the IPL before joining the now defunct Pune Warriors India. At the Player Auction in 2015, the Sri Lankan all-rounder was bought by DD. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.matthews));

        title = "Yuvraj Singh";
        role = "Batsman";
        bats = "Left-handed";
        bowls = " \tLeft-arm orthodox spin";
        nationality = "Indian";
        profile="Arguably Team India’s best limited-overs all-rounder in recent years, Yuvraj Singh has time and again risen to the occasion on the biggest of stages. From captaining IPL teams and being an integral part of India’s successful 2007 World T20 campaign to helping the Men in Blue lift the 50-over World Cup, Yuvi has achieved it all, and how. Even off the field Yuvraj is a true fighter – a trait best illustrated by his successful battle against cancer. Yuvraj played for Kings XI Punjab and Pune Warriors India in the IPL before being snapped up by RCB in the 2014 Player Auction for a whopping 14 crores. He emerged as the highest paid player in the auction. The all-rounder broke that record at the 2015 Player Auction when he was snapped up by DD for 16 crores. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.yuvraj));


        title = "Amit Mishra";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "Mishra is an orthodox leg-spinner who flights the ball and makes it turn consistently. He was impressive in IPL 2008 when he picked up a hat-trick while playing for the Delhi Daredevils. Mishra has been a consistent wicket-taker in all six editions of the tournament. He has also made several useful contributions in the lower order with his timely cameos. The Sunrisers ensured he was back in their ranks for IPL 2014 by signing him on for INR 4.75 crores during the year’s IPL Player Auction. In the 2015 edition of the auction, Mishra was signed up by Delhi Daredevils. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mishra));


        title = "Jaidev Unadkat";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm medium fast";
        nationality = "Indian";
        profile = "Jaidev Unadkat came into the spotlight when he debuted for the Kolkata Knight Riders in IPL 2010. However, he had already made quite an impression with a match-winning spell of 13 for 103 against West Indies A on first-class debut. Even Wasim Akram thought highly of this left-arm medium pacer. “This young kid is one to watch out for,” the legend had said. After being released by KKR, Unadkat found a taker in RCB at the 2013 Player Auction. He was bought by the Daredevils in the 2014 IPL auction. After plying his skills for RCB in 13 matches in IPL 2013 he was called up in to the India squad. DD released him after IPL 2014 but bought him back at the 2015 Player Auction. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.unadkat));

        title = "Gurinder Sandhu";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Right-arm fast-medium";
        nationality = "Australian";
        profile = "Having impressed for Australia at Under-19 level, well-built quick bowler Gurinder Sandhu burst on to the domestic scene for New South Wales towards the end of the 2013-14 season. The tall fast bowler is the first player of Indian heritage to represent Australia in cricket at any level. Sandhu's height gives him impressive bounce and he can swing the ball both ways, which makes him a more than handful bowler. Delhi Daredevils mentor TA Sekar claims to have followed his career over the last two years and after a lot of positive feedback from friends Down Under has the belief that Sandhu is very good in the shorter format. With Zaheer Khan leading the pace attack for the Daredevils, Sandhu is bound to learn from the wealth of experience on offer. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sandhu));


        title = "Shreyas Iyer";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm off-break";
        nationality = "Indian";
        profile = "A right-handed batsman and a right-arm off break bowler, 20-year old Shreyas Iyer created waves in the 2014-15 Ranji Trophy season for Mumbai. Iyer went into the 2015 IPL Player Auction with a base price of Rs. 10 lakhs but was bid for severely by the Mumbai Indians and Kolkata Knight Riders. Delhi Daredevils, however, managed to rope in the talented batsman for a whopping Rs. 2.6 crore, almost like a reward for his stellar shows of late. Iyer is considered to be a genuine talent and already averages close to 51 in his maiden First-class season. An IPL contract with the Delhi Daredevils with coach Gary Kirsten and his Mumbai coach Pravin Amre for company, Iyer could well use this opportunity to get himself ready for the big stage. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.iyer));


        title = "CM Gautam";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "C Muralidharen Gautam is a wicketkeeper-batsman who plies his trade for Karnataka in domestic cricket. A significant contributor to his state’s success over the last few seasons, he was with the Delhi Daredevils during IPL 2013, where he featured in three games. Sound with the gloves and a consistent scorer with the bat, Gautam was earlier signed by the Royal Challengers Bangalore but did not take the field during his tenure with the Garden City franchise. In IPL 2014, Gautam suited up for Mumbai Indians before being bought by DD in the 2015 Player Auction. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.cmgautam));

        title = "Travis Head";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-break";
        nationality = "Australian";
        profile = "Left-hand batsman Travis Head is one of the brightest batting talents in Australia. Twice named Player of the Championship while representing South Australia at the U-19 National Championships, Head is regarded as one of the most promising young batsman in Australia. He was a stand-out for the National Performance Squad during their 2014 one-day series against Australia A, South Africa A and India A, boasting an average of 43 including two half centuries and his first ever List A hundred. The 21-year old is a clean hitter of the ball and has an aggressive instinct no matter what form of the game he is playing. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.head));

        title = "Srikar Bharat";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "A swing bowler and a very handy batsman, who can fit into a variety of roles, the younger of the Pathan brothers is a gift to any captain or coach. Primarily considered a lower-order batsman, coaches have even used him at the top of the line-up and as a pinch-hitter. His rapid rise to the top and his consistent contributions with bat and ball in the early part of his career led to a lot of comparisons. However, excessive pressure, an unclear role within the team and too many changes to his bowling action resulted in the Baroda all-rounder losing his place in the national side. Injuries only added to his woes. However, after recovering, he was back in the thick of things and was called up to the national side in December 2011. He was with Kings XI Punjab during the first three seasons of the IPL and was the team’s leading wicket-taker. The left-arm pacer has since added a few more variations to his armory. He turned out for the Delhi Daredevils in IPL 2012 and 2013, and played for Sunrisers Hyderabad in IPL 2014. At the Player Auction ahead of the 2015 season, Pathan was bought by CSK. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bharat));


        title = " Albie Morkel";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Right-arm medium fast";
        nationality = "South African";
        profile = "As strong as they come, Johannes Albertus Morkel is an all-rounder of the highest quality. The South African is a powerful left-hand batsman and an accurate right-arm medium pacer. Albie has rich cricketing pedigree and it showed during the first edition of the IPL when he performed admirably scoring 241 runs and taking 17 wickets. A player with the ability to change the game with the bat at any moment, the southpaw can clear any boundary with ease. A predominantly wicket to wicket bowler, Albie can mix it up well in T20 cricket. After plying his trade for Chennai Super Kings until IPL 2013, the South African was bought by RCB at the 2014 Player Auction. In the 2015 edition, he will don the DD colours. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.amorkel));

        title = "Markus Stoinis";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Australian";
        profile = "A top-order batsman and medium pacer from Perth, Marcus Stonis moved to Victoria in 2012 having failed to nail down a place with Western Australia. After struggling to break into Victoria’s side in his first season, Stonis’s move paid dividends in 2013-14 when he scored an impressive 170 against Tasmania in a Sheffield Shield match at the MCG to earn a call-up for Australia A’s winter series in 2014. He scored 58 in a 50-over match against India A in Darwin and took two wickets in two first-class matches against South Africa A in Townsville, underlying his all-round ability. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.stoinis));

        title = "Zaheer Khan";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm medium fast";
        nationality = "Indian";
        profile = "The backbone of India’s pace attack for over a decade, Zaheer Khan is one of the best left-arm seamers produced by this country. The 34-year-old, who started out as a tear-away fast bowler, reinvented himself after several bouts with injuries. To the chagrin of batsmen around the world, he returned smarter, wiser and with more tricks in his bag – the reverse swing being the most lethal of the lot. The finest moment of Zaheer’s limited overs international career was when he won India the 2011 World Cup as the team’s highest wicket-taker. In IPL, Zaheer played for RCB in the inaugural season before moving to Mumbai Indians for two seasons. The Bangalore franchise bought him back in the 2011 IPL Player Auction and then MI took him back. In IPL 2015, the veteran pacer will don the Daredevils colours. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.zaheer));


        title = "KK Jiyas";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm chinaman";
        nationality = "Indian";
        profile = "KK Jiyaz is a slow left-arm Chinaman and will be making his IPL debut for the Delhi Daredevils this year. He was brought by the franchise for a base price of 10 lakhs. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jiyas));


        title = "Domnic Joseph";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "From manufacturing bullets to playing cricket, Dominic Muthuswami from Maharashtra has come a long way. His is a fascinating tale of how he took up a regular day job to support his family and shunned his passion of playing cricket only to return and play the sport he loved the most. Today the 33-years old Dominic is a regular for Maharashtra in the Ranji Trophy after first being picked for his raw ability in 2011. He picked up 22 wickets in seven matches with an average of 20 in the 2014-15 Ranji Trophy season and was one of the pacers who impressed many in the Maharshtra bowling attack. But his IPL ticket was in the works for some time. Following the conclusion of the Vijay Hazare Trophy in November 2014, he was called to Delhi for trials conducted by the Delhi Daredevils and left TA Sekhar and Pravin Amre impressed. He was roped in by the Delhi Daredevils this year for a whopping sum of Rs. 75 lakhs. ";
        ddTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.joseph));

        List<VideoEntry> list = new ArrayList<VideoEntry>();
        list.add(new VideoEntry("CSK - We are Thankful ", "0qjoDUMrwNI"));
        list.add(new VideoEntry("CSK Fours", "H8Z6e8T6ZiE"));
        list.add(new VideoEntry("Birthday celebration CSK ", "qje-3Fqh3zk"));
        list.add(new VideoEntry("CSK practice session ", "NhDOf3lj26s"));
        list.add(new VideoEntry("CSK - The Ultimate Winner", "h8wz9bI631E"));
        list.add(new VideoEntry("CSK - Veeram Style ", "3M0BJPrbpoU"));
        list.add(new VideoEntry("Final - Turning Point", "x5p5mixRzS0"));
        list.add(new VideoEntry("IPL 2010 Final: Best of Suresh Raina ", "_wEKzJFUUkA"));
        list.add(new VideoEntry("Dedicated to Raina", "aY76eXaPGVk"));
        list.add(new VideoEntry("Super Sixes", "BbQIGnRODvQ"));
        list.add(new VideoEntry("CSK vs RCB Highlights", "3dt4hZ6zM8I"));
        VIDEO_LIST = Collections.unmodifiableList(list);
    }


    private HashMap item(String title,String role,String bats,String bowls,String nationality,String profile, int image) {
        HashMap item = new HashMap();
        item.put("title",title);
        item.put("image", image);
        item.put("role",role);
        item.put("bats",bats);
        item.put("bowls",bowls);
        item.put("nationality",nationality);
        item.put("profile",profile);
        return item;
    }

}
