package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5E extends zz3C implements zzFW {
    private boolean zzkl;
    private zzP9 zzkm;
    private String zzkn;

    public zz5E(zz4W zz4w, String str, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        super(zz4w);
        this.zzkn = str;
        this.zzkm = zz3a.zzua();
        zzX(zzzq4);
        zzvi().zztV().zzA(this.zzkm.zzOo());
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    public final void zzZK(boolean z) {
        this.zzkl = z;
    }

    public final boolean zzvY() {
        return this.zzkl;
    }

    public final zzP9 zzvZ() {
        return this.zzkm;
    }
}
