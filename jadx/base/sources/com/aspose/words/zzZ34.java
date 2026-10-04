package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ34 extends zzZ3E {
    static zzZ34 zzY7E = new zzZ34(null, true);
    static zzZ34 zzY7F;
    private int zzY7D;
    private com.aspose.words.internal.zzPV zzeT;
    private com.aspose.words.internal.zzPV zzqB;

    static {
        com.aspose.words.internal.zzPV zzpv = com.aspose.words.internal.zzPV.zzHZ;
        zzZ34 zzz34ZzO = zzO(zzpv, zzpv);
        zzY7F = zzz34ZzO;
        zzz34ZzO.zzYN9();
    }

    public zzZ34(zzX6 zzx6, boolean z) {
        super(zzx6);
        this.zzY7D = 0;
        com.aspose.words.internal.zzPV zzpv = com.aspose.words.internal.zzPV.zzHZ;
        this.zzeT = zzpv;
        this.zzqB = zzpv;
        if (z) {
            zzYN9();
        }
    }

    private static zzZ34 zzO(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        zzZ34 zzz34 = new zzZ34(null, false);
        zzz34.zzN(zzpv);
        zzz34.zzM(zzpv2);
        zzz34.setTexture(0);
        return zzX(zzz34);
    }

    public static zzZ34 zzW(zzZ34 zzz34) {
        if (zzz34 == null) {
            return new zzZ34(null, true);
        }
        zzZ34 zzz342 = new zzZ34(zzz34.zzZoP(), false);
        zzz342.zzN(zzz34.zzeT);
        zzz342.zzM(zzz34.zzqB);
        zzz342.setTexture(zzz34.zzY7D);
        return zzz342;
    }

    public static zzZ34 zzX(zzZ34 zzz34) {
        if (zzz34 == null) {
            throw new IllegalArgumentException("src");
        }
        if (zzz34.zzZoP() == null || zzz34.isCached()) {
            return zzz34;
        }
        zzZ34 zzz342 = (zzZ34) com.aspose.words.internal.zzQW.zzZ((Map<zzZ34, TValue>) zzz34.zzZoP().zzZAC, zzz34);
        if (zzz342 != null) {
            return zzz342;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz34.zzZoP().zzZAC, zzz34, zzz34);
        return zzz34;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ34 zzz34 = (zzZ34) obj;
        return com.aspose.words.internal.zzZKO.equals(this.zzeT, zzz34.zzeT) && com.aspose.words.internal.zzZKO.equals(this.zzqB, zzz34.zzqB) && this.zzY7D == zzz34.zzY7D;
    }

    public final Shading getShading() {
        Shading shading = new Shading();
        shading.zzZJ(this.zzeT);
        shading.zzZK(this.zzqB);
        shading.setTexture(this.zzY7D);
        return shading;
    }

    public final int getTexture() {
        return this.zzY7D;
    }

    public final boolean isEmpty() {
        int i = this.zzY7D;
        return (i == 0 || i == 65535) && this.zzqB.isEmpty();
    }

    public final void setTexture(int i) {
        zzYN6();
        this.zzY7D = i;
    }

    public final void zzM(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzqB = zzpv;
    }

    public final void zzN(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzeT = zzpv;
    }

    public final com.aspose.words.internal.zzPV zzOK() {
        return this.zzqB;
    }

    public final com.aspose.words.internal.zzPV zzOL() {
        return this.zzeT;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzZY(this.zzeT);
        zzZY(this.zzqB);
        zzwB(this.zzY7D);
    }
}
