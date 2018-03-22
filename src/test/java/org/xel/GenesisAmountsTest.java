package org.xel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anonymous on 27.05.17.
 */
public class GenesisAmountsTest {
    public static final Long[] amountsMainNet = new Long[]{35359300970792L, 2379442055262L, 1615111143216L, 129260240064737L, 4035447421353L, 33943008310830L, 2615692205087L, 3071436598146L, 234456078583L, 62412255256299L, 1888153206525L, 10587687501703L, 2796486144137L, 299133277327L, 131292648767412L, 513808958657L, 61376593378682L, 12249777978017L, 35174368414465L, 2637817372644L, 9549853183082L, 4106835448452L, 3470312567053L, 3790830563695L, 61893892778448L, 1015280431037L, 94925797382912L, 354388450164L, 193530840854L, 2697335620492L, 38247080037888L, 9500840649716L, 15266250651099L, 237151560362L, 2967692665205L, 20475654067055L, 1012661652142L, 389048635765L, 1435272526555L, 1971628462346L, 2306063817104L, 2350383677614L, 1769354454893L, 1023812199382L, 20018660369643L, 11662216323912L, 35020460053674L, 18141067397059L, 69117479817501L, 10365308540184L, 16423804313446L, 11430278621954L, 55879132656852L, 22761454434982L, 442753352449L, 36699440962611L, 7488056900934L, 154607735177339L, 337990979174L, 37811533264832L, 10238121993822L, 17417052056987L, 315683327920L, 3227138605167L, 2884507924005L, 198462360931L, 244937855577370L, 202309951451L, 1149042062718L, 9900722155542L, 32811759028801L, 3997012896819L, 29020651972591L, 9246106431017L, 544828455714L, 20309149304920L, 82209887487487L, 600409588715497L, 3207115413897L, 1994221848835L, 1020375792675L, 10246312491417L, 106476468735754L, 1818096131369L, 28073643462694L, 4177596524853L, 9269778533222L, 88607943938038L, 32610314498840L, 954057093513L, 9675657267000L, 4323797333496L, 2803170745137L, 54290485795017L, 974458289532L, 380856558197L, 89341363972718L, 13765477884913L, 3165856173307L, 9288684299845L, 2688530835577L, 2826859239394L, 1016287653690L, 72571379395233L, 30612119158073L, 633907329766L, 1510122994088L, 25730448194849L, 24875144739779L, 7233991568026L, 92546311685504L, 19489165790782L, 18267858954166L, 437792682162L, 20476243987645L, 19088251677210L, 1845460988264L, 4237116700232L, 4167334340098L, 55438522121196L, 118779989645680L, 2048355642396L, 42419967532315L, 5762893514252L, 17577749550695L, 18744800287301L, 628894315108L, 594182365538L, 87550593159873L, 255202570215L, 59779256752805L, 146147277264770L, 1234933966574L, 4573576463986L, 61428731962935L, 1969416522411L, 9197850874651L, 2046436367088L, 1948837581204L, 2936982249116L, 819049759505L, 220022006007866L, 1057523621263L, 20891448549577L, 15339803462649L, 6662284092185L, 5069983954777L, 3972900869756L, 222973499372L, 17764501646846L, 22523868386409L, 21564044449488L, 42004501381886L, 185787155123L, 388224530139L, 1187370148101L, 953052629854L, 34701090685836L, 4403107387910L, 38583846866397L, 111359326146535L, 199371036578943L, 17657995514406L, 20819338611380L, 9214309794440L, 5119060996911L, 1308796960893L, 906111204503L, 2343695774641L, 20476243987645L, 7678275503922L, 32075795032606L, 9015232011216L, 1857397564173L, 182927432778L, 19185814027998L, 2781514470693L, 4350885855929L, 20885768867397L, 22938014640659L, 1114846167426L, 10310308268225L, 6921796548383L, 14844141691864L, 45522908869965L, 19337094920109L, 5825183322826L, 331386521502L, 53596094650519L, 1240890404823L, 388432452473L, 2670127495294L, 6525124066639L, 1112945479044L, 483707025385L, 20476243987645L, 3567385131127L, 678161653113L, 9637343307359L, 2293339326616L, 8528189725345L, 9304762338282L, 7948329670867L, 148772710222733L, 6031092040937L, 2931599208894L, 198016023066L, 197988373815L, 2215225062710L, 1433337079135L, 4363961448197L, 10243056768623L, 22299514478514L, 1790051892866L, 49937527153838L, 39731181138674L, 4226905820652L, 18075285923332L, 7454683925336L, 1737281325826L, 568772705501L, 8785351442365L, 1693417119590L, 5544069456207L, 1025811477090L, 9132025628781L, 2420119034018L, 5758620915280L, 2530795028718L, 7290126693243L, 971357623710L, 3977739488371L, 12283698768188L, 8490294454343L, 49941653883274L, 28179354837188L, 645372975507L, 126262271462L, 3618338747538L, 9578391158139L, 8844253348947L, 2890978796299L, 2617589971893L, 5899263561263L, 258518584575918L, 9195942793167L, 394673283022L, 5711906821925L, 2036039363339L, 8179834866381L, 226753260974888L, 20476243987645L, 393298720340L, 10155189221149L, 41431017481281L, 360436402686L, 7006363212579L, 20476243987645L, 14582974072601L, 7308203472168L, 12949277815033L, 204707141373L, 1937817380461L, 9805609604803L, 19258492054501L, 2559530498455L, 17918659996315L, 650272624642L, 819949071073L, 20476243987645L, 30496331901957L, 960090128092L, 19889587735869L, 1393439212504L, 5389475394073L, 892973977154L, 2842027064530L, 200516305169L, 2444863532124L, 15215618834757L, 17597464198090L, 5119060996911L, 43022666261612L, 192924611321L, 1258219584459L, 69706138416068L, 2763179619581L, 514441889008L, 1122920388085L, 42048255020985L, 17392957711263L, 10238121993822L, 1730053022089L, 25536609578360L, 90147612129865L, 614287319628L, 700149831347L, 4158150839475L, 3652465820842L, 788509188793L, 682441238811L, 396126843541L, 37162335213150L, 29192077317725L, 15630951044315L, 2646101166712L, 4396349121421L, 669941308398L, 28601995179603L, 4093283078106L, 67369628381196L, 27829561815482L, 10238121993822L, 15458401615072L, 185810854482L, 461636328195L, 511085509452L, 24459315831213L, 2404127656242L, 17364123494225L, 5151152723807L, 1439893901078L, 71000428052875L, 663581981057L, 1012890745940L, 3816333757192L, 1080463737648L, 888390284628L, 10287807615650L, 1925256721526L, 51310951351338L, 219676602896L, 94988105203004L, 75346455224776L, 142305411005842L, 9453080810829L, 132955045299435L, 1760936279176L, 2290683972773L, 204762439876L, 140977873375L, 204762439876L, 8710303480230L, 3804269678759L, 14785633510589L, 147907683693L, 532382343678L, 3875682159639L, 2047624398764L, 1612440883410L, 47205642176977L, 18931354037601L, 9255191184340L, 16482969571094L, 17981128340050L, 11458322860458L, 4823258901124L, 115219363650002L, 7755584858680L, 24164456337844L, 14855830135469L, 29711112973801L, 17771752425462L, 1953300960004L, 39627061965917L, 4765521253888L, 5901613747455L, 9609995908969L, 3690768720778L, 28092427177646L, 150193220189L, 6973849856655L, 28994627435750L, 70098439077513L, 202439902936L, 1766440777030L, 102381219938225L, 526915692118L, 8948684247230L, 10377158218418L, 88565820306860L, 2106556798492L, 545124697668L, 2647020622733L, 10238121993822L, 3055649734869L, 14955087859213L, 265593948056396L, 204762439876L, 6409838517482L, 20812022513391L, 355868110932L, 2253649895838L, 210905313072L, 7266189606557L, 616334944027L, 2323105718314L, 10633687952574L, 5521128479154L, 9453673294737L, 87130055781618L, 5730022506839L, 85345277232539L, 1966256608218L, 16071126104294L, 549493820183361L, 124097400984570L, 16611676187579L, 12490508832463L, 2342912313310L, 1376135917374L, 273332577903L, 1276542136746L, 6142873196293L, 74781541880436L, 3191214989422L, 2003425098949L, 866844251672L, 205712938624L, 1631834989103L, 3045959789928L, 208216107570L, 20476243987645L, 7426588338249L, 17761767096599L, 8140685497639L, 701011164704L, 529867446964L, 119760669016297L, 1559436609096L, 41537072101459L, 4098250715999L, 6708695331935L, 18896669476363L, 241619679054L, 6464704773013L
    };

    @Test
    public void testGenesisAmounts(){
        long total = 0;
        for(int i=0;i<amountsMainNet.length;++i)
            total += amountsMainNet[i];
        System.out.println("Total amounts: " + total/Constants.ONE_NXT);
        Assert.assertTrue(total<=Constants.MAX_BALANCE_NQT);
        Assert.assertTrue(Constants.MAX_BALANCE_NXT - total<= 1);
    }

}