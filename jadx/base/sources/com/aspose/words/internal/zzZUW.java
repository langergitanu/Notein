package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUW extends zz8R {
    private zzZT3 zz6T;
    private zzZTY zzr0;

    private zzZUW(zzA1 zza1, boolean z, zzG6 zzg6) {
        super(zza1, z, zzg6);
        this.zzr0 = new zzZTY(zza1.zzAg(), this);
        this.zz6T = new zzZT3(zza1, false, false, false);
    }

    public static zz8Q zzZ(zzA1 zza1, boolean z, zzG6 zzg6) throws Exception {
        zzZUW zzzuw = new zzZUW(zza1, z, zzg6);
        zzzuw.zzr0.play();
        return zzzuw.zzpq;
    }

    @Override // com.aspose.words.internal.zz8R
    public final void zzK1() throws Exception {
        int type = this.zzr0.zzmO().getType();
        if (type == 804 || type == 805 || type == 1048 || type == 1051 || type == 1336 || type == 1564 || type == 2071 || type == 2074 || type == 2096) {
            if (!((zzZU0) this.zzr0.zzmO().zzmM()).isEmpty()) {
                zzZW(this.zz6T.zzMK().zzFq(), this.zzr0.zzmO().zzJp());
            }
        } else if (type == 2368 || type == 2881 || type == 3907) {
            zzZ((zzZUL) this.zzr0.zzmO().zzmM(), this.zzr0.zzmO().zzJp());
        }
        this.zz6T.zzZ(this.zzr0.zzmO());
    }
}
