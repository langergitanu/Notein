package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33946OooOOOO extends o0OOO0o<char[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public char[] f122151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122152OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final char[] OooO00o() {
        char[] cArrCopyOf = Arrays.copyOf(this.f122151OooO00o, this.f122152OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        char[] cArr = this.f122151OooO00o;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(cArrCopyOf, "copyOf(...)");
            this.f122151OooO00o = cArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122152OooO0O0;
    }
}
