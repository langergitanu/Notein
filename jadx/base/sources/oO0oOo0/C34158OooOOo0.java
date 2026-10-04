package oO0oOo0;

import com.aspose.words.internal.C22245OooO0oO;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34012OooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34158OooOOo0 extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34032OooOo0O f122735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34012OooO f122736OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C34066Oooooo0 f122737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34142OooO00o f122738OooOoO0;

    public static C34158OooOOo0 OooO0oo(Oooo0 oooo0) {
        C34012OooO c34012OooO;
        int i = 0;
        AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) AbstractC34039OooOooO.f122370OooOo.OooO0o0(oooo0, false);
        if (abstractC34039OooOooO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO);
        C34158OooOOo0 c34158OooOOo0 = new C34158OooOOo0();
        if (abstractC34039OooOooOOooOOoo.size() > 4 || abstractC34039OooOooOOooOOoo.size() < 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        Object objOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(0);
        if (objOooOo0 == null || (objOooOo0 instanceof C34012OooO)) {
            c34012OooO = (C34012OooO) objOooOo0;
        } else {
            if (!(objOooOo0 instanceof byte[])) {
                throw new IllegalArgumentException("illegal object in getInstance: ".concat(objOooOo0.getClass().getName()));
            }
            try {
                AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO((byte[]) objOooOo0);
                if (!C34012OooO.class.isInstance(abstractC34036OooOoOOOooOOO)) {
                    throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOOOooOOO.getClass().getName()));
                }
                c34012OooO = (C34012OooO) abstractC34036OooOoOOOooOOO;
            } catch (Exception e) {
                throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
            }
        }
        c34158OooOOo0.f122736OooOo0o = c34012OooO;
        if (abstractC34039OooOooOOooOOoo.size() == 4) {
            i = 1;
            c34158OooOOo0.f122735OooOo = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(1));
        }
        c34158OooOOo0.f122738OooOoO0 = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(i + 1));
        c34158OooOOo0.f122737OooOoO = C34066Oooooo0.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(i + 2));
        return c34158OooOOo0;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(4);
        c34020OooO0oo.OooO00o(this.f122736OooOo0o);
        C34032OooOo0O c34032OooOo0O = this.f122735OooOo;
        if (c34032OooOo0O != null) {
            c34020OooO0oo.OooO00o(c34032OooOo0O);
        }
        c34020OooO0oo.OooO00o(this.f122738OooOoO0);
        c34020OooO0oo.OooO00o(this.f122737OooOoO);
        return new o00oO0O(c34020OooO0oo);
    }
}
