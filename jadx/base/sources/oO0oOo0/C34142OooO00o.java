package oO0oOo0;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34142OooO00o extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC34019OooO0oO f122684OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34032OooOo0O f122685OooOo0o;

    public C34142OooO00o(C34032OooOo0O c34032OooOo0O) {
        this.f122685OooOo0o = c34032OooOo0O;
    }

    public static C34142OooO00o OooO0oo(Object obj) {
        if (obj instanceof C34142OooO00o) {
            return (C34142OooO00o) obj;
        }
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34142OooO00o c34142OooO00o = new C34142OooO00o();
        if (abstractC34039OooOooOOooOOoo.size() < 1 || abstractC34039OooOooOOooOOoo.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        c34142OooO00o.f122685OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(0));
        if (abstractC34039OooOooOOooOOoo.size() == 2) {
            c34142OooO00o.f122684OooOo = abstractC34039OooOooOOooOOoo.OooOo0(1);
            return c34142OooO00o;
        }
        c34142OooO00o.f122684OooOo = null;
        return c34142OooO00o;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f122685OooOo0o);
        InterfaceC34019OooO0oO interfaceC34019OooO0oO = this.f122684OooOo;
        if (interfaceC34019OooO0oO != null) {
            c34020OooO0oo.OooO00o(interfaceC34019OooO0oO);
        }
        return new o00oO0O(c34020OooO0oo);
    }

    public C34142OooO00o(C34032OooOo0O c34032OooOo0O, oO0oO0Oo.OooOo00 oooOo00) {
        this.f122685OooOo0o = c34032OooOo0O;
        this.f122684OooOo = oooOo00;
    }
}
