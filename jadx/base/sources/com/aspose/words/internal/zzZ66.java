package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ66 implements zzYGL {
    private zzZ6P zzWml;

    private zzZ66(zzZ6P zzz6p) {
        this.zzWml = zzz6p;
    }

    @Override // com.aspose.words.internal.zzYGL
    public final Object clone() {
        return new zzZ66(this.zzWml);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzZ66) {
            return this.zzWml.equals(((zzZ66) obj).zzWml);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzWml.hashCode();
    }

    @Override // com.aspose.words.internal.zzYGL
    public final boolean zzWP(Object obj) {
        return obj instanceof zzZ63 ? ((zzZ63) obj).zzXHf().equals(this) : this.zzWml.zzWP(obj);
    }

    public zzZ66(byte[] bArr) {
        this(null, null, bArr);
    }

    public zzZ66(zzZ8C zzz8c, BigInteger bigInteger) {
        this(zzz8c, bigInteger, null);
    }

    private zzZ66(zzZ8C zzz8c, BigInteger bigInteger, byte[] bArr) {
        this(new zzZ6P(zzz8c, bigInteger, bArr));
    }
}
