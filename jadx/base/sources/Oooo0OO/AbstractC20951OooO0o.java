package Oooo0OO;

import OooOoO.C20509OooO0oo;
import OooOoo0.InterfaceC20719o00ooo;
import OooOoo0.oo000o;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.C21065OoooOOO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00oO0O;
import OooooOO.C21348Ooooo0o;
import o0000Ooo.C24232OooO0o0;

/* JADX INFO: renamed from: Oooo0OO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20951OooO0o implements InterfaceC20719o00ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f60463OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f60464OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00oO0O f60465OooO0OO;

    public AbstractC20951OooO0o() {
        throw null;
    }

    public AbstractC20951OooO0o(boolean z, float f, o00oO0O o00oo0o) {
        this.f60463OooO00o = z;
        this.f60464OooO0O0 = f;
        this.f60465OooO0OO = o00oo0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOoo0.InterfaceC20719o00ooo
    public final oo000o OooO00o(InterfaceC20736OooOOO0 interactionSource, InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interactionSource, "interactionSource");
        interfaceC21033OooOOOO.OooOo00(988743187);
        InterfaceC20963OooOOo0 interfaceC20963OooOOo0 = (InterfaceC20963OooOOo0) interfaceC21033OooOOOO.OooO0o0(C20962OooOOo.f60503OooO00o);
        interfaceC21033OooOOOO.OooOo00(-1524341038);
        o00oO0O o00oo0o = this.f60465OooO0OO;
        long jOooO0O0 = ((C21348Ooooo0o) o00oo0o.getValue()).f61768OooO00o != C21348Ooooo0o.f61766OooO0oO ? ((C21348Ooooo0o) o00oo0o.getValue()).f61768OooO00o : interfaceC20963OooOOo0.OooO0O0(interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        AbstractC20960OooOOOO abstractC20960OooOOOOOooO0O0 = OooO0O0(interactionSource, this.f60463OooO00o, this.f60464OooO0O0, C21105o000OoO.OooO0Oo(new C21348Ooooo0o(jOooO0O0), interfaceC21033OooOOOO), C21105o000OoO.OooO0Oo(interfaceC20963OooOOo0.OooO00o(interfaceC21033OooOOOO), interfaceC21033OooOOOO), interfaceC21033OooOOOO);
        C21065OoooOOO.OooO0OO(abstractC20960OooOOOOOooO0O0, interactionSource, new C20952OooO0o0(interactionSource, abstractC20960OooOOOOOooO0O0, null), interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return abstractC20960OooOOOOOooO0O0;
    }

    public abstract AbstractC20960OooOOOO OooO0O0(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, boolean z, float f, o00oO0O o00oo0o, o00oO0O o00oo0o2, InterfaceC21033OooOOOO interfaceC21033OooOOOO);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC20951OooO0o)) {
            return false;
        }
        AbstractC20951OooO0o abstractC20951OooO0o = (AbstractC20951OooO0o) obj;
        return this.f60463OooO00o == abstractC20951OooO0o.f60463OooO00o && C24232OooO0o0.OooO00o(this.f60464OooO0O0, abstractC20951OooO0o.f60464OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60465OooO0OO, abstractC20951OooO0o.f60465OooO0OO);
    }

    public final int hashCode() {
        return this.f60465OooO0OO.hashCode() + C20509OooO0oo.OooO0OO(this.f60464OooO0O0, Boolean.hashCode(this.f60463OooO00o) * 31, 31);
    }
}
