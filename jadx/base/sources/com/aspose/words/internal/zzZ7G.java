package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7G extends zzZDB {
    private zzZDK zzWpE;
    private zzZDA zzWpF;

    private zzZ7G(zzZD4 zzzd4) {
        if (zzzd4.size() == 2) {
            this.zzWpF = zzZDA.zzYA(zzzd4.zzg6(0));
            this.zzWpE = zzzd4.zzg6(1);
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
    }

    public static zzZ7G zzX0(Object obj) {
        if (obj instanceof zzZ7G) {
            return (zzZ7G) obj;
        }
        if (obj != null) {
            return new zzZ7G(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWpF);
        zzzdj.zzZ(this.zzWpE);
        return new zzZC2(zzzdj);
    }
}
