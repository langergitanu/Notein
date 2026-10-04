package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zz71 extends zzSR {
    private zzH0 zzRj;

    public zz71(zzZZR zzzzr, zzH0 zzh0, String str) {
        super(zzzzr, str);
        if (zzh0 != null && !zzh0.zzs() && zzh0.zzw() != Boolean.TYPE) {
            throw new zzCW("A conditional expression should return a Boolean value.");
        }
        this.zzRj = zzh0;
    }

    private boolean zzxc() throws Exception {
        if (((zzSH) zzsz()).zzRE()) {
            return false;
        }
        if (zzxa()) {
            return true;
        }
        Object objZzx = this.zzRj.zzx();
        return objZzx != null && ((Boolean) objZzx).booleanValue();
    }

    private boolean zzxd() throws Exception {
        if (!zzxc()) {
            return false;
        }
        ((zzSH) zzsz()).zzRF();
        return true;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        if (!zzxd()) {
            return 3;
        }
        zzZ(zzfs, map, zz0u);
        return 5;
    }

    public final boolean zzxa() {
        return this.zzRj == null;
    }

    @Override // com.aspose.words.internal.zz0V
    public final boolean zzxb() {
        return true;
    }
}
