package com.aspose.words;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYL2 {
    static boolean zzZD5 = true;
    protected com.aspose.words.internal.zzZOX zzW6;
    private boolean zzXDx;
    protected TableStyle zzYED;
    private zzZZB zzYbA;
    protected WordAttrCollection zzZF0;

    public zzYL2(zzZZB zzzzb) {
        this.zzYbA = zzzzb;
    }

    public static void zzU(WordAttrCollection wordAttrCollection) {
        if (wordAttrCollection.zz6D()) {
            WordAttrCollection wordAttrCollectionZzZ6C = wordAttrCollection.zzYsN().zzZ6C();
            if (!wordAttrCollectionZzZ6C.zzS(50, 1000)) {
                wordAttrCollectionZzZ6C.zzW(wordAttrCollection);
            }
            if (wordAttrCollectionZzZ6C.getCount() == 0) {
                wordAttrCollection.remove(10010);
            }
        }
    }

    private void zzY(int i, WordAttrCollection wordAttrCollection) throws Exception {
        Shading shadingZzY = zzYCK.zzY(this.zzW6, (Shading) wordAttrCollection.zzPk(i));
        if (shadingZzY != null) {
            wordAttrCollection.zzQ(i, shadingZzY);
        }
    }

    private void zzZ(int i, WordAttrCollection wordAttrCollection) throws Exception {
        Shading shadingZzZ = zzYCK.zzZ(this.zzW6, (Shading) wordAttrCollection.zzPk(i));
        if (shadingZzZ != null) {
            wordAttrCollection.zzQ(i, shadingZzZ);
        }
    }

    public static boolean zzpP(int i) {
        return i == 9238 || i == 9239 || i == 9291 || i == 9292 || i == 26185 || i == 30241 || i == 54790 || i == 54792;
    }

    private int zzpQ(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 4;
        }
        if (i == 16) {
            return 6;
        }
        if (i == 32) {
            return 8;
        }
        if (i == 64) {
            return 5;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 10;
        }
        if (i == 512) {
            return 9;
        }
        if (i == 1024) {
            return 12;
        }
        if (i == 2048) {
            return 11;
        }
        zzY("Unknown conditional formatting read 0x{0:x4}.", Integer.valueOf(i));
        return 0;
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzYbA.zzYUo;
    }

    public final void zzI(int i, int i2, boolean z) throws Exception {
        int iZzXa = this.zzW6.zzXa();
        int iZzGn = zzZZK.zzGn(iZzXa);
        if (iZzGn != Integer.MIN_VALUE) {
            this.zzZF0.zzQ(i2, Integer.valueOf(iZzGn));
            this.zzZF0.zzQ(i, Integer.valueOf(z ? -1 : 0));
            return;
        }
        WordAttrCollection wordAttrCollection = this.zzZF0;
        if (z) {
            iZzXa--;
        }
        wordAttrCollection.zzQ(i, Integer.valueOf(iZzXa));
        this.zzZF0.zzQ(i2, 0);
    }

    public final void zzJ(int i, int i2, boolean z) throws Exception {
        int iZzXa = this.zzW6.zzXa();
        int iZzGp = zzZZK.zzGp(iZzXa);
        if (iZzGp != Integer.MIN_VALUE) {
            this.zzZF0.zzQ(i, 0);
            this.zzZF0.zzQ(i2, Integer.valueOf(iZzGp));
            return;
        }
        WordAttrCollection wordAttrCollection = this.zzZF0;
        if (z) {
            iZzXa--;
        }
        wordAttrCollection.zzQ(i, Integer.valueOf(iZzXa));
        this.zzZF0.zzQ(i2, 0);
    }

    public final void zzT(String str, Object... objArr) {
        zzY1Z.zzY(this.zzYbA.zzYUo, 10, str, objArr);
    }

    public final void zzV(WordAttrCollection wordAttrCollection) throws Exception {
        zzY(wordAttrCollection, true);
    }

    public final void zzWi(int i, int i2) throws Exception {
        byte b = this.zzW6.readByte();
        int i3 = (b & PatternStyle.Wave) >> 4;
        if (i3 != 3) {
            this.zzZF0.zzQ(i2, Integer.valueOf(zzZZK.zzGr(i3)));
        }
        int i4 = (b & 192) >> 6;
        if (i4 != 3) {
            this.zzZF0.zzQ(i, Integer.valueOf(zzZZK.zzGt(i4)));
        }
    }

    public final void zzWj(int i, int i2) throws Exception {
        Border borderZzZ;
        Border border = (Border) this.zzZF0.get(i);
        if (i2 == 0) {
            borderZzZ = zzXY.zzZ(this.zzW6, border);
        } else if (i2 == 1) {
            borderZzZ = zzXY.zzY(this.zzW6, border);
        } else if (i2 == 2) {
            borderZzZ = zzXY.zzX(this.zzW6, border);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("Unexpected structure version.");
            }
            borderZzZ = zzXY.zzW(this.zzW6, border);
        }
        if (!borderZzZ.zz8B() && !borderZzZ.zz8T()) {
            zzY1Z.zzZ(this.zzYbA.zzYUo, 10, "Invalid line style value is read for border while reading DOC file.", new Object[0]);
            borderZzZ.zzOV(0);
        }
        this.zzZF0.zzQ(i, borderZzZ);
    }

    public final zzZZB zzYmN() {
        return this.zzYbA;
    }

    public final boolean zzYmO() {
        return this.zzXDx;
    }

    public final void zzYmP() throws Exception {
        zzI(1302, 1300, false);
    }

    public final void zzYmQ() throws Exception {
        zzJ(1292, 1290, false);
    }

    public final void zzpN(int i) throws Exception {
        zzY(i, this.zzZF0);
    }

    public final void zzpO(int i) throws Exception {
        zzZ(i, this.zzZF0);
    }

    public final void zzY(WordAttrCollection wordAttrCollection, boolean z) throws Exception {
        boolean z2 = this.zzW6.readByte() != 0;
        short sZzXa = this.zzW6.zzXa();
        com.aspose.words.internal.zzZQ9 zzzq9ZzM4 = zzKE.zzM4(this.zzW6.zzXc());
        if (z2) {
            zzZMK zzzmk = new zzZMK(wordAttrCollection, this.zzYbA.zzYUs.zzpy(sZzXa), zzzq9ZzM4);
            this.zzZF0.zzQ(10010, zzzmk);
            if (z) {
                this.zzZF0 = zzzmk.zzZ6C();
            }
        }
    }

    public final void zzZ(zzZ97 zzz97, com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        WordAttrCollection zzyef;
        int iZzpQ = zzpQ(zzzox.zzXa());
        this.zzXDx = true;
        WordAttrCollection wordAttrCollection = this.zzZF0;
        TableStyle tableStyle = this.zzYED;
        if (tableStyle != null) {
            zzyef = tableStyle.zzV7(iZzpQ, i2);
        } else {
            zzyef = new zzYEF();
        }
        this.zzZF0 = zzyef;
        new zzY9J(zzz97, zzzox, this.zzYbA.zzYUr).zzXK(zzzox.zzn(i - 2));
        this.zzZF0 = wordAttrCollection;
        this.zzXDx = false;
    }

    public final void zzU(String str, Object... objArr) {
        zzY1Z.zzZ(this.zzYbA.zzYUo, 16777216, 10, str, objArr);
    }

    public final void zzY(String str, Object... objArr) {
        zzY1Z.zzZ(this.zzYbA.zzYUo, 10, str, objArr);
    }
}
