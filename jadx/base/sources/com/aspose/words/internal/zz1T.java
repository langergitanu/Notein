package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1T extends zz1V {
    private int zzhg;
    private String zzky;

    public zz1T(int i, String str) {
        this.zzhg = i;
        this.zzky = str;
    }

    @Override // com.aspose.words.internal.zz1V
    public final void zzV(zzFX zzfx) {
    }

    @Override // com.aspose.words.internal.zz1V
    public final void zzx(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/MCR");
        zzfy.zzB("/Pg", this.zzky);
        zzfy.zzM("/MCID", this.zzhg);
        zzfy.zzFc();
    }
}
