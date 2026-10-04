package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZA6 extends zzZDB {
    private zzZ7O zzWDQ;
    private zzZD9 zzWDR;

    private zzZA6(zzZD4 zzzd4) {
        if (zzzd4.size() <= 0 || zzzd4.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        this.zzWDR = zzZD9.zzYz(zzzd4.zzg6(0));
        if (zzzd4.size() > 1) {
            this.zzWDQ = zzZ7O.zzX6(zzzd4.zzg6(1));
        }
    }

    public static zzZA6 zzY2(Object obj) {
        if (obj instanceof zzZA6) {
            return (zzZA6) obj;
        }
        if (obj != null) {
            return new zzZA6(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWDR);
        zzZ7O zzz7o = this.zzWDQ;
        if (zzz7o != null) {
            zzzdj.zzZ(zzz7o);
        }
        return new zzZC2(zzzdj);
    }
}
