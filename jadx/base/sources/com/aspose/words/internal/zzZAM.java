package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAM extends zzZDB {
    private final zzZ86 zzWFw;
    private final zzZ86 zzWFx;

    private zzZAM(zzZD4 zzzd4) {
        if (zzzd4.size() != 2) {
            throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.zzWFx = zzZ86.zzXm(zzzd4.zzg6(0));
        this.zzWFw = zzZ86.zzXm(zzzd4.zzg6(1));
    }

    public static zzZAM zzYb(Object obj) {
        if (obj != null) {
            return new zzZAM(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ86 zzXJS() {
        return this.zzWFx;
    }

    public final zzZ86 zzXJT() {
        return this.zzWFw;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFx);
        zzzdj.zzZ(this.zzWFw);
        return new zzZC2(zzzdj);
    }

    public zzZAM(zzZ86 zzz86, zzZ86 zzz862) {
        this.zzWFx = zzz86;
        this.zzWFw = zzz862;
    }
}
