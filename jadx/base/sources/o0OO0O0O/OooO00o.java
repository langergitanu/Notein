package o0OO0O0O;

import com.orion.editor.model.ClipboardData;
import oO00ooO.C32460OooOooO;
import oO0O0O0.AbstractC32552OooOOo;
import oO0O0O0.C32556OooOo0O;
import oO0O0O0.C32557OooOo0o;
import oO0O0O0.C32558OooOoO;
import oO0O0O0.C32559OooOoO0;
import oO0O0O0.C32566OooOooo;
import oO0O0O0.C32569Oooo00o;
import oO0O0O0.C32579OoooO0O;
import oO0O0O0.Oooo0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.OooOOO0;
import oO0O0Oo0.AbstractC32670OooO0oo;
import oO0O0Oo0.AbstractC32688Oooo00o;
import oO0O0Oo0.AbstractC32693Oooo0oO;
import oO0O0Oo0.C32692Oooo0o0;
import oO0O0Oo0.C32696OoooO0;
import oO0O0Oo0.C32697OoooO00;
import oO0O0Oo0.C32698OoooO0O;
import oO0O0Oo0.C32705Ooooo00;
import oO0O0Oo0.OooO0o;
import oO0O0Oo0.OooOOO;
import oO0O0Oo0.Oooo000;

/* JADX INFO: loaded from: classes9.dex */
public class OooO00o implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f92300OooO00o;

    public OooO00o(OooO0O0 memDataSource) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(memDataSource, "memDataSource");
        this.f92300OooO00o = memDataSource;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO(AbstractC32688Oooo00o abstractC32688Oooo00o, Object obj) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO00o(InterfaceC32609OooOo0 interfaceC32609OooOo0, Object obj) {
        C32460OooOooO data = (C32460OooOooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        return new C32556OooOo0O((AbstractC32552OooOOo) this.f92300OooO00o, interfaceC32609OooOo0);
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0O0(AbstractC32693Oooo0oO abstractC32693Oooo0oO, Object obj) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0OO(OooO0o oooO0o, Object obj) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0Oo(C32696OoooO0 c32696OoooO0, Object obj) {
        return OooO00o(c32696OoooO0, obj);
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0o(C32698OoooO0O c32698OoooO0O, Object obj) {
        return OooO00o(c32698OoooO0O, obj);
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0o0(AbstractC32670OooO0oo abstractC32670OooO0oo, Object obj) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0oO(Object obj, C32692Oooo0o0 c32692Oooo0o0) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooO0oo(OooOOO oooOOO, Object obj) {
        return OooO00o(oooOOO, obj);
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooOO0(C32705Ooooo00 c32705Ooooo00, Object obj) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooOO0O(oO0O0Oo0.OooOOO0 oooOOO0, Object obj) {
        return null;
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooOO0o(Oooo000 oooo000, Object obj) {
        return null;
    }

    public void OooOOO(ClipboardData clipboardData) {
        OooO0O0 oooO0O0 = (OooO0O0) this.f92300OooO00o;
        synchronized (oooO0O0.f92301OooO00o) {
            oooO0O0.f92302OooO0O0 = clipboardData;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oO0O0OO.OooOOO0
    public Object OooOOO0(C32697OoooO00 descriptor, Object obj) {
        C32460OooOooO data = (C32460OooOooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        int i = (descriptor.f117544Oooo != null ? 1 : 0) + (descriptor.f117557OoooO00 != null ? 1 : 0);
        boolean z = descriptor.f117594OooOoo0;
        AbstractC32552OooOOo abstractC32552OooOOo = (AbstractC32552OooOOo) this.f92300OooO00o;
        if (z) {
            if (i == 0) {
                return new C32557OooOo0o(abstractC32552OooOOo, descriptor);
            }
            if (i == 1) {
                return new C32559OooOoO0(abstractC32552OooOOo, descriptor);
            }
            if (i == 2) {
                return new C32558OooOoO(abstractC32552OooOOo, descriptor);
            }
        } else {
            if (i == 0) {
                return new C32566OooOooo(abstractC32552OooOOo, descriptor);
            }
            if (i == 1) {
                return new C32569Oooo00o(abstractC32552OooOOo, descriptor);
            }
            if (i == 2) {
                return new Oooo0(abstractC32552OooOOo, descriptor);
            }
        }
        throw new C32579OoooO0O("Unsupported property: " + descriptor);
    }

    public OooO00o(AbstractC32552OooOOo container) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        this.f92300OooO00o = container;
    }
}
