package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zzSH extends zzSR {
    private boolean zzOr;
    private boolean zzOs;

    public zzSH(zzZZR zzzzr, String str) {
        super(zzzzr, str);
    }

    public final boolean zzRE() {
        return this.zzOs;
    }

    public final void zzRF() {
        this.zzOs = true;
    }

    @Override // com.aspose.words.internal.zzSR
    public final boolean zzY(zz0V zz0v, zzYZ zzyz) {
        return !this.zzOr && zz0v.zzxb();
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        zzZ(zzfs, map, zz0u);
        this.zzOs = false;
        return 0;
    }

    @Override // com.aspose.words.internal.zzSR
    public final void zzY(zz0V zz0v) {
        if (((zz71) zz0v).zzxa()) {
            this.zzOr = true;
        }
    }
}
