package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz5U extends zz33 {
    private zz4Y zzkQ;
    private zzZQH<String, zz5S> zzkR;
    private String zzkS;
    private boolean zzkT;

    public zz5U(zz4W zz4w) {
        super(zz4w);
        this.zzkR = new zzZQH<>();
        this.zzkQ = new zz4Y(zz4w);
    }

    private void zzY(zzFY zzfy) throws Exception {
        zzfy.zzFf();
        for (int i = 0; i < this.zzkR.zzl9().size(); i++) {
            zzfy.zzZ(this.zzkR.zzl9().get(i));
            if (i < this.zzkR.zzl9().size() - 1) {
                zzfy.zzFh();
            }
        }
        if (this.zzkT) {
            if (this.zzkR.zzl9().size() > 0) {
                zzfy.zzFh();
            }
            zzfy.zzYU(this.zzkS);
        }
        zzfy.zzFe();
    }

    public final zz3Q zzM(zzPM zzpm) throws Exception {
        return this.zzkQ.zzZ(zzpm, null);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        if (this.zzkT) {
            zzfy.zzM("/SigFlags", 3);
        }
        zzfy.zzYY("/Fields");
        zzY(zzfy);
        zzZ(zzfy, "/DR");
        zzfy.zzFc();
    }

    public final zz4Y zzwl() {
        return this.zzkQ;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        Iterator<zz5S> it = this.zzkR.zzl9().iterator();
        while (it.hasNext()) {
            it.next().zzY(zzfx);
        }
    }

    public final void zzZ(zzZB zzzb, zz2M zz2m) throws Exception {
        zzZ(zz5P.zzZ(zz2m, zzzb));
    }

    public final void zzZ(zzZC zzzc, zz2M zz2m) throws Exception {
        zzZ(zz5P.zzZ(zz2m, zzzc));
    }

    public final void zzZ(zzC zzc, zz2M zz2m) throws Exception {
        zzZ(new zz5R(zz2m, zzc));
    }

    public final void zzZ(zz9 zz9Var, zz2M zz2m) throws Exception {
        zzZ(new zz5Q(zz2m, zz9Var));
    }

    public final void zzZ(zz26 zz26Var) {
        this.zzkT = true;
        this.zzkS = zz26Var.zzF0();
    }

    private void zzZ(zz5S zz5s) {
        zz5s.zzwi().zzY(zz5s);
        if (!this.zzkR.containsKey(zz5s.getName())) {
            this.zzkR.zzB(zz5s.getName(), zz5s);
            return;
        }
        throw new IllegalArgumentException("Names must be unique.");
    }

    private void zzZ(zzFY zzfy, String str) throws Exception {
        if (this.zzkQ.zzvf()) {
            zzfy.zzYY(str);
            this.zzkQ.zzL(zzfy);
        }
    }
}
