package oO0OO0OO;

import oO000Oo.o000O000;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: oO0OO0OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32911OooOOOo implements o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34524OooO0Oo f118737OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f118738OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f118739OooO0OO;

    public C32911OooOOOo(C34524OooO0Oo c34524OooO0Oo, int i) {
        this.f118737OooO00o = c34524OooO0Oo;
        this.f118738OooO0O0 = i;
    }

    @Override // oO000Oo.o000O000
    public final int OooO00o() {
        return this.f118738OooO0O0;
    }

    @Override // oO000Oo.o000O000
    public final int OooO0O0() {
        return this.f118739OooO0OO;
    }

    @Override // oO000Oo.o000O000
    public final void OooO0OO(byte b) {
        this.f118737OooO00o.o0OoO0o(b);
        this.f118738OooO0O0--;
        this.f118739OooO0OO++;
    }

    @Override // oO000Oo.o000O000
    public final void write(byte[] bArr, int i, int i2) {
        this.f118737OooO00o.o000O00O(bArr, i, i2);
        this.f118738OooO0O0 -= i2;
        this.f118739OooO0OO += i2;
    }
}
