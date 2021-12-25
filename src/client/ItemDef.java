package client;

import java.io.*;

public final class ItemDef {

	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if(j == 1)
		{
			k = anInt197;
			l = anInt173;
		}
		if(k == -1)
			return true;
		boolean flag = true;
		if(!Model.method463(k))
			flag = false;
		if(l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}
	
	/*public static void dumpStacks() {
		try {
			FileOutputStream out = new FileOutputStream(new File("stackable.dat"));
			for (int j = 0; j < 12000; j++) {
				ItemDef item = ItemDef.forID(j);
				out.write(item.stackable ? 1 : 0);
			}
			out.write(-1);
			out.close();
		} catch (IOException ioe) {ioe.printStackTrace();}	
	}
	
	public static void dumpNotes() {
		try {
			FileOutputStream out = new FileOutputStream(new File("notes.dat"));
			for (int j = 0; j < 12000; j++) {
				ItemDef item = ItemDef.forID(j);
				out.write(item.certTemplateID != -1 ? 0 : 1);
			}
			out.write(-1);
			out.close();
		} catch (IOException ioe) {ioe.printStackTrace();}
	
	
	}*/
	
	public static void dumpPrices() {
		try {
			//FileOutputStream out = new FileOutputStream(new File("prices.dat"));
			FileWriter fw = new FileWriter("prices.txt");
			for (int j = 0; j <= 16000; j++) {
				ItemDef item = ItemDef.forID(j);
				fw.write(item.id + " " + item.value + "\r\n");
			}
			fw.close();
		} catch (IOException ioe) {ioe.printStackTrace();}
	
	
	}
	
	public static void unpackConfig(StreamLoader streamLoader)	 {
		stream = new Stream(streamLoader.getDataForName("obj.dat"));
		Stream stream = new Stream(streamLoader.getDataForName("obj.idx"));
		totalItems = stream.readUnsignedWord();
		streamIndices = new int[totalItems + 15000];
		int i = 2;
		for(int j = 0; j < totalItems; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}
		cache = new ItemDef[10];
		for(int k = 0; k < 10; k++)
			cache[k] = new ItemDef();
		//dumpStacks();
		//dumpNotes();
		dumpPrices();
	}

	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if(j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if(k == -1)
			return null;
		Model model = Model.method462(k);
		if(l != -1) {
			Model model_1 = Model.method462(l);
			Model aclass30_sub2_sub4_sub6s[] = {
					model, model_1
			};
			model = new Model(2, aclass30_sub2_sub4_sub6s);
		}
	   if (originalModelColors != null) {
			for (int i1 = 0; i1 < originalModelColors.length; i1++)
				model.method476(originalModelColors[i1], modifiedModelColors[i1]);

		}
		return model;
	}

	public boolean method195(int j) {
		int k = maleEquip1;
		int l = maleEquip2;
		int i1 = anInt185;
		if(j == 1) {
			k = femaleEquip1;
			l = femaleEquip2;
			i1 = anInt162;
		}
		if(k == -1)
			return true;
		boolean flag = true;
		if(!Model.method463(k))
			flag = false;
		if(l != -1 && !Model.method463(l))
			flag = false;
		if(i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}

	public Model method196(int i) {
		int j = maleEquip1;
		int k = maleEquip2;
		int l = anInt185;
		if(i == 1) {
			j = femaleEquip1;
			k = femaleEquip2;
			l = anInt162;
		}
		if(j == -1)
			return null;
		Model model = Model.method462(j);
		if(k != -1)
			if(l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model aclass30_sub2_sub4_sub6_1s[] = {
						model, model_1, model_3
				};
				model = new Model(3, aclass30_sub2_sub4_sub6_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model aclass30_sub2_sub4_sub6s[] = {
						model, model_2
				};
				model = new Model(2, aclass30_sub2_sub4_sub6s);
			}
		if(i == 0 && aByte205 != 0)
			model.method475(0, aByte205, 0);
		if(i == 1 && aByte154 != 0)
			model.method475(0, aByte154, 0);
		if (originalModelColors != null) {
			for (int i1 = 0; i1 < originalModelColors.length; i1++)
				model.method476(originalModelColors[i1], modifiedModelColors[i1]);

		}
		return model;
	}

	
	public void setDefaults() {
		modelID = 0;
		name = null;
		description = null;
		originalModelColors = null;
		modifiedModelColors = null;
		modelZoom = 2000;
		modelRotation1 = 0;
		modelRotation2 = 0;
		anInt204 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		actions = null;
		maleEquip1 = -1;
		maleEquip2 = -1;
		aByte205 = 0;
		femaleEquip1 = -1;
		femaleEquip2 = -1;
		aByte154 = 0;
		anInt185 = -1;
		anInt162 = -1;
		anInt175 = -1;
		anInt166 = -1;
		anInt197 = -1;
		anInt173 = -1;
		stackIDs = null;
		stackAmounts = null;
		certID = -1;
		certTemplateID = -1;
		anInt167 = 128;
		anInt192 = 128;
		anInt191 = 128;
		anInt196 = 0;
		anInt184 = 0;
		team = 0;
	}

	public static ItemDef forID(int i) {
		for(int j = 0; j < 10; j++)
			if(cache[j].id == i)
				return cache[j];
		cacheIndex = (cacheIndex + 1) % 10;
		ItemDef itemDef = cache[cacheIndex];
		stream.currentOffset = streamIndices[i];
		itemDef.id = i;
		itemDef.setDefaults();
		itemDef.readValues(stream);
		if(itemDef.certTemplateID != -1)
			itemDef.toNote();
		if(!isMembers && itemDef.membersObject) {
			itemDef.name = "Members Object";
			itemDef.description = "Login to a members' server to use this object.".getBytes();
			itemDef.groundActions = null;
			itemDef.actions = null;
			itemDef.team = 0;
		}

		/**
class8.aStringArray189 = => itemDef.actions =
class8.aStringArray189[1] = => itemDef.actions[1] =
class8.anInt190 = => itemDef.modelRotation1 =
class8.anInt198 = => itemDef.modelRotation2 =
class8.anInt181 = => itemDef.modelZoom =
class8.anInt169 = => itemDef.modelOffset1 =
class8.aByteArray178 = => itemDef.description =
class8.aString170 = => itemDef.name =
class8.aBoolean176 = => itemDef.stackable =
class8.anInt165 = => itemDef.maleEquip1 =
class8.anInt200 = => itemDef.femaleEquip1 =
class8.anInt204 = => itemDef.anInt204 =
class8.anInt175 = => itemDef.anInt175 =
class8.anInt197 = => itemDef.anInt197 =
class8.anIntArray156 = => itemDef.originalModelColors =
class8.anIntArray160 = => itemDef.modifiedModelColors =
class8.anInt164 = => itemDef.maleEquip2 =
class8.anInt188 = => itemDef.femaleEquip2 =
class8.anInt194 = => itemDef.modelOffset2 =
class8.anInt174 = => itemDef.modelID =
		**/

			switch (itemDef.id) {
				
		
			
				case 11722:
				itemDef.femaleEquip1 = itemDef.maleEquip1;
				itemDef.femaleEquip2 = itemDef.maleEquip2;
				break;
				
				case 4657:
					itemDef.name = "Ring of the Gods";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 9152;
					itemDef.modifiedModelColors[0] = 99;
					break;
					
				case 674:
					itemDef.name = "Slag sample";
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Activate";
					break;
					
				case 4671:
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Activate";
					break;
					
				case 602:
					itemDef.name = "Magnet mould";
					break;
					
				case 1495:
					itemDef.name = "Iorwerth's Gauntlets";
					itemDef.description = "Gauntlets that once belonged to the corrupted elf Lord Iorwerth.".getBytes();
					break;
					
				case 6070:
					itemDef.name = "Lion's Mane";
					break;
					
				case 4677:
					itemDef.name = "Lion amulet";
					break;
					
				case 9076:
					itemDef.name = "Nickel ore";
					break;
					
				case 5516:
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Check runes";
					itemDef.actions[1] = "Take runes slot 1";
					itemDef.actions[2] = "Take runes slot 2";
					itemDef.actions[3] = "Take runes slot 3";
					itemDef.description = "Can be used to store up to 3 types of runes.".getBytes();
					break;
				
				case 84:
					itemDef.name = "Dust battlestaff";
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wield";
					itemDef.maleEquip1 = 534;
					itemDef.femaleEquip1 = 534;
					itemDef.maleEquip2 = 567;
					itemDef.femaleEquip2 = 567;
					itemDef.aByte154 = 6;
					itemDef.anInt175 = -1;
					itemDef.anInt162 = -1;
					itemDef.anInt166 = -1;
					itemDef.anInt167 = 128;
					itemDef.anInt175 = -1;
					itemDef.anInt192 = 128;
					itemDef.anInt191 = 128;
					itemDef.anInt197 = -1;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43117;
					itemDef.modifiedModelColors[0] = 3400;
					break;
					
				case 15075:
					itemDef.modelID = 2529;
					itemDef.modelZoom = 1070;
					itemDef.modelOffset1 = -2;
					itemDef.modelOffset2 = -19;
					itemDef.modelRotation1 = 224;
					itemDef.modelRotation2 = 1056;
					itemDef.maleEquip1 = 509;
					itemDef.femaleEquip1 = 509;
					itemDef.aByte205 = 0;
					itemDef.aByte154 = 6;
					itemDef.anInt175 = -1;
					itemDef.anInt162 = -1;
					itemDef.anInt166 = -1;
					itemDef.anInt167 = 128;
					itemDef.anInt173 = -1;
					itemDef.anInt185 = -1;
					itemDef.anInt191 = 128;
					itemDef.anInt192 = 128;
					itemDef.anInt197 = -1;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 61;
					itemDef.modifiedModelColors[0] = 950;
					itemDef.name = "Dragon Pickaxe";
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wield";
					break;
				
				case 4202:
					itemDef.name = "Ring of Immunity";
					itemDef.description = "Makes the wearer immune to all damage.".getBytes();
					break;
					
				case 3261:
					itemDef.name = "Marijuana";
					itemDef.description = "A drug.".getBytes();
					break;
					
				case 6650:
					itemDef.name = "Vibranium";
					itemDef.description = "The most powerful substance in the unvierse.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Absorb power";
					break;
					
				case 2403:
					itemDef.description = "Used to teleport to Hazeel's lair.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Read";
					break;
					
				case 2406:
					itemDef.description = "A magical seal that grants a 5% chance to use 0 runes when casting a combat spell.".getBytes();
					break;
					
				case 15080:
					itemDef.name = "T'Challa's necklace";
					itemDef.modelID = 9635;
					itemDef.modelZoom = 1020;
					itemDef.modelOffset2 = -16;
					itemDef.modelRotation1 = 332;
					itemDef.modelRotation2 = 2020;
					itemDef.maleEquip1 = 9643;
					itemDef.femaleEquip1 = 9645;
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wear";
					break;
					
				case 15085:
					itemDef.name = "Vannaka's amulet";
					itemDef.description = "This amulet increases the amount of points gained in the Arena when worn.".getBytes();
					itemDef.modelID = 2796;
					itemDef.modelZoom = 620;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 16;
					itemDef.modelRotation1 = 424;
					itemDef.modelRotation2 = 68;
					itemDef.maleEquip1 = 290;
					itemDef.femaleEquip1 = 454;
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wear";
					itemDef.originalModelColors = new int[2];
					itemDef.modifiedModelColors = new int[2];
					itemDef.originalModelColors[0] = 5916;
					itemDef.originalModelColors[1] = 4882;
					itemDef.modifiedModelColors[0] = 40;
					itemDef.modifiedModelColors[1] = 40;
					break;
					
				case 15090:
					itemDef.name = "Reality stone";
					itemDef.modelID = 5194;
					itemDef.modelZoom = 1500;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt167 = 80;
					itemDef.anInt191 = 80;
					itemDef.anInt192 = 80;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43125;
					itemDef.modifiedModelColors[0] = 960;
					break;
					
				case 15091:
					itemDef.name = "Soul stone";
					itemDef.modelID = 5194;
					itemDef.modelZoom = 1500;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt167 = 80;
					itemDef.anInt191 = 80;
					itemDef.anInt192 = 80;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43125;
					itemDef.modifiedModelColors[0] = 8122;
					break;
					
				case 15092:
					itemDef.name = "Mind stone";
					itemDef.modelID = 5194;
					itemDef.modelZoom = 1500;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt167 = 80;
					itemDef.anInt191 = 80;
					itemDef.anInt192 = 80;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43125;
					itemDef.modifiedModelColors[0] = 8170;
					break;
					
				case 15093:
					itemDef.name = "Space stone";
					itemDef.modelID = 5194;
					itemDef.modelZoom = 1500;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt167 = 80;
					itemDef.anInt191 = 80;
					itemDef.anInt192 = 80;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43125;
					itemDef.modifiedModelColors[0] = 302770;
					break;
					
				case 15094:
					itemDef.name = "Time stone";
					itemDef.modelID = 5194;
					itemDef.modelZoom = 1500;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt167 = 80;
					itemDef.anInt191 = 80;
					itemDef.anInt192 = 80;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43125;
					itemDef.modifiedModelColors[0] = 350770;
					break;
					
				case 15095:
					itemDef.name = "Power stone";
					itemDef.modelID = 5194;
					itemDef.modelZoom = 1500;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt167 = 80;
					itemDef.anInt191 = 80;
					itemDef.anInt192 = 80;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 43125;
					itemDef.modifiedModelColors[0] = 51136;
					break;
					
				case 9185:
					itemDef.name = "Rune crossbow";
					break;
					
				case 4551:
				case 4552:
					itemDef.name = "Slayer helmet";
					break;
					
				case 15100:
					itemDef.name = "Dragon crossbow";
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wield";
					itemDef.modelID = 16876;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = 3;
					itemDef.modelRotation1 = 432;
					itemDef.modelRotation2 = 258;
					itemDef.modelZoom = 926;
					itemDef.maleEquip1 = 16846;
					itemDef.femaleEquip1 = 16846;
					itemDef.originalModelColors = new int[6];
					itemDef.modifiedModelColors = new int[6];
					itemDef.originalModelColors[0] = 6447;
					itemDef.originalModelColors[1] = 6443;
					itemDef.originalModelColors[2] = 6439;
					itemDef.originalModelColors[3] = 5656;
					itemDef.originalModelColors[4] = 5652;
					itemDef.originalModelColors[5] = 5904;
					itemDef.modifiedModelColors[0] = 6806;
					itemDef.modifiedModelColors[1] = 7054;//7054
					itemDef.modifiedModelColors[2] = 5002;//5002
					itemDef.modifiedModelColors[3] = 950;//36141
					itemDef.modifiedModelColors[4] = 942;//36133
					itemDef.modifiedModelColors[5] = 1050;//36252
					break;
					
				case 1491:
					itemDef.name = "Spirit of Bast";
					itemDef.description = "Spirit of the Panther God Bast.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Equip";
					break;
					
				case 8058:
				case 8059:
				case 8060:
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Equip";
					break;
					
					
				case 5518:
					itemDef.description = "Use this on an NPC to view its stats.".getBytes();
					break;
					
				case 12000:
					itemDef.name = "Amulet of fury (e)";
					itemDef.description = "An enchanted amulet of fury that prevents health restoration.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wear";
					itemDef.actions[2] = "Toggle";
					itemDef.modelID = 9633;
					itemDef.modelZoom = 620;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 16;
					itemDef.modelRotation1 = 424;
					itemDef.modelRotation2 = 68;
					itemDef.maleEquip1 = 9642;
					itemDef.femaleEquip1 = 9644;
					itemDef.originalModelColors = new int[2];
					itemDef.modifiedModelColors = new int[2];
					itemDef.originalModelColors[0] = 43074; //43074
					itemDef.originalModelColors[1] = 43086; //43086
					itemDef.modifiedModelColors[0] = 840000; //926
					itemDef.modifiedModelColors[1] = 1709; //1709
					break;
					
				case 6790:
					itemDef.name = "Gnome Commander Shoes";
					itemDef.description = "Shoes of a Gnomish commander.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Equip";
					break;
					
				case 4668:
					itemDef.name = "Meth";
					itemDef.description = "A drug.".getBytes();
					break;
					
				case 4689:
					itemDef.name = "Cocaine";
					itemDef.description = "A drug.".getBytes();
					break;
					
				case 738:
					itemDef.name = "Heroin";
					itemDef.description = "A drug.".getBytes();
					break;
					
				case 295:
					itemDef.name = "Dramen amulet";
					itemDef.description = "An ancient and powerful amulet".getBytes();
					break;
					
				case 4021:
					itemDef.name = "Gorilla amulet";
					itemDef.description = "A powerful amulet that exudes strength.".getBytes();
					break;
					
				case 15070:
					itemDef.name = "Dragon Claws";
					itemDef.description = "Powerful claws.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wield";
					itemDef.modelID = 3781;
					itemDef.maleEquip1 = 3780;
					itemDef.femaleEquip1 = 3780;
					itemDef.modelOffset1 = -7;
					itemDef.modelOffset2 = -13;
					itemDef.modelZoom = 630;
					itemDef.modelRotation1 = 268;
					itemDef.modelRotation2 = 1340;
					itemDef.originalModelColors = new int[4];
					itemDef.modifiedModelColors = new int[4];
					itemDef.originalModelColors[0] = 24;
					itemDef.originalModelColors[1] = 33;
					itemDef.originalModelColors[2] = 41;
					itemDef.originalModelColors[3] = 49;
					itemDef.modifiedModelColors[0] = 950;
					itemDef.modifiedModelColors[1] = 960;
					itemDef.modifiedModelColors[2] = 960;
					itemDef.modifiedModelColors[3] = 950;
					break;
					
					
				case 15060:
					itemDef.name = "Twisted bow";
					itemDef.description = "A very powerful bow.".getBytes();
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wield";
					itemDef.modelID = 9928;
					itemDef.maleEquip1 = 9955;
					itemDef.femaleEquip1 = 9955;
					itemDef.modelOffset1 = -5;
					itemDef.modelOffset2 = 5;
					itemDef.modelZoom = 1650;
					itemDef.modelRotation1 = 384;
					itemDef.modelRotation2 = 20;
					itemDef.aByte154 = 6;
					itemDef.originalModelColors = new int[6];
					itemDef.modifiedModelColors = new int[6];
					itemDef.originalModelColors[0] = 10413;
					itemDef.originalModelColors[1] = 10283;
					itemDef.originalModelColors[2] = 10275;
					itemDef.originalModelColors[3] = 7465;
					itemDef.originalModelColors[4] = 10304;
					itemDef.originalModelColors[5] = 5190;
					itemDef.modifiedModelColors[0] = 28919;
					itemDef.modifiedModelColors[1] = -17597;
					itemDef.modifiedModelColors[2] = -18772;
					itemDef.modifiedModelColors[3] = 18989;	
					itemDef.modifiedModelColors[4] = 19706;
					itemDef.modifiedModelColors[5] = 5190;
					break;
					
				case 4508:
					itemDef.name = "Crystal sword";
					/*itemDef.originalModelColors = new int[6];
					itemDef.modifiedModelColors = new int[6];
					itemDef.originalModelColors[0] = 43321;
					itemDef.originalModelColors[1] = 43992;
					itemDef.originalModelColors[2] = 43235;
					itemDef.originalModelColors[3] = 42095;
					itemDef.originalModelColors[4] = 43486;
					itemDef.originalModelColors[5] = 127;
					itemDef.modifiedModelColors[0] = 80000;
					itemDef.modifiedModelColors[1] = 10000;
					itemDef.modifiedModelColors[2] = 5000;
					itemDef.modifiedModelColors[3] = 45;
					itemDef.modifiedModelColors[4] = 6984;
					itemDef.modifiedModelColors[5] = 500;*/
					break;
					
				case 9739:
				case 9740:
					itemDef.name = "Super combat potion(4)";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 61;
					itemDef.modifiedModelColors[0] = 350770;
					break;
					
				case 9741:
				case 9742:
					itemDef.name = "Super combat potion(3)";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 61;
					itemDef.modifiedModelColors[0] = 350770;
					break;
					
				case 9743:
				case 9744:
					itemDef.name = "Super combat potion(2)";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 61;
					itemDef.modifiedModelColors[0] = 350770;
					break;
					
				case 9745:
				case 9746:
					itemDef.name = "Super combat potion(1)";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 61;
					itemDef.modifiedModelColors[0] = 350770;
					break;
					
				case 6377:
					itemDef.name = "Holy sandals";
					break;
					
				case 6040:
					itemDef.description = "Wearing this provides a 5% XP boost in Farming and Herblore.".getBytes();
					break;
					
				case 6949:
					itemDef.description = "Use this with an Amulet of Fury to enchant it.".getBytes();
					break;
					
				case 6526:
					itemDef.actions = new String[5];
					itemDef.actions[1] = "Wield";
					itemDef.actions[2] = "Check";
					itemDef.name = "Tstanon's spine";
					itemDef.description = "A powerful staff with a built in spell, charged with fire and blood runes.".getBytes();
					break;
					
				case 6538:
					itemDef.name = "Tstanon's spine";
					itemDef.description = "A powerful staff with a built in spell, charged with fire and blood runes.".getBytes();
					break;
					
				case 6709:
					itemDef.name = "Spider carcass";
					itemDef.description = "Can be cut open to receive the silk producing glands.".getBytes();
					break;

				case 7465:
					itemDef.name = "Spinneret";
					itemDef.description = "The silk can be spun out of this at a spinning wheel.".getBytes();
					break;
					
				case 2717:
					itemDef.name = "Monster chest";
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Summon Pet";
					//itemDef.actions[1] = "Dismiss Monster";
					break;
				
		case 15037:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wield";
			itemDef.femaleEquip1 = 35085;//female
			itemDef.modelOffset1 = 9;
			itemDef.modelOffset2 = 13;
			itemDef.modelZoom = 1425;
			itemDef.modelRotation2 = 1300;
			itemDef.modelRotation1 = 700;
			itemDef.maleEquip1 = 35085;
			itemDef.modelID = 35084;
			itemDef.name = "Chaotic rapier";
			itemDef.aByte205 = -12;
			itemDef.aByte154 = -12;
			itemDef.anInt188 = -1;//female sleeve
			itemDef.anInt164 = -1;//male sleeve
		break;
		case 15038:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wield";
			itemDef.femaleEquip1 = 35087;//female
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 0;
			itemDef.modelZoom = 1650;
			itemDef.modelRotation2 = 1300;
			itemDef.modelRotation1 = 498;
			itemDef.maleEquip1 = 35087;
			itemDef.modelID = 35086;
			itemDef.name = "Chaotic longsword";
			itemDef.aByte205 = -12;
			itemDef.aByte154 = -12;
			itemDef.anInt188 = -1;//female sleeve
			itemDef.anInt164 = -1;//male sleeve
		break;
		case 15039:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wield";
			itemDef.femaleEquip1 = 35089;//female
			itemDef.modelOffset1 = 4;
			itemDef.modelOffset2 = 2;
			itemDef.modelZoom = 1360;
			itemDef.modelRotation2 = 354;
			itemDef.modelRotation1 = 498;
			itemDef.maleEquip1 = 35089;
			itemDef.modelID = 35088;
			itemDef.name = "Chaotic maul";
			itemDef.aByte205 = -12;
			itemDef.aByte154 = -12;
			//itemDef.anInt204 = 1000; //something in inv model
			//itemDef.anInt175 = 1000; //nothing?
			//itemDef.anInt197 = 1000; //nothing?
			itemDef.anInt188 = -1;//female sleeve
			itemDef.anInt164 = -1;//male sleeve
		break;
		case 15040:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wield";
			itemDef.femaleEquip1 = 35091;//female
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = 0;
			itemDef.modelZoom = 1711;
			itemDef.modelRotation2 = 365;
			itemDef.modelRotation1 = 350;
			itemDef.maleEquip1 = 35091;
			itemDef.modelID = 35090;
			itemDef.name = "Chaotic staff";
			itemDef.aByte205 = -10;
			itemDef.aByte154 = -10;
			itemDef.anInt188 = -1;//female sleeve
			itemDef.anInt164 = -1;//male sleeve
		break;
		case 8137: //hellhound item
			itemDef.modelID = 2997;
			itemDef.modelZoom = 2700;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			break;
		case 15000: //dark beast
			itemDef.modelID = 2934;
			itemDef.modelZoom = 2700;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			itemDef.name = "Dark Beast";
			break;
		case 15001: //dag
			itemDef.modelID = 4587;
			itemDef.name = "Dagannoth";
			itemDef.modelZoom = 4300;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			break;
		case 15002: //green dragon
			itemDef.modelID = 2998;
			itemDef.name = "Baby Green Dragon";
			itemDef.modelZoom = 2500;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			itemDef.originalModelColors = new int[4];
			itemDef.modifiedModelColors = new int[4];
			itemDef.originalModelColors[0] = 70;
			itemDef.modifiedModelColors[0] = 22051;
			itemDef.originalModelColors[1] = 61;
			itemDef.modifiedModelColors[1] = 22051;
			itemDef.originalModelColors[2] = 53;
			itemDef.modifiedModelColors[2] = 22051;
			itemDef.originalModelColors[3] = 41;
			itemDef.modifiedModelColors[3] = 22051;
			break;
		case 15003: //blue dragon
			itemDef.modelID = 2998;
			itemDef.name = "Baby Blue Dragon";
			itemDef.modelZoom = 2500;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			itemDef.originalModelColors = new int[4];
			itemDef.modifiedModelColors = new int[4];
			itemDef.originalModelColors[0] = 70;
			itemDef.modifiedModelColors[0] = 40371;
			itemDef.originalModelColors[1] = 61;
			itemDef.modifiedModelColors[1] = 40487;
			itemDef.originalModelColors[2] = 53;
			itemDef.modifiedModelColors[2] = 40606;
			itemDef.originalModelColors[3] = 41;
			itemDef.modifiedModelColors[3] = 49197;
			break;
		case 15004: //red dragon
			itemDef.modelID = 2998;
			itemDef.name = "Baby Red Dragon";
			itemDef.modelZoom = 2500;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			itemDef.originalModelColors = new int[4];
			itemDef.modifiedModelColors = new int[4];
			itemDef.originalModelColors[0] = 70;
			itemDef.modifiedModelColors[0] = 571;
			itemDef.originalModelColors[1] = 61;
			itemDef.modifiedModelColors[1] = 687;
			itemDef.originalModelColors[2] = 53;
			itemDef.modifiedModelColors[2] = 931;
			itemDef.originalModelColors[3] = 41;
			itemDef.modifiedModelColors[3] = 2221;
			break;
		case 15005: //black dragon
			itemDef.modelID = 2998;
			itemDef.name = "Baby Black Dragon";
			itemDef.modelZoom = 2500;
			itemDef.modelRotation2 = 200;
			itemDef.modelRotation1 = 0;
			itemDef.originalModelColors = new int[4];
			itemDef.modifiedModelColors = new int[4];
			itemDef.originalModelColors[0] = 70;
			itemDef.modifiedModelColors[0] = 16;
			itemDef.originalModelColors[1] = 61;
			itemDef.modifiedModelColors[1] = 16;
			itemDef.originalModelColors[2] = 53;
			itemDef.modifiedModelColors[2] = 16;
			itemDef.originalModelColors[3] = 41;
			itemDef.modifiedModelColors[3] = 16;
			break;
			
		case 16000:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wield";
			itemDef.modelID = 29424;
			itemDef.name = "Abyssal Bludgeon";
			itemDef.modelZoom = 3000;
			itemDef.modelRotation1 = 0;
			itemDef.modelRotation2 = 0;
			itemDef.maleEquip1 = 30000;
			itemDef.femaleEquip1 = 30000;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = 0;
			break;
		
		case 14005:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.modelID = 40004;
			itemDef.name = "Arcane Spirit Shield";
			itemDef.modelZoom = 1600;
			itemDef.modelRotation1 = 396;
			itemDef.modelRotation2 = 27;
			itemDef.maleEquip1 = 40005;
			itemDef.femaleEquip1 = 40005;
			itemDef.modelOffset1 = 4;
			itemDef.modelOffset2 = 13;
			break;
			
		case 14010:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.modelID = 40002;
			itemDef.name = "Spectral Spirit Shield";
			itemDef.modelZoom = 1600;
			itemDef.modelRotation1 = 396;
			itemDef.modelRotation2 = 27;
			itemDef.maleEquip1 = 40003;
			itemDef.femaleEquip1 = 40003;
			itemDef.modelOffset2 = 14;
			break;
			
		case 14015:
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.modelID = 40000;
			itemDef.name = "Elysian Spirit Shield";
			itemDef.modelZoom = 1789;
			itemDef.modelRotation1 = 431;
			itemDef.modelRotation2 = 27;
			itemDef.maleEquip1 = 40001;
			itemDef.femaleEquip1 = 40001;
			itemDef.modelOffset2 = 11;
			break;
		
		
				
			}
		/* Hardcoded items start here */
if (i >= 9747 && i <= 9811) {
	if (!itemDef.name.contains("hood")) {
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Operate";
	}
}
			
if (i == 15050) {
	itemDef.name = "Dragon defender";
	itemDef.description = "A dragon defender.".getBytes();
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Wield";
	itemDef.modelID = 15335;
	itemDef.modelZoom = 490;
	itemDef.modelRotation1 = 344;
	itemDef.modelRotation2 = 192;
	itemDef.modelOffset1 = 1;
	itemDef.modelOffset2 = 20;
	itemDef.anInt204 = 0;
	itemDef.maleEquip1 = 15413;
	itemDef.femaleEquip1 = 15413;
	itemDef.originalModelColors = new int[2];
	itemDef.modifiedModelColors = new int[2];
	itemDef.originalModelColors[0] = 28;
	itemDef.modifiedModelColors[0] = 960;
	itemDef.originalModelColors[1] = 74;
	itemDef.modifiedModelColors[1] = 950;
}
		if(i == 13896) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9510;
itemDef.stackable = false;
itemDef.modelZoom = 750;
itemDef.modelRotation1 = 126;
itemDef.modelRotation2 = 129;
itemDef.modelOffset1 = -1;
itemDef.modelOffset2 = 1;
itemDef.anInt204 = 28;
itemDef.maleEquip1 = 9531;
itemDef.femaleEquip1 = 9541;
itemDef.anInt175 = -1;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Statius's full helm";
itemDef.description = "Statius's full helm.".getBytes(); 
}
if (i == 13884) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 19513;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 19522;
itemDef.femaleEquip1 = 19532;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Statius's platebody";
itemDef.description = "Statius's platebody.".getBytes(); 
}
if (i == 13890) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9506;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9526;
itemDef.femaleEquip1 = 9537;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Statius's platelegs";
itemDef.description = "Statius's platelegs.".getBytes(); 
}
if (i == 13902) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wield";
itemDef.modelID = 9500;
itemDef.modelZoom = 1200;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9521;
itemDef.femaleEquip1 = 9521;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Statius's warhammer";
itemDef.description = "Statius's warhammer.".getBytes(); 
}
if (i == 13887) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9302;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9300;
itemDef.femaleEquip1 = 9301;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Vesta's chainbody";
itemDef.description = "Vesta's chainbody.".getBytes(); 
}
if (i == 13893) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9502;
itemDef.modelZoom = 1800;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9527;
itemDef.femaleEquip1 = 9538;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Vesta's plateskirt";
itemDef.description = "Vesta's plateskirt.".getBytes(); 
}
if (i == 13899) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wield";
itemDef.modelID = 9511;
itemDef.modelZoom = 1900;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9519;
itemDef.femaleEquip1 = 9519;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Vesta's longsword";
itemDef.description = "Vesta's longsword.".getBytes(); 
}
if (i == 13905) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wield";
itemDef.modelID = 9512;
itemDef.modelZoom = 1900;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9518;
itemDef.femaleEquip1 = 9518;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Vesta's spear";
itemDef.description = "Vesta's spear.".getBytes(); 
}
if (i == 13864) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9515;
itemDef.modelZoom = 800;
itemDef.modelRotation1 = 0;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9530;
itemDef.femaleEquip1 = 9530;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Zuriel's hood";
itemDef.description = "Zuriel's hood.".getBytes(); 
}
if (i == 13858) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9507;
itemDef.modelZoom = 1700;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9524;
itemDef.femaleEquip1 = 9533;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Zuriel's robe top";
itemDef.description = "Zuriel's robe top.".getBytes(); 
}
if (i == 13861) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9505;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9528;
itemDef.femaleEquip1 = 9535;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Zuriel's robe bottom";
itemDef.description = "Zuriel's robe bottom.".getBytes(); 
}
if (i == 13867) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wield";
itemDef.modelID = 9509;
itemDef.modelZoom = 1800;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9520;
itemDef.femaleEquip1 = 9520;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Zuriel's staff";
itemDef.description = "Zuriel's staff.".getBytes(); 
}
if (i == 13876) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 9504;
itemDef.modelZoom = 600;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 9529;
itemDef.femaleEquip1 = 9539;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Morrigan's coif";
itemDef.description = "Morrigan's coif.".getBytes(); 
}
if (i == 13870) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 19501;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 19523;
itemDef.femaleEquip1 = 19534;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Morrigan's leather body";
itemDef.description = "Morrigan's leather body.".getBytes(); 
}
if (i == 13873) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wear";
itemDef.modelID = 19514;
itemDef.modelZoom = 1700;
itemDef.modelRotation1 = 572;
itemDef.modelRotation2 = 0;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 19525;
itemDef.femaleEquip1 = 19536;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Morrigan's chaps";
itemDef.description = "Morrigan's chaps.".getBytes(); 
}
if (i == 14000) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wield";
itemDef.modelID = 14001;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 1500;
itemDef.modelRotation2 = 1500;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 14000;
itemDef.femaleEquip1 = 14000;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Bone scimitar";
itemDef.description = "Bone scimitar.".getBytes(); 
}
if (i == 14002) {
itemDef.actions = new String[5];
itemDef.actions[1] = "Wield";
itemDef.modelID = 14003;
itemDef.modelZoom = 1400;
itemDef.modelRotation1 = 500;
itemDef.modelRotation2 = 1000;
itemDef.modelOffset1 = 0;
itemDef.modelOffset2 = 1;
itemDef.maleEquip1 = 14002;
itemDef.femaleEquip1 = 14002;
itemDef.maleEquip2 = -1;
itemDef.femaleEquip2 = -1;
itemDef.stackable = false;
itemDef.name = "Bone shield";
itemDef.description = "Bone shield.".getBytes(); 
}
		/**/
		return itemDef;
	}

	public void actionData(int a, String b) {
		actions = new String[5];
		actions[a] = b;
	}
	
	public void totalColors(int total) {
	   originalModelColors = new int[total];	   
	   modifiedModelColors = new int[total];
	}
	
	public void colors(int id, int original, int modified) {
		originalModelColors[id] = original;
		modifiedModelColors[id] = modified;
	}
	public void itemData(String n, String d) {
		name = n;
		description = d.getBytes();
	}
	public void models(int mID, int mE, int fE, int mE2, int fE2) {
		modelID = mID;
		maleEquip1 = mE;
		femaleEquip1 = fE;
		maleEquip2 = mE2;
		femaleEquip2 = fE2;
	}
	public void modelData(int mZ, int mR1, int mR2, int mO1, int mO2) {
		modelZoom = mZ;
		modelRotation1 = mR1;
		modelRotation2 = mR2;
		modelOffset1 = mO1;
		modelOffset2 = mO2;
	}

	public void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotation1 = itemDef.modelRotation1;
		modelRotation2 = itemDef.modelRotation2;
		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		originalModelColors = itemDef.originalModelColors;
		modifiedModelColors = itemDef.modifiedModelColors;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String s = "a";
		char c = itemDef_1.name.charAt(0);
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			s = "an";
		description = ("Swap this note at any bank for " + s + " " + itemDef_1.name + ".").getBytes();
		stackable = true;
	}

	public static Sprite getSprite(int i, int j, int k) {
		if(k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if(sprite != null && sprite.anInt1445 != j && sprite.anInt1445 != -1) {
				sprite.unlink();
				sprite = null;
			}
			if(sprite != null)
				return sprite;
		}
		ItemDef itemDef = forID(i);
		if(itemDef.stackIDs == null)
			j = -1;
		if(j > 1) {
			int i1 = -1;
			for(int j1 = 0; j1 < 10; j1++)
				if(j >= itemDef.stackAmounts[j1] && itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];
			if(i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if(model == null)
			return null;
		Sprite sprite = null;
		if(itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if(sprite == null)
				return null;
		}
		Sprite sprite2 = new Sprite(32, 32);
		int k1 = Texture.textureInt1;
		int l1 = Texture.textureInt2;
		int ai[] = Texture.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Texture.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, sprite2.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Texture.method364();
		int k3 = itemDef.modelZoom;
		if(k == -1)
			k3 = (int)((double)k3 * 1.5D);
		if(k > 0)
			k3 = (int)((double)k3 * 1.04D);
		int l3 = Texture.anIntArray1470[itemDef.modelRotation1] * k3 >> 16;
		int i4 = Texture.anIntArray1471[itemDef.modelRotation1] * k3 >> 16;
		model.method482(itemDef.modelRotation2, itemDef.anInt204, itemDef.modelRotation1, itemDef.modelOffset1, l3 + model.modelHeight / 2 + itemDef.modelOffset2, i4 + itemDef.modelOffset2);
		for(int i5 = 31; i5 >= 0; i5--) {
			for(int j4 = 31; j4 >= 0; j4--)
				if(sprite2.myPixels[i5 + j4 * 32] == 0)
					if(i5 > 0 && sprite2.myPixels[(i5 - 1) + j4 * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if(j4 > 0 && sprite2.myPixels[i5 + (j4 - 1) * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if(i5 < 31 && sprite2.myPixels[i5 + 1 + j4 * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if(j4 < 31 && sprite2.myPixels[i5 + (j4 + 1) * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
		}
		if(k > 0) {
			for(int j5 = 31; j5 >= 0; j5--) {
				for(int k4 = 31; k4 >= 0; k4--)
					if(sprite2.myPixels[j5 + k4 * 32] == 0)
						if(j5 > 0 && sprite2.myPixels[(j5 - 1) + k4 * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if(k4 > 0 && sprite2.myPixels[j5 + (k4 - 1) * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if(j5 < 31 && sprite2.myPixels[j5 + 1 + k4 * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if(k4 < 31 && sprite2.myPixels[j5 + (k4 + 1) * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
			}
		} else if(k == 0) {
			for(int k5 = 31; k5 >= 0; k5--) {
				for(int l4 = 31; l4 >= 0; l4--)
					if(sprite2.myPixels[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && sprite2.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						sprite2.myPixels[k5 + l4 * 32] = 0x302020;
			}
		}
		if(itemDef.certTemplateID != -1) {
			int l5 = sprite.anInt1444;
			int j6 = sprite.anInt1445;
			sprite.anInt1444 = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.anInt1444 = l5;
			sprite.anInt1445 = j6;
		}
		if(k == 0)
			mruNodes1.removeFromCache(sprite2, i);
		DrawingArea.initDrawingArea(j2, i2, ai1);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Texture.textureInt1 = k1;
		Texture.textureInt2 = l1;
		Texture.anIntArray1472 = ai;
		Texture.aBoolean1464 = true;
		if(itemDef.stackable)
			sprite2.anInt1444 = 33;
		else
			sprite2.anInt1444 = 32;
		sprite2.anInt1445 = j;
		return sprite2;
	}

	public Model method201(int i) {
		if(stackIDs != null && i > 1) {
			int j = -1;
			for(int k = 0; k < 10; k++)
				if(i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if(j != -1)
				return forID(j).method201(1);
		}
		Model model = (Model) mruNodes2.insertFromCache(id);
		if(model != null)
			return model;
		model = Model.method462(modelID);
		if(model == null)
			return null;
		if(anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (originalModelColors != null) {
			for (int l = 0; l < originalModelColors.length; l++)
				model.method476(originalModelColors[l], modifiedModelColors[l]);

		}
		model.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}

	public Model method202(int i) {
		if(stackIDs != null && i > 1) {
			int j = -1;
			for(int k = 0; k < 10; k++)
				if(i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if(j != -1)
				return forID(j).method202(1);
		}
		Model model = Model.method462(modelID);
		if(model == null)
			return null;
		if (originalModelColors != null) {
			for (int l = 0; l < originalModelColors.length; l++)
				model.method476(originalModelColors[l], modifiedModelColors[l]);

		}
		return model;
	}

	public void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if(i == 0)
				return;
			if(i == 1)
				modelID = stream.readUnsignedWord();
			else if(i == 2)
				name = stream.readString();
			else if(i == 3)
				description = stream.readBytes();
			else if(i == 4)
				modelZoom = stream.readUnsignedWord();
			else if(i == 5)
				modelRotation1 = stream.readUnsignedWord();
			else if(i == 6)
				modelRotation2 = stream.readUnsignedWord();
			else if(i == 7) {
				modelOffset1 = stream.readUnsignedWord();
				if(modelOffset1 > 32767)
					modelOffset1 -= 0x10000;
			} else if(i == 8) {
				modelOffset2 = stream.readUnsignedWord();
				if(modelOffset2 > 32767)
					modelOffset2 -= 0x10000;
			} else if(i == 10)
				stream.readUnsignedWord();
			else if(i == 11)
				stackable = true;
			else if(i == 12)
				value = stream.readDWord();
			else if(i == 16)
				membersObject = true;
			else if(i == 23) {
				maleEquip1 = stream.readUnsignedWord();
				aByte205 = stream.readSignedByte();
			} else if(i == 24)
				maleEquip2 = stream.readUnsignedWord();
			else if(i == 25) {
				femaleEquip1 = stream.readUnsignedWord();
				aByte154 = stream.readSignedByte();
			} else if(i == 26)
				femaleEquip2 = stream.readUnsignedWord();
			else if(i >= 30 && i < 35) {
				if(groundActions == null)
					groundActions = new String[5];
				groundActions[i - 30] = stream.readString();
				if(groundActions[i - 30].equalsIgnoreCase("hidden"))
					groundActions[i - 30] = null;
			} else if(i >= 35 && i < 40) {
				if(actions == null)
					actions = new String[5];
				actions[i - 35] = stream.readString();
			} else if(i == 40) {
				int j = stream.readUnsignedByte();
				originalModelColors = new int[j];
				modifiedModelColors = new int[j];
				for(int k = 0; k < j; k++) {
					originalModelColors[k] = stream.readUnsignedWord();
					modifiedModelColors[k] = stream.readUnsignedWord();
				}
			} else if(i == 78)
				anInt185 = stream.readUnsignedWord();
			else if(i == 79)
				anInt162 = stream.readUnsignedWord();
			else if(i == 90)
				anInt175 = stream.readUnsignedWord();
			else if(i == 91)
				anInt197 = stream.readUnsignedWord();
			else if(i == 92)
				anInt166 = stream.readUnsignedWord();
			else if(i == 93)
				anInt173 = stream.readUnsignedWord();
			else if(i == 95)
				anInt204 = stream.readUnsignedWord();
			else if(i == 97)
				certID = stream.readUnsignedWord();
			else if(i == 98)
				certTemplateID = stream.readUnsignedWord();
			else if(i >= 100 && i < 110) {
				if(stackIDs == null) {
					stackIDs = new int[10];
					stackAmounts = new int[10];
				}
				stackIDs[i - 100] = stream.readUnsignedWord();
				stackAmounts[i - 100] = stream.readUnsignedWord();
			} else if(i == 110)
				anInt167 = stream.readUnsignedWord();
			else if(i == 111)
				anInt192 = stream.readUnsignedWord();
			else if(i == 112)
				anInt191 = stream.readUnsignedWord();
			else if(i == 113)
				anInt196 = stream.readSignedByte();
			else if(i == 114)
				anInt184 = stream.readSignedByte() * 5;
			else if(i == 115)
				team = stream.readUnsignedByte();
		} while(true);
	}

	public ItemDef() {
		id = -1;
	}

	public byte aByte154;
	public int value;
	public int[] modifiedModelColors;
	public int id;
	static MRUNodes mruNodes1 = new MRUNodes(100);
	public static MRUNodes mruNodes2 = new MRUNodes(50);
	public int[] originalModelColors;
	public boolean membersObject;
	public int anInt162;
	public int certTemplateID;
	public int femaleEquip2;
	public int maleEquip1;
	public int anInt166;
	public int anInt167;
	public String groundActions[];
	public int modelOffset1;
	public String name;
	public static ItemDef[] cache;
	public int anInt173;
	public int modelID;
	public int anInt175;
	public boolean stackable;
	public byte description[];
	public int certID;
	public static int cacheIndex;
	public int modelZoom;
	public static boolean isMembers = true;
	public static Stream stream;
	public int anInt184;
	public int anInt185;
	public int maleEquip2;
	public String actions[];
	public int modelRotation1;
	public int anInt191;
	public int anInt192;
	public int[] stackIDs;
	public int modelOffset2;
	public static int[] streamIndices;
	public int anInt196;
	public int anInt197;
	public int modelRotation2;
	public int femaleEquip1;
	public int[] stackAmounts;
	public int team;
	public static int totalItems;
	public int anInt204;
	public byte aByte205;
	public int anInt164;
	public int anInt199;
	public int anInt188;
}