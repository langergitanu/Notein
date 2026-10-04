package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYS6 implements zzYV3 {
    private zzYSV zzVY0;
    private zzYSW zzVY1;
    private zzYSW zzVY2;

    public zzYS6(zzYSW zzysw, zzYSW zzysw2) {
        this(zzysw, zzysw2, new zzYSV(zzysw2.zzXCt().getG().modPow(zzysw2.getX(), zzysw2.zzXCt().getP()), zzysw2.zzXCt()));
    }

    public final zzYSV zzXCp() {
        return this.zzVY0;
    }

    public final zzYSW zzXCr() {
        return this.zzVY1;
    }

    public final zzYSW zzXCs() {
        return this.zzVY2;
    }

    private zzYS6(zzYSW zzysw, zzYSW zzysw2, zzYSV zzysv) {
        this.zzVY2 = zzysw;
        this.zzVY1 = zzysw2;
        this.zzVY0 = zzysv;
        if (!zzysw.zzXCt().equals(zzysw2.zzXCt()) || !zzysw.zzXCt().equals(zzysv.zzXCt())) {
            throw new zzZ5E("Static and ephemeral keys have different domain parameters");
        }
    }
}
