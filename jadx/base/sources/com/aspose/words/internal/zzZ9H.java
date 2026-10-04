package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9H extends zzZDB implements zzZ96 {
    private zzZDA zzWFS;
    private zzZDK zzWFz;
    private boolean zzWyR;

    private zzZ9H(zzZD4 zzzd4) {
        this.zzWyR = true;
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWFS = (zzZDA) enumerationZzXKE.nextElement();
        if (enumerationZzXKE.hasMoreElements()) {
            this.zzWFz = ((zzZCY) enumerationZzXKE.nextElement()).zzXKw();
        }
        this.zzWyR = zzzd4 instanceof zzZCP;
    }

    public static zzZ9H zzXS(Object obj) {
        if (obj instanceof zzZ9H) {
            return (zzZ9H) obj;
        }
        if (obj != null) {
            return new zzZ9H(zzZD4.zzYy(obj));
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
            zzzdj.zzZ(new zzZCL(true, 0, zzzdk));
        }
        return this.zzWyR ? new zzZCP(zzzdj) : new zzZBN(zzzdj);
    }

    public zzZ9H(zzZDA zzzda, zzZDK zzzdk) {
        this.zzWyR = true;
        this.zzWFS = zzzda;
        this.zzWFz = zzzdk;
    }
}
