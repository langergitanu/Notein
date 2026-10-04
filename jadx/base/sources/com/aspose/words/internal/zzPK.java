package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPK extends zzPY {
    private int zzHu;
    private zzPV zzHv;
    private zzPV zzHw;

    public zzPK(int i, zzPV zzpv, zzPV zzpv2) {
        super(1);
        this.zzHu = i;
        zzN(zzpv);
        zzM(zzpv2);
    }

    public final void zzM(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzHw = zzpv;
    }

    public final void zzN(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzHv = zzpv;
    }

    public final zzPV zzOK() {
        return this.zzHw;
    }

    public final zzPV zzOL() {
        return this.zzHv;
    }

    public final int zzOM() {
        return this.zzHu;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzH5 zzh5) {
        this.zzHv = zzh5.zzZ(this.zzHv);
        this.zzHw = zzh5.zzZ(this.zzHw);
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzPW zzpw) throws Exception {
        zzpw.zzY(this);
    }
}
