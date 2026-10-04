package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33972OoooO0 extends o0OOO0o<int[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f122195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122196OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final int[] OooO00o() {
        int[] iArrCopyOf = Arrays.copyOf(this.f122195OooO00o, this.f122196OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        int[] iArr = this.f122195OooO00o;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
            this.f122195OooO00o = iArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122196OooO0O0;
    }
}
