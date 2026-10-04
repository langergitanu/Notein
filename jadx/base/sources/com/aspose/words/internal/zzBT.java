package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzBT extends zz0V {
    private zzH0 zzsR;
    private zzH0 zzsS;

    public zzBT(zzZZR zzzzr, zzH0 zzh0, zzH0 zzh02) {
        super(zzzzr);
        this.zzsS = zzh0;
        this.zzsR = zzh02;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzsS.zzx();
        String string = objZzx != null ? objZzx.toString() : null;
        if (zzZKN.zzU3(string)) {
            throw new IllegalStateException("An expression providing link's URI should return a non-empty value.");
        }
        zzH0 zzh0 = this.zzsR;
        Object objZzx2 = zzh0 != null ? zzh0.zzx() : null;
        String string2 = objZzx2 != null ? objZzx2.toString() : null;
        if (zzZKN.zzU3(string2)) {
            string2 = string;
        }
        zzfs.zzZ(zzzzr.zzEW(), string, string2);
        return 3;
    }
}
