package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ThemeColors implements Cloneable {
    static int[] zzX36 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 15, 10, 11, 12, 13};
    private String mName;
    private boolean zzX35;
    private zzZ90 zzZ4W;
    private zzBW[] zzZeT = new zzBW[17];

    public ThemeColors(zzZ90 zzz90) {
        this.zzZ4W = zzz90;
    }

    private void zzV5(int i, int i2) {
        this.zzZeT[i] = new zz6S(com.aspose.words.internal.zzZKN.format("{0:x2}{1:x2}{2:x2}", Integer.valueOf(com.aspose.words.internal.zzZQ1.zz0(i2) & 255), Integer.valueOf(com.aspose.words.internal.zzZQ1.zzZZ(i2) & 255), Integer.valueOf(com.aspose.words.internal.zzZQ1.zzZY(i2) & 255)));
        this.zzX35 = true;
        this.zzZ4W.onChange();
    }

    private int zzjA(int i) {
        zzBW zzbwZzjC = zzjC(i);
        return zzbwZzjC == null ? com.aspose.words.internal.zzZQ1.zz2p : zzbwZzjC.zzZ(this.zzZ4W, (zzZCM) null).zzPG();
    }

    private static int zzjB(int i) {
        switch (i) {
            case 12:
                return 0;
            case 13:
                return 2;
            case 14:
                return 1;
            case 15:
                return 3;
            default:
                return i;
        }
    }

    public int getAccent1() {
        return zzjA(4);
    }

    public int getAccent2() {
        return zzjA(5);
    }

    public int getAccent3() {
        return zzjA(6);
    }

    public int getAccent4() {
        return zzjA(7);
    }

    public int getAccent5() {
        return zzjA(8);
    }

    public int getAccent6() {
        return zzjA(9);
    }

    public int getDark1() {
        return zzjA(0);
    }

    public int getDark2() {
        return zzjA(2);
    }

    public int getFollowedHyperlink() {
        return zzjA(11);
    }

    public int getHyperlink() {
        return zzjA(10);
    }

    public int getLight1() {
        return zzjA(1);
    }

    public int getLight2() {
        return zzjA(3);
    }

    public final String getName() {
        if (this.mName == null) {
            this.mName = "";
        }
        return this.mName;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setAccent1(int i) {
        zzV5(4, i);
    }

    public void setAccent2(int i) {
        zzV5(5, i);
    }

    public void setAccent3(int i) {
        zzV5(6, i);
    }

    public void setAccent4(int i) {
        zzV5(7, i);
    }

    public void setAccent5(int i) {
        zzV5(8, i);
    }

    public void setAccent6(int i) {
        zzV5(9, i);
    }

    public void setDark1(int i) {
        zzV5(0, i);
    }

    public void setDark2(int i) {
        zzV5(2, i);
    }

    public void setFollowedHyperlink(int i) {
        zzV5(11, i);
    }

    public void setHyperlink(int i) {
        zzV5(10, i);
    }

    public void setLight1(int i) {
        zzV5(1, i);
    }

    public void setLight2(int i) {
        zzV5(3, i);
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final zzBW zzAf(String str) {
        return zzjC(zzY5L.zzAg(str));
    }

    public final void zzR(zzZ90 zzz90) {
        this.zzZ4W = zzz90;
    }

    public final boolean zzXVB() {
        return this.zzX35;
    }

    public final boolean zzXVx() {
        for (int i : zzX36) {
            if (zzjC(i) == null) {
                return false;
            }
        }
        return true;
    }

    public final ThemeColors zzXVy() {
        ThemeColors themeColors = (ThemeColors) memberwiseClone();
        themeColors.zzZeT = new zzBW[17];
        for (int i = 0; i < 17; i++) {
            zzBW zzbw = this.zzZeT[i];
            if (zzbw != null) {
                themeColors.zzZeT[i] = zzbw.zzZHt();
            }
        }
        return themeColors;
    }

    public final void zzZ(zzBW zzbw, int i) {
        this.zzZeT[i] = zzbw;
    }

    public final zzBW zzjC(int i) {
        return this.zzZeT[zzjB(i)];
    }
}
