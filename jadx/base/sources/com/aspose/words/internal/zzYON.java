package com.aspose.words.internal;

import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
final class zzYON implements zzYR0 {
    private transient zzZ3S zzVSq;

    public zzYON(zzZ5W zzz5w, zzYR0 zzyr0) {
        zzYMY zzymyZzXBH = zzyr0.zzXBH();
        this.zzVSq = new zzZ3S(zzz5w, zzYPX.zzZ(zzymyZzXBH), zzYPT.zzZ(zzymyZzXBH, zzyr0.getW()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYON) {
            return this.zzVSq.equals(((zzYON) obj).zzVSq);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVSq.zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSq.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // com.aspose.words.internal.zzYR0
    public final ECPoint getW() {
        return new ECPoint(this.zzVSq.zzXGA().zzXzn().toBigInteger(), this.zzVSq.zzXGA().zzXzm().toBigInteger());
    }

    public final int hashCode() {
        return this.zzVSq.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzZ("DSTU4145", this.zzVSq.zzXGA().zzXze(), this.zzVSq.zzXGB().zzXGy());
    }

    public final zzZ3S zzXAN() {
        return this.zzVSq;
    }

    @Override // com.aspose.words.internal.zzYR2
    public final zzYMY zzXBH() {
        return zzYPX.zzZ(this.zzVSq.zzXGB());
    }

    public zzYON(zzZ5W zzz5w, zzYMW zzymw) {
        zzYMY zzymyZzXBH = zzymw.zzXBH();
        this.zzVSq = new zzZ3S(zzz5w, zzYPX.zzZ(zzymyZzXBH), zzYPT.zzZ(zzymyZzXBH, zzymw.getW()));
    }

    public zzYON(zzZ3S zzz3s) {
        this.zzVSq = zzz3s;
    }
}
