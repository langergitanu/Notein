package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYST implements zzYV3 {
    private zzYSV zzVXZ;
    private zzYSV zzVY0;

    public zzYST(zzYSV zzysv, zzYSV zzysv2) {
        this.zzVXZ = zzysv;
        this.zzVY0 = zzysv2;
        if (!zzysv.zzXCt().equals(zzysv2.zzXCt())) {
            throw new zzZ5E("Static and ephemeral keys have different domain parameters");
        }
    }

    public final zzYSV zzXCp() {
        return this.zzVY0;
    }

    public final zzYSV zzXCq() {
        return this.zzVXZ;
    }
}
