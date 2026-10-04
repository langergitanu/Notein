package oO0oO00;

import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO00.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33932OooO extends o0OOO0o<byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f122138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122139OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final byte[] OooO00o() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f122138OooO00o, this.f122139OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        byte[] bArr = this.f122138OooO00o;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
            this.f122138OooO00o = bArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122139OooO0O0;
    }
}
