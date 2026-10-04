package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLJ implements zzZ9L {
    private int zzYuG = 0;
    private zzZAS zzYuK;
    private zzPV zzZog;

    private zzZLJ(zzPV zzpv, zzZAS zzzas) {
        this.zzZog = zzpv;
        this.zzYuK = zzzas;
    }

    private void zzLa(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i;
            while (i3 < str.length() && com.aspose.words.internal.zzZYD.isDigit(str.charAt(i3))) {
                i3++;
            }
            if (i3 - i > 0) {
                i2++;
            }
            i = i3;
            while (i < str.length() && !com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
                i++;
            }
        }
        this.zzYuG += i2;
    }

    public static int zzZ(zzYKK zzykk, zzPV zzpv, zzZAS zzzas) {
        zzZLJ zzzlj = new zzZLJ(zzpv, zzzas);
        zzykk.zzZ(zzzlj);
        return zzzlj.zzYuG;
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzLb(String str) {
        zzLa(str);
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzLc(String str) {
        zzLa(this.zzYuK.getAttributeValue(str, ""));
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzP(String str, String str2, int i) {
        this.zzYuG += this.zzZog.zzSJ(str).length;
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzZS(String str, int i) {
        this.zzYuG++;
    }
}
