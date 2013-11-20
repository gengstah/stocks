package org.cognoscenti.stocks.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class HttpUtilTest {
	
	@Test
	public void testSecuritiesAndIndicesForPublic() {
		String expected = "[{\"totalVolume\":\"8,000\",\"indicator\":\"D\",\"percChangeClose\":\"-6.71\",\"lastTradedPrice\":\"15.58\",\"securityAlias\":\"Asiabest Gorup\",\"indicatorImg\":\"\",\"securitySymbol\":\"ABG\"},{\"totalVolume\":\"3,900\",\"indicator\":\"U\",\"percChangeClose\":\"0.9\",\"lastTradedPrice\":\"33.8\",\"securityAlias\":\"ABS-CBN\",\"indicatorImg\":\"\",\"securitySymbol\":\"ABS\"},{\"totalVolume\":\"407,100\",\"indicator\":\"U\",\"percChangeClose\":\"0.74\",\"lastTradedPrice\":\"34.25\",\"securityAlias\":\"ABS-CBN PDR\",\"indicatorImg\":\"\",\"securitySymbol\":\"ABSP\"},{\"totalVolume\":\"470,640\",\"indicator\":\"U\",\"percChangeClose\":\"1.45\",\"lastTradedPrice\":\"595\",\"securityAlias\":\"Ayala Corp\",\"indicatorImg\":\"\",\"securitySymbol\":\"AC\"},{\"totalVolume\":\"2,000\",\"indicator\":\"U\",\"percChangeClose\":\"0.93\",\"lastTradedPrice\":\"1.09\",\"securityAlias\":\"Acesite Hotel\",\"indicatorImg\":\"\",\"securitySymbol\":\"ACE\"},{\"totalVolume\":\"43,890\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"514.5\",\"securityAlias\":\"Ayala Pref. B\",\"indicatorImg\":\"\",\"securitySymbol\":\"ACPB\"},{\"totalVolume\":\"471,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.34\",\"securityAlias\":\"Alsons Cons\",\"indicatorImg\":\"\",\"securitySymbol\":\"ACR\"},{\"totalVolume\":\"1,114,500\",\"indicator\":\"U\",\"percChangeClose\":\"0.3\",\"lastTradedPrice\":\"50\",\"securityAlias\":\"Aboitiz\",\"indicatorImg\":\"\",\"securitySymbol\":\"AEV\"},{\"totalVolume\":\"265,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.14\",\"lastTradedPrice\":\"3.46\",\"securityAlias\":\"AGF\",\"indicatorImg\":\"\",\"securitySymbol\":\"AGF\"},{\"totalVolume\":\"10,578,700\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"26.9\",\"securityAlias\":\"Alliance Global\",\"indicatorImg\":\"\",\"securitySymbol\":\"AGI\"},{\"totalVolume\":\"12,700,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.21\",\"securityAlias\":\"Arthaland\",\"indicatorImg\":\"\",\"securitySymbol\":\"ALCO\"},{\"totalVolume\":\"63,500\",\"indicator\":\"D\",\"percChangeClose\":\"-0.2\",\"lastTradedPrice\":\"25\",\"securityAlias\":\"Anchor Land\",\"indicatorImg\":\"\",\"securitySymbol\":\"ALHI\"},{\"totalVolume\":\"10,378,800\",\"indicator\":\"U\",\"percChangeClose\":\"0.17\",\"lastTradedPrice\":\"28.7\",\"securityAlias\":\"Ayala Land\",\"indicatorImg\":\"\",\"securitySymbol\":\"ALI\"},{\"totalVolume\":\"3,800\",\"indicator\":\"D\",\"percChangeClose\":\"-1.36\",\"lastTradedPrice\":\"5.8\",\"securityAlias\":\"AgriNurture\",\"indicatorImg\":\"\",\"securitySymbol\":\"ANI\"},{\"totalVolume\":\"141,800\",\"indicator\":\"D\",\"percChangeClose\":\"-1.45\",\"lastTradedPrice\":\"6.8\",\"securityAlias\":\"Anscor\",\"indicatorImg\":\"\",\"securitySymbol\":\"ANS\"},{\"totalVolume\":\"1,626,100\",\"indicator\":\"U\",\"percChangeClose\":\"1.52\",\"lastTradedPrice\":\"33.5\",\"securityAlias\":\"Aboitiz Power\",\"indicatorImg\":\"\",\"securitySymbol\":\"AP\"},{\"totalVolume\":\"564,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.72\",\"securityAlias\":\"APC Group\",\"indicatorImg\":\"\",\"securitySymbol\":\"APC\"},{\"totalVolume\":\"23,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.27\",\"lastTradedPrice\":\"2.15\",\"securityAlias\":\"Apex Mining A\",\"indicatorImg\":\"\",\"securitySymbol\":\"APX\"},{\"totalVolume\":\"1,118,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.74\",\"lastTradedPrice\":\"1.35\",\"securityAlias\":\"Araneta Prop\",\"indicatorImg\":\"\",\"securitySymbol\":\"ARA\"},{\"totalVolume\":\"574,500\",\"indicator\":\"U\",\"percChangeClose\":\"1.02\",\"lastTradedPrice\":\"11.94\",\"securityAlias\":\"Atlas Mining\",\"indicatorImg\":\"\",\"securitySymbol\":\"AT\"},{\"totalVolume\":\"4,200\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"11.2\",\"securityAlias\":\"Asian Terminals\",\"indicatorImg\":\"\",\"securitySymbol\":\"ATI\"},{\"totalVolume\":\"51,000\",\"indicator\":\"D\",\"percChangeClose\":\"-4.76\",\"lastTradedPrice\":\"1.2\",\"securityAlias\":\"ATN Holdings B\",\"indicatorImg\":\"\",\"securitySymbol\":\"ATNB\"},{\"totalVolume\":\"187,150\",\"indicator\":\"D\",\"percChangeClose\":\"-0.36\",\"lastTradedPrice\":\"68.45\",\"securityAlias\":\"ASIA UNITED\",\"indicatorImg\":\"\",\"securitySymbol\":\"AUB\"},{\"totalVolume\":\"11,100\",\"indicator\":\"U\",\"percChangeClose\":\"2.67\",\"lastTradedPrice\":\"7.7\",\"securityAlias\":\"Benguet A\",\"indicatorImg\":\"\",\"securitySymbol\":\"BC\"},{\"totalVolume\":\"2,200\",\"indicator\":\"U\",\"percChangeClose\":\"6.84\",\"lastTradedPrice\":\"7.5\",\"securityAlias\":\"Benguet B\",\"indicatorImg\":\"\",\"securitySymbol\":\"BCB\"},{\"totalVolume\":\"1,120,810\",\"indicator\":\"U\",\"percChangeClose\":\"0.26\",\"lastTradedPrice\":\"78.6\",\"securityAlias\":\"Banco de Oro\",\"indicatorImg\":\"\",\"securitySymbol\":\"BDO\"},{\"totalVolume\":\"3,734,300\",\"indicator\":\"U\",\"percChangeClose\":\"1.28\",\"lastTradedPrice\":\"5.52\",\"securityAlias\":\"Belle Corp.\",\"indicatorImg\":\"\",\"securitySymbol\":\"BEL\"},{\"totalVolume\":\"25,710,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.07\",\"lastTradedPrice\":\"0.14\",\"securityAlias\":\"Boulevard Hldg.\",\"indicatorImg\":\"\",\"securitySymbol\":\"BHI\"},{\"totalVolume\":\"8,982,000\",\"indicator\":\"U\",\"percChangeClose\":\"3.86\",\"lastTradedPrice\":\"2.42\",\"securityAlias\":\"Bankard\",\"indicatorImg\":\"\",\"securitySymbol\":\"BKD\"},{\"totalVolume\":\"2,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"2.1\",\"securityAlias\":\"BDO Leasing\",\"indicatorImg\":\"\",\"securitySymbol\":\"BLFI\"},{\"totalVolume\":\"2,280,400\",\"indicator\":\"U\",\"percChangeClose\":\"0.19\",\"lastTradedPrice\":\"10.3\",\"securityAlias\":\"Bloomberry\",\"indicatorImg\":\"\",\"securitySymbol\":\"BLOOM\"},{\"totalVolume\":\"3,004,300\",\"indicator\":\"U\",\"percChangeClose\":\"2.29\",\"lastTradedPrice\":\"94\",\"securityAlias\":\"BPI\",\"indicatorImg\":\"\",\"securitySymbol\":\"BPI\"},{\"totalVolume\":\"105,000\",\"indicator\":\"D\",\"percChangeClose\":\"-4.96\",\"lastTradedPrice\":\"1.15\",\"securityAlias\":\"A. Brown\",\"indicatorImg\":\"\",\"securitySymbol\":\"BRN\"},{\"totalVolume\":\"680,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.84\",\"lastTradedPrice\":\"0.24\",\"securityAlias\":\"Basic Petroleum\",\"indicatorImg\":\"\",\"securitySymbol\":\"BSC\"},{\"totalVolume\":\"132,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.82\",\"lastTradedPrice\":\"3.62\",\"securityAlias\":\"CALA CORP.\",\"indicatorImg\":\"\",\"securitySymbol\":\"CAL\"},{\"totalVolume\":\"47,720\",\"indicator\":\"U\",\"percChangeClose\":\"1.54\",\"lastTradedPrice\":\"52.9\",\"securityAlias\":\"5J\",\"indicatorImg\":\"\",\"securitySymbol\":\"CEB\"},{\"totalVolume\":\"10,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"11.1\",\"securityAlias\":\"Centro Escolar\",\"indicatorImg\":\"\",\"securitySymbol\":\"CEU\"},{\"totalVolume\":\"700\",\"indicator\":\"U\",\"percChangeClose\":\"0.17\",\"lastTradedPrice\":\"5.96\",\"securityAlias\":\"Cebu Holdings\",\"indicatorImg\":\"\",\"securitySymbol\":\"CHI\"},{\"totalVolume\":\"294,380\",\"indicator\":\"D\",\"percChangeClose\":\"-0.49\",\"lastTradedPrice\":\"60.5\",\"securityAlias\":\"Chinabank\",\"indicatorImg\":\"\",\"securitySymbol\":\"CHIB\"},{\"totalVolume\":\"1,800\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"14.84\",\"securityAlias\":\"CHIPS\",\"indicatorImg\":\"\",\"securitySymbol\":\"CHIPS\"},{\"totalVolume\":\"8,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.01\",\"securityAlias\":\"Seacem\",\"indicatorImg\":\"\",\"securitySymbol\":\"CMT\"},{\"totalVolume\":\"386,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.15\",\"lastTradedPrice\":\"0.91\",\"securityAlias\":\"Coal Asia\",\"indicatorImg\":\"\",\"securitySymbol\":\"COAL\"},{\"totalVolume\":\"55,000\",\"indicator\":\"U\",\"percChangeClose\":\"2.33\",\"lastTradedPrice\":\"3.07\",\"securityAlias\":\"Chemrez\",\"indicatorImg\":\"\",\"securitySymbol\":\"COAT\"},{\"totalVolume\":\"1,700\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"16.5\",\"securityAlias\":\"COL Financial\",\"indicatorImg\":\"\",\"securitySymbol\":\"COL\"},{\"totalVolume\":\"7,932,500\",\"indicator\":\"D\",\"percChangeClose\":\"-1.09\",\"lastTradedPrice\":\"9.99\",\"securityAlias\":\"COSCO CAPITAL\",\"indicatorImg\":\"\",\"securitySymbol\":\"COSCO\"},{\"totalVolume\":\"4,673,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.62\",\"lastTradedPrice\":\"1.82\",\"securityAlias\":\"CPG\",\"indicatorImg\":\"\",\"securitySymbol\":\"CPG\"},{\"totalVolume\":\"550,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.57\",\"securityAlias\":\"Cyber Bay\",\"indicatorImg\":\"\",\"securitySymbol\":\"CYBR\"},{\"totalVolume\":\"34,000\",\"indicator\":\"D\",\"percChangeClose\":\"-3.03\",\"lastTradedPrice\":\"0.96\",\"securityAlias\":\"DAVINCI CAPITAL\",\"indicatorImg\":\"\",\"securitySymbol\":\"DAVIN\"},{\"totalVolume\":\"1,239,000\",\"indicator\":\"U\",\"percChangeClose\":\"9.24\",\"lastTradedPrice\":\"5.2\",\"securityAlias\":\"Diversified\",\"indicatorImg\":\"\",\"securitySymbol\":\"DFNN\"},{\"totalVolume\":\"34,700\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"5.48\",\"securityAlias\":\"Dizon Mines\",\"indicatorImg\":\"\",\"securitySymbol\":\"DIZ\"},{\"totalVolume\":\"712,730\",\"indicator\":\"D\",\"percChangeClose\":\"-1.89\",\"lastTradedPrice\":\"52\",\"securityAlias\":\"DMCI Holdings\",\"indicatorImg\":\"\",\"securitySymbol\":\"DMC\"},{\"totalVolume\":\"67,100\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"27\",\"securityAlias\":\"DEL MONTE\",\"indicatorImg\":\"\",\"securitySymbol\":\"DMPL\"},{\"totalVolume\":\"752,700\",\"indicator\":\"D\",\"percChangeClose\":\"-0.15\",\"lastTradedPrice\":\"6.48\",\"securityAlias\":\"DNL INDUS\",\"indicatorImg\":\"\",\"securitySymbol\":\"DNL\"},{\"totalVolume\":\"11,367,700\",\"indicator\":\"U\",\"percChangeClose\":\"2.57\",\"lastTradedPrice\":\"5.18\",\"securityAlias\":\"Energy Devt. \",\"indicatorImg\":\"\",\"securitySymbol\":\"EDC\"},{\"totalVolume\":\"191,600\",\"indicator\":\"U\",\"percChangeClose\":\"1.15\",\"lastTradedPrice\":\"10.54\",\"securityAlias\":\"EEI Corp.\",\"indicatorImg\":\"\",\"securitySymbol\":\"EEI\"},{\"totalVolume\":\"6,500,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.01\",\"securityAlias\":\"E-Games\",\"indicatorImg\":\"\",\"securitySymbol\":\"EG\"},{\"totalVolume\":\"421,000\",\"indicator\":\"U\",\"percChangeClose\":\"3.23\",\"lastTradedPrice\":\"0.96\",\"securityAlias\":\"Empire East\",\"indicatorImg\":\"\",\"securitySymbol\":\"ELI\"},{\"totalVolume\":\"7,594,700\",\"indicator\":\"U\",\"percChangeClose\":\"0.17\",\"lastTradedPrice\":\"11.94\",\"securityAlias\":\"EMPERADOR\",\"indicatorImg\":\"\",\"securitySymbol\":\"EMP\"},{\"totalVolume\":\"441,700\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"25\",\"securityAlias\":\"EW\",\"indicatorImg\":\"\",\"securitySymbol\":\"EW\"},{\"totalVolume\":\"550,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.84\",\"securityAlias\":\"First Abacus\",\"indicatorImg\":\"\",\"securitySymbol\":\"FAF\"},{\"totalVolume\":\"10,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.92\",\"lastTradedPrice\":\"4.31\",\"securityAlias\":\"Filinvest Dev.\",\"indicatorImg\":\"\",\"securitySymbol\":\"FDC\"},{\"totalVolume\":\"370\",\"indicator\":\"U\",\"percChangeClose\":\"0.45\",\"lastTradedPrice\":\"1,120\",\"securityAlias\":\"Far Eastern U.\",\"indicatorImg\":\"\",\"securitySymbol\":\"FEU\"},{\"totalVolume\":\"2,800\",\"indicator\":\"D\",\"percChangeClose\":\"-2.6\",\"lastTradedPrice\":\"15\",\"securityAlias\":\"Filipino Fund\",\"indicatorImg\":\"\",\"securitySymbol\":\"FFI\"},{\"totalVolume\":\"4,173,800\",\"indicator\":\"D\",\"percChangeClose\":\"-0.29\",\"lastTradedPrice\":\"13.9\",\"securityAlias\":\"First Gen\",\"indicatorImg\":\"\",\"securitySymbol\":\"FGEN\"},{\"totalVolume\":\"11,090\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"112\",\"securityAlias\":\"First Gen G\",\"indicatorImg\":\"\",\"securitySymbol\":\"FGENG\"},{\"totalVolume\":\"18,589,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.34\",\"lastTradedPrice\":\"1.47\",\"securityAlias\":\"Filinvest Land\",\"indicatorImg\":\"\",\"securitySymbol\":\"FLI\"},{\"totalVolume\":\"20,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.14\",\"securityAlias\":\"Tuna\",\"indicatorImg\":\"\",\"securitySymbol\":\"FOOD\"},{\"totalVolume\":\"466,000\",\"indicator\":\"D\",\"percChangeClose\":\"-3.33\",\"lastTradedPrice\":\"60.9\",\"securityAlias\":\"First Phil Hldg\",\"indicatorImg\":\"\",\"securitySymbol\":\"FPH\"},{\"totalVolume\":\"150,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.43\",\"securityAlias\":\"GEOGRACE\",\"indicatorImg\":\"\",\"securitySymbol\":\"GEO\"},{\"totalVolume\":\"11,233,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.4\",\"lastTradedPrice\":\"1.45\",\"securityAlias\":\"Global-Estate\",\"indicatorImg\":\"\",\"securitySymbol\":\"GERI\"},{\"totalVolume\":\"30,605\",\"indicator\":\"U\",\"percChangeClose\":\"3.04\",\"lastTradedPrice\":\"1,660\",\"securityAlias\":\"Globe Telecom\",\"indicatorImg\":\"\",\"securitySymbol\":\"GLO\"},{\"totalVolume\":\"90,800\",\"indicator\":\"D\",\"percChangeClose\":\"-0.4\",\"lastTradedPrice\":\"7.55\",\"securityAlias\":\"GMA Network\",\"indicatorImg\":\"\",\"securitySymbol\":\"GMA7\"},{\"totalVolume\":\"547,000\",\"indicator\":\"U\",\"percChangeClose\":\"2.78\",\"lastTradedPrice\":\"7.4\",\"securityAlias\":\"GMA Holdings\",\"indicatorImg\":\"\",\"securitySymbol\":\"GMAP\"},{\"totalVolume\":\"3,600,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.01\",\"securityAlias\":\"GREEN\",\"indicatorImg\":\"\",\"securitySymbol\":\"GREEN\"},{\"totalVolume\":\"127,700\",\"indicator\":\"D\",\"percChangeClose\":\"-0.76\",\"lastTradedPrice\":\"26\",\"securityAlias\":\"Ginebra\",\"indicatorImg\":\"\",\"securitySymbol\":\"GSMI\"},{\"totalVolume\":\"643,130\",\"indicator\":\"D\",\"percChangeClose\":\"-2.32\",\"lastTradedPrice\":\"800\",\"securityAlias\":\"GT Capital\",\"indicatorImg\":\"\",\"securitySymbol\":\"GTCAP\"},{\"totalVolume\":\"1,300\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"6.9\",\"securityAlias\":\"H2O\",\"indicatorImg\":\"\",\"securitySymbol\":\"H2O\"},{\"totalVolume\":\"900\",\"indicator\":\"U\",\"percChangeClose\":\"5.26\",\"lastTradedPrice\":\"6\",\"securityAlias\":\"House of Inv\",\"indicatorImg\":\"\",\"securitySymbol\":\"HI\"},{\"totalVolume\":\"12,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.15\",\"lastTradedPrice\":\"15.5\",\"securityAlias\":\"Holcim\",\"indicatorImg\":\"\",\"securitySymbol\":\"HLCM\"},{\"totalVolume\":\"3,400\",\"indicator\":\"D\",\"percChangeClose\":\"-2.44\",\"lastTradedPrice\":\"6.41\",\"securityAlias\":\"8990 HLDG\",\"indicatorImg\":\"\",\"securitySymbol\":\"HOUSE\"},{\"totalVolume\":\"15,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.78\",\"lastTradedPrice\":\"2.8\",\"securityAlias\":\"IRemit\",\"indicatorImg\":\"\",\"securitySymbol\":\"I\"},{\"totalVolume\":\"1,324,140\",\"indicator\":\"D\",\"percChangeClose\":\"-0.28\",\"lastTradedPrice\":\"105.7\",\"securityAlias\":\"Intl Container\",\"indicatorImg\":\"\",\"securitySymbol\":\"ICT\"},{\"totalVolume\":\"3,000\",\"indicator\":\"D\",\"percChangeClose\":\"-5.24\",\"lastTradedPrice\":\"2.53\",\"securityAlias\":\"Integ. Micro\",\"indicatorImg\":\"\",\"securitySymbol\":\"IMI\"},{\"totalVolume\":\"6,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"12\",\"securityAlias\":\"IPeople\",\"indicatorImg\":\"\",\"securitySymbol\":\"IPO\"},{\"totalVolume\":\"2,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.38\",\"lastTradedPrice\":\"1.47\",\"securityAlias\":\"Interport A\",\"indicatorImg\":\"\",\"securitySymbol\":\"IRC\"},{\"totalVolume\":\"492,390\",\"indicator\":\"D\",\"percChangeClose\":\"-0.55\",\"lastTradedPrice\":\"181\",\"securityAlias\":\"Jollibee\",\"indicatorImg\":\"\",\"securitySymbol\":\"JFC\"},{\"totalVolume\":\"14,234,500\",\"indicator\":\"D\",\"percChangeClose\":\"-8.14\",\"lastTradedPrice\":\"44\",\"securityAlias\":\"JG Summit\",\"indicatorImg\":\"\",\"securitySymbol\":\"JGS\"},{\"totalVolume\":\"5,000\",\"indicator\":\"D\",\"percChangeClose\":\"-17.13\",\"lastTradedPrice\":\"4.5\",\"securityAlias\":\"Jolliville Hldg\",\"indicatorImg\":\"\",\"securitySymbol\":\"JOH\"},{\"totalVolume\":\"16,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.67\",\"lastTradedPrice\":\"3.05\",\"securityAlias\":\"Keppel Prop\",\"indicatorImg\":\"\",\"securitySymbol\":\"KEP\"},{\"totalVolume\":\"7,240,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.35\",\"securityAlias\":\"Lepanto A\",\"indicatorImg\":\"\",\"securitySymbol\":\"LC\"},{\"totalVolume\":\"6,650,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.36\",\"securityAlias\":\"Lepanto B\",\"indicatorImg\":\"\",\"securitySymbol\":\"LCB\"},{\"totalVolume\":\"5,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.8\",\"securityAlias\":\"Lodestar\",\"indicatorImg\":\"\",\"securitySymbol\":\"LIHC\"},{\"totalVolume\":\"5,130,000\",\"indicator\":\"D\",\"percChangeClose\":\"-14.75\",\"lastTradedPrice\":\"3.41\",\"securityAlias\":\"LMG Chemicals\",\"indicatorImg\":\"\",\"securitySymbol\":\"LMG\"},{\"totalVolume\":\"4,130,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.59\",\"lastTradedPrice\":\"4.46\",\"securityAlias\":\"Benpres Hldg.\",\"indicatorImg\":\"\",\"securitySymbol\":\"LPZ\"},{\"totalVolume\":\"107,200\",\"indicator\":\"D\",\"percChangeClose\":\"-0.9\",\"lastTradedPrice\":\"6.6\",\"securityAlias\":\"Leisure\",\"indicatorImg\":\"\",\"securitySymbol\":\"LR\"},{\"totalVolume\":\"336,100\",\"indicator\":\"D\",\"percChangeClose\":\"-0.32\",\"lastTradedPrice\":\"9.25\",\"securityAlias\":\"Lafarge_Rep\",\"indicatorImg\":\"\",\"securitySymbol\":\"LRI\"},{\"totalVolume\":\"1,000\",\"indicator\":\"U\",\"percChangeClose\":\"0.86\",\"lastTradedPrice\":\"1.17\",\"securityAlias\":\"LorenzoShipping\",\"indicatorImg\":\"\",\"securitySymbol\":\"LSC\"},{\"totalVolume\":\"11,411,700\",\"indicator\":\"U\",\"percChangeClose\":\"1.21\",\"lastTradedPrice\":\"15\",\"securityAlias\":\"LT GROUP\",\"indicatorImg\":\"\",\"securitySymbol\":\"LTG\"},{\"totalVolume\":\"84,500,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.02\",\"securityAlias\":\"Manila Mining A\",\"indicatorImg\":\"\",\"securitySymbol\":\"MA\"},{\"totalVolume\":\"100,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.02\",\"securityAlias\":\"Manila Mining B\",\"indicatorImg\":\"\",\"securitySymbol\":\"MAB\"},{\"totalVolume\":\"9,000\",\"indicator\":\"D\",\"percChangeClose\":\"-5.42\",\"lastTradedPrice\":\"1.92\",\"securityAlias\":\"Macroasia\",\"indicatorImg\":\"\",\"securitySymbol\":\"MAC\"},{\"totalVolume\":\"4,405,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.53\",\"lastTradedPrice\":\"3.74\",\"securityAlias\":\"Marcventures\",\"indicatorImg\":\"\",\"securitySymbol\":\"MARC\"},{\"totalVolume\":\"1,809,340\",\"indicator\":\"U\",\"percChangeClose\":\"0.25\",\"lastTradedPrice\":\"80.6\",\"securityAlias\":\"Metrobank\",\"indicatorImg\":\"\",\"securitySymbol\":\"MBT\"},{\"totalVolume\":\"3,989,900\",\"indicator\":\"U\",\"percChangeClose\":\"0.75\",\"lastTradedPrice\":\"13.4\",\"securityAlias\":\"MELCO CROWN\",\"indicatorImg\":\"\",\"securitySymbol\":\"MCP\"},{\"totalVolume\":\"11,978,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.33\",\"lastTradedPrice\":\"3.7\",\"securityAlias\":\"Megaworld\",\"indicatorImg\":\"\",\"securitySymbol\":\"MEG\"},{\"totalVolume\":\"197,540\",\"indicator\":\"D\",\"percChangeClose\":\"-0.76\",\"lastTradedPrice\":\"288.8\",\"securityAlias\":\"Meralco A\",\"indicatorImg\":\"\",\"securitySymbol\":\"MER\"},{\"totalVolume\":\"10\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"725\",\"securityAlias\":\"Manulife\",\"indicatorImg\":\"\",\"securitySymbol\":\"MFC\"},{\"totalVolume\":\"2,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"5.3\",\"securityAlias\":\"Minerales Ind\",\"indicatorImg\":\"\",\"securitySymbol\":\"MIC\"},{\"totalVolume\":\"36,797,000\",\"indicator\":\"U\",\"percChangeClose\":\"0.21\",\"lastTradedPrice\":\"4.81\",\"securityAlias\":\"Metro Pac Inv \",\"indicatorImg\":\"\",\"securitySymbol\":\"MPI\"},{\"totalVolume\":\"730,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.25\",\"lastTradedPrice\":\"0.09\",\"securityAlias\":\"MRC Allied\",\"indicatorImg\":\"\",\"securitySymbol\":\"MRC\"},{\"totalVolume\":\"1,310,400\",\"indicator\":\"D\",\"percChangeClose\":\"-0.19\",\"lastTradedPrice\":\"25.75\",\"securityAlias\":\"Manila Water\",\"indicatorImg\":\"\",\"securitySymbol\":\"MWC\"},{\"totalVolume\":\"11,500\",\"indicator\":\"D\",\"percChangeClose\":\"-0.38\",\"lastTradedPrice\":\"10.5\",\"securityAlias\":\"Megawide\",\"indicatorImg\":\"\",\"securitySymbol\":\"MWIDE\"},{\"totalVolume\":\"186,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.83\",\"lastTradedPrice\":\"2.4\",\"securityAlias\":\"NiHAO\",\"indicatorImg\":\"\",\"securitySymbol\":\"NI\"},{\"totalVolume\":\"1,883,500\",\"indicator\":\"D\",\"percChangeClose\":\"-0.26\",\"lastTradedPrice\":\"15.28\",\"securityAlias\":\"NICKELASIA\",\"indicatorImg\":\"\",\"securitySymbol\":\"NIKL\"},{\"totalVolume\":\"547,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.45\",\"securityAlias\":\"PhilNaRe\",\"indicatorImg\":\"\",\"securitySymbol\":\"NRCP\"},{\"totalVolume\":\"61,000\",\"indicator\":\"D\",\"percChangeClose\":\"-9.4\",\"lastTradedPrice\":\"3.18\",\"securityAlias\":\"Nextstage\",\"indicatorImg\":\"\",\"securitySymbol\":\"NXT\"},{\"totalVolume\":\"200,000\",\"indicator\":\"U\",\"percChangeClose\":\"5.56\",\"lastTradedPrice\":\"0.02\",\"securityAlias\":\"Oriental A\",\"indicatorImg\":\"\",\"securitySymbol\":\"OPM\"},{\"totalVolume\":\"1,000,000\",\"indicator\":\"U\",\"percChangeClose\":\"5\",\"lastTradedPrice\":\"0.02\",\"securityAlias\":\"Oriental B\",\"indicatorImg\":\"\",\"securitySymbol\":\"OPMB\"},{\"totalVolume\":\"520,000\",\"indicator\":\"U\",\"percChangeClose\":\"0.78\",\"lastTradedPrice\":\"1.3\",\"securityAlias\":\"Oriental P\",\"indicatorImg\":\"\",\"securitySymbol\":\"ORE\"},{\"totalVolume\":\"41,000,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.04\",\"securityAlias\":\"Philodrill A\",\"indicatorImg\":\"\",\"securitySymbol\":\"OV\"},{\"totalVolume\":\"1,200\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"5.6\",\"securityAlias\":\"PAL Holdings\",\"indicatorImg\":\"\",\"securitySymbol\":\"PAL\"},{\"totalVolume\":\"51,000\",\"indicator\":\"U\",\"percChangeClose\":\"0.52\",\"lastTradedPrice\":\"1.95\",\"securityAlias\":\"Paxys\",\"indicatorImg\":\"\",\"securitySymbol\":\"PAX\"},{\"totalVolume\":\"1,700\",\"indicator\":\"U\",\"percChangeClose\":\"0.21\",\"lastTradedPrice\":\"24\",\"securityAlias\":\"PB BANK\",\"indicatorImg\":\"\",\"securitySymbol\":\"PBB\"},{\"totalVolume\":\"300\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"16\",\"securityAlias\":\"Pancake\",\"indicatorImg\":\"\",\"securitySymbol\":\"PCKH\"},{\"totalVolume\":\"148,100\",\"indicator\":\"U\",\"percChangeClose\":\"0.78\",\"lastTradedPrice\":\"12.9\",\"securityAlias\":\"Petron\",\"indicatorImg\":\"\",\"securitySymbol\":\"PCOR\"},{\"totalVolume\":\"9,940\",\"indicator\":\"U\",\"percChangeClose\":\"1.29\",\"lastTradedPrice\":\"236\",\"securityAlias\":\"Purefoods \",\"indicatorImg\":\"\",\"securitySymbol\":\"PF\"},{\"totalVolume\":\"2,320\",\"indicator\":\"D\",\"percChangeClose\":\"-1.23\",\"lastTradedPrice\":\"1,040\",\"securityAlias\":\"SMPFC Pref\",\"indicatorImg\":\"\",\"securitySymbol\":\"PFP\"},{\"totalVolume\":\"7,200,500\",\"indicator\":\"D\",\"percChangeClose\":\"-1.99\",\"lastTradedPrice\":\"41.85\",\"securityAlias\":\"PUREGOLD\",\"indicatorImg\":\"\",\"securitySymbol\":\"PGOLD\"},{\"totalVolume\":\"1,120,000\",\"indicator\":\"D\",\"percChangeClose\":\"-6.25\",\"lastTradedPrice\":\"0.3\",\"securityAlias\":\"PremiereHorizon\",\"indicatorImg\":\"\",\"securitySymbol\":\"PHA\"},{\"totalVolume\":\"320,000\",\"indicator\":\"D\",\"percChangeClose\":\"-3.8\",\"lastTradedPrice\":\"0.38\",\"securityAlias\":\"Phil Estates\",\"indicatorImg\":\"\",\"securitySymbol\":\"PHES\"},{\"totalVolume\":\"430,600\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"13.3\",\"securityAlias\":\"Phinma \",\"indicatorImg\":\"\",\"securitySymbol\":\"PHN\"},{\"totalVolume\":\"5,461,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.08\",\"lastTradedPrice\":\"4.6\",\"securityAlias\":\"Pepsi-Cola\",\"indicatorImg\":\"\",\"securitySymbol\":\"PIP\"},{\"totalVolume\":\"2,215,440\",\"indicator\":\"D\",\"percChangeClose\":\"-0.96\",\"lastTradedPrice\":\"87.5\",\"securityAlias\":\"Phil Natl Bank\",\"indicatorImg\":\"\",\"securitySymbol\":\"PNB\"},{\"totalVolume\":\"950,400\",\"indicator\":\"U\",\"percChangeClose\":\"0.2\",\"lastTradedPrice\":\"5.1\",\"securityAlias\":\"Phoenix\",\"indicatorImg\":\"\",\"securitySymbol\":\"PNX\"},{\"totalVolume\":\"100\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"11\",\"securityAlias\":\"Globalports\",\"indicatorImg\":\"\",\"securitySymbol\":\"PORT\"},{\"totalVolume\":\"10\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"109.9\",\"securityAlias\":\"Petron Pref\",\"indicatorImg\":\"\",\"securitySymbol\":\"PPREF\"},{\"totalVolume\":\"6,100\",\"indicator\":\"D\",\"percChangeClose\":\"-0.11\",\"lastTradedPrice\":\"8.8\",\"securityAlias\":\"Phil. Racing \",\"indicatorImg\":\"\",\"securitySymbol\":\"PRC\"},{\"totalVolume\":\"811,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"2.16\",\"securityAlias\":\"Prime Media\",\"indicatorImg\":\"\",\"securitySymbol\":\"PRIM\"},{\"totalVolume\":\"1,800\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"124.8\",\"securityAlias\":\"PSBank\",\"indicatorImg\":\"\",\"securitySymbol\":\"PSB\"},{\"totalVolume\":\"8,760\",\"indicator\":\"U\",\"percChangeClose\":\"0.9\",\"lastTradedPrice\":\"360.2\",\"securityAlias\":\"PSE\",\"indicatorImg\":\"\",\"securitySymbol\":\"PSE\"},{\"totalVolume\":\"682,800\",\"indicator\":\"U\",\"percChangeClose\":\"1.49\",\"lastTradedPrice\":\"8.2\",\"securityAlias\":\"Philex\",\"indicatorImg\":\"\",\"securitySymbol\":\"PX\"},{\"totalVolume\":\"161,700\",\"indicator\":\"D\",\"percChangeClose\":\"-0.64\",\"lastTradedPrice\":\"7.8\",\"securityAlias\":\"PXP\",\"indicatorImg\":\"\",\"securitySymbol\":\"PXP\"},{\"totalVolume\":\"608,300\",\"indicator\":\"U\",\"percChangeClose\":\"0.22\",\"lastTradedPrice\":\"46.55\",\"securityAlias\":\"RCBC\",\"indicatorImg\":\"\",\"securitySymbol\":\"RCB\"},{\"totalVolume\":\"200\",\"indicator\":\"D\",\"percChangeClose\":\"-0.15\",\"lastTradedPrice\":\"6.5\",\"securityAlias\":\"CADP Group\",\"indicatorImg\":\"\",\"securitySymbol\":\"RCI\"},{\"totalVolume\":\"39,000\",\"indicator\":\"U\",\"percChangeClose\":\"0.38\",\"lastTradedPrice\":\"2.65\",\"securityAlias\":\"Republic Glass\",\"indicatorImg\":\"\",\"securitySymbol\":\"REG\"},{\"totalVolume\":\"1,043,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.85\",\"lastTradedPrice\":\"5.5\",\"securityAlias\":\"RFM Corp\",\"indicatorImg\":\"\",\"securitySymbol\":\"RFM\"},{\"totalVolume\":\"453,100\",\"indicator\":\"D\",\"percChangeClose\":\"-1.49\",\"lastTradedPrice\":\"23.15\",\"securityAlias\":\"Robinsons Land\",\"indicatorImg\":\"\",\"securitySymbol\":\"RLC\"},{\"totalVolume\":\"7,780,000\",\"indicator\":\"U\",\"percChangeClose\":\"3.45\",\"lastTradedPrice\":\"0.45\",\"securityAlias\":\"PhilRealty\",\"indicatorImg\":\"\",\"securitySymbol\":\"RLT\"},{\"totalVolume\":\"300,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.55\",\"lastTradedPrice\":\"1.81\",\"securityAlias\":\"ROCK\",\"indicatorImg\":\"\",\"securitySymbol\":\"ROCK\"},{\"totalVolume\":\"341,200\",\"indicator\":\"D\",\"percChangeClose\":\"-0.65\",\"lastTradedPrice\":\"6.16\",\"securityAlias\":\"Roxas Hldg.\",\"indicatorImg\":\"\",\"securitySymbol\":\"ROX\"},{\"totalVolume\":\"5,500\",\"indicator\":\"U\",\"percChangeClose\":\"1.52\",\"lastTradedPrice\":\"12\",\"securityAlias\":\"iRipple\",\"indicatorImg\":\"\",\"securitySymbol\":\"RPL\"},{\"totalVolume\":\"3,386,230\",\"indicator\":\"U\",\"percChangeClose\":\"0.43\",\"lastTradedPrice\":\"58.95\",\"securityAlias\":\"ROBINSONS RTL\",\"indicatorImg\":\"\",\"securitySymbol\":\"RRHI\"},{\"totalVolume\":\"23,627,500\",\"indicator\":\"D\",\"percChangeClose\":\"-0.36\",\"lastTradedPrice\":\"11.22\",\"securityAlias\":\"TRAVELLERS\",\"indicatorImg\":\"\",\"securitySymbol\":\"RWM\"},{\"totalVolume\":\"103,310\",\"indicator\":\"D\",\"percChangeClose\":\"-0.71\",\"lastTradedPrice\":\"280\",\"securityAlias\":\"Semirara Mining\",\"indicatorImg\":\"\",\"securitySymbol\":\"SCC\"},{\"totalVolume\":\"319,700\",\"indicator\":\"D\",\"percChangeClose\":\"-0.84\",\"lastTradedPrice\":\"140.9\",\"securityAlias\":\"Security Bank\",\"indicatorImg\":\"\",\"securitySymbol\":\"SECB\"},{\"totalVolume\":\"470\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"100\",\"securityAlias\":\"11-Jul\",\"indicatorImg\":\"\",\"securitySymbol\":\"SEVN\"},{\"totalVolume\":\"80,000\",\"indicator\":\"U\",\"percChangeClose\":\"3.23\",\"lastTradedPrice\":\"0.13\",\"securityAlias\":\"Swift\",\"indicatorImg\":\"\",\"securitySymbol\":\"SFI\"},{\"totalVolume\":\"80,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.32\",\"securityAlias\":\"Solid Group\",\"indicatorImg\":\"\",\"securitySymbol\":\"SGI\"},{\"totalVolume\":\"89,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.62\",\"lastTradedPrice\":\"3.18\",\"securityAlias\":\"SHNG Properties\",\"indicatorImg\":\"\",\"securitySymbol\":\"SHNG\"},{\"totalVolume\":\"550,000\",\"indicator\":\"D\",\"percChangeClose\":\"-3.45\",\"lastTradedPrice\":\"0.28\",\"securityAlias\":\"Sinophil\",\"indicatorImg\":\"\",\"securitySymbol\":\"SINO\"},{\"totalVolume\":\"120\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1,400\",\"securityAlias\":\"Sun Life\",\"indicatorImg\":\"\",\"securitySymbol\":\"SLF\"},{\"totalVolume\":\"314,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.64\",\"lastTradedPrice\":\"0.62\",\"securityAlias\":\"Sta.Lucia Land\",\"indicatorImg\":\"\",\"securitySymbol\":\"SLI\"},{\"totalVolume\":\"329,400\",\"indicator\":\"D\",\"percChangeClose\":\"-1.04\",\"lastTradedPrice\":\"763\",\"securityAlias\":\"SM Investments \",\"indicatorImg\":\"\",\"securitySymbol\":\"SM\"},{\"totalVolume\":\"270,540\",\"indicator\":\"U\",\"percChangeClose\":\"2.7\",\"lastTradedPrice\":\"76\",\"securityAlias\":\"San Miguel A\",\"indicatorImg\":\"\",\"securitySymbol\":\"SMC\"},{\"totalVolume\":\"1,291,960\",\"indicator\":\"D\",\"percChangeClose\":\"-0.98\",\"lastTradedPrice\":\"76\",\"securityAlias\":\"SMCPrefs2A\",\"indicatorImg\":\"\",\"securitySymbol\":\"SMC2A\"},{\"totalVolume\":\"700\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"77\",\"securityAlias\":\"SMCPrefs2B\",\"indicatorImg\":\"\",\"securitySymbol\":\"SMC2B\"},{\"totalVolume\":\"39,450\",\"indicator\":\"U\",\"percChangeClose\":\"0.32\",\"lastTradedPrice\":\"78.5\",\"securityAlias\":\"SMCPrefs2C\",\"indicatorImg\":\"\",\"securitySymbol\":\"SMC2C\"},{\"totalVolume\":\"8,283,300\",\"indicator\":\"U\",\"percChangeClose\":\"1.15\",\"lastTradedPrice\":\"17.58\",\"securityAlias\":\"SM Prime Hldg.\",\"indicatorImg\":\"\",\"securitySymbol\":\"SMPH\"},{\"totalVolume\":\"33,493,000\",\"indicator\":\"U\",\"percChangeClose\":\"2.86\",\"lastTradedPrice\":\"0.72\",\"securityAlias\":\"STI_HOLDINGS\",\"indicatorImg\":\"\",\"securitySymbol\":\"STI\"},{\"totalVolume\":\"60,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"3.45\",\"securityAlias\":\"Starmalls\",\"indicatorImg\":\"\",\"securitySymbol\":\"STR\"},{\"totalVolume\":\"402,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.86\",\"lastTradedPrice\":\"1.02\",\"securityAlias\":\"Suntrust Home\",\"indicatorImg\":\"\",\"securitySymbol\":\"SUN\"},{\"totalVolume\":\"94,000\",\"indicator\":\"D\",\"percChangeClose\":\"-0.5\",\"lastTradedPrice\":\"2.01\",\"securityAlias\":\"TKC Steel\",\"indicatorImg\":\"\",\"securitySymbol\":\"T\"},{\"totalVolume\":\"6,291,000\",\"indicator\":\"D\",\"percChangeClose\":\"-2.14\",\"lastTradedPrice\":\"1.83\",\"securityAlias\":\"Trans-Asia\",\"indicatorImg\":\"\",\"securitySymbol\":\"TA\"},{\"totalVolume\":\"94,685\",\"indicator\":\"U\",\"percChangeClose\":\"0.43\",\"lastTradedPrice\":\"2,810\",\"securityAlias\":\"PLDT\",\"indicatorImg\":\"\",\"securitySymbol\":\"TEL\"},{\"totalVolume\":\"1,356,000\",\"indicator\":\"D\",\"percChangeClose\":\"-1.75\",\"lastTradedPrice\":\"1.68\",\"securityAlias\":\"HARBOR STAR\",\"indicatorImg\":\"\",\"securitySymbol\":\"TUGS\"},{\"totalVolume\":\"4,440\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"125.9\",\"securityAlias\":\"Union Bank\",\"indicatorImg\":\"\",\"securitySymbol\":\"UBP\"},{\"totalVolume\":\"2,100,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.01\",\"securityAlias\":\"United Paragon\",\"indicatorImg\":\"\",\"securitySymbol\":\"UPM\"},{\"totalVolume\":\"1,159,970\",\"indicator\":\"D\",\"percChangeClose\":\"-0.63\",\"lastTradedPrice\":\"125.7\",\"securityAlias\":\"Univ Robina\",\"indicatorImg\":\"\",\"securitySymbol\":\"URC\"},{\"totalVolume\":\"550,000\",\"indicator\":\"U\",\"percChangeClose\":\"1.52\",\"lastTradedPrice\":\"0.67\",\"securityAlias\":\"Vitarich\",\"indicatorImg\":\"\",\"securitySymbol\":\"VITA\"},{\"totalVolume\":\"6,480,500\",\"indicator\":\"D\",\"percChangeClose\":\"-0.19\",\"lastTradedPrice\":\"5.37\",\"securityAlias\":\"Vista Land\",\"indicatorImg\":\"\",\"securitySymbol\":\"VLL\"},{\"totalVolume\":\"231,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.83\",\"securityAlias\":\"Victorias \",\"indicatorImg\":\"\",\"securitySymbol\":\"VMC\"},{\"totalVolume\":\"119,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.45\",\"securityAlias\":\"Vulcan Ind`l\",\"indicatorImg\":\"\",\"securitySymbol\":\"VUL\"},{\"totalVolume\":\"2,772,100\",\"indicator\":\"U\",\"percChangeClose\":\"0.1\",\"lastTradedPrice\":\"10\",\"securityAlias\":\"PhilWeb\",\"indicatorImg\":\"\",\"securitySymbol\":\"WEB\"},{\"totalVolume\":\"4,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"1.22\",\"securityAlias\":\"yehey\",\"indicatorImg\":\"\",\"securitySymbol\":\"YEHEY\"},{\"totalVolume\":\"20,000\",\"indicator\":\"N\",\"percChangeClose\":\"0\",\"lastTradedPrice\":\"0.34\",\"securityAlias\":\"Zeus Holdings\",\"indicatorImg\":\"\",\"securitySymbol\":\"ZHI\"},{\"totalVolume\":\"6,343.25\",\"indicator\":\"D\",\"percChangeClose\":\"-3.15\",\"lastTradedPrice\":\"-0.05\",\"securityAlias\":\"PSEi\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/downChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"PSE\"},{\"totalVolume\":\"3,864.86\",\"indicator\":\"D\",\"percChangeClose\":\"-4.14\",\"lastTradedPrice\":\"-0.11\",\"securityAlias\":\"All Shares\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/downChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"ALL\"},{\"totalVolume\":\"1,541.92\",\"indicator\":\"U\",\"percChangeClose\":\"9.16\",\"lastTradedPrice\":\"0.6\",\"securityAlias\":\"Financials\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/upChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"FIN\"},{\"totalVolume\":\"9,126.16\",\"indicator\":\"U\",\"percChangeClose\":\"21.85\",\"lastTradedPrice\":\"0.24\",\"securityAlias\":\"Industrial\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/upChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"IND\"},{\"totalVolume\":\"5,738.99\",\"indicator\":\"D\",\"percChangeClose\":\"-69.24\",\"lastTradedPrice\":\"-1.19\",\"securityAlias\":\"Holding Firms\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/downChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"HDG\"},{\"totalVolume\":\"2,551.78\",\"indicator\":\"U\",\"percChangeClose\":\"4.86\",\"lastTradedPrice\":\"0.19\",\"securityAlias\":\"Property\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/upChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"PRO\"},{\"totalVolume\":\"1,972.37\",\"indicator\":\"U\",\"percChangeClose\":\"6.67\",\"lastTradedPrice\":\"0.34\",\"securityAlias\":\"Services\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/upChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"SVC\"},{\"totalVolume\":\"12,098.48\",\"indicator\":\"U\",\"percChangeClose\":\"19.56\",\"lastTradedPrice\":\"0.16\",\"securityAlias\":\"Mining and Oil\",\"indicatorImg\":\"<img src='/styles/pse/images/icons/upChange.png' width='15' height='12' hspace='100' vspace='-15'>\",\"securitySymbol\":\"M-O\"}]\n";
		
		assertEquals(expected, HttpUtil.getInstance().getSecuritiesAndIndicesForPublic());
	}
	
}