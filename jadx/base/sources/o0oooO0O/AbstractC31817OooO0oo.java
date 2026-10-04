package o0oooO0O;

import Oooo0oO.o0Oo0oo;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31817OooO0oo implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31819OooOO0O f113443OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31811OooO0O0 f113444OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31436OooO0Oo f113445OooOoO0;

    public AbstractC31817OooO0oo(C31811OooO0O0 c31811OooO0O0, C31436OooO0Oo c31436OooO0Oo, C31819OooOO0O c31819OooOO0O) {
        this.f113444OooOo0o = c31811OooO0O0;
        this.f113445OooOoO0 = c31436OooO0Oo;
        this.f113443OooOo = c31819OooOO0O;
    }

    public final String OooO00o() {
        String strO000OOo0 = this.f113445OooOoO0.o000OOo0(C31441OooOO0.f112408o00OO0O);
        C31819OooOO0O c31819OooOO0O = this.f113443OooOo;
        String strOooO00o = c31819OooOO0O != null ? c31819OooOO0O.OooO00o() : null;
        return strOooO00o != null ? strO000OOo0 != null ? o0Oo0oo.OooO0Oo(strOooO00o, ".", strO000OOo0) : strOooO00o : strO000OOo0;
    }

    public final AbstractC31434OooO0O0 OooO0O0(C31441OooOO0 c31441OooOO0) {
        C31436OooO0Oo c31436OooO0Oo = this.f113445OooOoO0;
        if (c31436OooO0Oo.f112222OooOoO0.containsKey(c31441OooOO0)) {
            return c31436OooO0Oo.o0000O0O(c31441OooOO0);
        }
        C31819OooOO0O c31819OooOO0O = this.f113443OooOo;
        return c31819OooOO0O != null ? c31819OooOO0O.OooO0O0(c31441OooOO0) : this.f113444OooOo0o.f113436OooOo.o0000O0O(c31441OooOO0);
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113445OooOoO0;
    }

    public final String toString() {
        return OooO00o() + "{type: " + getClass().getSimpleName() + " value: " + OooO0O0(C31441OooOO0.f112420o00OOOO0) + "}";
    }
}
