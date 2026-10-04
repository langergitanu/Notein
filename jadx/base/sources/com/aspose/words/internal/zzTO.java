package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzTO extends zz0V {
    private zzH0 zzRj;

    public zzTO(zzZZR zzzzr, zzH0 zzh0) {
        super(zzzzr);
        if (!zzh0.zzs() && zzh0.zzw() != Boolean.TYPE) {
            throw new zzCW("A conditional expression should return a Boolean value.");
        }
        this.zzRj = zzh0;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzRj.zzx();
        zzfs.zzZ(zzzzr.zzEW(), objZzx != null && ((Boolean) objZzx).booleanValue());
        return 0;
    }
}
