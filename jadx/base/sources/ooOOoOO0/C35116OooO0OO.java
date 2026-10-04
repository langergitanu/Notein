package ooOOoOO0;

import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: ooOOoOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35116OooO0OO implements CharSequence {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f126106OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final char[] f126107OooOo0o;

    public C35116OooO0OO(char[] cArr) {
        this.f126107OooOo0o = cArr;
        this.f126106OooOo = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f126107OooOo0o[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f126106OooOo;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return C33595OooOOo.OooOOOO(this.f126107OooOo0o, i, Math.min(i2, this.f126106OooOo));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f126106OooOo;
        return C33595OooOOo.OooOOOO(this.f126107OooOo0o, 0, Math.min(i, i));
    }
}
