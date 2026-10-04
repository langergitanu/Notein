package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz28 extends zz33 implements zzFW {
    private zzP9 zzFW;
    private zz57 zzK;
    private long zzKj;
    private long zzKm;
    private zz3B zzga;
    private String zzkn;

    public zz28(zz4W zz4w, zz3B zz3b, long j, long j2, zz57 zz57Var, zzP9 zzp9, String str) {
        super(zz4w);
        this.zzga = zz3b;
        this.zzKm = j;
        this.zzKj = j2;
        this.zzK = zz57Var;
        this.zzFW = zzp9;
        this.zzkn = str;
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    public final zzP9 zzNb() {
        return this.zzFW;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Pattern");
        zzfy.zzM("/PatternType", 2);
        zzP9 zzp9 = this.zzFW;
        if (zzp9 != null) {
            zzfy.zzZ("/Matrix", zzp9);
        }
        zzfy.zzYY("/Shading");
        zzfy.zzFd();
        zzfy.zzM("/ShadingType", 2);
        zzfy.zzZ("/Extend", new boolean[]{true, true});
        zzfy.zzH("/ColorSpace", this.zzK.zzwE());
        zzfy.zzZ("/Coords", new float[]{Float.intBitsToFloat((int) this.zzKm), zzZPY.zzYC(this.zzKm), Float.intBitsToFloat((int) this.zzKj), zzZPY.zzYC(this.zzKj)});
        zzfy.zzZ("/Function", this.zzga);
        zzfy.zzFc();
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzga.zzY(zzfx);
    }
}
