package client;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

final class Animable_Sub3 extends Animable {

	public Animable_Sub3(int i, int j, int l, int i1, int j1, int k1,
						 int l1)
	{
		aBoolean1567 = false;
		aSpotAnim_1568 = SpotAnim.cache[i1];
		anInt1560 = i;
		//System.out.println(anInt1560);
		anInt1561 = l1;
		//System.out.println(anInt1561);
		anInt1562 = k1;
		//System.out.println(anInt1562);
		anInt1563 = j1;
		//System.out.println(anInt1563);
		anInt1564 = j + l;
		//System.out.println(anInt1564);
			aBoolean1567 = false;
	}

	public Model getRotatedModel()
	{
		Model model = aSpotAnim_1568.getModel();
		if(model == null)
			return null;
		int j = aSpotAnim_1568.aAnimation_407.anIntArray353[anInt1569];
		//System.out.println(j);
		Model model_1 = new Model(true, Class36.method532(j), false, model);
		if(!aBoolean1567)
		{
			model_1.method469();
			model_1.method470(j);
			model_1.anIntArrayArray1658 = null;
			model_1.anIntArrayArray1657 = null;
		}
		if(aSpotAnim_1568.anInt410 != 128 || aSpotAnim_1568.anInt411 != 128)
			model_1.method478(aSpotAnim_1568.anInt410, aSpotAnim_1568.anInt410, aSpotAnim_1568.anInt411);
		if(aSpotAnim_1568.anInt412 != 0)
		{
			if(aSpotAnim_1568.anInt412 == 90)
				model_1.method473();
			if(aSpotAnim_1568.anInt412 == 180)
			{
				model_1.method473();
				model_1.method473();
			}
			if(aSpotAnim_1568.anInt412 == 270) //rotation angles i guess
			{
				model_1.method473();
				model_1.method473();
				model_1.method473();
			}
		}
		model_1.method479(64 + aSpotAnim_1568.anInt413, 850 + aSpotAnim_1568.anInt414, -30, -50, -30, true);
		return model_1;
	}

	public void method454(int i)
	{
		for(anInt1570 += i; anInt1570 > aSpotAnim_1568.aAnimation_407.method258(anInt1569);)
		{
			anInt1570 -= aSpotAnim_1568.aAnimation_407.method258(anInt1569) + 1;
			anInt1569++;
			if(anInt1569 >= aSpotAnim_1568.aAnimation_407.anInt352 && (anInt1569 < 0 || anInt1569 >= aSpotAnim_1568.aAnimation_407.anInt352))
			{
				anInt1569 = 0;
				aBoolean1567 = true;
			}
		}

	}

	public final int anInt1560;
	public final int anInt1561;
	public final int anInt1562;
	public final int anInt1563;
	public final int anInt1564;
	public boolean aBoolean1567;
	private final SpotAnim aSpotAnim_1568; //need to define this
	private int anInt1569;
	private int anInt1570;
}
