package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33981Ooooo00 extends o0OOO0o<long[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f122203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122204OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final long[] OooO00o() {
        long[] jArrCopyOf = Arrays.copyOf(this.f122203OooO00o, this.f122204OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        long[] jArr = this.f122203OooO00o;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(jArrCopyOf, "copyOf(...)");
            this.f122203OooO00o = jArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122204OooO0O0;
    }
}
