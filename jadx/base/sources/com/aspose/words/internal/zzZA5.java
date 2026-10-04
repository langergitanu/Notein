package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZA5 extends zzZDB {
    private static final zzZ86 zzWDN = new zzZ86(zzZ9O.zzWAL);
    private byte[] zzWDO;
    private zzZ86 zzWDP;
    private zzZ7O zzWDQ;

    private zzZA5(zzZD4 zzzd4) {
        if (zzzd4.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        int i = 0;
        if (zzzd4.zzg6(0) instanceof zzZD9) {
            this.zzWDP = zzWDN;
        } else {
            this.zzWDP = zzZ86.zzXm(zzzd4.zzg6(0).zzXL0());
            i = 1;
        }
        int i2 = i + 1;
        this.zzWDO = zzZD9.zzYz(zzzd4.zzg6(i).zzXL0()).zzXL5();
        if (zzzd4.size() > i2) {
            this.zzWDQ = zzZ7O.zzX6(zzzd4.zzg6(i2));
        }
    }

    public static zzZA5 zzY1(Object obj) {
        if (obj instanceof zzZA5) {
            return (zzZA5) obj;
        }
        if (obj != null) {
            return new zzZA5(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        if (!this.zzWDP.equals(zzWDN)) {
            zzzdj.zzZ(this.zzWDP);
        }
        zzzdj.zzZ(new zzZC6(this.zzWDO).zzXL0());
        zzZ7O zzz7o = this.zzWDQ;
        if (zzz7o != null) {
            zzzdj.zzZ(zzz7o);
        }
        return new zzZC2(zzzdj);
    }
}
