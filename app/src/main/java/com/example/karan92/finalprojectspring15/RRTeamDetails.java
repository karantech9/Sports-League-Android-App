package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/22/2015.
 */
public class RRTeamDetails {


    List<Map<String,?>> rrTeam;

    public List<Map<String, ?>> getItemList() {
        return rrTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return rrTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < rrTeam.size()){
            return (HashMap) rrTeam.get(i);
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

    public RRTeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        rrTeam = new ArrayList<Map<String,?>>();


        title = "Shane Watson (c)";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Australian";
        profile = "Watson’s relationship with the Rajasthan Royals dates back to IPL 2008 which also helped him make an improbable comeback to international cricket. After being sidelined due to injuries, Watson decided to join the Royals and emerged the Player of the Tournament in the first edition of the tournament. Also known as ‘Watto’, he is an attacking batsman with a solid defense. An athletic fielder and a medium-pacer he can swing the ball and pick up useful wickets. The all-rounder has always played a crucial role in the Rajasthan Royals’ fortunes and in the absence of Rahul Dravid on the field he will play an even greater role in 2014 as the captain of the team. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.swatson));

        title = "Stuart Binny";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "An all-rounder, Stuart Binny has played a crucial role in RR’s fortunes, especially in the 2013 season. Primarily a hard-hitting batsman, he has proved that he has the temperament, technique and survival skills to suit all formats of the game. A right-hand batsman and medium-pacer from Karnataka, Stuart also has the experience of leading his state side in the domestic circuit. Along with being the leading run-scorer for Karnataka in 2011-12, Binny also claimed his maiden 10-wicket haul in first-class cricket during the season. He carried his form into the IPL 2013 which led to a call-up into the national side as well. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sbinny));


        title = "James Faulkner";
        role = "All-rounder";
        bats = "Right-hand bat";
        bowls = "Left-arm medium fast";
        nationality = "Australian";
        profile = "The Tasmanian all-rounder has the ability to change the game around with the bat or the ball. Having earned the reputation of winning games from improbable situations for Australia, the left-arm pacer has consistently picked up key wickets too. Also known as ‘Jimmy’, he is said to be a lively character and keeps the spirits up in the dressing room. He was part of the Pune Warriors India set-up in IPL 2011, and turned out for the Kings XI Punjab in IPL 2012 before being inducted into the Rajasthan Royals since IPL 2013.";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jfaulkner));

        title = "Ajinkya Rahane";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A solid opening batsman when he first began, Ajinkya Rahane now bats at No.3 for Mumbai and in the middle-order for India. The 25-year old continues to open for his IPL franchise and is the mainstay of their batting lineup. Changing batting positions hasn’t affected Rahane one bit, and he still goes about piling big scores on a regular basis for the various teams that he represents. With a solid technique and sound temperament, he proved his mettle at the international stage on India’s tours to South Africa and New Zealand recently. After being the leading run-getter for RR in IPL 2012, he was the highest run-getter in CLT20 2013. He also hit an unbeaten century in the shortest format of the game. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.arahane));

        title = "Sanju Samson (wk)";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Sanju Samson is one of the backup wicketkeeper-batsmen for the Rajasthan Royals. The youngster, who represents Kerala in domestic cricket, scored prolifically for the national Under-19 side in the 2013-14 season. He posted a vital century in the U19 Asia Cup in January 2014 against Pakistan. Batting in the middle-order he has shown the temperament to adapt to various situations and conditions. His performances in IPL and CLT20 2013 meant that he was retained by the Rajasthan Royals ahead of the 2014 auctions. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ssamson));

        title = "Rajat Bhatia";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "Inducted into the RR side in the 2014 season, Rajat Bhatia adds to the list of all-rounders in the team from Jaipur. Representing Delhi in the domestic circuit, Bhatia has also played for Tamil Nadu with distinction. Besides claiming over 5,000 runs and 100 wickets in first-class cricket, Bhatia also has a unbeaten century against his name in the shortest format of the game. Formerly representing the Kolkata Knight Riders, Bhatia’s experience and ability to read the game will come in handy for the Royals franchise. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rbhatia));

        title = "Tim Southee";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "New Zealander";
        profile = "The New Zealand fast bowler will be making his IPL debut in 2014 when he dons the RR blues in the seventh edition of the tournament. The spearhead of the Blackcaps’ attack had the Indian batsmen on a tight leash during India’s tour to NZ earlier in 2014. With the ability to combine pace and swing, he is a lethal weapon in any team’s armoury. Southee, who has proven his skills with both red and white balls, is useful with the bat as well. A consistent performer for his country, Southee has received high praise from Allan Donald. He will be one to watch out for in IPL 2014. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.tsouthee));

        title = "Dhawal Kulkarni";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "Dhawal Kulkarni’s medium pace has been a big hit ever since he arrived on the domestic scene in 2008. He is the kind of bowler who depends on seam movement and swing rather than raw pace. Kulkarni made a name for himself in IPL 2008 by claiming 11 wickets. Learning the nuances of seam bowling from Mumbai Indians mentor Shaun Pollock, Kulkarni became the leading wicket-taker in the Ranji Trophy in 2008-09. The pace bowler has received call-ups to the national side but is yet to receive the cap. In an unfortunate turn of events he was ruled out due to injury after being named in the squad for the ODIs against West Indies in 2013. The former Mumbai Indians player, who also missed out on the latter half of the Ranji Trophy 2013-14, will be keen to take the field in IPL 2014 for the Rajasthan Royals. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dkulkarni));

        title = "Abhishek Nayar";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Right-arm mediu";
        nationality = "Indian";
        profile = "Abhishek Nayar, a Mumbai lad, recently received the Lala Amarnath Award, given to the best all-rounder of India’s domestic season, for his fine performance in the 2012-13 Ranji Trophy. With an ability to give his team breakthroughs at crucial junctures and piling runs on the board, Nayar was Mumbai’s go to man in the season. A hard-hitting left-hand batsman and a handy right-arm medium-pacer, he played for the Mumbai Indians in the first three seasons of the IPL. He was then roped in by the Kings XI Punjab in 2011 and then by the Pune Warriors India at the 2013 IPL Player Auction for USD 675,000, which was the highest bid for an Indian player at the event. In the 2014 season he was bagged by the Rajasthan Royals. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.anayar));

        title = "Kane Richardson";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Australian";
        profile = "23-year-old Kane Richardson is another one of several young talented pacers to emerge from Australia in recent times. This South Australia native made his first-class debut during the 2010-11 season and has represented the Adelaide Strikers in the Big Bash League. Signed by the Pune Warriors India for IPL 2013, he had the opportunity to sharpen his skills with the legendary Allan Donald. Inducted into the RR side in the 2014 auction, he will be looking to put his best foot forward for the Jaipur franchise. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.krich));

        title = "Ben Cutting";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Australian";
        profile = "The Australian fast bowler was bought by the Rajasthan Royals in the 2014 IPL auction. The paceman who made his international debut in January 2013, will be looking forward to his IPL debut in the seventh edition of the tournament. The quick bowler has the ability to rattle the batsman with his bouncers and can add useful runs with the bat. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bcutting));

        title = "Karun Nair";
        role = "Batting All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "This Rajasthan-born batsman, who bats for Karnataka in the domestic circuit, was bought by the Rajasthan Royals ahead of the 2014 season. A technically sound right-handed batsman with a good temperament, Nair represented the Royal Challengers Bangalore in IPL 2012. The batsman scored three centuries from six matches for Karnataka in the Ranji Trophy 2013-14 season, including a sparkling 151 not out in the semi-final. The middle-order batsman will strengthen the RR batting lineup. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.knair));

        title = "Deepak Hooda";
        role = "Bowling All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile="A key performer for the India Under 19 side in recent times, Deepak Hooda will be making his Indian Premier League debut with the Rajasthan Royals. The off-spinner was born in Rohtak, Haryana but plays his domestic cricket for Baroda. He claimed five for 41 in India U19s’ opening match of the ICC CWC 2014 to bowl the team to victory. He has also represented his state side in the shortest format of the game. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dhooda));


        title = "Dishant Yagnik";
        role = "Wicketkeeper batsman";
        bats = "Left-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A wicketkeeper-batsman from Rajasthan, Yagnik made his first-class debut in 2004-05, but fell out of the selectors’ radar thereafter. However, after three seasons in the wilderness, Yagnik was recalled to the Rajasthan team and scored his maiden century in the Ranji Trophy. In Twenty20 cricket, Yagnik has been effective as an opening batsman. A lively character, he has also batted for RR in the middle-order and will continue with the Jaipur franchise. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dyagnik));

        title = "Vikramjeet Malik";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Vikramjeet Malik is a right-arm medium pacer who plays for Himachal Pradesh. Although he has been playing domestic cricket for a decade now, it was only a couple of seasons ago that he got noticed. In the 2009-10 season, he picked up 32 wickets from seven matches and finished among the top four bowlers in the Ranji Trophy. He was part of Kings XI Punjab since IPL 2008 and signed up with Rajasthan Royals in 2013. The Jaipur franchise bought back ahead of the 2014 season. With figures of 4-0-24-3 in the CLT20 2013 opening game against the Mumbai Indians, Vikramjeet Malik made his mark in the shortest format of the game. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vmallik));

        title = "Ankit Sharma";
        role = "Bowling All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "A left-arm orthodox spinner from Gwalior, Sharma plies his skills for Madhya Pradesh in India’s domestic circuit. Primarily a left-arm spinner, Sharma has also made useful contributions with the bat at the No. 8 spot. After playing for the Deccan Chargers since IPL 2011 he was with the Sunrisers Hyderabad before being bagged by the Rajasthan Royals ahead of the 2014 season. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.asharma));


        title = "Rahul Tewatia";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "The right-arm spinner from Haryana has represented his state side in one first-class match and also plies his skills at club cricket for ONGC. He was bought by RR in the 2014 IPL Auction and will be playing in the league for the first time. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rtewatia));

        title = "Pravin Tambe";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "The 42-year-old spin all-rounder who has been plying his skills in the maidens of Mumbai became a sensation when he turned out for Rajasthan Royals in the 2013 season of the Indian Premier League. With 12 wickets from five matches he bagged the Golden Wicket award in CLT20 2013. From captaining the DY Patil Sports Academy B team in Navi Mumbai, he received a call up to the Mumbai Ranji team after making waves in T20. The club cricket veteran is a highly-regarded leg-spinner and a useful middle-order batsman. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ptambe));


        title = "Chris Morris";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "South African";
        profile = "On Feb 3, 2013, Chris Morris’ life changed forever when CSK shelled out USD 625,000 to secure his all-round services at the 2013 IPL Player Auction. A bowler capable of generating disconcerting pace and someone who can hit the ball hard, the 25 year-old played a crucial role in propelling the Highveld Lions to the CLT20 final in 2012. He caught the eye of the think-tank at CSK and Mumbai Indians during the tournament in South Africa, which resulted in frantic bidding for him between the two franchises starting from his base price of USD 20,000. CSK won the bid and had him for the 2014 season. MI struck back and snapped him in the 2015 Player Auction. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.cmorris));


        title = "Dinesh Salunkhe";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Leg-spin";
        nationality = "Indian";
        profile = "A senior cricketer from Mumbai, Dinesh Salunkhe is set to make his IPL comeback with Rajasthan Royals. The bowling all-rounder was inducted into the Royals' squad by Shane Warne in 2008. He had received high praise from the legendary leg-spinner for his performances. At 32, Salunkhe will be keen to make his mark again in the circuit. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dsalunkhe));

        title = "Juan Theron";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "South African";
        profile = "A right-arm fast bowler who plays his domestic cricket for South Africa’s Warriors and Eastern Province, Theron is known for his controlled spells during the death overs. The 27-year-old’s remarkable ability to contain the opposition with yorkers when it matters most helped take the Warriors to the final of the 2010 CLT20. He has also represented South Africa in one-day and Twenty20 cricket. He was part of Kings XI Punjab team in IPL 2010 before moving south to Deccan Chargers in IPL 2012. In the 2015 Player Auction, MI bought the South African pacer. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jtheron));


        title = "Pradeep Sahu";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Leg-spin";
        nationality = "Indian";
        profile = "The 29-year old from Haryana has been plying his skills in domestic cricket since 2002-03 season. He first played the shortest format of the game in 2009 but has not represented his state in the format since 2011. Picked by RR in the 2015 auction, Sahu is set to make his IPL debut in the forthcoming edition of the tournament. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.psahu));


        title = "Barinder Saran";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm spin";
        nationality = "Indian";
        profile = "Bought by the Jaipur based franchise in the 2015 auction, the left-arm spinner from Punjab will be donning the RR jersey in the eighth edition of the Indian Premier League. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bsaran));

        title = "Sagar Trivedi";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm spin";
        nationality = "Indian";
        profile = "Bought by the Jaipur based franchise in the 2015 auction, the left-arm spinner from Punjab will be donning the RR jersey in the eighth edition of the Indian Premier League. ";
        rrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.strivedi));


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
