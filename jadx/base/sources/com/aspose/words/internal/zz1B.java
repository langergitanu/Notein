package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz1B implements zzGJ {
    private double zzE0;

    public zz1B(double d) {
        this.zzE0 = d;
    }

    @Override // com.aspose.words.internal.zzGJ
    public final double zzY(zzFD zzfd) throws Exception {
        double dZzPg = 0.0d;
        for (zzFC zzfc : zzfd.zzMf()) {
            if (dZzPg < zzfc.zzMa().zzZr().zzPg()) {
                dZzPg = zzfc.zzMa().zzZr().zzPg();
            }
        }
        return dZzPg * this.zzE0;
    }

    @Override // com.aspose.words.internal.zzGJ
    public final zzF5 zzZ(zzF5 zzf5) {
        zzZVI zzzvi = new zzZVI();
        zzzvi.zzZr(zzf5.zzY9() * this.zzE0);
        zzzvi.zzZq(zzf5.zzY8() * this.zzE0);
        zzzvi.setLineSpacing(zzf5.getLineSpacing() * this.zzE0);
        return zzzvi;
    }
}
