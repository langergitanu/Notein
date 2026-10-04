package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPM {
    private int zzXLP;
    private int zzXLQ;
    private int zzXLR;
    private int zzXLS;
    private int zzXLT;
    private int zzXLU;
    private int zzXLV;
    private int zzXLW;
    private zzYOR zzXRT;
    private int zzYZz;

    public zzYPM(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    public final String getNextParagraphStyleName() {
        if (this.zzXRT.zzYs0()) {
            int i = this.zzXLW + 1;
            this.zzXLW = i;
            return com.aspose.words.internal.zzZKN.format("PR{0}", Integer.valueOf(i));
        }
        int i2 = this.zzYZz + 1;
        this.zzYZz = i2;
        return com.aspose.words.internal.zzZKN.format("P{0}", Integer.valueOf(i2));
    }

    public final int zzYtM() {
        return this.zzYZz;
    }

    public final void zzYtN() {
        this.zzXLU = 0;
    }

    public final void zzYtO() {
        this.zzXLV = 0;
    }

    public final void zzYtP() {
        this.zzYZz = 0;
        this.zzXLW = 0;
        this.zzXLV = 0;
        this.zzXLU = 0;
        this.zzXLS = 0;
        this.zzXLR = 0;
        this.zzXLQ = 0;
        this.zzXLP = 0;
    }

    public final String zzYtQ() {
        int i = this.zzXLP + 1;
        this.zzXLP = i;
        return com.aspose.words.internal.zzZKN.format("Cell{0}", Integer.valueOf(i));
    }

    public final String zzYtR() {
        int i = this.zzXLQ + 1;
        this.zzXLQ = i;
        return com.aspose.words.internal.zzZKN.format("DT{0}", Integer.valueOf(i));
    }

    public final String zzYtS() {
        return com.aspose.words.internal.zzZKN.format("S{0}", Integer.valueOf(this.zzXRT.getDocument().getSections().indexOf(this.zzXRT.zzYBx()) + 1));
    }

    public final String zzYtT() {
        int i = this.zzXLR + 1;
        this.zzXLR = i;
        return com.aspose.words.internal.zzZKN.format("FR{0}", Integer.valueOf(i));
    }

    public final String zzYtU() {
        if (this.zzXRT.zzYs0()) {
            this.zzXLT++;
            return com.aspose.words.internal.zzZKN.format("RuR{0}_{1}", Integer.valueOf(this.zzXLW), Integer.valueOf(this.zzXLT));
        }
        this.zzXLS++;
        return com.aspose.words.internal.zzZKN.format("Ru{0}_{1}", Integer.valueOf(this.zzYZz), Integer.valueOf(this.zzXLS));
    }

    public final String zzYtV() {
        if (this.zzXRT.zzYs0()) {
            this.zzXLV++;
            return com.aspose.words.internal.zzZKN.format("TR{0}_{1}", Integer.valueOf(this.zzXLW), Integer.valueOf(this.zzXLV));
        }
        this.zzXLU++;
        return com.aspose.words.internal.zzZKN.format("T{0}_{1}", Integer.valueOf(this.zzYZz), Integer.valueOf(this.zzXLU));
    }
}
