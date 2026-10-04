package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTE {
    private String mValue;
    private int zzYsQ;
    private int zzYsR;
    private Cell zzZAc;
    private int zzsw = 1;
    private int zzU7 = 1;

    public final int getHorizontalMerge() {
        return this.zzYsR;
    }

    public final int getRowSpan() {
        return this.zzU7;
    }

    public final String getValue() throws Exception {
        return this.zzZAc.getFirstParagraph() != null ? com.aspose.words.internal.zzZKN.zzTX(this.zzZAc.getFirstParagraph().toString(70)) : this.mValue;
    }

    public final int getVerticalMerge() {
        return this.zzYsQ;
    }

    public final void setHorizontalMerge(int i) {
        this.zzYsR = i;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final void setVerticalMerge(int i) {
        this.zzYsQ = i;
    }

    public final Cell zz6C() {
        return this.zzZAc;
    }

    public final void zzA(Cell cell) {
        this.zzZAc = cell;
    }

    public final int zzBx() {
        return this.zzsw;
    }

    public final void zzOj(int i) {
        this.zzU7 = i;
    }

    public final void zzOk(int i) {
        this.zzsw = i;
    }
}
