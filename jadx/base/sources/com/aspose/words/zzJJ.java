package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJJ {
    private String zzZPH;

    public zzJJ(double d) {
        this.zzZPH = com.aspose.words.internal.zzJB.zzZT(d);
    }

    private double zzZ(zzZCC zzzcc) {
        return zz7K.zzZ(this.zzZPH, zzzcc);
    }

    public final String getString() {
        return this.zzZPH;
    }

    public final double zzY(zzZCC zzzcc) {
        return com.aspose.words.internal.zzSA.zzk(zzZ(zzzcc));
    }

    public zzJJ(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzZPH = "0";
        } else {
            this.zzZPH = str;
        }
    }
}
