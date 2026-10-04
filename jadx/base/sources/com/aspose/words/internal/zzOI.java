package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzOI extends zzPY {
    private zzPV zzZf;

    public zzOI(zzPV zzpv) {
        super(0);
        zzY(zzpv);
    }

    @Override // com.aspose.words.internal.zzPY
    public final boolean isEmpty() {
        return this.zzZf.zzPD() == 0;
    }

    public final void zzY(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzZf = zzpv;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzH5 zzh5) {
        this.zzZf = zzh5.zzZ(this.zzZf);
    }

    public final zzPV zzZy() {
        return this.zzZf;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzPW zzpw) throws Exception {
        zzpw.zzZ(this);
    }
}
