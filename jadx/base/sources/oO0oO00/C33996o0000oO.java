package oO0oO00;

import java.util.Arrays;
import oO00ooO.C32456OooOoO0;

/* JADX INFO: renamed from: oO0oO00.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33996o0000oO extends o0OOO0o<C32456OooOoO0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f122253OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122254OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final C32456OooOoO0 OooO00o() {
        long[] jArrCopyOf = Arrays.copyOf(this.f122253OooO00o, this.f122254OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(jArrCopyOf, "copyOf(...)");
        return new C32456OooOoO0(jArrCopyOf);
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        long[] jArr = this.f122253OooO00o;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(jArrCopyOf, "copyOf(...)");
            this.f122253OooO00o = jArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122254OooO0O0;
    }
}
