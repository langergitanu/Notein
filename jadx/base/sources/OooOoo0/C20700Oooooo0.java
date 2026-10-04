package OooOoo0;

import o00oO0O.AbstractC25521OoooO;
import o00oO0o.InterfaceC25574OooO0Oo;
import o00oO0o.InterfaceC25578OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34635OooOOOO;
import oo000o.InterfaceC34649OooOooo;

/* JADX INFO: renamed from: OooOoo0.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20700Oooooo0 implements InterfaceC25574OooO0Oo, InterfaceC34649OooOooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC25521OoooO f59418OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> f59419OooOo0o;

    @Override // oo000o.InterfaceC34649OooOooo
    public final void OooOo00(AbstractC25521OoooO abstractC25521OoooO) {
        InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> interfaceC32507OooOO0o;
        this.f59418OooOo = abstractC25521OoooO;
        if (!abstractC25521OoooO.OooOo()) {
            InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> interfaceC32507OooOO0o2 = this.f59419OooOo0o;
            if (interfaceC32507OooOO0o2 != null) {
                interfaceC32507OooOO0o2.invoke(null);
                return;
            }
            return;
        }
        AbstractC25521OoooO abstractC25521OoooO2 = this.f59418OooOo;
        if (abstractC25521OoooO2 == null || !abstractC25521OoooO2.OooOo() || (interfaceC32507OooOO0o = this.f59419OooOo0o) == null) {
            return;
        }
        interfaceC32507OooOO0o.invoke(this.f59418OooOo);
    }

    @Override // o00oO0o.InterfaceC25574OooO0Oo
    public final void OooooOO(InterfaceC25578OooO0oo scope) {
        InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> interfaceC32507OooOO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
        InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> interfaceC32507OooOO0o2 = (InterfaceC32507OooOO0o) scope.OooO00o(C20697OooooOO.f59412OooO00o);
        if (interfaceC32507OooOO0o2 == null && (interfaceC32507OooOO0o = this.f59419OooOo0o) != null) {
            interfaceC32507OooOO0o.invoke(null);
        }
        this.f59419OooOo0o = interfaceC32507OooOO0o2;
    }
}
