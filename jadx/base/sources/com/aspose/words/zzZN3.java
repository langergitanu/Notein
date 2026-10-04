package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN3 {
    private com.aspose.words.internal.zzGQ zzFh;
    private com.aspose.words.internal.zzZXH zzYwX;
    private com.aspose.words.internal.zzZXH zzYwY;
    private com.aspose.words.internal.zzZXH zzYwZ;
    private com.aspose.words.internal.zzZXH zzYx0;
    boolean zzYx1;
    boolean zzYx2;
    int zzYx3;
    String zzYx4;
    String zzYx5;
    String zzYx6;
    String zzYx7;
    boolean zzYx8;
    boolean zzYx9;
    boolean zzYxa;
    boolean zzYxb;
    Font zzYxc;

    public zzZN3(zzYEF zzyef, Inline inline, com.aspose.words.internal.zzGQ zzgq) {
        Theme themeZzZqI = inline.getDocument().zzZqI();
        this.zzYxc = Font.zzY(zzyef);
        this.zzYxb = zzyef.zzYe1().toBool();
        this.zzYxa = zzyef.zzYdO().toBool();
        this.zzYx9 = zzyef.zzYe0().toBool();
        this.zzYx8 = zzyef.zzYdN().toBool();
        this.zzYx7 = zzU1.zzZ(zzyef.zzYdS(), themeZzZqI);
        this.zzYx6 = zzU1.zzZ(zzyef.zzYdR(), themeZzZqI);
        this.zzYx5 = zzU1.zzZ(zzyef.zzYdP(), themeZzZqI);
        this.zzYx4 = zzU1.zzZ(zzyef.zzYdQ(), themeZzZqI);
        this.zzYx2 = zzyef.zzYdY().toBool();
        this.zzYx1 = zzyef.zzYdX().toBool();
        this.zzYx3 = zzyef.getSpacing();
        this.zzFh = zzgq;
    }

    private com.aspose.words.internal.zzZXH zzB5(int i) {
        return i != 1 ? i != 2 ? i != 3 ? this.zzYwX : this.zzYx0 : this.zzYwY : this.zzYwZ;
    }

    private static int zzN(boolean z, boolean z2) {
        return z2 ? (z ? 1 : 0) | 2 : z ? 1 : 0;
    }

    private void zzU(int i, com.aspose.words.internal.zzZXH zzzxh) {
        if (i == 1) {
            this.zzYwZ = zzzxh;
            return;
        }
        if (i == 2) {
            this.zzYwY = zzzxh;
        } else if (i != 3) {
            this.zzYwX = zzzxh;
        } else {
            this.zzYx0 = zzzxh;
        }
    }

    private int zzXi(int i, int i2) {
        return i == 2 ? zzN(this.zzYxa, !com.aspose.words.internal.zzZVS.zzS3(i2) && this.zzYx8) : zzN(this.zzYxb, this.zzYx9);
    }

    public final String getFontName(int i) {
        return zzY0C.zzZ(i, this.zzYx7, this.zzYx5, this.zzYx6, this.zzYx4);
    }

    public final com.aspose.words.internal.zzZXH zzXj(int i, int i2) throws Exception {
        com.aspose.words.internal.zzZXH zzzxhZzB5 = zzB5(i2);
        if (zzzxhZzB5 != null) {
            return zzzxhZzB5;
        }
        com.aspose.words.internal.zzZXH zzzxhZzN = this.zzFh.zzN(getFontName(i2), zzXi(i2, i));
        zzU(i2, zzzxhZzN);
        return zzzxhZzN;
    }
}
