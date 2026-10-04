package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1M extends zz5J {
    private zzZQ9 zzZe;
    private zzPV zzZf;
    private String zzZi;
    private String zzZj;
    private String zzfP;
    private float[] zzfQ;

    public zz1M(zz4W zz4w, zzZQ4 zzzq4, float[] fArr, String str, String str2, String str3, zzPV zzpv, zzZQ9 zzzq9) {
        super(zz4w, zzzq4, null);
        this.zzfQ = fArr;
        this.zzZj = str;
        this.zzZi = str2;
        this.zzfP = str3;
        this.zzZf = zzpv;
        this.zzZe = zzzq9;
    }

    private void zzw(zzFY zzfy) throws Exception {
        zzfy.zzYY("/C");
        zzfy.zzS(zz57.zzu(this.zzZf).zzv(this.zzZf));
    }

    @Override // com.aspose.words.internal.zz5J
    public final String getSubType() {
        return "/Highlight";
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzU(zzFY zzfy) throws Exception {
        if (zzuN().zzv7().zzvz()) {
            zzfy.zzM("/F", 28);
        }
        zzfy.zzZ("/QuadPoints", this.zzfQ);
        zzfy.zzC("/T", this.zzZj);
        zzfy.zzC("/Contents", this.zzZi);
        zzfy.zzZ("/Border", new int[]{0, 0, 0});
        zzw(zzfy);
        zzfy.zzY("/M", this.zzZe);
        String strZzXY = zzuN().zzva().zzXY(this.zzfP);
        if (strZzXY != null) {
            zzfy.zzB("/IRT", strZzXY);
        }
        if (zzw7() > 0) {
            zzfy.zzM("/StructParent", zzw7());
        }
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzZ(zzFX zzfx, zzZYG<zz4R> zzzyg) throws Exception {
        zzY(zzfx);
    }
}
