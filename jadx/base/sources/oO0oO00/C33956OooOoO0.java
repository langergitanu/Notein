package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33956OooOoO0 extends o0OOO0o<double[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double[] f122164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122165OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final double[] OooO00o() {
        double[] dArrCopyOf = Arrays.copyOf(this.f122164OooO00o, this.f122165OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        double[] dArr = this.f122164OooO00o;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(dArrCopyOf, "copyOf(...)");
            this.f122164OooO00o = dArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122165OooO0O0;
    }
}
