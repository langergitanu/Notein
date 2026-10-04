package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZS1 extends zzP {
    public zzZS1(zzZOP zzzop) throws Exception {
        super(zzzop, true);
    }

    public final void zzW(String str, zzP9 zzp9) throws Exception {
        zzX(str, zzZKN.format("{0},{1},{2},{3},{4},{5}", zzJB.zzr(zzp9.zzOf()), zzJB.zzr(zzp9.zzOe()), zzJB.zzr(zzp9.zzOd()), zzJB.zzr(zzp9.zzOc()), zzJB.zzr(zzp9.zzOb()), zzJB.zzr(zzp9.zzOa())));
    }

    public final void zzX(String str, float f) throws Exception {
        zzX(str, zzJB.zzr(f));
    }

    public final void zzY(String str, double d) throws Exception {
        zzX(str, zzJB.zzZT(d));
    }

    public final void zzZ(String str, zzPV zzpv) throws Exception {
        zzX(str, zzZKN.format("#{0}", zzJB.zzWs(zzpv.toArgb())));
    }

    public final void zzY(String str, zzZQ4 zzzq4) throws Exception {
        zzX(str, zzZKN.format("{0},{1},{2},{3}", zzJB.zzr(zzzq4.getX()), zzJB.zzr(zzzq4.getY()), zzJB.zzr(zzzq4.getWidth()), zzJB.zzr(zzzq4.getHeight())));
    }

    public final void zzZ(String str, float f, float f2) throws Exception {
        zzX(str, zzZKN.format("{0},{1}", zzJB.zzr(f), zzJB.zzr(f2)));
    }

    public final void zzW(String str, long j) throws Exception {
        zzX(str, zzZKN.format("{0},{1}", zzJB.zzr(Float.intBitsToFloat((int) j)), zzJB.zzr(zzZPY.zzYC(j))));
    }
}
