package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ34 {
    private final zzZ33 zzWlm;
    private final byte[] zzWtc;

    public zzZ34(zzZDA zzzda, byte[] bArr) {
        this(zzO(zzzda), bArr);
    }

    private static zzZ33 zzO(zzZDA zzzda) {
        zzZ33 zzz33ZzU = zzZ8J.zzU(zzzda);
        return new zzZ2W(zzzda, zzz33ZzU.zzXHv(), zzz33ZzU.zzXHu(), zzz33ZzU.zzXIz(), zzz33ZzU.zzXHt());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzZ34) {
            zzZ34 zzz34 = (zzZ34) obj;
            if (this.zzWlm.equals(zzz34.zzWlm) && zzYGU.zzp(this.zzWtc, zzz34.zzWtc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (zzYGU.hashCode(this.zzWtc) * 37) + this.zzWlm.hashCode();
    }

    public final zzZ33 zzXGy() {
        return this.zzWlm;
    }

    public final byte[] zzXIw() {
        return zzYGU.zzVI(this.zzWtc);
    }

    public zzZ34(zzZ33 zzz33) {
        this(zzz33, zzZ8I.zzXIv());
    }

    public zzZ34(zzZ33 zzz33, byte[] bArr) {
        this.zzWlm = zzz33;
        this.zzWtc = zzYGU.zzVI(bArr);
    }
}
