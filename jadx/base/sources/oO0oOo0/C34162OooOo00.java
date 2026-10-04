package oO0oOo0;

import java.io.IOException;
import java.util.Enumeration;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34162OooOo00 extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34066Oooooo0 f122750OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34142OooO00o f122751OooOo0o;

    public C34162OooOo00(C34142OooO00o c34142OooO00o, oO0oO0Oo.OooOo00 oooOo00) throws IOException {
        this.f122750OooOo = new C34066Oooooo0(oooOo00.OooO0o().OooO0oO(), 0);
        this.f122751OooOo0o = c34142OooO00o;
    }

    public static C34162OooOo00 OooO0oo(Object obj) {
        if (obj instanceof C34162OooOo00) {
            return (C34162OooOo00) obj;
        }
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34162OooOo00 c34162OooOo00 = new C34162OooOo00();
        if (abstractC34039OooOooOOooOOoo.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        Enumeration enumerationOooOo0O = abstractC34039OooOooOOooOOoo.OooOo0O();
        c34162OooOo00.f122751OooOo0o = C34142OooO00o.OooO0oo(enumerationOooOo0O.nextElement());
        c34162OooOo00.f122750OooOo = C34066Oooooo0.OooOo0(enumerationOooOo0O.nextElement());
        return c34162OooOo00;
    }

    public final AbstractC34036OooOoOO OooO() throws IOException {
        return AbstractC34036OooOoOO.OooOOO(this.f122750OooOo.OooOo00());
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f122751OooOo0o);
        c34020OooO0oo.OooO00o(this.f122750OooOo);
        return new o00oO0O(c34020OooO0oo);
    }

    public C34162OooOo00(C34142OooO00o c34142OooO00o, byte[] bArr) {
        this.f122750OooOo = new C34066Oooooo0(bArr, 0);
        this.f122751OooOo0o = c34142OooO00o;
    }
}
