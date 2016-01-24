package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dhaval on 4/22/2015.
 */
public class SRHTeamDetails {



    List<Map<String,?>> srhTeam;

    public List<Map<String, ?>> getItemList() {
        return srhTeam;
    }
    private static List<VideoEntry> VIDEO_LIST = null;

    public int getSize(){
        return srhTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < srhTeam.size()){
            return (HashMap) srhTeam.get(i);
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

    public SRHTeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        srhTeam = new ArrayList<Map<String,?>>();


        title = "David Warner (c)";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm leg spin";
        nationality = "Australian";
        profile = "David Warner answered critics when he made a successful transition to Test cricket from the limited-overs format. The first Australian cricketer in 132 years to be selected for a National team without playing first-class cricket, Warner also became the first cricketer to record centuries in back-to-back T20 matches. He scored 89 on his international Twenty20 debut, against South Africa, and held his own against the likes of Makhaya Ntini, Dale Steyn and Lonwabo Tsotsobe. He was quickly signed by the Delhi Daredevils and was retained by the franchise when they outbid the others at the 2011 IPL Player Auction. And after spending five seasons with the Delhi franchise, he was signed by the Sunrisers Hyderabad during the 2014 IPL Player Auction for INR 5.5 crores. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dwarner));


        title = "Shikhar Dhawan";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "Shikhar Dhawan’s powerful batting and great fielding skills make him a perfect fit for the Twenty20 format. The left-hand opening batsman played for the Delhi Daredevils in IPL 2008 and was their third-highest run-getter with 340 runs in 14 matches at an average of 37.77. He turned out for the Mumbai Indians for two seasons before moving to the Deccan Chargers. Dhawan had a great 2012 season, tallying 569 runs from 15 matches. After that, a great 2012-13 domestic season earned Dhawan a spot in India’s Test squad for the home series against Australia last year. Since then, he has been Team India’s preferred opener in Tests and ODIs. Given his fluid run-scoring at the top of the order – not to mention the world-famous moustache twirl – he is an instant crowd favourite. As one of just two players retained by the Sunrisers Hyderabad going into IPL 2014, the ever-smiling Dhawan will have to lead his new-look team from the front. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.sdhawan));


        title = "Dale Steyn";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm fast";
        nationality = "South African";
        profile = "He is quick, accurate and can swing the ball both ways. In other words, Dale Steyn is a batsman’s worst nightmare. He is the top-ranked bowler in Test cricket and one of the main reasons why South Africa are the No.1 Test team in the world. A fierce competitor on the cricket field – he once said that he loves cricket because it is the only profession in which he can legally knock off a batsman’s head with a leather ball – Steyn is a charming and friendly boy next door off it. The menacing Proteas pacer was part of the Royal Challengers Bangalore for the first three IPL seasons before the Deccan Chargers signed him in 2011. He was instrumental in the Sunrisers Hyderabad making the Playoffs last year as he picked up 19 wickets while maintaining a sub-six economy rate during IPL 2013. “Deadly Dale,” “Steyn Remover” and “Steyn Gun” are just some of the fitting epithets given to one of the biggest impact players in the game. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dsteyn));


        title = "Bhuvneshwar Kumar";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "It has been a rapid rise to the top for Uttar Pradesh’s Bhuvneshwar Kumar. After doing exceptionally well on the domestic circuit, the 23-year-old got his chance at the international level. He was impressive right off the blocks in his maiden ODI and T20I appearances for Team India. And thanks to his ability to bowl long spells, he was even selected in the Test squad against the visiting Australian side in February-March 2013. Expect this pacer, who also happens to be a very handy bat, to feature prominently in SRH’s plans in IPL 2014. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bkumar));



        title = "Ishant Sharma)";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "This lanky 6’4” paceman shot to prominence during the 2007-08 Test series in Australia. His rhythmic, high-arm action allowed him to bowl at around 140 kph. He made his Ranji Trophy debut at 18 and an injury to Munaf Patel provided him an opening during India's tour of Bangladesh in May 2007. But it was in Australia where he caught the attention, prompting Steve Waugh to call him the next best thing in Indian cricket. Injury kept him on the sidelines for a prolonged period. But he is fit and raring to go again for the Sunrisers Hyderabad. Under Dale Steyn’s guidance, Ishant has much to gain from his continued stint with SRH. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.isharma));

        title = "Moises Henriques";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Australian";
        profile = "A talented all-rounder, who has made a mark in the Australian Twenty20 circuit, Moises Henriques represented Kolkata Knight Riders, Delhi Daredevils and Royal Challengers Bangalore in the 2009, 2010 and 2013 seasons of the IPL respectively. Playing for the Sydney Sixers in CLT20 2012, Henriques contributed with eight wickets and 86 runs as his team surged to the title. He will be a key component of the Sunrisers Hyderabad come IPL 2014. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mhenriques));


        title = "Lokesh Rahul";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Lokesh Rahul was part of India’s Under-19 team for the 2010 World Cup in New Zealand. The 21-year-old wicketkeeper-batsman from Bangalore came to prominence with his fine performance for the Bangalore Brigadiers in the Karnataka Premier League. A batsman with tight technique, Lokesh looks up to Rahul Dravid as his role model and the legendary India batsman also holds the youngster in high regard. Following his 250 runs in the 2013 Syed Mushtaq Ali Trophy (India’s domestic T20 competition), Lokesh was drafted by the Royal Challengers Bangalore squad ahead of IPL 2013. In IPL 2014, this young talent will feature in the Sunrisers Hyderabad squad. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.lrahul));


        title = "Parveez Rasool";
        role = "Bowling All-rounder";
        bats = "Right-hand bat";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "With 33 wickets and 594 runs, Parveez Rasool was the leading run-getter and the highest wicket-taker for J&K in the Ranji Trophy 2012-13 season. He followed up with an impressive seven for 45 against the visiting Australian side in a warm-up game at Chennai in early 2013. He has received high praise from former India spinner Bishan Singh Bedi and fellow off-spinner Ravichandran Ashwin. Signed by the Pune Warriors India on the back of a successful domestic season, Rasool became the first player from Jammu & Kashmir to play in the Indian Premier League. This year, Rasool will represent the Sunrisers Hyderabad as he continues to make an impact on Indian cricket. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.prasool));


        title = "Naman Ojha";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A flashy wicketkeeper-batsman from Madhya Pradesh, Naman Ojha has been a consistent run-getter in domestic cricket for several years now. He has been impressive with his glovework along with his batting in recent times. A clean striker of the ball, he opens for his state side, but has been effective lower down the order in the IPL. He was part of the Rajasthan Royals the first three seasons of the IPL and then signed on with the Delhi Daredevils. This year, Ojha will suit up for Sunrisers Hyerabad. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nojha));


        title = "Ashish Reddy";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium medium";
        nationality = "Indian";
        profile = "This 23-year-old medium pacer from Secunderabad justified his selection into the Deccan Chargers rooster by claiming 10 wickets in nine matches. While he tends to be a bit expensive with his bowling, he does provide regular breakthroughs. He has also impressed on the domestic circuit – both with bat and ball – where he represents Hyderabad. On the back of his impressive IPL 2013 campaign, he will hope to feature regularly in the playing XI of Surisers Hyderabad. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.areddy));

        title = "Ricky Bhui";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "17-year-old Ricky Bhui made his first-class debut for Andhra Pradesh in the 2013-14 Ranji Trophy. While the middle-order batsman may be short on experience at the senior level – having played only one four-day game for his home state – he played for India U-19 in the recently concluded ICC U-19 World Cup. He will be hoping to make a splash when he dons the Sunrisers Hyderabad jersey in IPL 2014. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rbhui));


        title = "Chama Milind";
        role = "Bowler";
        bats = "Left-handed";
        bowls = "Left-arm medium";
        nationality = "Indian";
        profile="This 19-year-old left-arm medium pacer is one of two Under-19 players signed by the Sunrisers Hyderabad during the 2014 IPL Player Auction. Since his List A debut during the 2012-13 season, Chama Milind has represented Hyderabad in all three formats in the domestic circuit. After playing for India U-19 in the 2014 ICC U-19 World Cup, this youngster will be hoping for a good outing in IPL 2014 as well. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.cmilind));

        title = "Karn Sharma";
        role = "All-rounder";
        bats = "Left-hand bat";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "A left-hand batsman and handy googly bowler, Karan Sharma was part of the Royal Challengers Bangalore squad in IPL 2009. Born in Uttar Pradesh, Sharma plays his domestic cricket for Railways, having made his first-class debut in 2007. The Sunrisers Hyderabad handed him a contract ahead of IPL 2013. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ksharma));


        title = "Kane Williamson";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "New Zealander";
        profile = "A prolific run-scorer, Kane Williamson is a vital cog in the New Zealand line-up across formats. He has received high praise from none other than the legendary former NZ captain, Martin Crowe for his batting abilities and his temperament. He led New Zealand in the 2008 Under-19 ICC World Cup in Malaysia. He is set to make his Indian Premier League debut for SRH in 2015. Consistent performances in the domestic circuit and some solid batting performances during his junior cricket days made him one of the brightest prospects for New Zealand. Williamson was always rated highly and justified those expectations on his Test debut as he scored 131 against India in Ahmedabad in 2010. The right-handed batsman has been effective in the shortest format of the game as well, which earned him an IPL contract. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.kwilliamson));


        title = "Kevin Pietersen";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "English";
        profile = "Born in Pietermaritzburg, KP moved to the United Kingdom to further his cricketing career. He started off as an off-spinner who could bat a bit. However, he soon discovered his abilities with the willow. After scoring plenty of impact runs in county cricket, and soon after qualifying to play for England, he was handed his ODI cap in 2004. A dangerous batsman, Pietersen is also known for his trademark shot, the ‘switch-hit’. A match winner in all formats of the game, Pietersen was signed by the Royal Challengers Bangalore for IPL 2009 and IPL 2010. The Delhi Daredevils bid USD 650,000 in 2011 to get him on board. Capable of taking apart any bowling attack on his day, Pietersen will continue to be part of the Daredevils. With 305 runs in eight matches including an unbeaten century in IPL 2012 he was vital for the team’s fortunes in the edition. After missing out IPL 2013 due to injury, the prolific run-getter led Delhi Daredevils in 2014. They, however, let him go to the 2015 Player Auction, where SRH acquired him. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.kpietersen));


        title = "Eoin Morgan";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm medium";
        nationality = "English";
        profile = "An Irish-born Englishman with a reputation for inventive and audacious stroke-play. A compact left-hander, Morgan grew up playing hurling and with his change-up sweeps and pulls. He has clearly adopted aspects of that Irish sport into his cricket. At the age of 23, he shot to prominence on the back of two match-winning innings against South Africa. With a blend of nous and power, Morgan looks a natural finisher. His powerful shot-making and calm under pressure 183 runs helped England to their first triumph in a global limited-overs event during the ICC World Twenty20 in 2010. Morgan has spent most of his IPL career with KKR. This year he will turn up for SRH. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.emorgan));

        title = "Ravi Bopara";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "English";
        profile = "An experienced campaigner, Bopara has played over 100 ODIs for England besides representing the country in 13 Tests and 38 T20Is. Set to don the SRH jersey in 2015, he was earlier part of the Kings XI Punjab side in the IPL. Besides playing for clubs and teams in England, the London born cricketer has also played for Auckland, Chittagong Kings, Dolphins and Sydney Sixers. The stroke-player’s wealth of experience of playing in different conditions will strengthen SRH’s batting line-up. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rbopara));


        title = "Trent Boult";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm medium fast";
        nationality = "New Zealander";
        profile = "Trent Boult was a key bowler for New Zealand in their run-up to the 2015 ICC Cricket World Cup. The left-arm pacer shares the new-ball with Tim Southee while playing for the Kiwis. He had earlier earned temporary hero status among the New Zealand cricketing public after playing an important support role on Test debut at Hobart in December 2011. Three first-innings wickets allied with vital lower-order runs in the second innings helped New Zealand defeat Australia in a Test in Australia for the first time in 26 years. Before earning Test honours, Boult was a key performer at New Zealand Under-19 level. The pacer will be keen to make an impression in the IPL when he shares the stage with Dale Steyn. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.tboult));


        title = "Praveen Kumare";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Praveen Kumar hails from a family of wrestlers. He is the quintessential swing bowler who gives any team he represents an edge up-front. PK, as he is known to teammates, strikes early and consistently, and thus is an extra option with the new ball. He is the go-to man in a crunch situation. Besides being a fine opening bowler, he is also an aggressive pinch-hitter. Although he is not a tear-away paceman, he has worked out plenty of variations in his bowling. On India’s tour of England in 2011, he picked up five wickets at Lord’s and finished the tour with 15 wickets in his three Test appearances. He played for the Royal Challengers Bangalore in the first three seasons of the IPL, before the Kings XI Punjab signed him at the IPL Player Auction 2011. IPL 2015 will see the swing bowler team up with his fellow UP pacer, Bhuvneshwar Kumar, to bowl for SRH. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.pkumar));


        title = "Hanuma Vihari";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "The 19-year-old top-order batsman is one of the local uncapped players signed by the Sunrisers Hyderabad ahead of IPL 2013. Hanuma Vihari started out early, having made his first-class debut for Hyderabad in 2010. Vihari is also a handy off-spinner, capable of providing crucial breakthroughs when required. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.hvihari));


        title = "Prasanth Padmanabhan";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm spin";
        nationality = "Indian";
        profile = "Prasanth Padmanabham has been bought back by the Sunrisers Hyderabad in the IPL 2015 auction. The 29-year old all-rounder made his first-class debut for Kerala in 2006 and played his first T20 for the state side the following year. He was earlier part of the Kochi Tuskars Kerala and is no stranger to the T20 tournament. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ppadnabhan));

        title = "Siddarth Kaul";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Indian";
        profile = "A right-arm pacer, Siddharth Kaul, was the second highest wicket-taker in the Ranji Trophy 2012-13 season and the highest wicket-taker for his state team, Punjab. The youngster was part of the team that won the 2008 Under-19 World Cup in Malaysia. He played a crucial role in the team’s victory and has since been making waves in the domestic circuit. He claimed a five-for on his first-class debut for Punjab in 2007-08. The former Kolkata Knight Riders player was signed by the Delhi Daredevils in 2013 and bought back by them in the 2014 auction. He claimed four wickets from six matches in a rather forgettable 2013 IPL season. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.skaul));


        title = "Bipul Sharma";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "An orthodox left-arm spinner and a useful lower-order batsman, Bipul Sharma hails from Amritsar. The 29-year-old was just out of his teens when he was called up to play for Punjab. Although he has been around for several seasons now, he hasn’t been able to nail a permanent place in the Punjab Ranji Trophy team. However, he is a regular in the Punjab limited overs line-up. Sharma has been part of Kings XI Punjab since 2010 but has not able to live up to expectations, coming off wicket-less in five matches in in 2012. ";
        srhTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bsharma));


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
