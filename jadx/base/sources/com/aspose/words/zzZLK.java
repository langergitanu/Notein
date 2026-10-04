package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLK implements zzZ9L {
    private int zzYuI;
    private int zzYuJ;
    private zzZAS zzYuK;
    private zzPV zzZog;
    private StringBuilder zzYuH = new StringBuilder();
    private com.aspose.words.internal.zzD4 zzYuM = new com.aspose.words.internal.zzD4();
    private com.aspose.words.internal.zzD4 zzYuL = new com.aspose.words.internal.zzD4();

    private zzZLK(zzPV zzpv, zzZAS zzzas, int i, int i2) {
        this.zzZog = zzpv;
        this.zzYuK = zzzas;
        this.zzYuJ = i;
        this.zzYuI = i2;
    }

    private void zzLa(String str) {
        int i = 0;
        while (i < str.length()) {
            int i2 = i;
            while (i2 < str.length() && com.aspose.words.internal.zzZYD.isDigit(str.charAt(i2))) {
                i2++;
            }
            int i3 = i2 - i;
            if (i3 > 0) {
                int iZz2 = com.aspose.words.internal.zzZQB.zz2(str.substring(i, i3 + i));
                if (this.zzYuJ > 0) {
                    zzX5(iZz2, 0);
                } else {
                    zzX4(iZz2, 0);
                }
            }
            i = i2;
            while (i < str.length() && !com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
                this.zzYuH.append(str.charAt(i));
                i++;
            }
        }
    }

    private void zzX4(int i, int i2) {
        this.zzYuH.append((char) this.zzYuI);
        this.zzYuM.add(this.zzYuI, i);
        this.zzYuL.add(this.zzYuI, i2);
        this.zzYuI++;
    }

    private void zzX5(int i, int i2) {
        com.aspose.words.internal.zzZNH.zzU(this.zzYuH, zzYTW.zzM(i, i2, true));
        this.zzYuJ--;
    }

    public static zzZLL zzZ(zzYKK zzykk, zzPV zzpv, zzZAS zzzas, int i, int i2) {
        zzZLK zzzlk = new zzZLK(zzpv, zzzas, i, i2);
        zzykk.zzZ(zzzlk);
        return new zzZLL(zzzlk.zzYuH.toString(), zzzlk.zzYuM, zzzlk.zzYuL);
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
        int[] iArrZzSJ = this.zzZog.zzSJ(str);
        int iMin = Math.min(this.zzYuJ, iArrZzSJ.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            zzX5(iArrZzSJ[i2], i);
            if (i2 != iArrZzSJ.length - 1) {
                com.aspose.words.internal.zzZNH.zzU(this.zzYuH, str2);
            }
        }
        while (iMin < iArrZzSJ.length) {
            zzX4(iArrZzSJ[iMin], i);
            if (iMin != iArrZzSJ.length - 1) {
                com.aspose.words.internal.zzZNH.zzU(this.zzYuH, str2);
            }
            iMin++;
        }
    }

    @Override // com.aspose.words.zzZ9L
    public final void zzZS(String str, int i) {
        int iZzXp = this.zzZog.zzXp(str);
        if (this.zzYuJ > 0) {
            zzX5(iZzXp, i);
        } else {
            zzX4(iZzXp, i);
        }
    }
}
