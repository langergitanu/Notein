package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZTM extends zzZT7 {
    private int zzYK6;
    private int zzYK7;

    public zzZTM() {
        super(61448, 0);
    }

    @Override // com.aspose.words.zzZT7
    public String toString() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0}\n", super.toString());
        com.aspose.words.internal.zzZNH.zzZ(sb, "ShapeCount:{0}, SpidLast:{1:X}\n", Integer.valueOf(this.zzYK7), Integer.valueOf(this.zzYK6));
        return sb.toString();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYK7 = zzzox.zzXc();
        this.zzYK6 = zzzox.zzXc();
    }

    public final void zzEf(int i) {
        this.zzYK6 = i;
    }

    public final void zzEg(int i) {
        this.zzYK7 = i;
    }

    public final void zzEh(int i) {
        zzZii().zzE7(i);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYK7);
        zzzsp.write(this.zzYK6);
    }

    public final int zzZiB() {
        return this.zzYK6;
    }

    public final int zzZiC() {
        return this.zzYK7;
    }
}
