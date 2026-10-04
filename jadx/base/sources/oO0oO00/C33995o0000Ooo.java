package oO0oO00;

import java.util.Arrays;
import oO00ooO.C32451OooOo0;

/* JADX INFO: renamed from: oO0oO00.o0000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33995o0000Ooo extends o0OOO0o<C32451OooOo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f122251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122252OooO0O0;

    @Override // oO0oO00.o0OOO0o
    public final C32451OooOo0 OooO00o() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f122251OooO00o, this.f122252OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
        return new C32451OooOo0(bArrCopyOf);
    }

    @Override // oO0oO00.o0OOO0o
    public final void OooO0O0(int i) {
        byte[] bArr = this.f122251OooO00o;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
            this.f122251OooO00o = bArrCopyOf;
        }
    }

    @Override // oO0oO00.o0OOO0o
    public final int OooO0Oo() {
        return this.f122252OooO0O0;
    }
}
