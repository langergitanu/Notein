package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAP extends zzZDB implements zzZAQ {
    private zzZDA zzWFS;
    private zzZDK zzWFz;

    private zzZAP(zzZD4 zzzd4) {
        if (zzzd4.size() <= 0 || zzzd4.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        this.zzWFS = (zzZDA) zzzd4.zzg6(0);
        if (zzzd4.size() > 1) {
            zzZCY zzzcy = (zzZCY) zzzd4.zzg6(1);
            if (!zzzcy.zzXKx() || zzzcy.zzXKy() != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            this.zzWFz = zzzcy.zzXKw();
        }
    }

    public static zzZAP zzYd(Object obj) {
        if (obj instanceof zzZAP) {
            return (zzZAP) obj;
        }
        if (obj != null) {
            return new zzZAP(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDK zzXJV() {
        return this.zzWFz;
    }

    public final zzZDA zzXJW() {
        return this.zzWFS;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFS);
        zzZDK zzzdk = this.zzWFz;
        if (zzzdk != null) {
            zzzdj.zzZ(new zzZCL(zzzdk));
        }
        return new zzZCP(zzzdj);
    }

    public zzZAP(zzZDA zzzda, zzZDK zzzdk) {
        this.zzWFS = zzzda;
        this.zzWFz = zzzdk;
    }
}
