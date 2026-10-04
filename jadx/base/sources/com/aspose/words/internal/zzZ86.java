package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ86 extends zzZDB {
    private zzZDA zzWGh;
    private zzZDK zzWr5;

    public zzZ86(zzZDA zzzda) {
        this.zzWGh = zzzda;
    }

    public static zzZ86 zzT(zzZCY zzzcy) {
        return zzXm(zzZD4.zzX(zzzcy, true));
    }

    public static zzZ86 zzXm(Object obj) {
        if (obj instanceof zzZ86) {
            return (zzZ86) obj;
        }
        if (obj != null) {
            return new zzZ86(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDK zzXJj() {
        return this.zzWr5;
    }

    public final zzZDA zzXJk() {
        return this.zzWGh;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGh);
        zzZDK zzzdk = this.zzWr5;
        if (zzzdk != null) {
            zzzdj.zzZ(zzzdk);
        }
        return new zzZC2(zzzdj);
    }

    public zzZ86(zzZDA zzzda, zzZDK zzzdk) {
        this.zzWGh = zzzda;
        this.zzWr5 = zzzdk;
    }

    private zzZ86(zzZD4 zzzd4) {
        if (zzzd4.size() > 0 && zzzd4.size() <= 2) {
            this.zzWGh = zzZDA.zzYA(zzzd4.zzg6(0));
            if (zzzd4.size() == 2) {
                this.zzWr5 = zzzd4.zzg6(1);
                return;
            } else {
                this.zzWr5 = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
    }
}
