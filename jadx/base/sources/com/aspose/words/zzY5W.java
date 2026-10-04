package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5W {
    private zzZ32 zzXcZ;

    public zzY5W(zzZ32 zzz32) {
        this.zzXcZ = zzz32;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return this.zzXcZ.zzY(((zzY5W) obj).zzXcZ);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzXcZ.zzYKL().hashCode() ^ this.zzXcZ.zzZr().zzOQ().hashCode()) ^ Float.floatToIntBits(this.zzXcZ.zzZr().zzPg());
    }
}
