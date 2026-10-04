package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ74 extends zzZDB implements zzZDL {
    private zzZD5 zzWoC;

    public zzZ74(zzZ72 zzz72) {
        this.zzWoC = null;
        this.zzWoC = zzz72.zzXL0();
    }

    public static zzZ74 zzWS(Object obj) {
        if (obj == null || (obj instanceof zzZ74)) {
            return (zzZ74) obj;
        }
        if (obj instanceof zzZD5) {
            return new zzZ74((zzZD5) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new zzZ74(zzZD5.zzXo((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("unable to parse encoded data: ")), e);
        }
    }

    public final zzZD5 zzXHx() {
        return this.zzWoC;
    }

    public final boolean zzXHy() {
        return this.zzWoC instanceof zzZDC;
    }

    public final boolean zzXIy() {
        return this.zzWoC instanceof zzZDA;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWoC;
    }

    public zzZ74(zzZDA zzzda) {
        this.zzWoC = zzzda;
    }

    public zzZ74(zzZDC zzzdc) {
        this.zzWoC = zzzdc;
    }

    private zzZ74(zzZD5 zzzd5) {
        this.zzWoC = zzzd5;
    }
}
