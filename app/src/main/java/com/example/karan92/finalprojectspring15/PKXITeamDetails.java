package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/18/2015.
 */
public class PKXITeamDetails {
    List<Map<String,?>> pTeam;

    public List<Map<String, ?>> getItemList() {
        return pTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return pTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < pTeam.size()){
            return (HashMap) pTeam.get(i);
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

    public PKXITeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        pTeam = new ArrayList<Map<String,?>>();

        title = "George Bailey (c)";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Australian";
        profile = "The Tasmanian is a cool customer and has led Australia in the limited overs formats. A right-hand middle-order batsman, he is one of the leading run-scorers in the Australian domestic circuit. Popular among his team-mates, he is quite highly rated and was even appointed skipper of the Australian Twenty20 side on debut. Although Bailey had been with the Chennai Super Kings since IPL 2009, he’s only had a handful of IPL outings. Bailey was a added to the KXIP lineup at the IPL 2014 Auction. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bailey));

        title = "Axar Patel";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "Akshar Patel is an all-rounder from Gujarat, who made his first-class and List A debuts in the 2012-13 season. A native of Anand, he earned his maiden IPL contract with the Mumbai Indians ahead of IPL 2013. He scored 369 runs in seven matches and picked 29 wickets for Gujarat during Ranji Trophy 2013-14 before being bought by KXIP ahead of the 2014 edition of IPL. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.apatel));

        title = "Anureet Singh";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Recruited by KXIP in the IPL 2014 auction, Anureet Singh had earlier represented the Kolkata Knight Riders. The pacer plays for Railways in India’s domestic circuit. He was the second highest wicket-taker in Ranji Trophy 2013-14, claiming 44 wickets in eight matches at an average of 17.56 and a strike rate of 47.4. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.asingh));

        title = "Beuran Hendricks";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm medium fast";
        nationality = "South African";
        profile = "Beuran Hendricks is a left-arm fast-bowler from the stables of South Africa. The Cape Town-born bowler also represents the Cape Cobras. He has claimed 47 wickets from 29 T20 matches with a career best haul of six for 29. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bhendricks));

        title = "David Miller";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "South African";
        profile = "A left-hand batsman, David Miller made his first-class debut as a 17-year-old and scored an unbeaten 63 against the Warriors. Although his first-class numbers are modest, he has been very successful in limited-overs cricket. A destructive batsman, he has an impressive strike-rate in the limited overs formats. Apart from playing for South Africa and the Dolphins in Twenty20 cricket, Miller has also played for Durham and Yorkshire. A powerful middle-order bat, he is also an outstanding fielder. Miller, who scored 418 runs from 12 games, including an unbeaten century for the Kings XI Punjab in IPL 2013, was one of the two players to be retained by the franchise ahead of IPL 2014 auction. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dmiller));


        title = "Glenn Maxwell";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Australian";
        profile = "Glenn Maxwell’s potential as an all-rounder was recognised in his debut season of 2010 itself. As a result, he went to South Africa as part of Victoria’s squad for the Champions League Twenty20. A versatile batsman who bats anywhere between the first and seventh position in the line-up, Maxwell also adds value with his off-spin. He was a part of the Delhi Daredevils in 2012 and was bought by the Mumbai Indians at the 2013 IPL Player Auction for USD 1 million – which was also the year’s highest bid. A big hitter of the ball, he was recruited by KXIP in the 2014 IPL Auction. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.gmaxwell));

        title = "Gurkeerat Mann Singh";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Gurkeerat Mann Singh is a young batsman from Faridkot in Punjab. He made his limited-overs debut for Punjab in 2012 and impressed everyone by scoring 236 runs in his first five matches. This included a well-made century and a half-century. Inducted in the KXIP squad in IPL 2012, the batsman pulled off a thrilling last-ball victory against Deccan Chargers. He has been a vital cog in Punjab’s lineup in recent times. He was bought back by KXIP in 2014. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.gsingh));

        title = "Karanveer Singh";
        role = "All-rounder";
        bats = "Right-hand bat";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "The Punjab-born cricketer represents Himachal Pradesh in first-class and List A matches in India’s domestic circuit. He is a right-hand batsman and a leg-break bowler. Recruited by KXIP ahead of the seventh season, Karnaveer is set to make his IPL debut. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ksingh));

        title = "Manan Vohra";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Manan Vohra opened the batting for India Under-19s and has also played first-class matches for Punjab. A prolific run-scorer and an aggressive batsman, he was unfortunate to miss the 2012 U-19 World Cup due to injury. Recruited by the Kings XI Punjab ahead of 2013 season, he was retained by them before the 2014 auction. The youngster scored 161 runs from 12 games in his debut season. He scored 187 in the Ranji Trophy 2013-14 season for Punjab against Jharkhand and is a talent to look out for. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mvohra));


        title = "Mitchell Johnson";
        role = "Bowling All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm fast";
        nationality = "Australian";
        profile = "The left-arm fast bowler is in peak form, rewriting the books in what can be termed as his second coming. Mitchell Johnson has been running through some of the best lineups in the international circuit. He rendered the English and South African batsmen helpless in his recent outings. He is a rare left-arm paceman with a slingy action. He bowls fast, uses the crease and can move the ball in both directions. The Australian, who was first spotted by the legendary fast bowler Dennis Lillee, played tennis while growing up, but soon switched to cricket. He struggled in his early days, but worked hard at his game and is now one of Australia’s first-choice fast bowlers. A handy lower-order batsman, he even has a Test century to his name. The Mumbai Indians signed him at the IPL Player auction 2012 and he was a key to their fortunes in the 2013 season, claiming 24 wickets in 17 matches as Mumbai Indians won the trophy. The Kings XI Punjab snapped him in the 2014 auction. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mjohnson));


        title = "Parvinder Awana";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Brought up in a village near Noida in Uttar Pradesh, Parvinder Awana had been slogging it out in the domestic circuit before getting an opportunity to display his skills in the Indian Premier League. 2011-12 was the right-arm medium-pacer’s most successful domestic season when he picked up 35 wickets in seven matches and finished as Delhi’s leading wicket-taker in the Ranji Trophy. After his impressive performances, Awana realised his dream of receiving a call into the national side and made his debut for India in the shortest format of the game in December 2012. He claimed 14 wickets in 15 matches for KXIP in IPL 2013 and was bought back by the franchise ahead of the 2014 season. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.pawana));


        title = "Rishi Dhawan";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "Captain of the Himachal Pradesh state team, Rishi Dhawan had a brilliant 2013-14 season with the bat and the ball. He claimed 49 wickets and scored 435 runs in eight Ranji Trophy matches. After being part of KXIP earlier, he was with the Mumbai Indians squad in 2013. The highest wicket-taker in Ranji Trophy 2013-14, he was bought by the Kings XI Punjab in 2014 for Rs. 3 crores. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rdhawan));


        title = "Sandeep Sharma";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile="A right-arm medium pacer from Punjab, Sandeep Sharma rose to prominence during the 2012 Under-19 World Cup. His four wickets in the final propelled India to the title and made him India’s joint highest wicket-taker in the tournament with 12 scalps. The 20-year-old made his first-class debut in 2011 and was also part of Team India during the 2010 Under-19 World Cup. He earned a contract with the Kings XI Punjab ahead of IPL 2013 and was bought back by the franchise in the 2014 Auction. He has earned high praise from experts for his ability to swing the ball and played a key role for his state side, Punjab in recent times. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ssharma));

        title = "Shardul Thakur";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "The pacer from Mumbai was among wickets in the 2013-14 Ranji Trophy. With 27 wickets from six matches, he was the second highest wicket-taker for the side. Bought by KXIP ahead of the 2014 season, the pacer is set to make his IPL debut in the seventh edition of the tournament. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sthakur));


        title = "Shaun Marsh";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Australian";
        profile = "Shaun Marsh is one of the international players to have benefitted immensely from the IPL. The left-hand opener came to prominence after opening the innings for the Kings XI Punjab and winning the Orange Cap (which is presented to the leading run-getter in the competition) in IPL 2008. He was part of the Australia under-19 squad that won the World Cup and is a treat to watch when on song. Despite missing IPL 2009 and part of the tournament next year, Marsh continues to be an integral part of the Mohali franchise. Kings XI Punjab announced that they were going to retain the southpaw at the end of the third season when all the teams were revamped. He is the leading run-getter for KXIP with 1603 runs from 42 games, from 2008 to 2012, has an average of 45.80 and is one of the key performers for the franchise. He was brought back into the side in ahead of the 2014 season. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.smarsh));


        title = "Shivam Sharma";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "A right-hand batsman and an off-spinner, Shivam Sharma is yet to make his first-class debut in India’s domestic circuit. The Delhi-born cricketer was bought by KXIP ahead of the seventh edition of the IPL. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.shivam));

        title = "Thisara Perera";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Right-arm medium fast";
        nationality = "Sri Lankan";
        profile = "A right-arm medium pacer and a powerful striker of the ball, Perera was pegged as an international cricketer since his U-19 days. Although he started his career as a bowler, Perera worked hard at his batting and has developed into a handy all-rounder. He was part of the Chennai Super Kings during IPL 2010, but was subsequently signed by the Kochi Tuskers, then Mumbai Indians before hectic bidding saw Sunrisers Hyderabad grabbing him for USD 675,000 at the 2013 auction at Chennai. He was bought by the Kings XI Punjab in the 2014 Auction. The tall pacer claimed 19 wickets from 16 matches for SRH in IPL 2013. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.tperera));

        title = "Virender Sehwag";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "One of the most destructive batsmen in the world, Sehwag, originally a middle-order batsman, has redefined the role of an opener. With minimal footwork but great hand-eye coordination, Sehwag goes after every delivery that deserves to be hit. And many that don’t! He has won many games for India with his big hitting. However, Sehwag is yet to perform as consistently in the Twenty20 format as he does in the longer versions of the game. Apart from being an attacking batsman, he is a handy off-spinner and is known to use his wiles to both check the flow of runs, and take wickets. Sehwag was the “Icon” player for the Delhi Daredevils when the IPL was formed, and was with the franchise till 2013 before being bought by KXIP in the 2014 Auction. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vsehwag));


        title = "Wriddhiman Saha (wk)";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "This wicket-keeper batsman from West Bengal has plied his skills for Kolkata Knight Riders and Chennai Super Kings before being bought by Kings XI Punjab in the 2014 IPL Auction. At times, he was inducted into the playing XI despite MS Dhoni keeping wickets – a testament to his more than decent batting credentials. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.wsaha));


        title = "Murali Vijay";
        role = "Batsman";
        bats = "LeRightft-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Murali Vijay, who had been a key player for the Chennai Super Kings, was bought by the Daredevils in the 2014 player auctions. He completely redefined himself during IPL 2010 with some impressive displays of power-hitting right at the top for CSK. Known for his technique and poise at the crease, Vijay was drafted into the Indian Test team in 2008 against a daunting Australian side. A clean hitter of the ball, Vijay possesses the gift of timing and that was well demonstrated during his record-breaking knock of 127 against Rajasthan Royals in IPL 2010. He ended up scoring 458 runs in the tournament, cementing his place in the Indian squad for the ICC World T20 Championship in the Caribbean. Brought back into the Test side, Vijay had made an impact in the home series against Australia in 2012-13. In the IPL, Vijay plied his trade for CSK from 2009 to 2013 before playing for DD in 2014. At the 2015 Player Auction, the opening batsman was roped in by KXIP. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mvijay));


        title = "Nikhil Naik";
        role = "Wicket Keeper Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-break";
        nationality = "Indian";
        profile = "A young 20-year old right hand Wicket Keeper batsman from Maharashtra, Nikhil Naik is one of the promising additions to the Kings XI Punjab line-up. Naik is yet to make his First-class debut, but boasts of some good numbers in the List A circuit with three half centuries and a top score of 78. A relatively unknown batsman, Naik would be looking at the IPL as a huge learning process under the guidance of experts and brushing shoulders with the best in the international circuit. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nnaik));

        title = "Yogesh Golwalkar";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Leg-break";
        nationality = "Indian";
        profile = "35-year old Yogesh Golwalkar is a leg-spinner who made his debut for Madhya Pradesh aged 20 and won national recognition when picked for the India A tour of Zimbabwe and Kenya in 2004. After returning from the twin tours, Golwalkar was picked up to play against Mumbai at the Irani Trophy where he bowled well and helped his team win against then Ranji Trophy champions at Mohali. In the 2004-05 season, Madhya Pradesh made it to the Elite Group of the Ranji Trophy and his performance led to his recruitment to Middlesex County Cricket Club where he took six wickets in his debut game against Kent. He returned to India in 2006 and continued to play for MP until the 2008-09 season. He played as an overseas professional in the UK for many years. In the beginning of 2013 he was called upon by Durham County Cricket Club UK to address their Academy coaches on how to coach leg-spin bowling. He is an interesting choice in this Kings XI Punjab line-up and his wealth of experience might come in handy in the IPL. ";
        pTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ygolwalkar));


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
