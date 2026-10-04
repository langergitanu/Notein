package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8E {
    private int zzX8T;
    private int zzYzl;
    private zzZO7 zzYUg = new zzZO7();
    private zzZO6 zzYUf = new zzZO6();
    private zzZZH zzX8X = new zzZZH(2);
    private zzZOI zzX8W = new zzZOI();
    private zzZOG zzX8V = new zzZOG();
    private zzZO3 zzX8U = new zzZO3();
    private zzZO2 zzYU4 = new zzZO2();
    private StringBuilder zzYuF = new StringBuilder();

    public zzY8E(int i) {
        this.zzYzl = i;
    }

    public final int getLength() {
        return this.zzYuF.length();
    }

    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        for (int i = 0; i < this.zzYuF.length(); i++) {
            char cCharAt = this.zzYuF.charAt(i);
            zzzow.writeByte((byte) cCharAt);
            zzzow.writeByte((byte) (cCharAt >> '\b'));
        }
        return this.zzYuF.length();
    }

    public final int zzY1Y() {
        return this.zzX8T;
    }

    public final StringBuilder zzY1Z() {
        return this.zzYuF;
    }

    public final zzZO2 zzY20() {
        return this.zzYU4;
    }

    public final zzZO3 zzY21() {
        return this.zzX8U;
    }

    public final zzZOG zzY22() {
        return this.zzX8V;
    }

    public final zzZOI zzY23() {
        return this.zzX8W;
    }

    public final zzZZH zzY24() {
        return this.zzX8X;
    }

    public final void zzY25() {
        this.zzX8T++;
    }

    public final void zzYNh() {
        this.zzX8T--;
    }

    public final int zzZqT() {
        return this.zzYzl;
    }

    public final zzZO6 zzZrl() {
        return this.zzYUf;
    }

    public final zzZO7 zzZrm() {
        return this.zzYUg;
    }

    public final void zzky(int i) {
        this.zzYUg.add(this.zzYuF.length());
        this.zzX8X.add(i);
    }
}
