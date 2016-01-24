package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/22/2015.
 */
public class MITeamDetails {
    List<Map<String,?>> miTeam;

    public List<Map<String, ?>> getItemList() {
        return miTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return miTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < miTeam.size()){
            return (HashMap) miTeam.get(i);
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

    public MITeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        miTeam = new ArrayList<Map<String,?>>();

        title = "Rohit Sharma (c)";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "One of the most naturally-gifted batsmen in the world, this 26-year-old is a prolific run-getter in all formats of the game and his batting is all about grace and elegance. While he has been making waves since 2007, this right-hander made several telling impacts last season – not least of which was an ODI double-century. He was also one of the most consistent Deccan Chargers batsmen in the first three seasons of the IPL, and he was instrumental in his former franchise winning the 2009 crown. However, since 2011 Sharma has been an integral part of the Mumbai Indians. In fact, he even took over the team’s captaincy a couple of games into the 2013 season and led MI to their maiden IPL title. He was, therefore, one of the five players retained by the franchise going into the 2014 season. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rsharma));


        title = "Lasith Malinga";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm fast";
        nationality = "Sri Lankan";
        profile = "In an era when coaches emphasise on correct technique, Lasith Malinga has anything but that. His slingy round-arm action can be tough to read. His pace, his ability to generate bounce and his reverse swing render opposition batsmen clueless at times. He picked up four wickets in four deliveries in the 2007 ICC World Cup. He also holds the record for the most bowled dismissals in Twenty20 cricket. After missing IPL 2008 due to a knee injury, he was at his devastating best in IPL 2009. In IPL 2010, he carried the Mumbai Indians to the final. He won the Purple Cap (awarded to the leading wicket-taker in the league stage of every season) in IPL 2011. Little wonder that MI retained their most prized weapon ahead of the 2014 auction. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.lmalinga));


        title = "Kieron Pollard";
        role = "All-rounder";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "West Indian";
        profile = "Trinidad’s Kieron Pollard is an absolute entertainer. This big-hitting batsman, capable of clearing most cricket grounds, announced his arrival at the 2009 CLT20 when he scored 146 runs in five innings at a strike-rate of close to 200. A genuine all-rounder, he lends balance to the team. His tall frame, athletic build, powerful forearms and broad shoulders make him a very good fielder too. Pollard was one of Mumbai Indians’ star performers in IPL 2010, but he had a modest outing in 2011 and 2012. However, he came back with a bang the next year, scoring 420 runs and picking up 10 wickets from 18 matches in IPL 2013 as MI surged to the title. He was one of MI's retained players ahead of IPL Player Auction, 2014. Expect the familiar chants of “Pollard! Pollard!” from the MI faithful at Wankhede Stadium every time this big man comes anywhere near the ball. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.kpollard));


        title = "Ambati Rayudu (wk)";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm off spin";
        nationality = "Indian";
        profile = "A prolific run-getter since his early days in the game, Ambati Rayudu announced his arrival when he scored 177 as a 16-year-old against an England U-19 team in 2002. Stints at the National Cricket Academy and an outstanding second season in domestic cricket only enhanced his reputation. Rayudu is also becoming a regular in India’s ODI and T20I teams. The 28-year-old was held on to by Mumbai Indians prior to IPL 2011 when all IPL squads got a makeover. And given his consistent run over the last three seasons, Rayudu was again retained by MI prior to IPL 2014. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.arayudu));


        title = "Harbhajan Singh";
        role = "Bowling All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Harbhajan Singh led the Mumbai Indians to their first Twenty20 title in 2011 when they beat the Royal Challengers Bangalore in the final of the CLT20. The Turbanator was the preferred spinner in India’s 2011 ICC World Cup-winning team too. But since then, he has slipped down the ranks. A shin injury forced him to miss most of the 2011-12 domestic season. However, he has since recovered and is now a key component of the Mumbai Indians. Given his vast experience and unique playmaking abilities, Harbhajan Singh was retained by the defending IPL champions ahead of the 2014 season. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.hsingh));

        title = "Corey Anderson";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm medium fast";
        nationality = "New Zealander";
        profile = "At INR 4.5 crores, young Corey Anderson was the Mumbai Indians’ second-costliest buy at the 2014 IPL Player Auction. This hard-hitting left-hander could well be worth every penny spent on him given his propensity to clear the ropes at regular intervals. It was this flamboyant batting style that saw him register the fastest ODI ton (36 balls) against the West Indies to ring in 2014. Expect this Kiwi batsman to clock in plenty of maximums come IPL season. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.canderson));


        title = "Aditya Tare (wk)";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm off spin";
        nationality = "Indian";
        profile = "Aditya Tare, a Mumbai wicketkeeper, always wanted to play with Sachin Tendulkar. His wish came true as he has shared the dugout with the Little Master, after being picked by the Mumbai Indians in 2010. The 26-year-old made his first-class debut for Mumbai in the 2007-08 domestic season. After a slow start, he has become a regular in the Mumbai ranks and was part of the Ranji Trophy-winning team in the 2012-13 season as well as the triumphant Mumbai Indians in IPL 2013. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.atare));



        title = "Jasprit Bumrah";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A 20-year-old medium pacer from Ahmedabad, Jasprit Bumrah was included in the Mumbai Indians squad ahead of IPL 2013. Bumrah’s journey to the big leagues has been quite exceptional. He was plying his trade for Gujarat – against Mumbai – in the 2013 Syed Mushtaq Ali Trophy (India’s domestic Twenty20 tournament). As luck would have it, MI’s new coach, John Wright, was present at the venue scouting for fresh talent. Wright was impressed with Bumrah’s smooth action and control, and thus came the teenager’s big break even before playing a single first-class or List A match. Within a few days, he was in the Mumbai Indians dressing room, rubbing shoulders with the likes of Sachin Tendulkar, Ricky Ponting and Harbhajan Singh. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jbumrah));


        title = "Josh Hazlewood";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Right-arm fast-medium";
        nationality = "Australian";
        profile = "This 23-year-old New South Wales native caught the eye of IPL scouts thanks to his consistent performances for both his state team and the Australian national side. A right-arm pacer, young Hazlewood will add depth to the Mumbai Indians’ pace attack in IPL 2014. Having played the T20 format for both Australia and the Sydney Sixers and clocking valuable four-fors on occasion, Hazlewood certainly has the big-game experience and temperament required to make a splash in the big leagues. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jhazelwood));


        title = "Marchant de Lange";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "South African";
        profile = "Marchant de Lange was signed by the Kolkata Knight Riders during the IPL Player Auction back in 2012 and in IPL 2014 he will be a part of the Mumbai Indians. de Lange is a genuine pace bowler whose built and bowling style are very similar to fellow South African pacer Morne Morkel. He made his first-class debut in September 2010 and has taken 87 wickets at a strike-rate of just under 47. The 23-year-old went on to take seven wickets for 81 runs in an innings against Sri Lanka in his debut Test in December 2011. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mdlange));



        title = "Pawan Suyal";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm medium";
        nationality = "Indian";
        profile = "A small-town boy from Uttaranchal, Pawan made quite an impression while playing a corporate cricket tournament and soon found himself in the Delhi Ranji team. The 24-year-old left-arm quick made his first-class debut for Delhi in the 2009-10 season. However, it wasn’t until the next season that he picked up 22 wickets in six matches and made a huge impact. Suyal was roped in by the Mumbai Indians a couple of season ago and got his solitary IPL start in 2013. He will be eager to get more playing time and showcase his talent on the big stage this season.";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.psuyal));


        title = "Shreyas Gopal";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "This 20-year-old has already played a handful of first-class games for Karnataka since his debut in late 2013. An effective leg-break bowler, Gopal has also proven to be handy with the bat lower down the order. In his debut season in the IPL this talented youngster will ply his trade for the Mumbai Indians. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sgopal));


        title = "Lendl Simmons";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium-fast";
        nationality = "West Indian";
        profile="Lendl Simmons came into limelight when he represented the West Indies in the 2002 and 2004 Under-19 World Cups. He received his Test cap against England in March 2009. He is an excellent fielder and an occasional wicketkeeper. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.lsimmons));


        title = "Aaron Finch";
        role = "Batsman";
        bats = "Right-hand bat";
        bowls = "Left-arm medium";
        nationality = "Australian";
        profile = "Aaron Finch is an aggressive batsman, who has represented Australia in T20s and ODIs. Finch, who plays for Victoria, is a solid striker of the cricket ball and has been a consistent run-getter for his team. Normally, a No.3 batsman, Finch has been very successful at every position at which he has batted. Earlier, a part of the Rajasthan Royals, he was signed by the Delhi Daredevils in IPL 2012 and then suited up for the Pune Warriors India in IPL 2013. After spending a year with SRH, in the 2014 season, this aggressive Australian batsman will represent the Mumbai Indians in IPL 2015. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.afinch));


        title = "Pragyan Ojha";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "Pragyan Ojha started his competitive cricket in the city of Hyderabad. A left-arm orthodox spinner, Ojha is one of the few bowlers who have consistently withstood the challenges presented by Twenty20 cricket. The 27-year-old was with the Deccan Chargers during the first four seasons of the IPL, but was transferred to the Mumbai Indians before the 2012 edition. Thanks to his consistent performances – which include winning the Purple Cap (presented to the leading wicket-taker in the league stages of the IPL season) – Ojha earned a place in the Indian team and became a key weapon in MS Dhoni's armoury. MI released him ahead of IPL 2015 but re-bought him at the Player Auction. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jojha));

        title = "Mitchell McClenaghan";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm medium-fast";
        nationality = "New Zealander";
        profile = "Mitch McClenaghan is one of New Zealand’s fastest bowlers. The left-arm quick started his First-class career with the Central Stags, but it was when he moved to the Auckland Aces in the 2011-12 season that his career began to take flight. He took 35 wickets in ten First-class games for the Aces and was rewarded with a place in the New Zealand squad to tour South Africa in 2012-13. He was impressive in his very first international outing with figures of 4 for 20 against South Africa. With his aggressive bowling, he has the ability to hurry even the world’s best batsmen. It’s not just his pace but he has the ability to get the ball swinging, which is a weapon all bowlers want. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mmcg));

        title = "Abhimanyu Mithun";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "Given the presence of Zaheer Khan and the plight of medium pacers in the T20 format, this gangly bowler from Karnataka has played only a handful of matches in the IPL; the last season he got a solitary game. However, he remains a promising young prospect, given his impressive first-class record. Abhimanyu Mithun started playing cricket when he was 17. The 23-year-old fast bowler made his ODI debut against South Africa in February 2010. Later that year, he earned his Test cap on India’s tour of Sri Lanka. Mithun joined the Royal Challengers Bangalore during IPL 2009, after impressing Coach Ray Jennings with his pace during trials. In the 2015 Player Auction, Mithun was roped in by MI. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.amithun));


        title = "Aiden Blizzard";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Left-arm medium";
        nationality = "Australian";
        profile = "Aiden Blizzard, an aggressive left-hand batsman was born in Tasmania. Blizzard first made headlines when he scored a 38-ball 89 for Victoria on New Year’s Day in 2007. However, he couldn’t find a permanent place in his state side and decided to move to South Australia. The 28-year-old has been a part of the Mumbai Indians since 2011. He was released ahead of the 2015 season but MI bought him back at the Player Auction. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ablizzard));

        title = "Akshay Wakhar";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm off-break";
        nationality = "Indian";
        profile = "Right-arm off-break bowler Akshay Wakhare enjoyed reasonable success in the 2014-15 Ranji Trophy season with 21 scalps at an average of 16. He came into the limelight in January 2015 when he picked 5 for 89 against Saurasthra and had match figures of 13 for 162 against Gujarat during that season of the Ranji Trophy. Wakhare comes from the traditional mould of off-spin bowling and wickets in the IPL could well suit his style of bowling. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.awakhare));


        title = "Nitish Rana";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-break";
        nationality = "Indian";
        profile = "An attacking left-handed batsman from Delhi, Nitish Rana has grown up playing his cricket at the Feroz Shah Kotla and rubbing shoulders in cricket camps with fellow Delhi mates, Mithun Manhas, Rajat Bhatia and Shikhar Dhawan. Rana is yet to make his First-class debut but has put up meaningful contributions in the List A circuit and Syed Mushtaq Ali Trophy this year. Rana credits a lot of his batting success to his coach Sanjay Bhardwaj who has worked with him through thick and thin and Rana would be looking to make the most of this IPL exposure with the Mumbai Indians. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nrana));

        title = "Siddhesh Lad";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "RIght-arm off-spin";
        nationality = "Indian";
        profile = "This young batsman from the stables of Mumbai cricket will be making his IPL debut in the 2015 edition of the IPL. Lad has proven himself to be a vital cog in his state side and scored his maiden first-class ton in the 2014-15 season. Son of Mumbai-based coach, Dinesh Lad, Siddhesh is a handy off-spinner for his side. In the forthcoming season, the youngster will be looking to carry his form into the Indian Premier League. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.slad));


        title = "Hardik Pandya";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "This youngster from Baroda is set to make his IPL debut for the Mumbai Indians in the 2015 edition of the tournament. A bowling all-rounder, Pandya has been plying his skills for his domestic side since 2013. He played a vital role in Baroda winning the Syed Mushtaq Ali trophy in the 2013-14 season. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.hpandya));


        title = "Jagadeesha Suchitch";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Slow left-arm orthodox";
        nationality = "Indian";
        profile = "The bowler from Mysore has played two domesticT20s leading up to IPL 2015 and will looking to make his debut in the prestigious tournament in the forthcoming season. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jsuch));


        title = "Unmukt Chand";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "A prolific run-getter from Delhi, Unmukt Chand led India to the ICC Under-19 World Cup title in 2012. The right-hand batsman made headlines when he scored 151 against Railways in the Ranji Trophy as a 17-year-old. A cricketer with a calm temperament, he is a big match player and has a knack for coming up with big scores in crucial situations. Chand was one of the top two scorers for his state side in his maiden first-class season, aggregating 400 runs in five matches at an impressive average of 57.14. He played a crucial innings in DD’s win over KKR in CLT20, 2012. He was signed by the Delhi Daredevils prior to IPL 2011 and picked up by Rajasthan Royals ahead of the 2014 edition of the IPL. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.uchand));



        title = "Vinay Kumar";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "It’s not often that despite bowling in the shadows of Zaheer Khan an inexperienced medium pacer emerges as his team’s top wicket-taker in the tournament. Vinay Kumar did just that in IPL 2012, picking up 19 wickets in 15 matches. Vinay Kumar, who has represented India in 31 ODIs, got his Test cap during the 2011-12 tour of Australia. The Royal Challengers Bangalore recognised his talent and had him in their ranks for the first three seasons of the IPL. After a year with the now defunct Kochi franchise, he was taken back by RCB in the 2012 IPL Player Auction and then in the auction ahead of the 2014 season. RCB traded him to MI ahead of the 2015 season. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vkumar));



        title = "Parthiv Patel (wk)";
        role = "Wicketkeeper batsman";
        bats = "Left-handed";
        bowls = "Slow left-arm orthodox";
        nationality = "Indian";
        profile = "This wicketkeeper-batsman first came into prominence when he made his Test debut against England at the age of 17 back in 2002. Since then, he has regularly been in contention for a spot in the Indian team. The 29-year-old left-hander, who has been impressive with the bat in one-day cricket, was signed by the Chennai Super Kings for the first three seasons of the IPL, moved to Kochi Tuskers Kerala before being bought by the Deccan Chargers at the IPL Player Auction 2012. In the 2014 IPL Player Auction he was purchased by RCB. The Bangalore-based team traded him to MI ahead of IPL 2015. ";
        miTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ppatel));

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
