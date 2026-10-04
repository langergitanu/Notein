package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLI implements zzZ9L {
    private StringBuilder zzYuF = new StringBuilder();
    private zzZAS zzYuK;
    private zzPV zzZog;

    private zzZLI(zzPV zzpv, zzZAS zzzas) {
        this.zzZog = zzpv;
        this.zzYuK = zzzas;
    }

    public static String zzY(zzYKK zzykk, zzPV zzpv, zzZAS zzzas) {
        zzZLI zzzli = new zzZLI(zzpv, zzzas);
        zzykk.zzZ(zzzli);
        return zzzli.zzYuF.toString();
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzLb(String str) {
        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, str);
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzLc(String str) {
        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, this.zzYuK.getAttributeValue(str, ""));
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzP(String str, String str2, int i) {
        int[] iArrZzSJ = this.zzZog.zzSJ(str);
        for (int i2 = 0; i2 < iArrZzSJ.length; i2++) {
            com.aspose.words.internal.zzZNH.zzU(this.zzYuF, zzYTW.zzM(iArrZzSJ[i2], i, true));
            if (i2 != iArrZzSJ.length - 1) {
                com.aspose.words.internal.zzZNH.zzU(this.zzYuF, str2);
            }
        }
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzZS(String str, int i) {
        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, zzYTW.zzM(this.zzZog.zzXp(str), i, true));
    }
}
