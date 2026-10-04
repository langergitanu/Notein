package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zzZ0 extends zzSR {
    private zzT5 zzXT;

    public zzZ0(zzZZR zzzzr, zzH0 zzh0, String str) {
        super(zzzzr, str);
        this.zzXT = new zzT5(zzh0);
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        zzZ(zzfs, map, zz0u);
        int iZzTq = this.zzXT.zzTq();
        if (zzZQ1.zzRh(iZzTq) == 0) {
            return 5;
        }
        zzfs.zzZ(zzzzr, iZzTq);
        return 5;
    }
}
