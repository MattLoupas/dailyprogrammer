package io.loupas.dailyprogrammer.easy.n339;

import org.junit.Assert;
import org.junit.Test;


public class FileProcessingTest {
	@Test
	public void test1(){
		String input = "Boyce Calles        83460319\n" 
				+ "::EXT::SAL 00000000000044722\n"
				+ "Marcelo Candela     29040821\n"
				+ "::EXT::JOB loser            \n"
				+ "::EXT::SAL 00000000000047706\n"
				+ "Milton Camper       32541106";
		Assert.assertEquals("Marcelo Candela, $47,706", FileProcessing.highestSalary(input));
	}
	
	@Test
	public void test2(){
		String input = "Boyce Calles        83460319\n"
				+"::EXT::SAL 00000000000044722\n"
				+"Marcelo Candela     29040821\n"
				+"::EXT::JOB loser            \n"
				+"::EXT::SAL 00000000000047706\n"
				+"Milton Camper       32541106\n"
				+"Luther Steffen      44311219\n"
				+"::EXT::SAL 00000000000047181\n"
				+"Quentin Salter      38590726\n"
				+"::EXT::JOB COW              \n"
				+"::EXT::SAL 00000000001859623\n"
				+"::EXT::COL humperdink       \n"
				+"Willian Chand       39560505\n"
				+"Major Bills         37790227\n"
				+"::EXT::SAL 00000000003561927\n"
				+"::EXT::JOB CFP              \n"
				+"::EXT::COL akkawi           \n"
				+"Benedict Ringel     95241209\n"
				+"Eddie Che           15830111\n"
				+"::EXT::SAL 00000000000046961\n"
				+"Drew Tynan          84260213\n"
				+"Bud Sloat           45371201\n"
				+"::EXT::JOB CTO              \n"
				+"::EXT::SAL 00000000004301076\n"
				+"::EXT::COL humperdink       \n"
				+"Allen Reade         46761110\n"
				+"Denny Cassidy       99710227\n"
				+"Arnulfo Herrada     84650626\n"
				+"::EXT::SAL 00000000000014737\n"
				+"::EXT::JOB mook             \n"
				+"Buck Goulette       84420413\n"
				+"::EXT::SAL 00000000000027329\n"
				+"Basil Tatum         97330503\n"
				+"::EXT::JOB loser            \n"
				+"Randy Ciulla        32031111\n"
				+"::EXT::SAL 00000000004669876\n"
				+"::EXT::JOB CHP              \n"
				+"::EXT::COL hummus           \n"
				+"Felipe Bungard      36500317\n"
				+"::EXT::SAL 00000000000049176\n"
				+"Irvin Plum          34491126\n"
				+"::EXT::JOB CEO              \n"
				+"::EXT::SAL 00000000002710511\n"
				+"::EXT::COL hummus           \n"
				+"Mel Quintanilla     73660811\n"
				+"::EXT::JOB CXO              \n"
				+"::EXT::SAL 00000000002184725\n"
				+"::EXT::COL akkawi           \n"
				+"Macie Tellez        31340718\n"
				+"::EXT::JOB CRO              \n"
				+"::EXT::SAL 00000000002503183\n"
				+"::EXT::COL hummus           \n"
				+"Wendi Brouse        53061118\n"
				+"::EXT::COL pickle           \n"
				+"::EXT::SAL 00000000003917526\n"
				+"::EXT::JOB CFO              \n"
				+"Synthia Simonds     76860807\n"
				+"::EXT::SAL 00000000001817483\n"
				+"::EXT::JOB COO              \n"
				+"::EXT::COL apple            \n"
				+"Gilma Spero         63180726\n"
				+"::EXT::SAL 00000000004180552\n"
				+"::EXT::JOB CIO              \n"
				+"::EXT::COL chartreuse       \n"
				+"Veronique Walters   60470224\n"
				+"Azalee Countryman   69460609\n"
				+"::EXT::JOB CZO              \n"
				+"::EXT::COL naranja          \n"
				+"::EXT::SAL 00000000002782843\n"
				+"Beata Ryans         18460107\n"
				+"::EXT::SAL 00000000000033073\n"
				+"Mercedez Mahon      26380323\n"
				+"Myrta Hine          81591009\n"
				+"Shanti Chan         19240722\n"
				+"::EXT::JOB mook             \n"
				+"::EXT::SAL 00000000000036496\n"
				+"Reta Eberly         55050821\n"
				+"::EXT::JOB loser            \n"
				+"::EXT::SAL 00000000000042240\n"
				+"Mirtha Mckissick    46730112\n"
				+"::EXT::JOB loser            \n"
				+"Marine Benn         10451207\n"
				+"Melanie Griffeth    59720804\n"
				+"::EXT::JOB mook             \n"
				+"Vanesa Plowman      28600505\n"
				+"::EXT::SAL 00000000000019935\n"
				+"Mamie Burchett      49870101\n"
				+"::EXT::JOB mook             \n"
				+"Aida Horton         65400523\n"
				+"::EXT::SAL 00000000000039958\n"
				+"::EXT::JOB peon             \n"
				+"Leia Principe       83050710\n"
				+"::EXT::SAL 00000000000023830\n"
				+"::EXT::JOB mook             \n"
				+"Olive Shield        70300120\n"
				+"::EXT::JOB loser            \n"
				+"::EXT::SAL 00000000000034563\n"
				+"Ellamae Galeana     46400508\n"
				+"::EXT::SAL 00000000000049203";
		
		Assert.assertEquals("Randy Ciulla, $4,669,876", FileProcessing.highestSalary(input));
	}
}
