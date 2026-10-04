package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InternableComplexAttr {
    private zzZS zzYhA;

    public final void detach() {
        this.zzYhA = null;
    }

    public void notifyChanging() {
        zzZS zzzs = this.zzYhA;
        if (zzzs != null) {
            zzzs.zzbp();
            this.zzYhA = null;
        }
    }

    public final void zzM(zzZS zzzs) {
        this.zzYhA = zzzs;
    }
}
