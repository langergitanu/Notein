package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz16 {
    private zzD3<zzPV> zzfe = new zzD3<>();
    private int zzff;
    private int zzfg;

    public zz16(int i, int i2) {
        this.zzfg = i;
        this.zzff = i2;
    }

    public final zzPV zzA(int i) {
        return this.zzfe.get(i) == null ? zzPV.zzHZ : this.zzfe.get(i);
    }

    public final zzD3<zzPV> zzsT() {
        return this.zzfe;
    }
}
