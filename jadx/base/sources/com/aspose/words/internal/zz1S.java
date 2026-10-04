package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1S extends zz1V {
    private zz33 zzfT;
    private String zzky;

    public zz1S(zz33 zz33Var, String str) {
        this.zzfT = zz33Var;
        this.zzky = str;
    }

    @Override // com.aspose.words.internal.zz1V
    public final void zzV(zzFX zzfx) {
    }

    @Override // com.aspose.words.internal.zz1V
    public final void zzx(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/OBJR");
        zzfy.zzB("/Pg", this.zzky);
        zzfy.zzZ("/Obj", this.zzfT);
        zzfy.zzFc();
    }
}
