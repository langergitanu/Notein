package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33937OooO0o extends o0OOO0o<boolean[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean[] f122140OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122141OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final boolean[] OooO00o() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f122140OooO00o, this.f122141OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        boolean[] zArr = this.f122140OooO00o;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(zArrCopyOf, "copyOf(...)");
            this.f122140OooO00o = zArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122141OooO0O0;
    }
}
