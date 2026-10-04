package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6Q implements zzZCA, Cloneable {
    private zzZCB zzZ2X;

    public zz6Q(zzZCB zzzcb) {
        this.zzZ2X = zzzcb;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCA
    public final zzZCA zzZOl() {
        zz6Q zz6q = (zz6Q) memberwiseClone();
        zzZCB zzzcb = this.zzZ2X;
        if (zzzcb != null) {
            zz6q.zzZ2X = zzzcb.zzZzY();
        }
        return zz6q;
    }

    @Override // com.aspose.words.zzZCA
    public final zzZCB zzZOm() {
        return this.zzZ2X;
    }

    public zz6Q() {
    }
}
