package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVG {
    private int zzZw9;
    private zzTY zzZwa;
    private char[] zzZwb;

    public zzVG(char[] cArr, zzTY zzty, int i) {
        this.zzZwb = cArr;
        this.zzZwa = zzty;
        this.zzZw9 = i;
    }

    public final boolean isUnicode() {
        return this.zzZwa.zzZYE().zzZte;
    }

    public final char zz15() {
        return this.zzZwb[r0.length - 1];
    }

    public final zzTY zz16() {
        return this.zzZwa;
    }

    public final int zzNm(int i) {
        return (i * (this.zzZwa.zzZYE().zzZte ? 2 : 1)) + this.zzZw9;
    }

    public final int zzNn(int i) {
        return this.zzZwa.zzZYE().zzZYG().getStart() + this.zzZwa.getOffset() + i;
    }

    public final char[] zzr5() {
        return this.zzZwb;
    }

    public zzVG(zzVG zzvg, int i, int i2, boolean z) {
        int i3 = i2 - i;
        char[] cArr = new char[i3 + (z ? 1 : 0)];
        this.zzZwb = cArr;
        if (z) {
            cArr[i3] = ControlChar.PARAGRAPH_BREAK_CHAR;
        }
        com.aspose.words.internal.zzZKV.zzZ(zzvg.zzZwb, i, cArr, 0, i3);
        this.zzZwa = new zzTY(zzvg.zzZwa.zzZYE(), zzvg.zzZwa.getOffset() + i);
        this.zzZw9 = (i * (zzvg.zzZwa.zzZYE().zzZte ? 2 : 1)) + zzvg.zzZw9;
    }
}
