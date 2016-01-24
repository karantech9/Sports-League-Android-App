package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/22/2015.
 */
public class RCBTeamDetails {
    List<Map<String,?>> rcbTeam;

    public List<Map<String, ?>> getItemList() {
        return rcbTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return rcbTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < rcbTeam.size()){
            return (HashMap) rcbTeam.get(i);
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

    public RCBTeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        rcbTeam = new ArrayList<Map<String,?>>();

        title = "Virat Kohli (c)";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Virat Kohli, the toast of Indian cricket in recent times, is a talented batsman who has rapidly come up through the system. He was the captain of the Indian team that won the 2008 ICC U-19 World Cup. This 25-year-old is the quintessential new-age cricketer who plays his game aggressively and is unafraid to express his emotions on the field. The flamboyant cricketer is also known to enjoy the lifestyle that comes with being a star. All this while being a consistent performer for his side. A vital cog in the Indian ODI squad, Virat has now established himself in the Test team as well, taking the No. 4 spot vacated by Sachin Tendulkar. He can perform calmly and consistently under pressure, and has delivered many match-winning performances over the last couple of years. Kohli is also a good fielder and can bowl the occasional medium pace spell too. By making him in charge of the team for a few games in IPL 2012, the Royal Challengers Bangalore groomed him as their next leader, which he eventually became in the 2013 season. Retained by the franchise ahead of the 2014 Player Auction, Virat continues to lead them. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vkohli));


        title = "AB de Villiers (wk)";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "South African";
        profile = "A delightfully brutal batsman, a more than decent wicket-keeper and an agile fielder that can put an acrobat to shame – there are very few things (if any) that Abraham Benjamin de Villiers cannot do on a cricket field. Yes, he also has two Test wickets to his name. South Africa’s limited-overs captain was a key player in the Delhi Daredevils’ middle order in the first three editions of the IPL. He was bought by the Royal Challengers Bangalore for USD 1.1 million at the IPL Player Auction 2011. Since then, he has joined hands with Chris Gayle in tearing bowling attacks apart with utter disdain. During the 2012 season when playing the role of a finisher, he snatched wins out of the jaws of defeat. He unearthed some outrageous shots to incredible effect and in one over, smashed Dale Steyn for 23 – two fours and sixes each – to win RCB a thriller. The menace of de Villiers continued in the next season which led the RCB management to retain him ahead of the 2014 IPL Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.abd));


        title = "Chris Gayle";
        role = "All-rounder";
        bats = "Left-hand bat";
        bowls = "Right-arm off-spin";
        nationality = "West Indian";
        profile = "Chris Gayle, at his best, is devastating. He is the first player to have scored a century in international Twenty20 cricket; the only man to score seven or more tons in the Twenty20 format; and is the leading six-hitter in Twenty20s. This 33-year-old Jamaican batsman is all about power and brute force. Besides playing for his home team, Jamaica in the Caribbean Twenty20 competition and the Royal Challengers Bangalore in the IPL, Gayle struts his stuff for teams in various T20 franchises around the world. He has enjoyed success everywhere he’s played, as no boundary or total is beyond his reach. The big man from Caribbean is also a safe catcher and a handy off-spinner. In three years he has donned the RCB cap, Gayle has single-handedly won matches for them. In the 2012 season he shattered all boundaries, piling up agony worth 733 runs over the bowlers, scoring 160 runs per 100 balls. The next year he took the T20 world by storm with a knock of 175 against Pune Warriors. The swaggerer from Caribbean was too valuable an asset to let go for the Bengaluru-based franchise and hence he was retained ahead of the 2014 season. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.cgayle));

        title = "Mitchell Starc";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm fast-medium";
        nationality = "Australian";
        profile = "Tall, fast and skillful, Mitchell Starc is one of the most exciting young fast bowlers in Australia. While the left-arm pacer can trouble the batsmen with pace and bounce on helpful wickets, he is equally capable of being effective in conditions that don’t suit his kind. Having played in the 2012 CLT20 for Sydney Sixers, 2014 will see Starc’s maiden journey in the IPL after he was bought by RCB at the Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mstarc));


        title = "Nic Maddinson";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Australian";
        profile = "The 22-year-old opening batsman from New South Wales, Nic Maddinson is quickly coming through the ranks of the Australian domestic cricket. In the 2013-14 edition of the Big Bash League, Maddinson emerged as the highest run-scorer for Sydney Sixers, with 211 runs from nine matches. When he was picked by RCB at the 2014 IPL Player Auction, the left-handed batsman signed up for his first IPL season. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nmaddinson));


        title = "Varun Aaron";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm fast";
        nationality = "Indian";
        profile = "The 23-year-old Varun Aaron, from Jamshedpur, is a product of the MRF Pace Foundation and even went on to represent the Australian Institute of Sport team. He was picked by the Kolkata Knight Riders going into IPL 2010 after he impressed Sourav Ganguly and bowling coach, Wasim Akram at the team trials. Aaron was signed by the Delhi Daredevils ahead of IPL 2011 and continued to play for them in IPL 2012. In the 12-month period between IPL 2011 and IPL 2012, the Jharkhand pacer was called up to the Indian team; he won his maiden Test cap when the West Indies toured India in 2011 and featured in four ODIs as well. An injury ruled him out of cricket for quite a while but as soon as he attained total fitness, he was summoned into the Indian squad for the tour of New Zealand. Aaron was picked up by RCB at the Player Auction ahead of IPL 2014. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vaaron));



        title = "Ashok Dinda";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "From playing cricket in a village in West Bengal to donning the India cap, it has been some journey for Ashok Dinda. A fast bowler with an unusual leap at the end of his delivery stride, Dinda is a momentum bowler. He can bowl fast and demolish sides on his day. Dinda is capable of generating a lot of pace and bounce off the surface with his quick arm action. His stellar domestic performances were duly rewarded when he was called up to the Indian team for the Asia Cup in March 2012. He was part of the Kolkata Knight Riders in the first three seasons of the IPL, before being signed by the Delhi Daredevils in the IPL Player Auction 2011. The Delhi franchise traded him to the Pune Warriors before IPL 2012 and he was bought by RCB in the 2014 Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.adinda));

        title = "Harshal Patel";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Haryana’s Harshal Patel was the discovery of the 2011-12 Indian domestic season. He bagged an impressive 19 wickets in the Ranji Trophy knockout phase. A few years ago, he had achieved a similar feat when he took 23 wickets at an average of 11 in the domestic U-19 competition. The Mumbai Indians saw a lot of promise in this 21-year-old swing bowler and signed him in the U-19 category a few years ago. The Royal Challengers Bangalore signed him on before IPL 2011 in which he warmed the bench throughout the season before eventually making his debut in IPL 2012. Although he didn’t play a game for RCB in the 2013 season, he was bought back by them at the 2014 Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.hpatel));


        title = "Vijay Zol";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "The 19-year-old Vijay Zol is the youngest member of the Royal Challengers Bangalore line-up. The teenager from Maharashtra made headlines when he scored an unbeaten 451 for his state U-19 team against Assam in 2012 Cooch Behar Trophy. The youngster continued to live up to his promise and went on to perform admirably in the 2012 Under-19 World Cup, that India emerged victorious. The Maharashtra lad went on to captain India the 2014 U-19 World Cup after a successful Ranji Trophy season. Zol idolises Virender Sehwag and tries to emulate his batting style. A powerful striker of the cricket ball, Zol was signed by the Royal Challengers Bangalore ahead of IPL 2012 and was bought back by the franchise at the 2014 Player Auction. He is yet to play his first IPL game. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.vzol));

        title = "Abu Nechim";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "Abu Nechim Ahmed, a right-hand fast bowler from Guwahati, picked up plenty of wickets in the 2008 ICC U-19 World Cup. The 23-year-old is often compared to Ajit Agarkar because of his slim build and his quick arm action. He can swing the ball both ways and can control the white ball well. Ahmed made his IPL debut for the Mumbai Indians in IPL 2010 before switching to RCB in 2012. He was bought back by the Bengaluru-based team in the 2014 IPL Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.anechim));


        title = "Sandeep Warrier";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A bristling 22-year-old pacer from Kerala, Sandeep Warrior announced his arrival in first-class cricket by scalping 24 wickets in the five matches he played in the 2012-13 Ranji Trophy. Nippy and skillful, Warrior impressed at a fast bowling camp held in Kerala in early 2012 and earned a place in the state side the following Ranji season. In only his fourth game, Warrior ran through the Jharkhand line-up to finish with career-best 6 for 44 in 15 overs. Recognizing the talent, RCB made him a part of their IPL squad ahead of the 2013 tournament and bought him back at the 2014 auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.swarrier));


        title = " Yogesh Takawale";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "The 29-year-old wicketkeeper batsman, hailing from Pune, made his first-class debut in 2006 for Maharashtra. Since scoring 351 runs at an average of 50 in his debut Ranji Trophy season, Takawale has been a regular in the Maharashtra side. He was penciled in into the Mumbai Indians squad for the inaugural IPL season and was bought by RCB at the 2014 IPL Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ytakwale));


        title = "Yuzvendra Chahal";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile="This 23-year-old is a leg-spinner who plays domestic cricket for Haryana. After impressing at the U-19 level and spending time at the National Cricket Academy, Chahal graduated to first-class cricket. He made his Ranji Trophy debut for Haryana in 2009. A good outfielder too, Chahal first turned out for the Mumbai Indians in IPL 2011. He was bought by RCB at the 2014 Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ychahal));

        title = "Rilee Rossouw";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "South African";
        profile = "Rilee Rossouw is a left-hand top-order batsman who represented South Africa in the 2008 ICC U-19 World Cup. Rossouw, who has shown immense potential in his performances on the domestic circuit, hasn’t quite stamped his authority in the Twenty20 format. Having said that, Rossouw is certainly seen as a player for the future. The 22-year-old, who bats at No. 3 for the Knights in South African domestic cricket, will turn out for the Royal Challengers Bangalore in IPL 2012. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rrossouw));


        title = "Iqbal Abdulla";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "A left-handed all-rounder who bowls orthodox spin, Iqbal Abdulla has represented Mumbai in the Ranji Trophy and has also played for India Greens in the Challenger Trophy. His 10 wickets at 13 apiece played an important role in India U-19 team winning the World Cup in Malaysia in 2008. He is a talented lower middle-order batsman and an athletic fielder. He won the Emerging Player of the Year award for his performance in IPL 2011 when he bagged 16 wickets. Abdullah also won the Man of the Series award while playing for India A during the Emerging Players Tournament in Australia in 2011. Although he got limited opportunities in the Ranji Trophy 2013-14 season, the diminutive bowler captured 11 victims in the must-win match against Gujarat to help Mumbai qualify for the knock-outs. Having spent the previous seasons with the Kolkata Knight Riders, the spinner will be seen in the Royals’ jersey in 2014. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.iabdulla));

        title = "Manvinder Bisla";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Bisla, an aggressive batsman and wicketkeeper, has played for two IPL teams since its inception in 2008 and has also represented Himachal Pradesh, Jammu & Kashmir and Haryana. Manvinder kick started KKR's first win in IPL 2012 with a blistering 46 against Bangalore. He followed it up with a stunning 89 in 48 balls to clinch the Man-of-the-Match award in the final. He was bought back by KKR at the 2014 IPL Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mbisla));

        title = "Mandeep Singh";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Another local lad from Punjab, Mandeep Singh was bought back by the Kings XI Punajb in the 2014 Auction. He was the vice-captain of the Indian team that competed in the ICC U-19 World Cup in New Zealand. The youngster is an outstanding batsman and a sharp fielder. A prolific run-scorer during his junior days, Mandeep continues to shine at the senior level too. A powerful striker of the cricket ball, he was earlier with the Kolkata Knight Riders and was subsequently signed by Kings XI Punjab ahead of IPL 2011. He was the second highest run scorer for Punjab with 616 runs in the Ranji Trophy 2013-14 season. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.msingh));

        title = " Dinesh Karthik";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Dinesh Karthik is one of the most consistent wicketkeeper-batsmen in Indian domestic cricket. Nimble and agile behind the stumps and aggressive in front of it, he has repeatedly delivered the goods in all formats of the game. A resilient batsman, he goes after every target, no matter how steep. Part of the Delhi Daredevils stable in the first three seasons of the IPL, Karthik was signed by Kings XI Punjab at the IPL Player Auction 2011 and was traded to the Mumbai Indians before IPL 2012. After two years of supreme services for MI, he was bought back by DD at the 2014 Player Auction. IPL 2015 will be a fresh start for Karthik as he dons RCB's red jersey for the first time. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dkarthik));


        title = "Subramaniam Badrinath";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "A complete team man, Subramaniam Badrinath is CSK’s grafter extraordinaire. An explosive batsman in his own right, Badrinath has never really shown his tremendous domestic form on the international stage. A seasoned Ranji batsman, he finally got his Test cap in 2010 against South Africa. Badrinath has been the calming factor in the CSK batting line-up, packed with flamboyant hitters. He has, many a times, dropped anchor to steady the team’s rocking boat and eventually taken it safely to the shore. In IPL 2015, Badrinath will serve RCB. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sbadrinath));

        title = "Darren Sammy";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "West Indian";
        profile = "The first international cricketer from St Lucia, the crowning moment for Sammy came in October 2010 when he became the first cricketer from his native Island to be named West Indies captain. That the West Indies went onto win their first world title since the 1979 World Cup, defeating hosts Sri Lanka in their own backyard in the 2012 World Twenty20 final, is testimony of his leadership qualities. His impact on the Sunrisers Hyderabad’s Playoffs qualification in IPL 2013 was telling. Not only did he win games, but he also won over fans with his own brand of swagger and showmanship. SRH gave him up ahead of the 2015 season and RCB were quick to snap him up at the Player Auction. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dsammy));

        title = "Sean Abbott";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm fast";
        nationality = "Australian";
        profile = "A talented young all-rounder, Abott received the Bradman Young Cricketer of the Year, 2015 for his performances across all formats of the game. He has also been the recipient of the Steve Waugh Medal as the best New South Wales cricketer in 2013-14. The 23-year old has donned the national colours for one ODI and played in three T20Is. The fast bowler is known for his wicket-taking abilities and is also known to be a hard-hitter of the ball. After bowling the fatal delivery that hit Phil Hughes, he came back couple of weeks later to bowl a match winning six for 14 against Queensland. He will be looking to make his mark in the IPL when he takes the field for RCB in 2015. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sabbott));


        title = "David Wiese";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium-fast";
        nationality = "South African";
        profile = "A hard-hitting batsman and pace bowler, Wiese plays for the Titans in South Africa's domestic circuit. He has been plying his skills across formats in South Africa for almost a decade since his first-class debut for the Easterns in 2005. In his maiden season of the IPL he will be keen to make his mark in the premier T20 competition in India for RCB. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dwiese));

        title = "Sarfaraz Khan";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "This hard-hitting batsman from Mumbai has been making waves in the domestic circuit for his prolific run-making since age-level cricket. A clean hitter of the ball, Sarfaraz is known to score quickly. He has been piling on runs in the Mumbai ‘maidans’ and made his first-class debut in 2014-15. He has also represented India in Under-19 cricket. He will be looking for an opportunity to set the stage on fire when he makes his IPL debut in the eight edition of the tournament. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.skhan));


        title = "Jalaj Saxena";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm offbreak";
        nationality = "Indian";
        profile = "While this 27-year-old was a part of the Mumbai Indians’ squad in IPL 2013, he is yet to see on-field action. This right-hander bats up the order – often opening the innings – for Madhya Pradesh and is also an effective right-arm off-spinner. He will be hoping to play his first IPL game this year, donning the RCB red. For someone who is yet to realize his full potential, a launch pad like IPL could work wonders. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jsaxena));


        title = "Shishir Bhavane";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Bhavane, a young batsman from Karnataka, made his state debut in the 2014-15 season. The left-hander who made an impression in the domestic circuit, was bought into the RCB side ahead of the 2015 season and will be looking to impress in the red jersey. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sbhavane));

        title = "Sreenath Aravind";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm medium fast";
        nationality = "Indian";
        profile = "This left-arm seamer from Karnataka became a star in IPL 2011, his very first season in the tournament. With 21 scalps in 13 matches, Aravind was RCB’s leading wicket-taker, but in 2012, however, he remained on the fringes after a very expensive spell in his first game. A quick learner, Aravind will be keen to re-establish himself in the RCB setup this season. ";
        rcbTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.saravind));


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
