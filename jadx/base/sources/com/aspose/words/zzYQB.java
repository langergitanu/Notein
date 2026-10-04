package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYQB extends zzYOY {
    private boolean zzXNh;
    private boolean zzXNi;
    private boolean zzXNj;
    private boolean zzXNk;
    private String zzYG0;
    private int zztG;
    private zzYTH zzXO2 = new zzYTH();
    private zzYR2 zzXOv = new zzYR2();
    private zzYQL zzXO1 = new zzYQL();
    private int zzXNl = -1;
    private int zzXNn = 1;
    private boolean zzXNm = false;
    private boolean zzXNg = false;

    public final int getLineNumber() {
        return this.zztG;
    }

    public final String getPageNumber() {
        return this.zzYG0;
    }

    public final void setLineNumber(int i) {
        this.zztG = i;
    }

    public final void setPageNumber(String str) {
        this.zzYG0 = str;
    }

    public final void zzSf(boolean z) {
        this.zzXNg = z;
    }

    public final void zzSg(boolean z) {
        this.zzXNi = z;
    }

    public final void zzSh(boolean z) {
        this.zzXNj = z;
    }

    public final void zzSi(boolean z) {
        this.zzXNk = z;
    }

    public final void zzSj(boolean z) {
        this.zzXNm = true;
    }

    public final void zzU2(boolean z) {
        this.zzXNh = z;
    }

    public final boolean zzYLV() {
        return this.zzXNh;
    }

    public final boolean zzYv0() {
        return this.zzXNg;
    }

    public final boolean zzYv1() {
        return this.zzXNi;
    }

    public final boolean zzYv2() {
        return this.zzXNj;
    }

    public final boolean zzYv3() {
        return this.zzXNk;
    }

    public final int zzYv4() {
        return this.zzXNl;
    }

    public final boolean zzYv5() {
        return this.zzXNm;
    }

    public final int zzYv6() {
        return this.zzXNn;
    }

    public final zzYR2 zzYvQ() {
        return this.zzXOv;
    }

    public final zzYQL zzYvg() {
        return this.zzXO1;
    }

    public final zzYTH zzYvh() {
        return this.zzXO2;
    }

    public final void zzZ(zzYQB zzyqb) {
        zzZ(zzyqb.zzXO2);
        zzZ(zzyqb.zzXOv);
        zzZ(zzyqb.zzXO1);
    }

    public final void zzrO(int i) {
        this.zzXNl = i;
    }

    public final void zzrP(int i) {
        this.zzXNn = i;
    }

    private void zzZ(zzYTH zzyth) {
        this.zzXO2.zzY(zzyth.zzYy8());
        this.zzXO2.zzX(zzyth.zzYy7());
        this.zzXO2.zzW(zzyth.zzYy6());
        this.zzXO2.zzV(zzyth.zzYy5());
    }

    private void zzZ(zzYR2 zzyr2) {
        this.zzXOv.zzYvC().zzWF(zzyr2.zzYvC().zzYvO());
        this.zzXOv.zzYvC().zzWE(zzyr2.zzYvC().zzYvN());
        this.zzXOv.zzYvB().zzWw(zzyr2.zzYvB().zzYsU());
        this.zzXOv.zzYvB().zzWv(zzyr2.zzYvB().zzYsT());
    }

    private void zzZ(zzYQL zzyql) {
        this.zzXO1.zzWD(zzyql.zzYvl());
        this.zzXO1.zzWC(zzyql.zzYvk());
        this.zzXO1.zzWB(zzyql.zzYvj());
        this.zzXO1.zzWA(zzyql.zzYvi());
    }
}
