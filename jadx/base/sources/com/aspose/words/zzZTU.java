package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTU extends zzZT7 {
    private int zzVL;
    private int zzVN;
    private int zzw9;
    private int zzwa;

    public zzZTU() {
        super(61455, 0);
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getLeft() {
        return this.zzwa;
    }

    public final int getTop() {
        return this.zzw9;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final void setHeight(int i) {
        this.zzVN = i;
    }

    public final void setLeft(int i) {
        this.zzwa = i;
    }

    public final void setTop(int i) {
        this.zzw9 = i;
    }

    public final void setWidth(int i) {
        this.zzVL = i;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzwa = zzzox.zzXc();
        this.zzw9 = zzzox.zzXc();
        this.zzVL = zzzox.zzXc() - this.zzwa;
        this.zzVN = zzzox.zzXc() - this.zzw9;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzwa);
        zzzsp.write(this.zzw9);
        zzzsp.write(this.zzwa + this.zzVL);
        zzzsp.write(this.zzw9 + this.zzVN);
    }
}
