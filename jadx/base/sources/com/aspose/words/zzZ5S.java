package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5S {
    private int zzYeX;
    private int zzYeY;
    static zzZ5S zzYeW = new zzZ5S(1, 9);
    static zzZ5S zzYeV = new zzZ5S(9, 1);
    private static com.aspose.words.internal.zzZNR zzYeU = new com.aspose.words.internal.zzZNR("\\A\\D*(\\d)\\D+(\\d)\\D*\\z", 0);

    private zzZ5S(int i, int i2) {
        this.zzYeY = i;
        this.zzYeX = i2;
    }

    public static zzZ5S zzJs(String str) {
        int i;
        int i2;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        com.aspose.words.internal.zzZNT zzzntZzUX = zzYeU.zzUX(str);
        if (zzzntZzUX.zzhL() && (i = com.aspose.words.internal.zzJB.parseInt(zzzntZzUX.zzhJ().zzQx(1).getValue())) <= (i2 = com.aspose.words.internal.zzJB.parseInt(zzzntZzUX.zzhJ().zzQx(2).getValue())) && zzxU(i) && zzxU(i2)) {
            return new zzZ5S(i, i2);
        }
        return null;
    }

    public static boolean zzxU(int i) {
        return i > 0 && i <= 9;
    }

    public final boolean zzxV(int i) {
        return i >= this.zzYeY && i <= this.zzYeX;
    }
}
