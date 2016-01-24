package com.example.karan92.finalprojectspring15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Karan92 on 4/17/2015.
 */
public class CSKTeamDetails {
    List<Map<String,?>> cskTeam;

    public List<Map<String, ?>> getItemList() {
        return cskTeam;
    }

    public int getSize(){
        return cskTeam.size();
    }

    public HashMap getItem(int i){
        if (i >=0 && i < cskTeam.size()){
            return (HashMap) cskTeam.get(i);
        } else return null;
    }
    public boolean isSelected;
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public CSKTeamDetails(){
        String title;
        String role;
        String bats;
        String bowls;
        String nationality;
        String profile;
        cskTeam = new ArrayList<Map<String,?>>();

        title = "MS Dhoni (c/wk)";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "A born leader, MS Dhoni is Chennai Super Kings’ flamboyant yet grounded captain who exudes enough confidence to inspire and guide his team. A batting powerhouse, Dhoni is more than capable of demolishing any bowling attack on his own. Being a reliable wicket-keeper adds to the complete package that Dhoni brings to the CSK setup. Calm and composed at all times, he is a delight to play under with his affirmative leadership qualities combined with a real ‘go get ‘em’ attitude giving a boost to every side he leads. The captain who led India to the 2007 World Twenty20 and the 2011 World Cup, has taken CSK to the IPL title twice, in 2010 and 2011. Under his leadership, the Chennai-based franchise also lifted the CLT20 trophy in 2010. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dhoni));

        title = "Ashish Nehra";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Left-arm medium fast";
        nationality = "Indian";
        profile = "One of the better swing bowlers in India, Ashish Nehra’s career has been plagued by injuries. When fully fit and in form, Nehra is capable of running through sides, like he did against England in the 2003 ICC World Cup. The left-arm paceman, who plays for Delhi on the domestic circuit, has the experience to bowl in any situation. He represented the Mumbai Indians in IPL 2008 and joined the Delhi Daredevils during IPL 2009 in South Africa. He was a part of the Pune Warriors India till IPL 2012 before being traded back to the Daredevils going into IPL 2013, Nehra was picked by CSK in the Player Auction ahead of the 2014 season. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.nehra));

        title = "Baba Aparajith";
        role = "All-rounder";
        bats = "Right-hand bat";
        bowls = "Right-arm offbreak";
        nationality = "Indian";
        profile = "Disguised under a shy, diminutive and skinny demeanor is a hard-hitting all-rounder who has the attitude and aptitude for big matches. The 19 year-old showed that by producing man-of-the-match winning performances in the quarter and semi-final of the 2012 Under-19 World Cup. His performances were crucial to the Indian colts bringing the Cup back home. A batsman capable of hitting the cricket ball hard and long and a handy left-arm spinner, Aparajith made his first-class debut for Tamil Nadu in 2011. An IPL contract with the CSK ahead of IPL 2013 and being picked up at the 2014 Player Auction is the latest feather in his very young cricketing cap. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.baba));

        title = "Dwayne Bravo";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "West Indian";
        profile = "Dwayne Bravo brings the Caribbean swagger into the CSK camp. After plying his skills for the Mumbai Indians in the first three seasons, Bravo was taken up by the Super Kings ahead of the 2011 IPL. A hard-hitting batsman and a decent-paced bowler, Bravo is an asset to any T20 side in the world. No wonder, his services are utilized by T20 teams around the world. His all-round usefulness in the field led the CSK think tank to retain him ahead of the 2014 season";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.bravo));

        title = "Dwayne Smith";
        role = "Batting All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "West Indian";
        profile = "A handy T20 cricketer, Dwayne Smith was likened to the great West Indies batting legend Sir Viv Richards when he arrived on the cricketing scene. Smith now also doubles up as a decent medium-pacer with more than 120 wickets to his name in first-class cricket and more than 75 scalps in T20s. Smith has represented West Indies in all three formats of the game, but it is in T20 cricket that he has established a fairly solid reputation of being a hard-hitting batsman who also provides a quality bowling option to his skipper. Smith’s high point in T20 cricket came in the 2009 Twenty20 Cup final in England where his innings of 59 off just 26 deliveries helped Sussex win the championship and book a place for CLT20 2009. He was also a part of the 2012 ICC World T20 winning West Indies squad. In IPL, he plied his trade for the Mumbai Indians till 2013 before being snapped up by CSK in the 2014 IPL Player Auction. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.dsmith));

        title = "Faf du Plessis";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "South African";
        profile = "Drafted into the CSK squad ahead of the 2011 season, this South African batsman had to wait an entire season to play his first game. He finally got his chance in IPL 2012 and he made it count immediately with some solid performances opening the batting. Francois du Plessis impressed with a half-century on his ODI debut, against India and soon enough, found himself in South Africa’s squad for the 2011 World Cup. With a century on Test debut against Australia, du Plessis has shed the tag of a limited-overs specialist. Although batting remains his area of prowess, du Plessis can come up with a few handy leg-spinners when required. To boot that, he is a livewire in the field, hence, making him a perfect T20 package for any captain. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.duplesses));

        title = "Brendon McCullum";
        role = "Wicketkeeper batsman";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "New Zealander";
        profile = "Brash, brutal and brilliant to watch, Brendon McCullum can bruise bowling attacks like few other men in international cricket. A wicketkeeper-batsman, he was responsible for getting the IPL off to an electrifying start, lighting up the tournament's first match with a 158 and showing what the format had to offer. His knock against Australia in a Twenty20 international, where he brazenly scooped 155 kph offerings from Shaun Tait and Dirk Nannes over the wicketkeeper's head at Christchurch in 2009-10, is regarded as one of the best T20 innings ever. Having represented Kolkata Knight Riders and Kochi Tuskers Kerala in the previous seasons, the Kiwi captain was bought by CSK in the 2014 IPL Player Auction. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.macullam));

        title = "Ishwar Pandey";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Ishwar Pandey is a right-arm medium pacer from Madhya Pradesh, who made his first-class debut back in 2010. In 31 first-class matches, the 24-year-old has bagged an impressive 131 wickets at an average of just over 24. After emerging as the highest wicket-taker in the 2012-13 Ranji Trophy, Pandey earned an IPL contract with the Pune Warriors. His consistency at the domestic level was rewarded when he was called up for India’s Test and ODI squads for the 2014 tour of New Zealand. In the subsequent Player Auction, the pacer was bought by CSK. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.pandey));

        title = "Matt Henry";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm fast-medium";
        nationality = "New Zealander";
        profile = "Matt Henry caught the imagination of the IPL franchises in his very first international outing – the fifth match of the 2014 ODI series against India, in Wellington. The 22-year-old fast bowler ran through the Indian line-up, claiming 4 for 38 and winning the game for New Zealand. A fortnight later he had an IPL contract when CSK took him at the 2014 Player Auction. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.henry));

        title = "Michael Hussey";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm medium";
        nationality = "Australian";
        profile = "A late entrant into the Australian team, Michael Hussey has made a name for himself in a significantly less amount of time. At 38, Hussey is hardly a spring chicken, but the ever-smiling left-handed batsman from Australia never lets age dictate his performance. Hussey started his international career with a real bang, reaching statistical stratosphere in both Tests and ODIs. ‘Mr. Cricket’, as he is affectionately called, was a real honest worker for CSK since IPL 2008. In IPL 2014, this legendary Australian batsman suited up for Mumbai Indians. Hussey became the second batsman to score a century in IPL when he made 116 against Kings XI Punjab in 2008. He was pivotal in CSK winning the IPL and CLT20 in 2010. Hussey’s value to his team isn’t limited to his cricketing skills. With his work ethics and humility he has established himself as a role model for all the younger players around him. In the 2015 Player Auction, CSK bought the Australian batsman back. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.hussy));

        title = "Rahul Sharma";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm leg spin";
        nationality = "Indian";
        profile = "Rahul Sharma belongs to the new generation of Indian cricketers who have benefitted from the IPL. The tall 26-year-old from Jalandhar isn’t an orthodox leg-spinner; he delivers the ball with a high-arm action, bowls flat and only occasionally gets the ball to turn. He relies heavily on bounce, often drawing comparisons with Anil Kumble. Sharma was initially signed by the Deccan Chargers before being roped in by the Pune Warriors ahead of IPL 2011 and performed very well that year. He even made it to the Indian team on the back of his IPL success. He was signed up by the Daredevils in the 2014 auction and CSK bagged him ahead of the 2015 season. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.rahul));

        title = "Ronit More";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Ronit More is a 21-year-old right-arm medium-pacer from Karnataka. The Belgaum-born bowler announced his arrival in domestic cricket by picking up six wickets in his very first match for Karnataka. It was the best limited-overs debut in Indian domestic cricket. Tall, lanky, skiddy and deceptive, More has even played for the Australian Institute of Sport and the Madras Rubber Factory (MRF). During last season’s Vijay Hazare one-day tournament, he picked up 15 wickets in seven matches. As a result, he was roped in by the Royal Challengers Bangalore for IPL 2012. In 2013 he was part of CSK, who bought him back at the 2014 Player Auction. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ronit));

        title = "Suresh Raina";
        role = "Batsman";
        bats = "Left-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile="Suresh Raina is a part of India’s new age firebrand cricketers. Young, fearless and oozing with talent, Raina has successfully carved out a niche for himself. A solid striker of the ball, Raina possesses the rare quality of performing well under pressure. Batting in the middle order for both India and CSK, Raina is quickly mastering the art of finishing games, along with MS Dhoni. The left-handed batsman is also a part-time off break bowler who often provides that crucial breakthrough at the right time. To add to his talent with the bat and the ball, Raina is a livewire on the field with good reflexes. He also made his Test debut in July 2010 against Sri Lanka, scoring century in his very first innings. Raina is the only batsman to have scored over 400 runs in each IPL season and with 2802 runs, is the highest run-getter in IPL. In Raina, CSK have a real match-winner in their ranks. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.raina));

        title = "Samuel Badree";
        role = "Bowler";
        bats = "Right-hand bat";
        bowls = "Right-arm leg spin";
        nationality = "West Indian";
        profile = "The West Indies leg-spinner made his national debut with T20I in 2012. He was part of the team that lifted the 2012, World T20 title in Colombo. The Trinidad & Tobago player made his first-class debut in 2001-02 and played his first List A match the following season. He was the Man of the Match in Trinidad & Tobago's victory against Barbados in the WICB Cup final in 2008. An integral part of the T&T team Badree made his IPL debut with Rajasthan Royals in the 2013 season. He was picked up by CSK in the 2014 Player Auction. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.badree));


        title = "Ravindra Jadeja";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "A left-arm spinner and lower order batsman, Ravindra Jadeja has been an enigma right since his advent in international cricket. He was part of the victorious Indian U-19 cricket team that won the World Cup in Malaysia in 2008. His performance in IPL 2008 helped Rajasthan Royals to title victory and earned him the nickname \"Rockstar\" by his captain Shane Warne. In 2012 IPL player auction, Jadeja was bought by Chennai Super Kings for $2 million (approx. Rs. 9.8 Crore), making him the most expensive player of the year's auction. With Dhoni showing immense faith in his abilities, Jadeja has become a regular fixture in Team India across all formats. As for CSK, they retained him ahead of IPL 2014. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.jadeja));

        title = "Ravichandran Ashwin";
        role = "Bowling All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm off-spin";
        nationality = "Indian";
        profile = "Quiet, unassuming but deadly with the ball, Ravichandran Ashwin is one of the major reasons why CSK got their hands on the IPL trophy twice. The tall right-arm offbreak bowler from Chennai was a complete revelation in the third edition of the Indian Premier League. Ashwin managed to cement his place in the CSK lineup with some miserly spells with the new ball. After an impressive 2010 IPL season, Ashwin was duly rewarded with a place in the Indian squad for the ICC Cricket World Cup. He has never looked back since then and is now a vital cog in India’s bowing attack in all formats of the game. Always looking to add variety in his bowling, Ashwin can be a force to reckon with. His exploits for CSK over the years meant he was retained by the franchise ahead of the 2014 season. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.ashwin));

        title = "Mohit Sharma";
        role = "Bowler";
        bats = "Right-handed";
        bowls = "Right-arm medium";
        nationality = "Indian";
        profile = "Mohit Sharma made his first-class debut for Haryana in the 2011-12 Ranji Trophy season, and since then has made rapid strides in his career. In the 2012-13 Ranji Trophy season, Mohit finished with 37 wickets in eight games at 23.24, hence earning his maiden IPL contract from the Chennai-based franchise. He impressed in IPL 2013 with 20 wickets from 15 matches and was soon playing ODI cricket for India. Part of the 2014 IPL Player Auction, Mohit was bought back by CSK. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.mohit));

        title = "Pawan Negi";
        role = "Bowling All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm orthodox spin";
        nationality = "Indian";
        profile = "This youngster who bats left-handed and bowls left-arm spin, is viewed as a potential all-rounder in the making. He impressed the Delhi Daredevils bosses who were scouting local talent at the Syed Mushtaq Ali Trophy Twenty20 competition and was signed on immediately. The promising young left-arm spinner has always had a tendency to punch above his weight from a very young age. When he went to bowl in the nets as boy, the coach there was worried if his delivery would even reach the batsman. But the small-sized bowler surprised everyone with a beamer. However, injury added a twist to the tale and threatened to take away his most cherished dream, of being a cricketer, at a very tender age. But Negi was not the type to give up and decided to convert himself into a left-arm spinner and focus on his batting. In his brief Twenty20 career, Negi has batted in the middle-order and bowled economically and has come up with match winning performances for his IPL franchise in the fifth edition of IPL. Negi was bought by CSK at the 2014 Player Auction. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.negi));

        title = "Kyle Abbott";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "South African";
        profile = "A pace-bowling all-rounder from Kwa-Zulu Natal, Kyle Abbott's cricketing skills are not dissimilar to those of Lance Klusener. Abbott played for his home province first in 2008 and represented the Dolphins in 2010. Abbott rose through the ranks by playing against Bangladesh A and Sri Lanka A. He emerged as the highest wicket-taker in the first-class season of 2012-13 with Klusener as the Dolphins' coach. That performance earned Abbott his maiden Test call-up for the home series against Pakistan. A calf injury to Jacques Kallis meant Test debut for Abbott at the Centurion in 2013 in that very series. Abbott is set for his first Test of the IPL after being picked up in the 2015 Player Auction by CSK. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.abbott));

        title = "Irfan Pathan";
        role = "All-rounder";
        bats = "Left-handed";
        bowls = "Left-arm medium fast";
        nationality = "Indian";
        profile = "A swing bowler and a very handy batsman, who can fit into a variety of roles, the younger of the Pathan brothers is a gift to any captain or coach. Primarily considered a lower-order batsman, coaches have even used him at the top of the line-up and as a pinch-hitter. His rapid rise to the top and his consistent contributions with bat and ball in the early part of his career led to a lot of comparisons. However, excessive pressure, an unclear role within the team and too many changes to his bowling action resulted in the Baroda all-rounder losing his place in the national side. Injuries only added to his woes. However, after recovering, he was back in the thick of things and was called up to the national side in December 2011. He was with Kings XI Punjab during the first three seasons of the IPL and was the team’s leading wicket-taker. The left-arm pacer has since added a few more variations to his armory. He turned out for the Delhi Daredevils in IPL 2012 and 2013, and played for Sunrisers Hyderabad in IPL 2014. At the Player Auction ahead of the 2015 season, Pathan was bought by CSK. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.irfan));

        title = "Pratyush Singh";
        role = "Batsman";
        bats = "Right-handed";
        bowls = "Right-arm leg-break";
        nationality = "Indian";
        profile = "Growing up, young Pratyush Singh developed a keen interest to play cricket but since his family had to shift to Agartala from Jharkhand, in keeping with the sport that was popular in his new surroundings, he chose football without second thoughts. But a few years later his family shifted to Delhi and Pratyush’s cricket journey got underway. Singh is considered to be a hard striker of the cricket ball and has a reputation of being more than handy with the ball. He has represented Delhi at the Plate level and enjoyed a good run with the U-16 set-up raking up big scores with the bat. A stint with the Chennai Super Kings in the 2015 edition of the IPL will be a great learning curve for the 20-year old. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.pratyush));

        title = "Andrew Tye";
        role = "All-rounder";
        bats = "Right-handed";
        bowls = "Right-arm medium fast";
        nationality = "Australian";
        profile = "Perth-born right-arm medium fast bowler, Andrew Tye was a late bloomer in domestic cricket but was a revelation during the 2013-14 Ryobi Cup in Australia. He took 13 wickets in five games to be the tournament’s second leading wicket-taker. He also showed his talent with the bat with some aggressive displays where he plundered seven sixes. Tye was later roped in by the Australian T20 league and was considered to be the find of the tournament in 2014. In 2015, the all-rounder would be looking to put up meaningful performances for the Chennai Super Kings. ";
        cskTeam.add(item(title,role,bats,bowls,nationality,profile,R.drawable.tye));
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
