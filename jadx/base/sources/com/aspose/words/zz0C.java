package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0C extends zz40 {
    public zz0C() {
    }

    private int zzGC(int i) {
        double d;
        double dZzT5 = com.aspose.words.internal.zzZZ7.zzT5(i);
        double value = getValue();
        if (value >= 0.0d) {
            d = (1.0d - value) + (dZzT5 * value);
        } else {
            d = (value + 1.0d) * dZzT5;
        }
        return com.aspose.words.internal.zzZZ7.zzZt(d);
    }

    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zz40.zzZ("tint", str, getValue(), zzzyd);
    }

    @Override // com.aspose.words.zz40
    public final zz40 zzZR0() {
        return new zz0C();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 27;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), zzGC(zzpv.zzPC()), zzGC(zzpv.zzPB()), zzGC(zzpv.zzPA()));
    }

    public zz0C(double d) {
        setValue(d);
    }
}
