package o0ooo0;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31450OooOOoo;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31722OooOOo0 implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113315OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f113314OooOo = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f113316OooOoO0 = -1;

    public C31722OooOOo0() {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        this.f113315OooOo0o = c31436OooO0Oo;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112305o0000oOO);
    }

    public final C31676OooO0oo OooO00o() {
        C31433OooO00o c31433OooO00oOooo0 = this.f113315OooOo0o.Oooo0(C31441OooOO0.f112304o0000oO0);
        if (c31433OooO00oOooo0 != null) {
            return new C31676OooO0oo(c31433OooO00oOooo0);
        }
        return null;
    }

    public final C31668OooO OooO0O0() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113315OooOo0o.o0000O0O(C31441OooOO0.f112276o000);
        if (abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo) {
            return new C31668OooO((C31448OooOOo) abstractC31434OooO0O0O0000O0O);
        }
        return null;
    }

    public final String OooO0OO() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113315OooOo0o.o0000O0O(C31441OooOO0.f112335o000OoO);
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            return ((C31441OooOO0) abstractC31434OooO0O0O0000O0O).f112461OooOo;
        }
        return null;
    }

    public final C31725OooOo00 OooO0Oo() {
        C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) this.f113315OooOo0o.o0000O0O(C31441OooOO0.f112405o00OO000);
        if (c31436OooO0Oo == null) {
            return null;
        }
        byte[] bArr = ((C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112377o00O00o0)).f112480OooOo;
        if (bArr.length >= 12) {
            return new C31725OooOo00(bArr);
        }
        return null;
    }

    public final void OooO0o(int i, boolean z) {
        int i2 = this.f113316OooOoO0;
        C31436OooO0Oo c31436OooO0Oo = this.f113315OooOo0o;
        if (i2 == -1) {
            this.f113316OooOoO0 = c31436OooO0Oo.o000O00O(C31441OooOO0.o0000o0, null, 0);
        }
        int i3 = this.f113316OooOoO0;
        int i4 = z ? i | i3 : (~i) & i3;
        c31436OooO0Oo.o000Oo(C31441OooOO0.o0000o0, i4);
        this.f113316OooOoO0 = i4;
    }

    public final boolean OooO0o0(int i) {
        if (this.f113316OooOoO0 == -1) {
            this.f113316OooOoO0 = this.f113315OooOo0o.o000O00O(C31441OooOO0.o0000o0, null, 0);
        }
        return (i & this.f113316OooOoO0) != 0;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113315OooOo0o;
    }

    public C31722OooOOo0(C31436OooO0Oo c31436OooO0Oo) {
        this.f113315OooOo0o = c31436OooO0Oo;
    }
}
