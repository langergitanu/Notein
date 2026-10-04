package o0oooO0o;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.C31674OooO0o0;

/* JADX INFO: renamed from: o0oooO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31833OooO0Oo extends C31674OooO0o0 {
    public final C31831OooO0O0 OooO00o(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113211OooOo0o.o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            return new C31831OooO0O0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O);
        }
        return null;
    }

    public final AbstractC31833OooO0Oo OooO0O0() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113211OooOo0o.o0000O0O(C31441OooOO0.f112376o00O00o);
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo)) {
            return null;
        }
        C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) abstractC31434OooO0O0O0000O0O;
        return C31441OooOO0.f112438o00oOoo.equals(c31436OooO0Oo.o0Oo0oo(C31441OooOO0.f112403o00OO)) ? new C31830OooO00o(c31436OooO0Oo) : new C31831OooO0O0(c31436OooO0Oo);
    }

    public boolean OooO0OO() {
        return this.f113211OooOo0o.o000O00O(C31441OooOO0.f112453oo000o, null, 0) > 0;
    }

    public final void OooO0Oo(int i) {
        AbstractC31833OooO0Oo abstractC31833OooO0OoOooO0O0 = OooO0O0();
        if (abstractC31833OooO0OoOooO0O0 != null) {
            boolean zOooO0OO = abstractC31833OooO0OoOooO0O0.OooO0OO();
            C31436OooO0Oo c31436OooO0Oo = abstractC31833OooO0OoOooO0O0.f113211OooOo0o;
            if (!zOooO0OO) {
                C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112453oo000o;
                c31436OooO0Oo.o000Oo(c31441OooOO0, c31436OooO0Oo.o000O00O(c31441OooOO0, null, 0) - i);
            } else {
                C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112453oo000o;
                c31436OooO0Oo.o000Oo(c31441OooOO02, c31436OooO0Oo.o000O00O(c31441OooOO02, null, 0) + i);
                abstractC31833OooO0OoOooO0O0.OooO0Oo(i);
            }
        }
    }
}
