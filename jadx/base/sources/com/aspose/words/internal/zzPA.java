package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzPA extends zzPL {
    private zzPV zzHd;
    private zzZQ4 zzHe;
    private zzPV zzHf;

    public zzPA(zzZQ4 zzzq4, zzPV zzpv, zzPV zzpv2) {
        super(3);
        this.zzHf = zzPV.zzHZ;
        this.zzHe = zzZQ4.zz2T;
        this.zzHd = zzPV.zzHZ;
        if (zzzq4.getWidth() == 0.0f || zzzq4.getHeight() == 0.0f) {
            throw new IllegalArgumentException(zzZKN.format("Rectangle '{0}' cannot have a width or height equal to 0.", zzzq4));
        }
        this.zzHe = zzzq4;
        zzL(zzpv);
        zzK(zzpv2);
    }

    public final void zzK(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzHf = zzpv;
    }

    public final void zzL(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzHd = zzpv;
    }

    public final zzPV zzOu() {
        return this.zzHf;
    }

    public final zzPV zzOv() {
        return this.zzHd;
    }

    public final zzZQ4 zzOw() {
        return this.zzHe;
    }

    public final void zzP(zzZQ4 zzzq4) {
        this.zzHe = zzzq4;
    }

    @Override // com.aspose.words.internal.zzPL, com.aspose.words.internal.zzPY
    public final void zzZ(zzH5 zzh5) throws Exception {
        this.zzHd = zzh5.zzZ(this.zzHd);
        this.zzHf = zzh5.zzZ(this.zzHf);
        super.zzZ(zzh5);
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzPW zzpw) throws Exception {
        zzpw.zzV(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzPA(zzZQ4 zzzq4) {
        zzPV zzpv = zzPV.zzHZ;
        this(zzzq4, zzpv, zzpv);
    }
}
