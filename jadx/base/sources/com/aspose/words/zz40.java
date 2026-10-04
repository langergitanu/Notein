package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz40 extends zzBT {
    private double zzE0;

    public static void zzZ(String str, String str2, double d, zzZYD zzzyd) {
        boolean z = zzzyd.zzZtY() == 2;
        zzzyd.zzY(com.aspose.words.internal.zzZKN.format("{0}:{1}", str2, str));
        zzzyd.zz0(zz56.zzZl(str2, "val"), zz3W.zzS(d, z));
        zzzyd.zzo();
    }

    @Override // com.aspose.words.zzBT
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzAN.zzL(((zz40) obj).zzE0, this.zzE0);
        }
        return false;
    }

    public final double getValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zzBT
    public int hashCode() {
        return zzZR1() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzE0);
    }

    public final void setValue(double d) {
        this.zzE0 = d;
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        zz40 zz40VarZzZR0 = zzZR0();
        zz40VarZzZR0.zzE0 = this.zzE0;
        return zz40VarZzZR0;
    }

    public abstract zz40 zzZR0();
}
