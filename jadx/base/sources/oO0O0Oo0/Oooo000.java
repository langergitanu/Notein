package oO0O0Oo0;

import OooOoo0.o0000OO;
import OooOoo0.o0000OOO;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import o00oO0O.C25515Oooo0O0;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32623Oooo0OO;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33477OooO0OO;
import oOo0oooO.InterfaceC34588OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 extends AbstractC32673OooOOo implements InterfaceC32623Oooo0OO {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117503OooOooO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33477OooO0OO f117504OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32692Oooo0o0 f117505OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117506OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final oO0Oo0o0.OooO f117507OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117508OooOoo0;

    static {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117503OooOooO = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(Oooo000.class), "fragments", "getFragments()Ljava/util/List;")), oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(Oooo000.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(C32692Oooo0o0 module, C33477OooO0OO fqName, C33361OooO0Oo storageManager) {
        super(InterfaceC34588OooO0oO.OooO00o.f123919OooO00o, fqName.OooO0oO());
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageManager, "storageManager");
        this.f117505OooOoO0 = module;
        this.f117504OooOoO = fqName;
        int i = 1;
        this.f117506OooOoOO = storageManager.OooO00o(new o0000OOO(this, i));
        this.f117508OooOoo0 = storageManager.OooO00o(new o0000OO(this, i));
        this.f117507OooOoo = new oO0Oo0o0.OooO(storageManager, new C32685OooOooo(this));
    }

    @Override // oO0O0OO.InterfaceC32623Oooo0OO
    public final C33477OooO0OO OooO0OO() {
        return this.f117504OooOoO;
    }

    @Override // oO0O0OO.OooOO0O
    public final oO0O0OO.OooOO0O OooO0Oo() {
        C33477OooO0OO c33477OooO0OO = this.f117504OooOoO;
        if (c33477OooO0OO.OooO0Oo()) {
            return null;
        }
        C33477OooO0OO c33477OooO0OOOooO0o0 = c33477OooO0OO.OooO0o0();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0o0, "fqName.parent()");
        return this.f117505OooOoO0.o00oO0o(c33477OooO0OOOooO0o0);
    }

    @Override // oO0O0OO.InterfaceC32623Oooo0OO
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        return this.f117507OooOoo;
    }

    @Override // oO0O0OO.InterfaceC32623Oooo0OO
    public final List<InterfaceC32620Oooo00O> Oooo0() {
        return (List) C25515Oooo0O0.OooO00o(this.f117506OooOoOO, f117503OooOooO[0]);
    }

    public final boolean equals(Object obj) {
        InterfaceC32623Oooo0OO interfaceC32623Oooo0OO = obj instanceof InterfaceC32623Oooo0OO ? (InterfaceC32623Oooo0OO) obj : null;
        if (interfaceC32623Oooo0OO == null) {
            return false;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117504OooOoO, interfaceC32623Oooo0OO.OooO0OO())) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117505OooOoO0, interfaceC32623Oooo0OO.o0OO00O());
        }
        return false;
    }

    public final int hashCode() {
        return this.f117504OooOoO.hashCode() + (this.f117505OooOoO0.hashCode() * 31);
    }

    @Override // oO0O0OO.InterfaceC32623Oooo0OO
    public final boolean isEmpty() {
        return ((Boolean) C25515Oooo0O0.OooO00o(this.f117508OooOoo0, f117503OooOooO[1])).booleanValue();
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooOO0o(this, d);
    }

    @Override // oO0O0OO.InterfaceC32623Oooo0OO
    public final C32692Oooo0o0 o0OO00O() {
        return this.f117505OooOoO0;
    }
}
