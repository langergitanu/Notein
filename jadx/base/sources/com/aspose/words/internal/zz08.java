package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz08 implements Comparable<zz08> {
    private int zzTL;
    private int zzZq;

    public zz08(int i, int i2) {
        this.zzZq = i;
        this.zzTL = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public int compareTo(zz08 zz08Var) {
        return zzZKR.zzZ7(this.zzTL, zz08Var.zzTL);
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final int zzZD() {
        return this.zzZq;
    }
}
