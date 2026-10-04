package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1J extends zz50 {
    private zzP9 zzFW;
    private long zzfI;

    public zz1J(zz4W zz4w, zzP9 zzp9, long j) throws Exception {
        super(zz4w, new zz4Y(zz4w));
        this.zzfI = j;
        this.zzFW = zzp9;
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/Pattern");
        zzfy.zzM("/PatternType", 1);
        zzfy.zzM("/PaintType", 1);
        zzfy.zzM("/TilingType", 3);
        long j = this.zzfI;
        zzfy.zzZ("/BBox", new zzZQ4(0.0f, 0.0f, (int) j, (int) (j >>> 32)));
        zzfy.zzM("/XStep", (int) this.zzfI);
        zzfy.zzM("/YStep", (int) (this.zzfI >>> 32));
        if (zzvk().zzvf()) {
            zzfy.zzYY("/Resources");
            zzvk().zzL(zzfy);
        }
        zzfy.zzZ("/Matrix", this.zzFW);
    }

    public final zzP9 zzNb() {
        return this.zzFW;
    }
}
