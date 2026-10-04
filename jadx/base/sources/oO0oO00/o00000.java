package oO0oO00;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000 extends o0OOO0o<short[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public short[] f122222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122223OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final short[] OooO00o() {
        short[] sArrCopyOf = Arrays.copyOf(this.f122222OooO00o, this.f122223OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        short[] sArr = this.f122222OooO00o;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(sArrCopyOf, "copyOf(...)");
            this.f122222OooO00o = sArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122223OooO0O0;
    }
}
