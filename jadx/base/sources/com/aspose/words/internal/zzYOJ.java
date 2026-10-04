package com.aspose.words.internal;

import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOJ implements zzYQY {
    private transient zzZ3Q zzVSe;

    public zzYOJ(zzZ5W zzz5w, zzYQY zzyqy) {
        zzYMM<zzYMV> zzymmZzXBG = zzyqy.zzXBG();
        this.zzVSe = new zzZ3Q(zzz5w, zzYPR.zzY(zzymmZzXBG), zzYPT.zzZ((ECParameterSpec) zzymmZzXBG.zzXA3(), zzyqy.getW()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYOJ) {
            return this.zzVSe.equals(((zzYOJ) obj).zzVSe);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.zzVSe.zzXGV().getName();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVSe.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // com.aspose.words.internal.zzYQY
    public final ECPoint getW() {
        return new ECPoint(this.zzVSe.zzXGA().zzXzn().toBigInteger(), this.zzVSe.zzXGA().zzXzm().toBigInteger());
    }

    public final int hashCode() {
        return this.zzVSe.hashCode();
    }

    public final String toString() {
        return zzYPJ.zzZ("ECGOST3410", this.zzVSe.zzXGA(), this.zzVSe.zzXGz().zzXGk());
    }

    public final zzZ3Q zzXAJ() {
        return this.zzVSe;
    }

    @Override // com.aspose.words.internal.zzYQW
    public final zzYMM<zzYMV> zzXBG() {
        return zzYPR.zzX(this.zzVSe.zzXGz());
    }

    public zzYOJ(zzZ5W zzz5w, zzYMT zzymt) {
        zzYMM<zzYMV> zzymmZzXBG = zzymt.zzXBG();
        this.zzVSe = new zzZ3Q(zzz5w, zzYPR.zzY(zzymmZzXBG), zzYPT.zzZ((ECParameterSpec) zzymmZzXBG.zzXA3(), zzymt.getW()));
    }

    public zzYOJ(zzZ3Q zzz3q) {
        this.zzVSe = zzz3q;
    }
}
