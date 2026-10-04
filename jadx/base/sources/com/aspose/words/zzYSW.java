package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSW extends zzYSZ {
    private double zzXA;
    private ArrayList<zzYT6> zzXRb;
    private ArrayList<zzYT6> zzXRc;
    private ArrayList<zzYT6> zzXRd;
    private String zzXRe;
    private String zzXRf;
    private String zzXRg;
    private zzYSV zzXRh;
    private double zzXw;
    private double zzXx;
    private double zzXy;
    private ArrayList<zzYSS> zzZyS;

    public zzYSW(zzYPO zzypo) {
        super(zzypo);
        this.zzXA = Double.NaN;
        this.zzXy = Double.NaN;
        this.zzXx = Double.NaN;
        this.zzXw = Double.NaN;
        this.zzZyS = new ArrayList<>();
        this.zzXRd = new ArrayList<>();
        this.zzXRc = new ArrayList<>();
        this.zzXRb = new ArrayList<>();
    }

    private int zzGo(String str) {
        ArrayList<zzYT6> arrayListZzsN = zzsN(1);
        for (zzYT6 zzyt6 : arrayListZzsN) {
            if (com.aspose.words.internal.zzZKN.equals(zzyt6.getName(), str)) {
                return arrayListZzsN.indexOf(zzyt6);
            }
        }
        return -1;
    }

    private zzYT6 zzL(int i, int i2, boolean z) {
        ArrayList<zzYT6> arrayListZzsN = zzsN(i);
        if (arrayListZzsN.size() == 0) {
            return null;
        }
        if (i2 >= arrayListZzsN.size() && z) {
            i2 = 0;
        }
        if (i2 >= arrayListZzsN.size()) {
            return null;
        }
        return arrayListZzsN.get(i2);
    }

    private zzYT6 zzn(int i, String str) {
        for (zzYT6 zzyt6 : zzsN(i)) {
            if (com.aspose.words.internal.zzZKN.equals(zzyt6.getName(), str)) {
                return zzyt6;
            }
        }
        return null;
    }

    private ArrayList<zzYT6> zzsN(int i) {
        if (i == 0) {
            return this.zzXRd;
        }
        if (i == 1) {
            return this.zzXRc;
        }
        if (i == 2) {
            return this.zzXRb;
        }
        throw new IllegalArgumentException("Unexpected axis type.");
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final ArrayList<zzYSS> zz3H() {
        return this.zzZyS;
    }

    public final void zzGl(String str) {
        this.zzXRe = str;
    }

    public final void zzGm(String str) {
        this.zzXRf = str;
    }

    public final void zzGn(String str) {
        this.zzXRg = str;
    }

    public final double zzQb() {
        return this.zzXx;
    }

    public final void zzV(double d) {
        this.zzXw = d;
    }

    public final void zzW(double d) {
        this.zzXx = d;
    }

    public final double zzYm() {
        return this.zzXw;
    }

    public final zzYSV zzYxe() {
        if (this.zzXRh == null) {
            this.zzXRh = new zzYSV(zzYxl().zzYx1());
        }
        return this.zzXRh;
    }

    public final zzYSR zzYxf() {
        return (zzYSR) this.zzXRj.zzYh(this.zzXRe, "chart");
    }

    public final zzYSR zzYxg() {
        return (zzYSR) this.zzXRj.zzYh(this.zzXRf, "chart");
    }

    public final zzYSR zzYxh() {
        return (zzYSR) this.zzXRj.zzYh(this.zzXRg, "chart");
    }

    public final String zzYxi() {
        return this.zzXRe;
    }

    public final String zzYxj() {
        return this.zzXRf;
    }

    public final String zzYxk() {
        return this.zzXRg;
    }

    public final void zzZ(zzYT6 zzyt6) {
        zzsN(zzyt6.zzYxQ()).add(zzyt6);
    }

    public final zzYT6 zzZ(zzYSS zzyss, int i, boolean z) {
        if (i == 1) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzyss.zzYx7())) {
                return zzn(i, zzyss.zzYx7());
            }
            return zzL(i, 0, z);
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(zzyss.zzYx7())) {
            return zzL(i, 0, z);
        }
        int iZzGo = zzGo(zzyss.zzYx7());
        return zzL(i, iZzGo >= 0 ? iZzGo : 0, z);
    }

    public final void zzZ(zzYSS zzyss) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZyS, zzyss);
    }
}
