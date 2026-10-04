package oO0oO00;

import java.util.Arrays;
import oO00ooO.C32454OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000 extends o0OOO0o<C32454OooOo0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f122220OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122221OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final C32454OooOo0o OooO00o() {
        int[] iArrCopyOf = Arrays.copyOf(this.f122220OooO00o, this.f122221OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
        return new C32454OooOo0o(iArrCopyOf);
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        int[] iArr = this.f122220OooO00o;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
            this.f122220OooO00o = iArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122221OooO0O0;
    }
}
