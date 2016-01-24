package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/20/2015.
 */
public class KKRTeamDetails {
    List<Map<String,?>> kkrTeam;

    public List<Map<String, ?>> getItemList() {
        return kkrTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return kkrTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < kkrTeam.size()){
            return (HashMap) kkrTeam.get(i);
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

    public KKRTeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        kkrTeam = new ArrayList<Map<String,?>>();

        title = "Gautam Gambhir (c)";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "Gautam Gambhir is the leader, and one of the mainstays of the KKR batting unit. A big-match player, he top scored for India in both the 2007 ICC World T20 and the 2011 ICC World Cup. A slew of Test and one-day centuries, including an 11-hour marathon in Napier, led to him being decorated with an Arjuna Award and the title of ICC Test Player of the Year in 2009. Having played for Delhi Daredevils in the first three seasons, Gambhir was snapped up by KKR at the 2011 IPL Player Auction for a record-smashing USD 2.5 million. He vindicated their decision when he captained KKR to their first top-four finish in IPL 2011 and then led them to the IPL title in 2012. Ahead of the 2014 Player Auction, Gambhir was retained by the Kolkata franchise as the captain of the team. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ggambhir));

        title = "Sunil Narine";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "West Indian";
        profile = "This ‘mystery spinner’ from the Caribbean took IPL 2012 by storm and terrorised batsmen across all teams with his unique spin skills. Picked up by KKR after a successful 2011 CLT20 for Trinidad & Tobago, Narine finished IPL 2012 as the Player of the Tournament with 24 wickets at a miserly 5.47 runs per over. Narine was the single most prominent reason for KKR’s IPL triumph and was retained by the franchise ahead of the 2014 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.snarine));


        title = "Robin Uthappa (wk)";
        role = "Batsman";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "This Karnataka batsman is a talented stroke-maker who has all the shots in the book. He is a utility cricketer who has batted in various positions. He is also an outstanding fielder, a reliable wicketkeeper and can even bowl slow medium pace. Uthappa was signed by the Mumbai Indians, before being traded to the Royal Challengers Bangalore. He was signed by the Pune Warriors India at the IPL Player Auction 2011. That year, he played all 16 games for PWI, and in a franchise laced with superstars, he was the highest run-getter for the team. At the 2014 Player Auction, Uthappa was bought by KKR to strengthen their Indian batsmen contingent. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ruthappa));


        title = "Piyush Chawla";
        role = "Bowling All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "A leg-spinner from Aligarh, Piyush Chawla first came to the fore when he got past the defense of Sachin Tendulkar with a googly in a Challenger Series match several years ago. In his early days, Chawla was an orthodox leg-spinner. However, he bowls much flatter these days and ends up bowling quite a few long hops in the process. A lower-order batsman, Chawla scores handy runs consistently. One of his most recent impressive performances came in the Corporate Trophy here he claimed six for 32 to help Chemplast lift the title in 2012-13. In the 2014 IPL Player Auction KKR doled out huge money (` 4.25 crores) to procure his services. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.pcahwla));


        title = "Yusuf Pathan";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Yusuf Pathan first made his mark as a hard-hitting batsman and off-spinner for the Baroda U-16 team. His ability to score runs quickly earned him a spot in India's squad for the inaugural World T20 in 2007. His impressive showing in IPL 2008, including a Man-of-the-Match performance in the final, earned him an ODI cap in 2008 Asia Cup. Pathan’s most memorable ODI performances are 123* versus New Zealand and a blitzkrieg of 105 off 70 balls against South Africa at Centurion. He has won many games for his state, IPL and national sides. However, haunted by inconsistency, the flamboyant batsman is yet to produce anything memorable for KKR. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ypathan));

        title = "Shakib Al Hasan";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Bangladeshi";
        profile = "A talented left-hand batsman and left-arm spinner, Shakib Al Hasan is one of the best cricketers that Bangladesh has produced. As a bowler, he is accurate, consistent, and canny; and his aggression and a wide range of strokes are the keys to his batting. Even more importantly, he has self-belief, an excellent temperament, is not flustered by the big occasion and is ready to battle against the top teams. Shakib became only the 28th player in the history of Test cricket to score a century and pick up five wickets in an innings in 2011 versus Pakistan. He joined the KKR ranks in 2011 and was bought back by the franchise in the 2014 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sahasan));


        title = "Morne Morkel";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Right-arm fast";
        nationality = "South African";
        profile = "A tall frame, high arm action, high release point, good pace and the ability to generate discerning bounce off the pitch makes Morne Morkel the quintessential fast bowler. Long before Morkel had played for South Africa, pace legend Allan Donald had identified him as someone who would go on to play international cricket with distinction. He has troubled batsman all over with his disconcerting pace. The younger of the Morkel brothers, he was with the Rajasthan Royals in the first three seasons of the IPL, but was signed by the Delhi Daredevils at the IPL Player Auction 2011. He was the Delhi Daredevils’ leading wicket-taker in IPL 2011, and followed it up by winning a Purple cap in the IPL 2012 with 25 wickets. After playing for the Delhi franchise for one more year, Morkel was snapped up by KKR at the 2014 IPL Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mmorkel));


        title = "Umesh Yadav";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "A rare Indian fast bowler, Yadav grew up in a small dwelling in a mine-workers' settlement about five kilometers from Khaparkheda in Nagpur and played leather-ball cricket around 2007-08 for the first time. Yadav has since made rapid strides in his career. He earned his India cap after only two seasons of domestic cricket and was one of the few success stories on India’s tour of Australia. The son of a coalmine worker, Yadav has emerged as an important cog in the India line-up. The pacer considers swing and bounce his strengths and worked diligently on sharpening his skills with the coaches at Delhi Daredevils as well. He was signed by the Delhi Daredevils at IPL Player Auction 2011. The season 2012 has been his most successful IPL year yet, where he picked 19 wickets from 17 matches. In the 2014 auction, Umesh was picked by KKR. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.uyadav));

        title = "Manish Pandey";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "It took one spectacular innings to thrust Manish Pandey into the limelight. A flamboyant right-hand top-order batsman, Pandey scored an unbeaten 114 for the Royal Challengers Bangalore against the Deccan Chargers in IPL 2009. He became the first Indian to score a ton in the IPL. Since then, Pandey has been one of the most consistent run-getters in Indian domestic cricket. He also scored an outstanding century on a difficult track in the Ranji Trophy final a few seasons ago. Pandey is a naturally gifted batsman. While his batting is more about timing and picking out gaps, he can also hit big sixes if needed. After turning out for the Royal Challengers Bangalore in the first three seasons of the IPL, Pandey was signed by the Pune Warriors prior to IPL 2011 and continued his stint with the team even in IPL 2013 before being purchased by KKR at the 2014 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mpandey));

        title = "Pat Cummins";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm fast";
        nationality = "Australian";
        profile = "The lanky Australian fast bowler hasn’t looked back since making his first-class debut in 2011 for New South Wales. He picked seven wickets on his Test debut and topped the wicket-takers’ chart in his maiden Big Bash League, with 11 wickets at 14.09. Sure enough, he became the youngest player to receive a central contract with Cricket Australia. While 2014 will see him being involved in his first IPL, Cummins did get a taste of CLT20, as part of the Sydney Sixers outfit. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.pcummins));


        title = "Ryan ten Doeschate";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Dutch";
        profile = "Ryan ten Doeschate has been the big name in Dutch cricket since announcing himself in the 2006 Intercontinental Cup. He has become something of a cult figure amongst Essex supporters with his huge hitting, skiddy bowling and big smile. Born in South Africa, he cites Jonty Rhodes as his hero, and has played for Western Province. In 2010, he won the ICC Associate and Affiliate Player of the Year award for his ODI performance with bat and ball. He won that award in 2008 and 2011 as well. The all-rounder has been with KKR since IPL 2011 and will continue to be part of the Kolkata franchise after they procured his services at the 2014 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rtd));

        title = "Suryakumar Yadav";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Still taking those small steps in domestic cricket, Suryakumar Yadav has already established his reputation as a prolific run-getter. The 22-year-old Mumbai middle-order batsman won the MA Chidambaram Trophy presented to the best cricketer at the U-22 level in the 2010-11 season. He scored over 1,000 runs in his first 11 games in first-class cricket. A part-time medium-pacer, Yadav was signed by the Mumbai Indians before IPL 2011 and has represented the franchise in one match, in 2012. At the 2014 Player Auction he was signed in by KKR. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.syadav));


        title = "Andre Russell";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm fast";
        nationality = "West Indian";
        profile="The most exciting talent to emerge from the Caribbean in recent times, Andre Russell – a Jamaican all-rounder – was signed by the Delhi franchise at the IPL Player Auction 2012. Russell is a powerful striker of the ball and scored an unbeaten 92 in 2011 to rescue the West Indies from a delicate situation against India in an ODI. He operates as a change bowler, often sticking to a wicket-to-wicket line and using variations to outsmart batsmen. While he can be expensive at times, Russell generally picks up key wickets and is also a very athletic fielder with a good throwing arm. After representing DD in seven matches over the 2012 and 2013 seasons, Russell was signed in by KKR at the 2014 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.arussel));

        title = "Veer Pratap Singhe";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A medium-pacer who plays domestic cricket for Bengal, the 21-year-old was considered a promising prospect and signed on in by Deccan Chargers for IPL 2012. The bowler did not disappoint bagging 10 wickets from nine matches. He was bought by KKR at the 2014 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vpsingh));

        title = "Kuldeep Yadav";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "Kuldeep Yadav is a left-arm spinner who can bowl orthodox left-arm spin and the chinaman. He starred for Uttar Pradesh U-19 in the semi-final of the Cooch Behar Trophy against Mumbai last season by picking up six wickets and scoring a half-century. As a result, the Mumbai Indians were quick to sign him on for IPL 2012. The 19-year-old, who idolises Shane Warne, took up cricket accidentally, but is making the most of the opportunities coming his way. A medium-pacer to begin with, Yadav took to spin bowling after his coach insisted that he didn’t have the height to succeed as a medium-pacer. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.kyadav));

        title = "Brad Hogg";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm chinaman";
        nationality = "Australian";
        profile = "The 42-year-old Brad Hogg is a left-arm wrist spinner who was an integral part of the Australian one-day team in the mid-2000s. The West Australian made a stunning comeback to the Australian Twenty20 team in early 2012. The all-rounder, started his journey back to cricket from commentary by first playing for the Perth Scorchers which led to a call up into the Australian team and then into the IPL. This two-time World Cup-winner was signed by the Rajasthan Royals at the IPL Player Auction 2012. In the 2015 season Hogg will don the KKR purple. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bhogg));


        title = "Sumit Narwal";
        role = "Bowling All-rounder";
        bats = "Left-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Delhi’s Sumit Narwal was beginning to gain a reputation as a handy lower-order batsman in addition to being a fine seam bowler when he was picked by the Rajasthan Royals ahead of IPL 2010. Narwal has been in the domestic circuit for over a decade now. The 31-year-old made his first-class debut for Haryana, before he crossed state borders to play for Delhi. A consistent wicket-taker for his state team, Narwal was prolific with both bat and ball in 2010-11 – scoring 340 runs in eight matches and picking up 40 wickets at an average of 20.22. He was a late inclusion in the Kolkata Knight Riders team in IPL 2013, replacing James Pattinson. The Kolkata-based franchise took him back in the 2015 Player Auction. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.snarwal));


        title = "Sheldon Jackson";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "This wicketkeeper-batsman from Saurashtra rose to prominence with a prolific 2012-13 Ranji Trophy campaign. With 756 runs, including three centuries and four half-centuries, he propelled Saurashtra to the final of India’s premier first-class tournament. Jackson was part of the Kolkata Knight Riders in the 2009 and 2010 seasons, but he didn’t get a single game. RCB signed the 26-year-old ahead of IPL 2013. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sjackson));

        title = "Aditya Garhwal";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "18-year old Aditya Garhwal is a right-handed batsman currently playing for the Rajasthan U-19 team. He has been creating waves in the domestic circuit for quite some time after scoring 763 runs in five innings of the Vinoo Mankad Trophy last year that had 38 sixes and 68 fours. He has been labeled as a wonder kid of sorts for his exploits in the tournament that included two double centuries and a score of 196 to go with it. He has caught the attention of senior India players with Suresh Raina presenting him an autographed bat and even Delhi Daredevils scouts monitoring his performance. He is also known as little Virender Sehwag for imperious stroke-play because he often scores more runs than balls faced. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.agarhwal));

        title = "KC Cariappa";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Leg-break";
        nationality = "Indian";
        profile = "KKR’s fascination with unknown commodities and mystery spinners only continued in the 2015 IPL Player auction as the franchise went all-out in their pursuit to rope in young Karnataka spinner KC Cariappa for a sum of Rs. 2.4 crore that got a lot of eyebrows raising. The 20-year old tall leg-spinner bowls with an unorthodox round-arm action and has variations like the googly and the faster one. His other strength that could make it difficult for batsmen to read him is his ability to bowl off-spinners without changing his grip. He also boasts of a carrom ball that is deceptive and difficult to pick. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.kccariappa));

        title = "Vaibhav Rawal";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Leg-break";
        nationality = "Indian";
        profile = "23-year old left-hand batsman from Delhi, Vaibhav Rawal is making gentle strides in First-class cricket. He may have only 10 matches under his belt but has already raked up 572 runs in the process at an average of close to 41. He has two centuries and two half-centuries to go with it and his hunger for runs has only grown over the years. Rawal rates aggressive Australian opener Matthew Hayden as his role model and has aspirations of being called the Hayden of his own team one day. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vrawal));

        title = "Azhar Mahmood";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "English";
        profile = "Going into IPL 2012, Kings XI Punjab signed on Azhar Mahmood, the former Pakistan all-rounder, now a British citizen. Mahmood played 21 Tests and 143 ODIs for Pakistan between 1996 and 2007. A lively medium pacer who can get the ball to move both ways, he is also a good striker of the ball. A regular in the English county circuit, Mahmood plays for Kent. One of the most successful all-rounders in first-class cricket he played a key role in Auckland Aces’ victory in the HRV Cup 2012. His ability to build an innings, find the boundary as well as claim wickets makes him a huge asset for any side. Having represented quite a few teams across different cricket playing nations his brought with him a vast experience to the Kings XI outfit. Ahead of IPL 2015, Mahmood was signed up by KKR as a replacement for injured Jimmy Neesham. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.amahmood));

        title = "Johan Botha";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "South African";
        profile = "The experienced South African all-rounder adds variety to the Delhi Daredevils bowling attack. The former Rajasthan Royals player can bowl conventional off-break, slip in a few top-spinners and also bowl the away-going delivery. A good striker of the ball, Botha can also chip in with crucial runs. He also led South Africa to home and away ODI series wins over Australia in 2008-09 and skippered the South Africa T20 side for the 2010-11 season. He led the Warriors to the 2010 CLT20 final against CSK. Botha played for Delhi Daredevils in 2013. In he 2015 season of the IPL, the South African all-rounder will play for KKR after being named as a replacement for injured Chris Lynn. ";
        kkrTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jbotha));


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
