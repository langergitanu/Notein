package o0oooO00;

import android.util.Log;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOoo.C31676OooO0oo;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31793OooO00o implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113422OooOo0o;

    public AbstractC31793OooO00o() {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        this.f113422OooOo0o = c31436OooO0Oo;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112248Oooo00O);
    }

    public final C31804OooOOO OooO00o() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113422OooOo0o.o0000O0O(C31441OooOO0.f112246Oooo0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            return new C31804OooOOO((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O);
        }
        return null;
    }

    public final C31807OooOOOo OooO0O0() {
        C31806OooOOOO c31806OooOOOOOooO00o;
        C31804OooOOO c31804OooOOOOooO00o = OooO00o();
        if (c31804OooOOOOooO00o == null || (c31806OooOOOOOooO00o = c31804OooOOOOooO00o.OooO00o()) == null) {
            return null;
        }
        return !(c31806OooOOOOOooO00o.f113425OooOo0o instanceof C31448OooOOo) ? (C31807OooOOOo) c31806OooOOOOOooO00o.OooO0O0().f113208OooOo.get(this.f113422OooOo0o.o0Oo0oo(C31441OooOO0.f112250Oooo0O0)) : c31806OooOOOOOooO00o.OooO00o();
    }

    public final C31676OooO0oo OooO0OO() {
        C31433OooO00o c31433OooO00o = (C31433OooO00o) this.f113422OooOo0o.o0000O0O(C31441OooOO0.f112386o00O0OOO);
        if (c31433OooO00o != null) {
            if (c31433OooO00o.f112214OooOo.size() == 4 && (c31433OooO00o.Oooo0OO(0) instanceof AbstractC31443OooOO0o) && (c31433OooO00o.Oooo0OO(1) instanceof AbstractC31443OooOO0o) && (c31433OooO00o.Oooo0OO(2) instanceof AbstractC31443OooOO0o) && (c31433OooO00o.Oooo0OO(3) instanceof AbstractC31443OooOO0o)) {
                return new C31676OooO0oo(c31433OooO00o);
            }
            Log.w("PdfBox-Android", c31433OooO00o + " is not a rectangle array, returning null");
        }
        return null;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113422OooOo0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC31793OooO00o) {
            return ((AbstractC31793OooO00o) obj).f113422OooOo0o.equals(this.f113422OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f113422OooOo0o.hashCode();
    }

    public AbstractC31793OooO00o(C31436OooO0Oo c31436OooO0Oo) {
        this.f113422OooOo0o = c31436OooO0Oo;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112403o00OO;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O == null) {
            c31436OooO0Oo.o000OoOO(c31441OooOO0, C31441OooOO0.f112248Oooo00O);
        } else {
            if (C31441OooOO0.f112248Oooo00O.equals(abstractC31434OooO0O0O0000O0O)) {
                return;
            }
            Log.w("PdfBox-Android", "Annotation has type " + abstractC31434OooO0O0O0000O0O + ", further mayhem may follow");
        }
    }
}
