package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYI8 implements zzYI6 {

    /* JADX INFO: renamed from: dh */
    protected final zzYIB f50907dh;

    /* JADX INFO: renamed from: di */
    protected final zzYI7 f50908di;

    public zzYI8(zzYIB zzyib, zzYI7 zzyi7) {
        this.f50907dh = zzyib;
        this.f50908di = zzyi7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzYI8)) {
            return false;
        }
        zzYI8 zzyi8 = (zzYI8) obj;
        return this.f50907dh.equals(zzyi8.f50907dh) && this.f50908di.equals(zzyi8.f50908di);
    }

    public final int hashCode() {
        return this.f50907dh.hashCode() ^ Integer.rotateLeft(this.f50908di.hashCode(), 16);
    }

    @Override // com.aspose.words.internal.zzYI6
    public final zzYI7 zzXyB() {
        return this.f50908di;
    }

    @Override // com.aspose.words.internal.zzYIB
    public final BigInteger zzXyD() {
        return this.f50907dh.zzXyD();
    }

    @Override // com.aspose.words.internal.zzYIB
    public final int zzYxQ() {
        return this.f50908di.zzsh() * this.f50907dh.zzYxQ();
    }
}
