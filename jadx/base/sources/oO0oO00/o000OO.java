package oO0oO00;

import java.util.Arrays;
import oO00ooO.C32459OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o000OO extends o0OOO0o<C32459OooOoo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public short[] f122257OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122258OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final C32459OooOoo0 OooO00o() {
        short[] sArrCopyOf = Arrays.copyOf(this.f122257OooO00o, this.f122258OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(sArrCopyOf, "copyOf(...)");
        return new C32459OooOoo0(sArrCopyOf);
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        short[] sArr = this.f122257OooO00o;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(sArrCopyOf, "copyOf(...)");
            this.f122257OooO00o = sArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122258OooO0O0;
    }
}
