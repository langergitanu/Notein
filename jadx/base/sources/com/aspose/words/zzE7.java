package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzE7 extends zzCF {
    private double zzE0;
    private byte zzZbM;
    private double zzZbN;
    private String zzZbP;
    private String zzZxh;
    private String zzZyL;

    public zzE7(int i, double d, String str) {
        this(i, d, str, 1.0d);
    }

    private void zzRo(String str) {
        this.zzZbP = str;
        setFormatCode(str);
    }

    private static String zzT(double d, String str) {
        if (d < 0.0d) {
            return "";
        }
        com.aspose.words.internal.zzZQ9 zzzq9ZzY3 = zzCG.zzY3(d);
        if (zzEW.zzRu(str)) {
            str = com.aspose.words.internal.zzJB.zzH8();
        }
        return zzDG.zzY(zzzq9ZzY3, str);
    }

    public static String zzZ(double d, double d2, String str) {
        if (Double.isNaN(d)) {
            return "#N/A";
        }
        double d3 = d / d2;
        return zzEW.zzRu(str) ? zzDG.zzYe(d3) : zzEW.zzRs(str) ? zzT(d, str) : zzDG.zzR(d3, str);
    }

    public final String getFormatCode() {
        return this.zzZyL;
    }

    @Override // com.aspose.words.zzCF
    public final String getStringValue() {
        if (com.aspose.words.internal.zzZKN.zzU3(this.zzZxh)) {
            this.zzZxh = zzZ(this.zzE0, this.zzZbN, this.zzZyL);
        }
        return this.zzZxh;
    }

    @Override // com.aspose.words.zzCF
    public final double getValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zzCF
    public final boolean isDate() {
        if (this.zzZbM == -1) {
            this.zzZbM = zzEW.zzRs(this.zzZyL) ? (byte) 1 : (byte) 0;
        }
        return this.zzZbM == 1;
    }

    public final void setFormatCode(String str) {
        this.zzZyL = zzEW.zzRt(str);
        this.zzZbM = (byte) -1;
    }

    public final void zzYl(double d) {
        this.zzZbN = d;
    }

    public final double zzZL9() {
        return this.zzE0 / this.zzZbN;
    }

    public final String zzZLa() {
        return this.zzZbP;
    }

    public zzE7(int i, double d, String str, double d2) {
        super(i, 2);
        this.zzZxh = "";
        this.zzZbM = (byte) -1;
        this.zzE0 = d;
        zzRo(str);
        this.zzZbN = d2;
    }
}
