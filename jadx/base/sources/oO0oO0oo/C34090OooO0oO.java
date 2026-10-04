package oO0oO0oo;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34025OooOOO0;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oO0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34090OooO0oO extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34088OooO0o f122488OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34029OooOOo0 f122489OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AbstractC34033OooOo0o f122490OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34142OooO00o f122491OooOoO0;

    public static C34090OooO0oO OooO0oo(Oooo0 oooo0, boolean z) {
        C34088OooO0o c34088OooO0o;
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0;
        AbstractC34039OooOooO abstractC34039OooOooOOooOo00 = AbstractC34039OooOooO.OooOo00(oooo0, z);
        if (abstractC34039OooOooOOooOo00 == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOo00);
        C34090OooO0oO c34090OooO0oO = new C34090OooO0oO();
        c34090OooO0oO.f122489OooOo0o = (C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(0);
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo02 = abstractC34039OooOooOOooOOoo.OooOo0(1);
        if (interfaceC34019OooO0oOOooOo02 == null || (interfaceC34019OooO0oOOooOo02 instanceof C34088OooO0o)) {
            c34088OooO0o = (C34088OooO0o) interfaceC34019OooO0oOOooOo02;
        } else {
            if (!(interfaceC34019OooO0oOOooOo02 instanceof AbstractC34039OooOooO)) {
                throw new IllegalArgumentException("Invalid KEKIdentifier: ".concat(interfaceC34019OooO0oOOooOo02.getClass().getName()));
            }
            AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) interfaceC34019OooO0oOOooOo02;
            c34088OooO0o = new C34088OooO0o();
            c34088OooO0o.f122484OooOo0o = (AbstractC34033OooOo0o) abstractC34039OooOooO.OooOo0(0);
            int size = abstractC34039OooOooO.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        throw new IllegalArgumentException("Invalid KEKIdentifier");
                    }
                    c34088OooO0o.f122483OooOo = (C34025OooOOO0) abstractC34039OooOooO.OooOo0(1);
                    interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooO.OooOo0(2);
                } else if (abstractC34039OooOooO.OooOo0(1) instanceof C34025OooOOO0) {
                    c34088OooO0o.f122483OooOo = (C34025OooOOO0) abstractC34039OooOooO.OooOo0(1);
                } else {
                    interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooO.OooOo0(1);
                }
                c34088OooO0o.f122485OooOoO0 = C34095OooOOO.OooO0oo(interfaceC34019OooO0oOOooOo0);
            }
        }
        c34090OooO0oO.f122488OooOo = c34088OooO0o;
        c34090OooO0oO.f122491OooOoO0 = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(2));
        c34090OooO0oO.f122490OooOoO = (AbstractC34033OooOo0o) abstractC34039OooOooOOooOOoo.OooOo0(3);
        return c34090OooO0oO;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(4);
        c34020OooO0oo.OooO00o(this.f122489OooOo0o);
        c34020OooO0oo.OooO00o(this.f122488OooOo);
        c34020OooO0oo.OooO00o(this.f122491OooOoO0);
        c34020OooO0oo.OooO00o(this.f122490OooOoO);
        return new o00oO0O(c34020OooO0oo);
    }
}
