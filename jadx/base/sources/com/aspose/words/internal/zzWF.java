package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWF extends zzWG {
    private int zzTn;
    public static zzWF zzTm = zzZj(0);
    public static zzWF zzTl = zzZj(1);

    private zzWF(int i) {
        this.zzTn = i;
    }

    public static zzWF zzG(double d) {
        return new zzWF(zzSA.zzl(d));
    }

    public static zzWF zzZi(int i) {
        return new zzWF(i);
    }

    public static zzWF zzZj(int i) {
        return new zzWF(zzSA.zzl(i));
    }

    public final double getDoubleValue() {
        return ((double) this.zzTn) / 65536.0d;
    }

    public final int getIntValue() {
        return this.zzTn / 65536;
    }

    public final boolean zzUA() {
        return this.zzTn != 0;
    }

    public final int zzUB() {
        return this.zzTn;
    }

    @Override // com.aspose.words.internal.zzWG
    public final void zzZ(zzWH zzwh) {
        zzwh.zzZ(this);
    }
}
