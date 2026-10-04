package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB1 extends zzZDB implements zzZDL {
    private final int type;
    private final zzZDB zzWGw;

    public zzZB1(zzZB0 zzzb0) {
        this((zzZDK) zzzb0);
    }

    public static zzZB1 zzYk(Object obj) {
        if (obj instanceof zzZB1) {
            return (zzZB1) obj;
        }
        if (obj != null) {
            return new zzZB1((zzZDK) obj);
        }
        return null;
    }

    public final int getType() {
        return this.type;
    }

    public final zzZDB zzXK8() {
        return this.zzWGw;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWGw.zzXL0();
    }

    private zzZB1(zzZDK zzzdk) {
        if (!(zzzdk instanceof zzZD4) && !(zzzdk instanceof zzZB0)) {
            throw new IllegalArgumentException("Unknown check object in integrity check.");
        }
        this.type = 0;
        this.zzWGw = zzZB0.zzYj(zzzdk);
    }
}
