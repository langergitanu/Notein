package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBI {
    private zzOP zzXep;
    private boolean zzXeq;

    public zzYBI(String str, boolean z) {
        this.zzXep = zzMR.zzSj(str);
        this.zzXeq = z;
    }

    public final String getPropertyName() {
        return this.zzXep.getName();
    }

    public final zzPS zzQL(boolean z) {
        zzPT zzptZzYc = this.zzXep.zzYc(z);
        if (zzptZzYc != null) {
            return new zzPS(zzptZzYc);
        }
        return null;
    }

    public final zzPS zzQM(boolean z) {
        return new zzPS(this.zzXep.zzYi(z));
    }

    public final zzPS zzY(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        zzPT zzptZzZ = this.zzXep.zzZ(zzl2, i, z, z2, refInt);
        if (zzptZzZ != null) {
            return new zzPS(zzptZzZ);
        }
        return null;
    }

    public final boolean zzY84() {
        return this.zzXeq;
    }
}
