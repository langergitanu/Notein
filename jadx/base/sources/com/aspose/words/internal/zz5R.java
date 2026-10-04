package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5R extends zz5S {
    private zz5T zzkL;
    private zz5T zzkM;
    private boolean zzkN;

    public zz5R(zz2M zz2m, zzC zzc) throws Exception {
        super(zz2m, zzc);
        this.zzkN = zzc.zzZF();
        zzX(zzc.zzZv());
        zzwh();
    }

    private static void zzY(zz4X zz4x, zzZQ4 zzzq4, zzPV zzpv, zzPV zzpv2) throws Exception {
        zz5S.zzZ(zz4x, zzzq4, zzpv, zzpv2);
        zz5S.zzZ(zz4x, zzpv, true);
        zz4x.zzn(zzzq4.zzZm());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZo());
        zz4x.zzXW(" m ");
        zz4x.zzn(zzzq4.zzkw());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZn());
        zz4x.zzXW(" l s ");
        zz4x.zzn(zzzq4.zzZm());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZn());
        zz4x.zzXW(" m ");
        zz4x.zzn(zzzq4.zzkw());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZo());
        zz4x.zzXW(" l s ");
    }

    private void zzwh() throws Exception {
        zzZQ4 zzzq4 = new zzZQ4(0.0f, 0.0f, zzZv().getWidth(), zzZv().getHeight());
        zz5T zz5t = new zz5T(zzuN());
        this.zzkL = zz5t;
        zz5t.zzX(zzzq4);
        zz5S.zzZ(this.zzkL.zzvl(), zzzq4, zzZu(), zzZt());
        zz5T zz5t2 = new zz5T(zzuN());
        this.zzkM = zz5t2;
        zz5t2.zzX(zzzq4);
        zzY(this.zzkM.zzvl(), zzzq4, zzZu(), zzZt());
    }

    @Override // com.aspose.words.internal.zz5S
    public final int getFieldType() {
        return 0;
    }

    @Override // com.aspose.words.internal.zz5S
    public final void zzX(zzFY zzfy) throws Exception {
        boolean z = this.zzkN;
        if (z) {
            zzfy.zzH("/DV", z ? "/On" : "/Off");
        }
        zzfy.zzYY("/AP");
        zzfy.zzFd();
        zzfy.zzYY("/N");
        zzfy.zzFd();
        zzfy.zzYY("/Off");
        zzfy.zzFh();
        zzfy.zzZ(this.zzkL);
        zzfy.zzFh();
        zzfy.zzYY("/On");
        zzfy.zzFh();
        zzfy.zzZ(this.zzkM);
        zzfy.zzFc();
        zzfy.zzFc();
        zzfy.zzH("/AS", this.zzkN ? "/On" : "/Off");
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzkM.zzY(zzfx);
        this.zzkL.zzY(zzfx);
    }
}
