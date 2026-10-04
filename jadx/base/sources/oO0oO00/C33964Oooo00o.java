package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33964Oooo00o extends o0OOO0o<float[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float[] f122187OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122188OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final float[] OooO00o() {
        float[] fArrCopyOf = Arrays.copyOf(this.f122187OooO00o, this.f122188OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        float[] fArr = this.f122187OooO00o;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(fArrCopyOf, "copyOf(...)");
            this.f122187OooO00o = fArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122188OooO0O0;
    }
}
