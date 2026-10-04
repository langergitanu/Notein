package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXT implements zzGQ {
    private static final zzZXT zzbe = new zzZXT();
    private zzJQ zzbf = new zzJQ();

    private zzZXT() {
    }

    public static zzZXT zzqd() {
        return zzbe;
    }

    public final String zzHw() {
        return this.zzbf.zzHw();
    }

    @Override // com.aspose.words.internal.zzGQ
    public final zzZXH zzN(String str, int i) {
        zzZXH zzzxhZzO = zzO(str, i);
        if (zzzxhZzO != null) {
            return zzzxhZzO;
        }
        zzZXH zzzxhZzR = this.zzbf.zzR(str, i);
        if (zzzxhZzR != null) {
            return zzzxhZzR;
        }
        zzZXH zzzxhZzQ = this.zzbf.zzQ(str, i);
        if (zzzxhZzQ != null) {
            return zzzxhZzQ;
        }
        zzZXH zzzxhZzWR = this.zzbf.zzWR(i);
        if (zzzxhZzWR != null) {
            return zzzxhZzWR;
        }
        zzZXH zzzxhZzIk = this.zzbf.zzIk();
        if (zzzxhZzIk != null) {
            return zzzxhZzIk;
        }
        throw new IllegalStateException("Cannot find any fonts in specified font sources.");
    }

    @Override // com.aspose.words.internal.zzGQ
    public final zzZXH zzO(String str, int i) {
        zzZXH zzzxhZzV;
        if (zzZYD.zzXk(str) && (zzzxhZzV = this.zzbf.zzV(str, i)) != null) {
            return zzzxhZzV;
        }
        return null;
    }

    public final String zzX2(String str) {
        return this.zzbf.zzZM(str);
    }

    @Override // com.aspose.words.internal.zzGQ
    public final zzZXH zzZ(zzZXH zzzxh, int i, boolean z) {
        return this.zzbf.zzHv().zzZ(zzzxh, i, z, this);
    }
}
