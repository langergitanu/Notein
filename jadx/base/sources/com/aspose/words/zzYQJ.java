package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQJ extends zzYOS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("top", "bottom");
    private boolean zzXNP;
    private boolean zzXNQ;
    String zzXNR;
    String zzXNS;
    String zzXNT;
    String zzXNU;
    private zzYOR zzXRT;
    private int zzY85;
    private int zzY8c = Integer.MIN_VALUE;
    private int zzY8b = Integer.MIN_VALUE;

    public zzYQJ(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private int zzEk(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return this.zzY8c;
        }
        if (iZzTP != 1) {
            return Integer.MIN_VALUE;
        }
        return this.zzY8b;
    }

    private void zzEz(String str) {
        int iZzr;
        int i;
        int iZzDj = zzDj(str);
        int iZzEk = zzEk(str);
        boolean z = ("top".equals(str) && this.zzXNQ) || ("bottom".equals(str) && this.zzXNP);
        int i2 = iZzDj != Integer.MIN_VALUE ? iZzDj : 1440;
        Border borderZzGC = zzYsO().zzGC(str);
        if (borderZzGC != null) {
            boolean z2 = z || iZzDj <= iZzEk;
            if (!z2) {
                iZzEk = i2;
            }
            iZzr = com.aspose.words.internal.zzSA.zzr(borderZzGC.zz8K());
            int iZzr2 = com.aspose.words.internal.zzSA.zzr(borderZzGC.getLineWidth());
            if (iZzEk < 0) {
                i = iZzr - iZzr2;
            } else {
                int i3 = iZzEk - (iZzr + iZzr2);
                i = (!"double".equals(zzYS3.zzsl(borderZzGC.getLineStyle())) || z2) ? i3 : i3 - (iZzr2 * 2);
            }
            if (this.zzY85 == 1) {
                iZzEk = iZzr;
                iZzr = i;
            } else {
                iZzEk = i;
            }
        } else if (!z || iZzEk == Integer.MIN_VALUE) {
            iZzr = 0;
            iZzEk = i2;
        } else {
            iZzr = 0;
        }
        int i4 = iZzr >= 0 ? iZzr : 0;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0(com.aspose.words.internal.zzZKN.format("fo:padding-{0}", str), this.zzXRT.zzr2(i4));
        if (zzYTI.zzB(borderZzGC)) {
            this.zzXRT.zzZ(zzYsO(), str);
        }
        zzytgZzYsG.zz0(com.aspose.words.internal.zzZKN.format("fo:margin-{0}", str), this.zzXRT.zzr2(iZzEk));
        this.zzXRT.zzY(zzYsO(), str);
    }

    public final void setBorderDistanceFrom(int i) {
        this.zzY85 = i;
    }

    public final void zzYv8() {
        this.zzXNP = true;
    }

    public final void zzYv9() {
        this.zzXNQ = true;
    }

    public final void zzYw4() {
        zzEz("top");
        zzEz("bottom");
        zzEz("left");
        zzEz("right");
        this.zzXRT.zzZ(zzYsO());
    }

    public final void zzvQ(int i) {
        this.zzY8b = i;
    }

    public final void zzvR(int i) {
        this.zzY8c = i;
    }
}
