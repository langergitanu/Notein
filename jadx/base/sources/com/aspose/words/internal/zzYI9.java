package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYI9 implements zzYI7 {

    /* JADX INFO: renamed from: dg */
    protected final int[] f50909dg;

    public zzYI9(int[] iArr) {
        this.f50909dg = zzYGU.zzZy(iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzYI9) {
            return zzYGU.zzv(this.f50909dg, ((zzYI9) obj).f50909dg);
        }
        return false;
    }

    public final int hashCode() {
        return zzYGU.hashCode(this.f50909dg);
    }

    @Override // com.aspose.words.internal.zzYI7
    public final int[] zzXyC() {
        return zzYGU.zzZy(this.f50909dg);
    }

    @Override // com.aspose.words.internal.zzYI7
    public final int zzsh() {
        return this.f50909dg[r0.length - 1];
    }
}
