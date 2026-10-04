package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zzXJ extends zzSR {
    private zzH0 zzVl;

    public zzXJ(zzZZR zzzzr, zzH0 zzh0, String str) {
        super(zzzzr, str);
        this.zzVl = zzh0;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzVl.zzx();
        String string = objZzx != null ? objZzx.toString() : null;
        if (zzZKN.zzU3(string)) {
            throw new IllegalStateException("An expression providing bookmark's name should return a non-empty value.");
        }
        zzfs.zzZ(zzzzr, string);
        zzZ(zzfs, map, zz0u);
        return 5;
    }
}
