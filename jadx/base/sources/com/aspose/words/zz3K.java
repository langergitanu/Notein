package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz3K extends zz0E implements Cloneable {
    private zz0K zzZ00;

    public zz3K() {
        this(new zz0K());
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zz0E
    public final zz0E zzZwA() {
        zz3K zz3k = (zz3K) memberwiseClone();
        zz0K zz0k = this.zzZ00;
        if (zz0k != null) {
            zz3k.zzZ00 = zz0k.zzZsB();
        }
        return zz3k;
    }

    public final zz0K zzZwo() {
        return this.zzZ00;
    }

    public zz3K(zz0K zz0k) {
        new zz0K();
        this.zzZ00 = zz0k;
    }
}
