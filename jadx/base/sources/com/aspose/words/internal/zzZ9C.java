package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9C extends zzZDB {
    private zzZ86 zzWyM;

    public zzZ9C(zzZDA zzzda, zzZDK zzzdk) {
        this.zzWyM = new zzZ86(zzzda, zzzdk);
    }

    public static zzZ9C zzXN(Object obj) {
        if (obj instanceof zzZ9C) {
            return (zzZ9C) obj;
        }
        if (obj != null) {
            return new zzZ9C(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDK zzXJj() {
        return this.zzWyM.zzXJj();
    }

    public final zzZDA zzXJk() {
        return this.zzWyM.zzXJk();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWyM.zzXL0();
    }

    private zzZ9C(zzZD4 zzzd4) {
        this.zzWyM = zzZ86.zzXm(zzzd4);
    }
}
