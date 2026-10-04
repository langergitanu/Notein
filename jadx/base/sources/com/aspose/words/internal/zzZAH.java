package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAH extends zzZDB implements zzZDL {
    private zzZDK zzWFa;

    public zzZAH(zzZAL zzzal) {
        this.zzWFa = zzzal;
    }

    public static zzZAH zzY6(Object obj) {
        if (obj == null || (obj instanceof zzZAH)) {
            return (zzZAH) obj;
        }
        if (obj instanceof zzZAL) {
            return new zzZAH((zzZAL) obj);
        }
        if (obj instanceof zzZD9) {
            return new zzZAH((zzZD9) obj);
        }
        if (obj instanceof zzZD5) {
            return new zzZAH((zzZD5) obj);
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "Illegal object in SignerIdentifier: "));
    }

    public final zzZDK zzXJF() {
        zzZDK zzzdk = this.zzWFa;
        return zzzdk instanceof zzZCY ? zzZD9.zzY((zzZCY) zzzdk, false) : zzzdk;
    }

    public final boolean zzXJG() {
        return this.zzWFa instanceof zzZCY;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWFa.zzXL0();
    }

    private zzZAH(zzZD9 zzzd9) {
        this.zzWFa = new zzZBX(false, 0, zzzd9);
    }

    private zzZAH(zzZD5 zzzd5) {
        this.zzWFa = zzzd5;
    }
}
