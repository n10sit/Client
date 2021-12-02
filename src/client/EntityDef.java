package client;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
import java.io.*;
public final class EntityDef {
	
	public static int totalNPCs;
	//public int monsterLevel = myPlayer.monsterLevel;
	
	public static void dumpNpcSizes(EntityDef ed) {
		try {
		
		
		
		} catch (Exception e) {}
	
	
	}
	
	public static void dumpNpcModels() {
		
	}
	
	@SuppressWarnings("static-access")
	public static EntityDef forID(int i) {
		for(int j = 0; j < 20; j++)
			if(cache[j].type == (long)i)
				return cache[j];
		anInt56 = (anInt56 + 1) % 20;
		EntityDef entityDef = cache[anInt56] = new EntityDef();
		stream.currentOffset = streamIndices[i];
		entityDef.type = i;
		entityDef.readValues(stream);
		//entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
		
		//baby dragon model 2998
		//91 and 86 both 128
		//68 is 2
		if (i == 758) {
			entityDef.name = "Dylan M";
			entityDef.description = "Loves chicken eggs.".getBytes();
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[2] = "Sell eggs"; 
		}
		if (i >= 1019 && i <= 1022) {
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
		}
		if (i == 814) {
			entityDef.name = "Ava";
			entityDef.standAnim = 2273;
		}
		if (i == 501) {
			entityDef.name = "Ancient Spirit";
			entityDef.combatLevel = 400;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.description = "A tortured immortal being.".getBytes();
		}
		if (i == 864) {
			entityDef.name = "The Ageless";
			entityDef.combatLevel = 1780;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.description = "A truly horrible sight.".getBytes();
		}
		if (i == 451) {
			entityDef.name = "Strange Dove";
			entityDef.combatLevel = 2;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.description = "A strange dove.".getBytes();
		}
		if (i == 2021) {
			entityDef.combatLevel = 110;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 892) {
			entityDef.combatLevel = 596;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 79) {
			entityDef.combatLevel = 165;
		}
		if (i == 1172 || i == 1173) {
			entityDef.combatLevel = 200;
			entityDef.name = "The Lion King";
			entityDef.description = "King of the... Jungle?".getBytes();
		}
		if (i == 1665) {
			entityDef.combatLevel = 600;
			entityDef.name = "Hiakai";
			entityDef.description = "FEED ME".getBytes();
			entityDef.actions = new String[5];
		}
		if (i == 1575) {
			entityDef.combatLevel = 200;
			entityDef.description = "A terrifying skeletal hound.".getBytes();
		}
		if (i == 902) {
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[2] = "Bank"; 
		}
		if (i == 1460) {
			entityDef.name = "Vastator";
			entityDef.description = "A destroyer of worlds...".getBytes();
			entityDef.combatLevel = 700;
		}
		if (i == 872) {
			entityDef.name = "Rune match wizard";
			entityDef.description = "One of the wizards you match your talisman to in Rune Match.".getBytes();
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Tag";
		}
		if (i == 1182) {
			entityDef.combatLevel = 295;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 708) {
		    entityDef.actions = new String[5];
		    entityDef.actions[0] = "Trade";
		    entityDef.combatLevel = 0;
		    //entityDef.h
		    entityDef.description = "Impy Imp".getBytes();
		}
		if (i == 373) {
			entityDef.name = "Ashley";
		}
		if (i == 757) {
			entityDef.combatLevel = 200;
		}
		if (i == 138) {
			entityDef.combatLevel = 110;
		}
		if (i == 1007) {
			entityDef.combatLevel = 105;
		}
		if (i == 199) {
			entityDef.combatLevel = 91;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 649) {
			entityDef.combatLevel = 540;
			entityDef.name = "Peritus Arcus";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 655) {
			entityDef.combatLevel = 400;
		}
		if (i == 1281) {
			entityDef.combatLevel = 300;
			entityDef.name = "Morrigan";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 1289) {
			entityDef.combatLevel = 300;
			entityDef.name = "Vesta";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 2130) {
			entityDef.combatLevel = 300;
			entityDef.name = "Statius Disciple";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 389) {
			entityDef.combatLevel = 300;
			entityDef.name = "Zuriel";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 470) {
			entityDef.combatLevel = 640;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
		}
		if (i == 2060) {
			entityDef.combatLevel = 700;
			//System.out.println(entityDef.walkAnim);
		}
		if (i == 1064) {
			entityDef.name = "Black Panther";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.combatLevel = 940;
			/*entityDef.models = new int[7]; //original
			entityDef.models[0] = 225;
			entityDef.models[1] = 295;
			entityDef.models[2] = 150;
			entityDef.models[3] = 254;
			entityDef.models[4] = 185;
			entityDef.models[5] = 317;
			entityDef.models[6] = 3780;*/
			entityDef.models = new int[9];
			entityDef.models[0] = 235; //head
			entityDef.models[1] = 254; //pants
			entityDef.models[2] = 246; //facial hair
			entityDef.models[3] = 292; //stomach?????
			entityDef.models[4] = 151; //arms
			entityDef.models[5] = 176; //cape??
			entityDef.models[6] = 3780; //weapon
			entityDef.models[7] = 184; //feet standard is 185
			entityDef.models[8] = 326; //shirt
			entityDef.anInt56 = 3;
			entityDef.anIntArray73 = new int[1];
			entityDef.anIntArray73[0] = 67;
			/*entityDef.originalModelColors = new int[5]; //original
			entityDef.modifiedModelColors = new int[5];
			entityDef.originalModelColors[0] = 8090;
			entityDef.modifiedModelColors[0] = 0;
			entityDef.originalModelColors[1] = 61;
			entityDef.modifiedModelColors[1] = 0;
			entityDef.originalModelColors[2] = 25238;
			entityDef.modifiedModelColors[2] = 0;
			entityDef.originalModelColors[3] = 4626;
			entityDef.modifiedModelColors[3] = 0;
			entityDef.originalModelColors[4] = 7952;
			entityDef.modifiedModelColors[4] = 0;*/
			entityDef.originalModelColors = new int[5];
			entityDef.modifiedModelColors = new int[5];
			entityDef.originalModelColors[0] = 25238; //pants
			entityDef.modifiedModelColors[0] = 0;
			entityDef.originalModelColors[1] = 8741; //shirt
			entityDef.modifiedModelColors[1] = 0;
			entityDef.originalModelColors[2] = 4550; //skin
			entityDef.modifiedModelColors[2] = 0;
			entityDef.originalModelColors[3] = 6798; //hair
			entityDef.modifiedModelColors[3] = 0;
			entityDef.originalModelColors[4] = 43072; //arms
			entityDef.modifiedModelColors[4] = 0;
			entityDef.description = "Wakanda Forever.".getBytes();
		}
		if (i == 191) {
			entityDef.originalModelColors = new int[2];
			entityDef.modifiedModelColors = new int[2];
			entityDef.originalModelColors[0] = 4550; //this is his fucking skin color
			entityDef.modifiedModelColors[0] = 20000;
			entityDef.originalModelColors[1] = 43072;
			entityDef.modifiedModelColors[1] = 6806;
		}
		if (i == 3019) {
			entityDef.name = "Baby Green Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[1];
			entityDef.models[0] = 2998;
			entityDef.walkAnim = 21;
			entityDef.standAnim = 27;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			entityDef.originalModelColors = new int[4];
			entityDef.modifiedModelColors = new int[4];
			entityDef.originalModelColors[0] = 70;
			entityDef.modifiedModelColors[0] = 22051;
			entityDef.originalModelColors[1] = 61;
			entityDef.modifiedModelColors[1] = 22051;
			entityDef.originalModelColors[2] = 53;
			entityDef.modifiedModelColors[2] = 22051;
			entityDef.originalModelColors[3] = 41;
			entityDef.modifiedModelColors[3] = 22051;
			entityDef.description = "A Dragon.".getBytes();
		}
		
		if (i == 3020) {
			entityDef.name = "Baby Blue Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[1];
			entityDef.models[0] = 2998;
			entityDef.walkAnim = 21;
			entityDef.standAnim = 27;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			entityDef.originalModelColors = new int[4];
			entityDef.modifiedModelColors = new int[4];
			entityDef.originalModelColors[0] = 70;
			entityDef.modifiedModelColors[0] = 40371;
			entityDef.originalModelColors[1] = 61;
			entityDef.modifiedModelColors[1] = 40487;
			entityDef.originalModelColors[2] = 53;
			entityDef.modifiedModelColors[2] = 40606;
			entityDef.originalModelColors[3] = 41;
			entityDef.modifiedModelColors[3] = 49197;
			entityDef.description = "A Dragon.".getBytes();
		}
		
		if (i == 3021) {
			entityDef.name = "Baby Red Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[1];
			entityDef.models[0] = 2998;
			entityDef.walkAnim = 21;
			entityDef.standAnim = 27;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			entityDef.originalModelColors = new int[4];
			entityDef.modifiedModelColors = new int[4];
			entityDef.originalModelColors[0] = 70;
			entityDef.modifiedModelColors[0] = 571;
			entityDef.originalModelColors[1] = 61;
			entityDef.modifiedModelColors[1] = 687;
			entityDef.originalModelColors[2] = 53;
			entityDef.modifiedModelColors[2] = 931;
			entityDef.originalModelColors[3] = 41;
			entityDef.modifiedModelColors[3] = 2221;
			entityDef.description = "A Dragon.".getBytes();
		}
		
		if (i == 3022) {
			entityDef.name = "Baby Black Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[1];
			entityDef.models[0] = 2998;
			entityDef.walkAnim = 21;
			entityDef.standAnim = 27;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			entityDef.originalModelColors = new int[4];
			entityDef.modifiedModelColors = new int[4];
			entityDef.originalModelColors[0] = 70;
			entityDef.modifiedModelColors[0] = 16;
			entityDef.originalModelColors[1] = 61;
			entityDef.modifiedModelColors[1] = 16;
			entityDef.originalModelColors[2] = 53;
			entityDef.modifiedModelColors[2] = 16;
			entityDef.originalModelColors[3] = 41;
			entityDef.modifiedModelColors[3] = 16;
			entityDef.description = "A Dragon.".getBytes();
		}
		
		if (i == 3023) {
			entityDef.name = "Green Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[2];
			entityDef.models[0] = 14293;
			entityDef.models[1] = 14297;
			entityDef.walkAnim = 79;
			entityDef.standAnim = 90;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 4;
			entityDef.originalModelColors = new int[1];
			entityDef.modifiedModelColors = new int[1];
			entityDef.originalModelColors[0] = 61;
			entityDef.modifiedModelColors[0] = 22051;
			entityDef.description = "A Dragon.".getBytes();
		}
		
		if (i == 3024) {
			entityDef.name = "Blue Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[2];
			entityDef.models[0] = 14293;
			entityDef.models[1] = 14297;
			entityDef.walkAnim = 79;
			entityDef.standAnim = 90;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 4;
			entityDef.originalModelColors = new int[1];
			entityDef.modifiedModelColors = new int[1];
			entityDef.originalModelColors[0] = 61;
			entityDef.modifiedModelColors[0] = 40487;
			entityDef.description = "A Dragon.".getBytes();
		}
		
		if (i == 3025) {
			entityDef.name = "Red Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[2];
			entityDef.models[0] = 14293;
			entityDef.models[1] = 14297;
			entityDef.walkAnim = 79;
			entityDef.standAnim = 90;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 4;
			entityDef.originalModelColors = new int[1];
			entityDef.modifiedModelColors = new int[1];
			entityDef.originalModelColors[0] = 61;
			entityDef.modifiedModelColors[0] = 687;
			entityDef.description = "A Dragon.".getBytes();
		}
		if (i == 3026) {
			entityDef.name = "Black Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.models = new int[2];
			entityDef.models[0] = 14293;
			entityDef.models[1] = 14297;
			entityDef.walkAnim = 79;
			entityDef.standAnim = 90;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 4;
			entityDef.originalModelColors = new int[1];
			entityDef.modifiedModelColors = new int[1];
			entityDef.originalModelColors[0] = 61;
			entityDef.modifiedModelColors[0] = 16;
			entityDef.description = "A Dragon.".getBytes();
			entityDef.combatLevel = 0;
		}
		
		if (i == 2884) {
			entityDef.name = "White Paladin";
			entityDef.description = "A hero of Saradomin.".getBytes();
			entityDef.standAnim = 0x328;
			entityDef.walkAnim = 0x333;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.originalModelColors = new int[4];
			entityDef.modifiedModelColors = new int[4];
			entityDef.originalModelColors[0] = 4626;
			entityDef.originalModelColors[1] = 6798;
			entityDef.originalModelColors[2] = 55198;
			entityDef.originalModelColors[3] = 43072;
			entityDef.modifiedModelColors[0] = 24;
			entityDef.modifiedModelColors[1] = 6854;
			entityDef.modifiedModelColors[2] = 35026;
			entityDef.modifiedModelColors[3] = 4550;
			entityDef.models = new int[10];
			entityDef.models[0] = 217;
			entityDef.models[1] = 248;
			entityDef.models[2] = 313;
			entityDef.models[3] = 156;
			entityDef.models[4] = 176;
			entityDef.models[5] = 268;
			entityDef.models[6] = 185;
			entityDef.models[7] = 518;
			entityDef.models[8] = 541;
			entityDef.models[9] = 3330;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 1;
			entityDef.combatLevel = 333;
		}
		
		if (i == 1804) {
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.walkAnim = 1748;
			entityDef.standAnim = 1749;
			entityDef.combatLevel = 300;
		}
		
		if (i == 1552) {
			entityDef.actions = new String[5];
			entityDef.combatLevel = 800;
		}
		
		if (i == 1812) {
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.combatLevel = 240;
		}
		
		if (i == 2546) {
			entityDef.combatLevel = 360;
		}
		
		if (i == 2269) {
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.combatLevel = 180;
		}
		
		/**if (i == 20) {
			System.out.println("name: "+entityDef.name);
			for (int c = 0; c < entityDef.originalModelColors.length; c++) {
				System.out.println("oColor: "+entityDef.originalModelColors[c]);
			}		
			for (int c = 0; c < entityDef.modifiedModelColors.length; c++) {
				System.out.println("mColor: "+entityDef.modifiedModelColors[c]);
			}		
			for (int c = 0; c < entityDef.models.length; c++) {
				System.out.println("models: "+entityDef.models[c]);
			}		
			System.out.println("91: "+entityDef.anInt91);
			System.out.println("86: "+entityDef.anInt86);
			System.out.println("b68: "+entityDef.aByte68);
		}
		
		/**if (i == 53) {
			System.out.println("name: "+entityDef.name);
			for (int c = 0; c < entityDef.originalModelColors.length; c++) {
				System.out.println("oColor: "+entityDef.originalModelColors[c]);
			}		
			for (int c = 0; c < entityDef.modifiedModelColors.length; c++) {
				System.out.println("mColor: "+entityDef.modifiedModelColors[c]);
			}		
			System.out.println("model: "+entityDef.models[0]);
			System.out.println("model1: "+entityDef.models[1]);
			System.out.println("91: "+entityDef.anInt91);
			System.out.println("86: "+entityDef.anInt86);
			System.out.println("b68: "+entityDef.aByte68);
		}
		
		if (i == 54) {
			System.out.println("name: "+entityDef.name);
			for (int c = 0; c < entityDef.originalModelColors.length; c++) {
				System.out.println("oColor: "+entityDef.originalModelColors[c]);
			}		
			for (int c = 0; c < entityDef.modifiedModelColors.length; c++) {
				System.out.println("mColor: "+entityDef.modifiedModelColors[c]);
			}		
			System.out.println("model: "+entityDef.models[0]);
			System.out.println("91: "+entityDef.anInt91);
			System.out.println("86: "+entityDef.anInt86);
			System.out.println("b68: "+entityDef.aByte68);
		}
		
		if (i == 55) {
			System.out.println("name: "+entityDef.name);
			for (int c = 0; c < entityDef.originalModelColors.length; c++) {
				System.out.println("oColor: "+entityDef.originalModelColors[c]);
			}		
			for (int c = 0; c < entityDef.modifiedModelColors.length; c++) {
				System.out.println("mColor: "+entityDef.modifiedModelColors[c]);
			}		
			System.out.println("model: "+entityDef.models[0]);
			System.out.println("91: "+entityDef.anInt91);
			System.out.println("86: "+entityDef.anInt86);
			System.out.println("b68: "+entityDef.aByte68);
		}
		
		if (i == 941) {
			System.out.println("name: "+entityDef.name);
			for (int c = 0; c < entityDef.originalModelColors.length; c++) {
				System.out.println("oColor: "+entityDef.originalModelColors[c]);
			}		
			for (int c = 0; c < entityDef.modifiedModelColors.length; c++) {
				System.out.println("mColor: "+entityDef.modifiedModelColors[c]);
			}	
			System.out.println("model: "+entityDef.models[0]);
			System.out.println("91: "+entityDef.anInt91);
			System.out.println("86: "+entityDef.anInt86);
			System.out.println("b68: "+entityDef.aByte68);
		}**/
		
	if (i == 2641) { //dragonkin
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Talk-to";
	}
	if (i == 1821) { //eagle
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Talk-to";
	}
	if (i == 3001) { //crawling hand
		entityDef.name = "Crawling Hand";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5071;
		entityDef.walkAnim = 1589;
		entityDef.standAnim = 1588;
		entityDef.anInt91 = 56;
		entityDef.anInt86 = 56;
		entityDef.aByte68 = 1;
		entityDef.description = "A crawling hand.".getBytes();
	}
	
	if (i == 3002) { //cave crawler
		entityDef.name = "Cave Crawler";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5066;
		entityDef.walkAnim = 225;
		entityDef.standAnim = 226;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A cave crawler".getBytes();
	}
	
	if (i == 3003) { //Banshee
		entityDef.name = "Banshee";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5063;
		entityDef.walkAnim = 1521;
		entityDef.standAnim = 1522;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A banshee.".getBytes();
	}
	
	if (i == 3004) { //Rockslug
		entityDef.name = "Rockslug";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5084;
		entityDef.walkAnim = 1564;
		entityDef.standAnim = 1566;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		//entityDef.combatLevel = myPlayer.monsterLevel;
		//System.out.println(""+myPlayer.npcKills);
		//System.out.println(""+myPlayer.monsterLevel);
		entityDef.description = "A rockslug.".getBytes();
	}
	
	if (i == 3005) { //Cockatrice
		entityDef.name = "Cockatrice";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5070;
		entityDef.walkAnim = 1559;
		entityDef.standAnim = 1561;
		entityDef.anInt91 = 60;
		entityDef.anInt86 = 60;
		entityDef.aByte68 = 1;
		entityDef.description = "A cockatrice.".getBytes();
	}
	
	if (i == 3006) { //Pyrefiend
		entityDef.name = "Pyrefiend";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5083;
		entityDef.walkAnim = 1579;
		entityDef.standAnim = 1578;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A pyrefiend.".getBytes();
	}
	
	if (i == 3007) { //Basilisk
		entityDef.name = "Basilisk";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5064;
		entityDef.walkAnim = 1544;
		entityDef.standAnim = 1545;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A pyrefiend.".getBytes();
	}
	
	if (i == 3008) { //Bloodveld
		entityDef.name = "Bloodveld";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5065;
		entityDef.walkAnim = 1549;
		entityDef.standAnim = 1551;
		entityDef.anInt91 = 122;
		entityDef.anInt86 = 122;
		entityDef.aByte68 = 1;
		entityDef.description = "A bloodveld.".getBytes();
	}
	
	if (i == 3009) { //Jelly
		entityDef.name = "Jelly";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5081;
		entityDef.walkAnim = 1584;
		entityDef.standAnim = 1583;
		entityDef.anInt91 = 56;
		entityDef.anInt86 = 56;
		entityDef.aByte68 = 1;
		entityDef.description = "A Jelly.".getBytes();
	}
	
	if (i == 3010) { //Turoth
		entityDef.name = "Turoth";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5086;
		entityDef.walkAnim = 1593;
		entityDef.standAnim = 1594;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A Turoth.".getBytes();
	}
	
	if (i == 3011) { //Aberrant specter
		entityDef.name = "Aberrant specter";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5085;
		entityDef.walkAnim = 1505;
		entityDef.standAnim = 1506;
		entityDef.anInt91 = 35;
		entityDef.anInt86 = 35;
		entityDef.aByte68 = 1;
		entityDef.description = "An Aberrant specter.".getBytes();
	}
	
	if (i == 3012) { //Dust devil
		entityDef.name = "Dust devil";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5076;
		entityDef.walkAnim = 1554;
		entityDef.standAnim = 1556;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A Dust devil.".getBytes();
	}
	
	if (i == 3013) { //Kurask
		entityDef.name = "Kurask";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5082;
		entityDef.walkAnim = 1510;
		entityDef.standAnim = 1511;
		entityDef.anInt91 = 92;
		entityDef.anInt86 = 92;
		entityDef.aByte68 = 1;
		entityDef.description = "A Kurask.".getBytes();
	}
	
	if (i == 3014) { //Gargoyle
		entityDef.name = "Gargoyle";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5078;
		entityDef.walkAnim = 1515;
		entityDef.standAnim = 1516;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		//entityDef.combatLevel = myPlayer.monsterLevel;
		entityDef.description = "A Gargoyle.".getBytes();
	}
	
	if (i == 3015) { //Nechryael
		entityDef.name = "Nechryael";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5074;
		entityDef.walkAnim = 1526;
		entityDef.standAnim = 1527;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		//entityDef.combatLevel = myPlayer.monsterLevel;
		entityDef.description = "A Nechryael.".getBytes();
	}
	if (i == 3016) { //hellhound
		entityDef.name = "Hellhound";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 2997;
		entityDef.walkAnim = 157;
		entityDef.standAnim = 160;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		//entityDef.combatLevel = myPlayer.monsterLevel;
		entityDef.description = "A Hellhound.".getBytes();
	}
	if (i == 3017) {
		entityDef.name = "Dark Beast";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 2934;
		entityDef.walkAnim = 2731;
		entityDef.standAnim = 2729;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.description = "A Dark Beast.".getBytes();
	}
	if (i == 3018) {
		entityDef.name = "Dagannoth";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 4587;
		entityDef.walkAnim = 1339;
		entityDef.standAnim = 1338;
		entityDef.anInt91 = 32;
		entityDef.anInt86 = 32;
		entityDef.aByte68 = 1;
		entityDef.description = "A Dagannoth.".getBytes();
	}
	if (i == 3000) {
		entityDef.name = "Abyssal Demon";
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.models = new int[1];
		entityDef.models[0] = 5062;
		entityDef.walkAnim = 1534;
		entityDef.standAnim = 1536;
		entityDef.originalModelColors = new int[1];
		entityDef.originalModelColors[0] = 4015;
		entityDef.anInt91 = 32;//64
		entityDef.anInt86 = 32;//64
		entityDef.aByte68 = 1;//1
		entityDef.description = "An Abyssal demon.".getBytes();
	} 
	if (i == 1830) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
	}
	
	if (i==3031) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 2651;
		entityDef.standAnim = 2650;
		entityDef.anInt91 = 20;
		entityDef.anInt86 = 20;
		entityDef.aByte68 = 1;
		entityDef.models = new int[1];
		entityDef.models[0] = 9319;
		entityDef.name = "Tzrek-Jad";
		entityDef.description = "This is not going to hurt, but it might tickle.".getBytes();
	}
	
	if (i==3032) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 3145;
		entityDef.standAnim = 3144;
		entityDef.anInt91 = 32;
		entityDef.anInt86 = 32;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 4;
		entityDef.models = new int[2];
		entityDef.models[0] = 11216;
		entityDef.models[1] = 11217;
		entityDef.name = "Chaos Elemental Jr.";
		entityDef.description = "Cute!".getBytes();
	}
	
	if (i==3033) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 2849;
		entityDef.standAnim = 2850;
		entityDef.anInt91 = 41;
		entityDef.anInt86 = 37;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 5;
		entityDef.models = new int[2];
		entityDef.models[0] = 9941;
		entityDef.models[1] = 9943;
		entityDef.name = "Dagannoth Supreme Jr.";
		entityDef.description = "Wouldn't want that at the end of my bed.".getBytes();
	}
	
	if (i==3034) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 2849;
		entityDef.standAnim = 2850;
		entityDef.anInt91 = 43;
		entityDef.anInt86 = 37;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 6;
		entityDef.models = new int[3];
		entityDef.models[0] = 9940;
		entityDef.models[1] = 9943;
		entityDef.models[2] = 9942;
		entityDef.originalModelColors = new int[4];
		entityDef.modifiedModelColors = new int[4];
		entityDef.originalModelColors[0] = 11930;
		entityDef.originalModelColors[1] = 27144;
		entityDef.originalModelColors[2] = 16536;
		entityDef.originalModelColors[3] = 16540;
		entityDef.modifiedModelColors[0] = 5931;
		entityDef.modifiedModelColors[1] = 1688;
		entityDef.modifiedModelColors[2] = 21530;
		entityDef.modifiedModelColors[3] = 21534;
		entityDef.name = "Dagannoth Prime Jr.";
		entityDef.description = "Wouldn't want that at the end of my bed.".getBytes();
	}
	
	if (i==3035) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 2849;
		entityDef.standAnim = 2850;
		entityDef.anInt91 = 55;
		entityDef.anInt86 = 37;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 7;
		entityDef.models = new int[1];
		entityDef.models[0] = 9941;
		entityDef.originalModelColors = new int[4];
		entityDef.modifiedModelColors = new int[4];
		entityDef.originalModelColors[0] = 16536;
		entityDef.originalModelColors[1] = 16540;
		entityDef.originalModelColors[2] = 27144;
		entityDef.originalModelColors[3] = 2477;
		entityDef.modifiedModelColors[0] = 7322;
		entityDef.modifiedModelColors[1] = 7326;
		entityDef.modifiedModelColors[2] = 10403;
		entityDef.modifiedModelColors[3] = 2595;
		entityDef.name = "Dagannoth Rex Jr.";
		entityDef.description = "Wouldn't want that at the end of my bed.".getBytes();
	}
	
	if (i==3036) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 1197;
		entityDef.standAnim = 1198;
		entityDef.anInt91 = 40;
		entityDef.anInt86 = 40;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 10;
		entityDef.models = new int[1];
		entityDef.models[0] = 3879;
		entityDef.name = "Simba";
		entityDef.description = "Oh I just can't wait to be king!".getBytes();
	}
	
	if (i==3037) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 79;
		entityDef.standAnim = 50;
		entityDef.anInt91 = 40;
		entityDef.anInt86 = 40;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 11;
		entityDef.models = new int[2];
		entityDef.models[0] = 14293;
		entityDef.models[1] = 14302;
		entityDef.originalModelColors = new int[5];
		entityDef.modifiedModelColors = new int[5];
		entityDef.originalModelColors[0] = 61;
		entityDef.originalModelColors[1] = 41;
		entityDef.originalModelColors[2] = 0;
		entityDef.originalModelColors[3] = 115;
		entityDef.originalModelColors[4] = 127;
		entityDef.modifiedModelColors[0] = 11140;
		entityDef.modifiedModelColors[1] = 11138;
		entityDef.modifiedModelColors[2] = 937;
		entityDef.modifiedModelColors[3] = 7853;
		entityDef.modifiedModelColors[4] = 7853;
		entityDef.name = "Prince Black Dragon";
		entityDef.description = "Not quite a king.".getBytes();
	}
	
	if (i==3038) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 358;
		entityDef.standAnim = 357;
		entityDef.anInt91 = 60;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 14;
		entityDef.models = new int[2];
		entityDef.models[0] = 6764;
		entityDef.models[1] = 6771;
		entityDef.originalModelColors = new int[5];
		entityDef.modifiedModelColors = new int[5];
		entityDef.originalModelColors[0] = 6482;
		entityDef.originalModelColors[1] = 8722;
		entityDef.originalModelColors[2] = 99;
		entityDef.originalModelColors[3] = 6478;
		entityDef.originalModelColors[4] = 2165;
		entityDef.modifiedModelColors[0] = 10421;
		entityDef.modifiedModelColors[1] = 10266;
		entityDef.modifiedModelColors[2] = 64448;
		entityDef.modifiedModelColors[3] = 10413;
		entityDef.modifiedModelColors[4] = 59491;
		entityDef.name = "Cut Push";
		entityDef.description = "Less menacing, but getting there.".getBytes();
	}
	
	if (i==3039) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.walkAnim = 819;
		entityDef.standAnim = 808;
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.aByte68 = 1;
		entityDef.anInt56 = 0;
		entityDef.models = new int[9];
		entityDef.models[0] = 390;
		entityDef.models[1] = 477;
		entityDef.models[2] = 332;
		entityDef.models[3] = 356;
		entityDef.models[4] = 422;
		entityDef.models[5] = 414;
		entityDef.models[6] = 483;
		entityDef.models[7] = 3194;
		entityDef.models[8] = 563;
		entityDef.name = "Discipulus";
		entityDef.description = "An eager student.".getBytes();
	}
	
	if (i==1452) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
	}
	
	if (i == 40) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.combatLevel = 0;
		entityDef.name = "Baby Shark";
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
		entityDef.description = "doo doo doo doo doo doo".getBytes();
	}
	
	if (i == 1874) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.combatLevel = 0;
		entityDef.name = "Slitherin";
		entityDef.anInt91 = 64;
		entityDef.anInt86 = 64;
	}
	
	if (i == 413) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.combatLevel = 0;
		entityDef.anInt91 = 48;
		entityDef.anInt86 = 48;
	}
	
	if (i == 2262) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.combatLevel = 0;
		entityDef.name = "Strange Little Mage";
		entityDef.anInt91 = 80;
		entityDef.anInt86 = 80;
		entityDef.description = "A floating Zamorakian mage who seems to be studying you... intently.".getBytes();
	}
	
	if (i == 1751) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.combatLevel = 0;
	}
	
	if (i == 1734) {
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
		entityDef.combatLevel = 0;
		entityDef.name = "Living Magic Tree";
		entityDef.anInt91 = 48;
		entityDef.anInt86 = 48;
		entityDef.aByte68 = 1;
		entityDef.description = "A Magic Tree spawned a little demon tree to follow you around forever.".getBytes();
	}
	
	if(i == 3027) { // NPC ID 
		entityDef.actions = new String[5];
		entityDef.actions[0] = "Pick-up";
	    entityDef.models = new int[2]; // Number of models the NPC uses
	    int changedColors = 1; // Number of model colors changed on the NPC
	    entityDef.originalModelColors = new int[changedColors];
	    entityDef.modifiedModelColors = new int[changedColors];
	    entityDef.originalModelColors[0] = 61; // Original model color
	    entityDef.modifiedModelColors[0] = 926; // Changed model color
	    entityDef.models[0] = 27789; // 27789
	    entityDef.models[1] = 27785; // 27785
	    entityDef.combatLevel = 0;
	    entityDef.name = "General Graardor Jr."; // NPC name
		entityDef.walkAnim = 7058;
		entityDef.standAnim = 7059;
		entityDef.anInt91 = 20; //width?
		entityDef.anInt86 = 20; //height?
		entityDef.aByte68 = 1;
		entityDef.description = "Totally inaudible.".getBytes();
		}

	if(i == 2550) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[2]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 27789; // 27789
    entityDef.models[1] = 27785; // 27785
    entityDef.name = "General Graardor"; // NPC name
    entityDef.combatLevel = 624; //combat level
	entityDef.walkAnim = 7058;
	entityDef.standAnim = 7059;
	entityDef.anInt91 = 110; //width?
	entityDef.anInt86 = 110; //height?
	entityDef.aByte68 = 4;
    entityDef.description = "The mighty lord Bandos!".getBytes(); // NPC description
	}
	
	if(i == 2551) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[2]; // Number of models the NPC uses
    entityDef.models[0] = 27794; // 27789
    entityDef.models[1] = 24425; // 27785
    entityDef.name = "Sergeant Strongstack"; // NPC name
    entityDef.combatLevel = 141; //combat level
	entityDef.walkAnim = 6152;
	entityDef.standAnim = 6153;
	entityDef.aByte68 = 1;
    entityDef.description = "A follower of Bandos.".getBytes(); // NPC description
	}
	if(i == 2552) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[2]; // Number of models the NPC uses
    entityDef.models[0] = 27793; // 27789
    entityDef.models[1] = 27792; // 27785
    entityDef.name = "Sergeant Steelwill"; // NPC name
    entityDef.combatLevel = 142; //combat level
	entityDef.walkAnim = 6152;
	entityDef.standAnim = 6153;
	entityDef.aByte68 = 1;
    entityDef.description = "A follower of Bandos.".getBytes(); // NPC description
	}
	if(i == 2553) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[1]; // Number of models the NPC uses
    entityDef.models[0] = 27795; // 27789
    entityDef.name = "Sergeant Grimspike"; // NPC name
    entityDef.combatLevel = 142; //combat level
	entityDef.walkAnim = 6152;
	entityDef.standAnim = 6153;
	entityDef.aByte68 = 1;
    entityDef.description = "A follower of Bandos.".getBytes(); // NPC description
	}

	if(i == 3028) { // NPC ID
	    entityDef.actions = new String[5];
	    entityDef.actions[0] = "Pick-up";
		entityDef.aByte68 = 1;
	    entityDef.models = new int[5]; // Number of models the NPC uses
	    int changedColors = 1; // Number of model colors changed on the NPC
	    entityDef.originalModelColors = new int[changedColors];
	    entityDef.modifiedModelColors = new int[changedColors];
	    entityDef.originalModelColors[0] = 61; // Original model color
	    entityDef.modifiedModelColors[0] = 926; // Changed model color
	    entityDef.models[0] = 27768;
	    entityDef.models[1] = 27770;
	    entityDef.models[2] = 27773;
	    entityDef.models[3] = 27765;
	    entityDef.models[4] = 27764;
	    entityDef.name = "K'ril Tsutsaroth Jr."; // NPC name
	    entityDef.combatLevel = 0; //combat level
		entityDef.anInt91 = 20; //width?
		entityDef.anInt86 = 20; //height?
		entityDef.walkAnim = 6942;
		entityDef.standAnim = 6943;
		entityDef.description = "Where did he even come from?".getBytes();
	}
	
	if(i == 2554) { // NPC ID
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
	entityDef.aByte68 = 5;
    entityDef.models = new int[5]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 27768;
    entityDef.models[1] = 27770;
    entityDef.models[2] = 27773;
    entityDef.models[3] = 27765;
    entityDef.models[4] = 27764;
    entityDef.name = "K'ril Tsutsaroth"; // NPC name
    entityDef.combatLevel = 650; //combat level
	entityDef.anInt91 = 110; //width?
	entityDef.anInt86 = 110; //height?
	entityDef.walkAnim = 6942;
	entityDef.standAnim = 6943;
    entityDef.description = "The mighty lord zamoraks demon K'ril Tsutsaroth!".getBytes(); // NPC description
	}
	if(i == 2555) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[4]; // Number of models the NPC uses
    entityDef.models[0] = 27775; // 27789
	entityDef.models[1] = 27767;
	entityDef.models[2] = 27763;
	entityDef.models[3] = 17390;
    entityDef.name = "Tstanon Karlak"; // NPC name
    entityDef.combatLevel = 475; //combat level
	entityDef.walkAnim = 63;
	entityDef.standAnim = 66;
	entityDef.aByte68 = 3;
    entityDef.description = "A follower of Zamorak.".getBytes(); // NPC description
	}
	if(i == 2556) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[4]; // Number of models the NPC uses
    entityDef.models[0] = 27776; // 27789
	entityDef.models[1] = 27769;
	entityDef.models[2] = 27766;
	entityDef.models[3] = 17390;
    entityDef.name = "Zakl'n Gritch"; // NPC name
    entityDef.combatLevel = 142; //combat level
	entityDef.walkAnim = 63;
	entityDef.standAnim = 66;
	entityDef.anInt91 = 86; //width?
	entityDef.anInt86 = 86; //height?
	entityDef.aByte68 = 2;
    entityDef.description = "A follower of Zamorak.".getBytes(); // NPC description
	}
	if(i == 2557) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[4]; // Number of models the NPC uses
    entityDef.models[0] = 27772; // 27789
	entityDef.models[1] = 27771;
	entityDef.models[2] = 27774;
	entityDef.models[3] = 17390;
    entityDef.name = "Balfrug Kreeyath"; // NPC name
    entityDef.combatLevel = 151; //combat level
	entityDef.walkAnim = 63;
	entityDef.standAnim = 66;
	entityDef.aByte68 = 3;
    entityDef.description = "A follower of Zamorak.".getBytes(); // NPC description
	}

	if(i == 3029) { // NPC ID
	    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
	    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
	    entityDef.actions = new String[5];
	    entityDef.actions[0] = "Pick-up";
		entityDef.aByte68 = 1;
	    entityDef.models = new int[3]; // Number of models the NPC uses
	    int changedColors = 1; // Number of model colors changed on the NPC
	    entityDef.originalModelColors = new int[changedColors];
	    entityDef.modifiedModelColors = new int[changedColors];
	    entityDef.originalModelColors[0] = 61; // Original model color
	    entityDef.modifiedModelColors[0] = 926; // Changed model color
	    entityDef.models[0] = 28002;
	    entityDef.models[1] = 28003;
	    entityDef.models[2] = 28004;
		entityDef.anInt91 = 23; //width?
		entityDef.anInt86 = 20; //height?
	    entityDef.name = "Kree'arra Jr."; // NPC name
	    entityDef.combatLevel = 0; //combat level
		entityDef.walkAnim = 3500;
		entityDef.standAnim = 3501;
	    entityDef.description = "Is it a bird, is it... no, it's a bird.".getBytes(); // NPC description
		}
	
	if(i == 2558) { // NPC ID
    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
	entityDef.aByte68 = 5;
    entityDef.models = new int[3]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 28002;
    entityDef.models[1] = 28003;
    entityDef.models[2] = 28004;
	entityDef.anInt91 = 128; //width?
	entityDef.anInt86 = 110; //height?
    entityDef.name = "Kree'arra"; // NPC name
    entityDef.combatLevel = 650; //combat level
	entityDef.walkAnim = 3500;
	entityDef.standAnim = 3501;
    entityDef.description = "The mighty lord Armadyls general kree'arra!".getBytes(); // NPC description
	}
	if (i == 2559) {
	entityDef.name = "Wingman Skree";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6949;
	entityDef.walkAnim = 6950;
	entityDef.combatLevel = 143;
	entityDef.models = new int[8];
	entityDef.models[0] = 28044;
	entityDef.models[1] = 28054;
	entityDef.models[2] = 28037;
	entityDef.models[3] = 28005;
	entityDef.models[4] = 28069;
	entityDef.models[5] = 28081;
	entityDef.models[6] = 28083;
	entityDef.models[7] = 28079;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Armadyl.".getBytes();
	}
	if (i == 2560) {
	entityDef.name = "Flockleader Geerin";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6949;
	entityDef.walkAnim = 6950;
	entityDef.combatLevel = 149;
	entityDef.models = new int[5];
	entityDef.models[0] = 28018;
	entityDef.models[1] = 28028;
	entityDef.models[2] = 28006;
	entityDef.models[3] = 28005;
	entityDef.models[4] = 28063;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Armadyl.".getBytes();
	}
	if (i == 2561) {
	entityDef.name = "Flight Kilisa";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6949;
	entityDef.walkAnim = 6950;
	entityDef.combatLevel = 159;
	entityDef.models = new int[6];
	entityDef.models[0] = 28015;
	entityDef.models[1] = 28025;
	entityDef.models[2] = 28012;
	entityDef.models[3] = 28005;
	entityDef.models[4] = 28073;
	entityDef.models[5] = 28072;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Armadyl.".getBytes();
	}
	
	if(i == 3030) { // NPC ID
	    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
	    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
	    entityDef.actions = new String[5];
	    entityDef.actions[0] = "Pick-up";
		entityDef.aByte68 = 1;
	    entityDef.models = new int[3]; // Number of models the NPC uses
	    int changedColors = 1; // Number of model colors changed on the NPC
	    entityDef.originalModelColors = new int[changedColors];
	    entityDef.modifiedModelColors = new int[changedColors];
	    entityDef.originalModelColors[0] = 61; // Original model color
	    entityDef.modifiedModelColors[0] = 926; // Changed model color
	    entityDef.models[0] = 28078;
	    entityDef.models[1] = 28071;
	    entityDef.models[2] = 28057;
	    entityDef.name = "Zilyana Jr."; // NPC name
	    entityDef.combatLevel = 0; //combat level
		entityDef.walkAnim = 6962;
		entityDef.standAnim = 6963;
		entityDef.anInt91 = 48;
		entityDef.anInt86 = 48;
	    entityDef.description = "Somehow a junior?".getBytes(); // NPC description
		}
	
	if(i == 2562) { // NPC ID
    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
	entityDef.aByte68 = 2;
    entityDef.models = new int[3]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 28078;
    entityDef.models[1] = 28071;
    entityDef.models[2] = 28057;
    entityDef.name = "Commander Zilyana"; // NPC name
    entityDef.combatLevel = 648; //combat level
	entityDef.walkAnim = 6962;
	entityDef.standAnim = 6963;
	entityDef.anInt91 = 110;
	entityDef.anInt86 = 110;
    entityDef.description = "The mighty lord Saradomin's commander Zilyana!".getBytes(); // NPC description
	}
	
	if (i == 2563) {
	entityDef.name = "Starlight";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6374;
	entityDef.walkAnim = 6373;
	entityDef.combatLevel = 149;
	entityDef.anInt91 = 110;
	entityDef.anInt86 = 110;
	entityDef.models = new int[2];
	entityDef.models[0] = 27761;
	entityDef.models[1] = 25756;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Saradomin.".getBytes();
	}
	if (i == 2564) {
	entityDef.name = "Growler";
	entityDef.aByte68 = 3;
	entityDef.standAnim = 7014;
	entityDef.walkAnim = 7015;
	entityDef.combatLevel = 139;
	entityDef.anInt91 = 144;
	entityDef.anInt86 = 144;
	entityDef.models = new int[1];
	entityDef.models[0] = 27718;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Saradomin.".getBytes();
	}
	if (i == 2565) {
	entityDef.name = "Bree";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 4311;
	entityDef.walkAnim = 4310;
	entityDef.combatLevel = 146;
	entityDef.models = new int[1];
	entityDef.models[0] = 28254;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Saradomin.".getBytes();
	}
	if(i == 83) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.actions = new String[5];
	entityDef.actions[1] = "Attack";
	entityDef.models = new int[5];
	entityDef.models[0] = 17375;
	entityDef.models[1] = 17391;
	entityDef.models[2] = 17384;
	entityDef.models[3] = 17399;
	entityDef.models[4] = 17390;
	entityDef.standAnim = 66;
	entityDef.walkAnim = 63;
	entityDef.name = "Greater Demon";
	entityDef.combatLevel = 92;
	entityDef.description = "Big, Red & Incredibly Evil".getBytes();
	}
	if(i == 84) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.actions = new String[5];
	entityDef.actions[1] = "Attack";
	entityDef.models = new int[5];
	entityDef.models[0] = 17375;
	entityDef.models[1] = 17391;
	entityDef.models[2] = 17384;
	entityDef.models[3] = 17399;
	entityDef.models[4] = 17390;
	entityDef.originalModelColors = new int[5];
    entityDef.modifiedModelColors = new int[5];
    entityDef.originalModelColors[0] = 910; // Original model color
    entityDef.modifiedModelColors[0] = 898; // Changed model color
	entityDef.originalModelColors[1] = 912; // Original model color
    entityDef.modifiedModelColors[1] = 4; // Changed model color
	entityDef.originalModelColors[2] = 1938; // Original model color
    entityDef.modifiedModelColors[2] = 8; // Changed model color
	entityDef.originalModelColors[3] = 1814; // Original model color
    entityDef.modifiedModelColors[3] = 16; // Changed model color
	entityDef.originalModelColors[4] = 0; // Original model color
    entityDef.modifiedModelColors[4] = 5206; // Changed model color
	entityDef.standAnim = 66;
	entityDef.walkAnim = 63;
	entityDef.name = "Black Demon";
	entityDef.combatLevel = 169;
	entityDef.description = "Big, Black & extremely hard.".getBytes();
	}
	if(i == 82) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.actions = new String[5];
	entityDef.actions[1] = "Attack";
	entityDef.models = new int[5];
	entityDef.models[0] = 17391;
	entityDef.models[1] = 17375;
	entityDef.models[2] = 17384;
	entityDef.models[3] = 17388;
	entityDef.models[4] = 17390;
	entityDef.standAnim = 66;
	entityDef.walkAnim = 63;
	entityDef.name = "Lesser Demon";
	entityDef.combatLevel = 82;
	entityDef.description = "Lesser, but still Scary".getBytes();
	}
		
		return entityDef;
	}
	
	
	
	public static void rewriteNpcs() {
		try {
			DataOutputStream dat = new DataOutputStream(new FileOutputStream("npc.dat"));
			DataOutputStream idx = new DataOutputStream(new FileOutputStream("npc.idx"));
			idx.writeShort(totalNPCs);
			dat.writeShort(totalNPCs);
			for (int j = 0; j < 6386; j++) {
				int offset1 = dat.size();
				EntityDef npc = forID(j);
				if (npc.anIntArray73 == null) {
					dat.writeByte(0);
					idx.writeShort(1);
					continue;
				}
				if (npc.models != null) {
					dat.writeByte(1);
					dat.writeByte(npc.models.length);
					for (int j2 : npc.models)
						dat.writeShort(j2);				
				}
				if (npc.name != null) {
					dat.writeByte(2);
					writeString(dat, npc.name);	
				}
				if (npc.description != null) {
					dat.writeByte(3);
					writeString(dat, npc.description.toString());					
				}
				if (npc.aByte68 != 1) {
					dat.writeByte(12);
					dat.writeByte(npc.aByte68);
				}
				if (npc.standAnim != -1) {
					dat.writeByte(13);
					dat.writeShort(npc.standAnim);				
				}
				if (npc.walkAnim != -1 || npc.anInt58 != -1 || npc.anInt55 != -1 || npc.anInt83 != -1) {
					dat.writeByte(17);
					dat.writeShort(npc.walkAnim);
					dat.writeShort(npc.anInt58);
					dat.writeShort(npc.anInt83);
					dat.writeShort(npc.anInt55);				
				}
				if (npc.actions != null) {
					for (int ii = 0; ii < 5; ii++) {
						dat.writeByte(30 + ii);
						if (npc.actions[ii] == null)
							writeString(dat, "hidden");
						else
							writeString(dat, npc.actions[ii]);
					}				
				}
				if (npc.originalModelColors != null) {
					dat.writeByte(40);
					dat.writeByte(npc.originalModelColors.length);
					for (int ii = 0; ii < npc.originalModelColors.length; ii++) {
						dat.writeShort(npc.originalModelColors[ii]);
						dat.writeShort(npc.modifiedModelColors[ii]);
					}
				
				}
				if (npc.anIntArray73 != null) {
					dat.writeByte(60);
					dat.write(npc.anIntArray73.length);
					for (int j1 : npc.anIntArray73) {
						dat.writeShort(j1);					
					}				
				}
				if (!npc.aBoolean87) {
					dat.writeByte(93);
				}
				if (npc.combatLevel != -1) {
					dat.writeByte(95);
					dat.writeShort(npc.combatLevel);				
				}
				if(npc.anInt91 != 128) {
					dat.writeByte(97);
					dat.writeShort(npc.anInt91);
				}
				if(npc.anInt86 != 128) {
					dat.writeByte(98);
					dat.writeShort(npc.anInt86);
				}
				if(npc.aBoolean93) {
					dat.writeByte(99);
				}
				if(npc.anInt85 != -1) {
					dat.writeByte(100);
					dat.writeByte(npc.anInt85);
				}
				if(npc.anInt92 != -1) {
					dat.writeByte(101);
					dat.writeByte((npc.anInt92 / 5));
				}
				if(npc.anInt75 != -1) {
					dat.writeByte(102);
					dat.writeShort(npc.anInt75);
				}
				if(npc.anInt79 != 32) {
					dat.writeByte(103);
					dat.writeShort(npc.anInt79);
				}
				if(npc.childrenIDs != null) {
					dat.writeByte(106);
					dat.writeShort(npc.anInt57);
					dat.writeShort(npc.anInt59);
					dat.writeByte(npc.childrenIDs.length - 1);
					for(int ii = 0; ii < npc.childrenIDs.length; ii++) {
						dat.writeShort(npc.childrenIDs[ii]);
					}
				}
				if(!npc.aBoolean84) {
					dat.writeByte(107);
				}
				dat.writeByte(0);
				int offset2 = dat.size();
				int writeOffset = offset2 - offset1;
				idx.writeShort(writeOffset);				
			}
			dat.close();
			idx.close();
		} catch(IOException ioe){}
	}
	
	public static void writeString(DataOutputStream dos, String toWrite) {
		try {
			dos.write(toWrite.getBytes());
			dos.writeByte(10);		
		} catch(IOException ioe){}
	
	}

	public Model method160()
	{
		if(childrenIDs != null)
		{
			EntityDef entityDef = method161();
			if(entityDef == null)
				return null;
			else
				return entityDef.method160();
		}
		if(anIntArray73 == null)
			return null;
		boolean flag1 = false;
		for(int i = 0; i < anIntArray73.length; i++)
			if(!Model.method463(anIntArray73[i]))
				flag1 = true;

		if(flag1)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
		for(int j = 0; j < anIntArray73.length; j++)
			aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

		Model model;
		if(aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
		if(originalModelColors != null)
		{
			for(int k = 0; k < originalModelColors.length; k++)
				model.method476(originalModelColors[k], modifiedModelColors[k]);

		}
		return model;
	}

	public EntityDef method161()
	{
		int j = -1;
		if(anInt57 != -1)
		{
			VarBit varBit = VarBit.cache[anInt57];
			int k = varBit.anInt648;
			int l = varBit.anInt649;
			int i1 = varBit.anInt650;
			int j1 = client.anIntArray1232[i1 - l];
			j = clientInstance.variousSettings[k] >> l & j1;
		} else
		if(anInt59 != -1)
			j = clientInstance.variousSettings[anInt59];
		if(j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
			return null;
		else
			return forID(childrenIDs[j]);
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("npc.dat"));
		Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
		totalNPCs = stream2.readUnsignedWord();
		streamIndices = new int[totalNPCs + 5000];
		int i = 2;
		for(int j = 0; j < totalNPCs; j++) {
			streamIndices[j] = i;
			i += stream2.readUnsignedWord();
		}
		cache = new EntityDef[20];
		for(int k = 0; k < 20; k++)
			cache[k] = new EntityDef();

	}

	public static void nullLoader()
	{
		mruNodes = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public Model method164(int j, int k, int ai[])
	{
		if(childrenIDs != null)
		{
			EntityDef entityDef = method161();
			if(entityDef == null)
				return null;
			else
				return entityDef.method164(j, k, ai);
		}
		Model model = (Model) mruNodes.insertFromCache(type);
		if(model == null)
		{
			boolean flag = false;
			for(int i1 = 0; i1 < models.length; i1++)
				if(!Model.method463(models[i1]))
					flag = true;

			if(flag)
				return null;
			Model aclass30_sub2_sub4_sub6s[] = new Model[models.length];
			for(int j1 = 0; j1 < models.length; j1++)
				aclass30_sub2_sub4_sub6s[j1] = Model.method462(models[j1]);

			if(aclass30_sub2_sub4_sub6s.length == 1)
				model = aclass30_sub2_sub4_sub6s[0];
			else
				model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
			if(originalModelColors != null)
			{
				for(int k1 = 0; k1 < originalModelColors.length; k1++)
					model.method476(originalModelColors[k1], modifiedModelColors[k1]);

			}
			model.method469();
			model.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
			mruNodes.removeFromCache(model, type);
		}
		Model model_1 = Model.aModel_1621;
		model_1.method464(model, Class36.method532(k) & Class36.method532(j));
		if(k != -1 && j != -1)
			model_1.method471(ai, j, k);
		else
		if(k != -1)
			model_1.method470(k);
		if(anInt91 != 128 || anInt86 != 128)
			model_1.method478(anInt91, anInt91, anInt86);
		model_1.method466();
		model_1.anIntArrayArray1658 = null;
		model_1.anIntArrayArray1657 = null;
		if(aByte68 == 1)
			model_1.aBoolean1659 = true;
		return model_1;
	}

	private void readValues(Stream stream)
	{
		do
		{
			int i = stream.readUnsignedByte();
			if(i == 0)
				return;
			if(i == 1)
			{
				int j = stream.readUnsignedByte();
				models = new int[j];
				for(int j1 = 0; j1 < j; j1++)
					models[j1] = stream.readUnsignedWord();

			} else
			if(i == 2)
				name = stream.readString();
			else
			if(i == 3)
				description = stream.readBytes();
			else
			if(i == 12)
				aByte68 = stream.readSignedByte();
			else
			if(i == 13)
				standAnim = stream.readUnsignedWord();
			else
			if(i == 14)
				walkAnim = stream.readUnsignedWord();
			else
			if(i == 17)
			{
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else
			if(i >= 30 && i < 40)
			{
				if(actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readString();
				if(actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else
			if(i == 40)
			{
				int k = stream.readUnsignedByte();
				originalModelColors = new int[k];
				modifiedModelColors = new int[k];
				for(int k1 = 0; k1 < k; k1++)
				{
					originalModelColors[k1] = stream.readUnsignedWord();
					modifiedModelColors[k1] = stream.readUnsignedWord();
				}

			} else
			if(i == 60)
			{
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for(int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else
			if(i == 90)
				stream.readUnsignedWord();
			else
			if(i == 91)
				stream.readUnsignedWord();
			else
			if(i == 92)
				stream.readUnsignedWord();
			else
			if(i == 93)
				aBoolean87 = false;
			else
			if(i == 95)
				combatLevel = stream.readUnsignedWord();
			else
			if(i == 97)
				anInt91 = stream.readUnsignedWord();
			else
			if(i == 98)
				anInt86 = stream.readUnsignedWord();
			else
			if(i == 99)
				aBoolean93 = true;
			else
			if(i == 100)
				anInt85 = stream.readSignedByte();
			else
			if(i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else
			if(i == 102)
				anInt75 = stream.readUnsignedWord();
			else
			if(i == 103)
				anInt79 = stream.readUnsignedWord();
			else
			if(i == 106)
			{
				anInt57 = stream.readUnsignedWord();
				if(anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if(anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for(int i2 = 0; i2 <= i1; i2++)
				{
					childrenIDs[i2] = stream.readUnsignedWord();
					if(childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else
			if(i == 107)
				aBoolean84 = false;
		} while(true);
	}

	private EntityDef()
	{
		anInt55 = -1;
		anInt57 = -1;
		anInt58 = -1;
		anInt59 = -1;
		combatLevel = -1;
		walkAnim = -1;
		aByte68 = 1;
		anInt75 = -1;
		standAnim = -1;
		type = -1L;
		anInt79 = 32;
		anInt83 = -1;
		aBoolean84 = true;
		anInt86 = 128;
		aBoolean87 = true;
		anInt91 = 128;
		aBoolean93 = false;
	}

	public int anInt55;
	public static int anInt56;
	public int anInt57;
	public int anInt58;
	public int anInt59;
	public static Stream stream;
	public int combatLevel;
	public String name;
	public String actions[];
	public int walkAnim;//walkAnim
	public byte aByte68;
	public int[] modifiedModelColors;//modifiedModelColors
	public static int[] streamIndices;
	public int[] anIntArray73;
	public int anInt75;
	public int[] originalModelColors;//originalModelColors
	public int standAnim;//anInt177
	public long type;
	public int anInt79;
	public static EntityDef[] cache;
	public static client clientInstance;
	public static Player myPlayer;
	public int anInt83;
	public boolean aBoolean84;
	public int anInt85;
	public int anInt86;
	public boolean aBoolean87;
	public int childrenIDs[];
	public byte description[];
	public int anInt91;
	public int anInt92;
	public boolean aBoolean93;
	public int[] models;//anIntArray94
	public static MRUNodes mruNodes = new MRUNodes(30);

}
