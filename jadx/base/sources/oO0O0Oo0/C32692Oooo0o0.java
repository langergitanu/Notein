package oO0O0Oo0;

import OooOoOO.C20519OooO0Oo;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.C32611OooOo0o;
import oO0O0OO.C32616OooOoo0;
import oO0O0OO.InterfaceC32613OooOoO0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32621Oooo00o;
import oO0O0OO.InterfaceC32623Oooo0OO;
import oO0O0Oo0.InterfaceC32694Oooo0oo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33369OooO0oo;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32692Oooo0o0 extends AbstractC32673OooOOo implements InterfaceC32615OooOoo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final oO0O0O0o.OooOO0 f117524OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33361OooO0Oo f117525OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Map<C32616OooOoo0<?>, Object> f117526OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Oooo0 f117527OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final InterfaceC32694Oooo0oo f117528OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public InterfaceC32621Oooo00o f117529OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final boolean f117530OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC33369OooO0oo<C33477OooO0OO, InterfaceC32623Oooo0OO> f117531Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C32447OooOOo f117532Oooo00O;

    public C32692Oooo0o0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32692Oooo0o0(C33479OooO0o moduleName, C33361OooO0Oo c33361OooO0Oo, oO0O0O0o.OooOO0 oooOO02, int i) {
        super(InterfaceC34588OooO0oO.OooO00o.f123919OooO00o, moduleName);
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(moduleName, "moduleName");
        this.f117525OooOoO0 = c33361OooO0Oo;
        this.f117524OooOoO = oooOO02;
        if (!moduleName.f120980OooOo) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f117526OooOoOO = c34436OooOoOO;
        InterfaceC32694Oooo0oo.f117535OooO00o.getClass();
        InterfaceC32694Oooo0oo interfaceC32694Oooo0oo = (InterfaceC32694Oooo0oo) OooooOo(InterfaceC32694Oooo0oo.OooO00o.f117537OooO0O0);
        this.f117528OooOoo0 = interfaceC32694Oooo0oo == null ? InterfaceC32694Oooo0oo.OooO0O0.f117538OooO0O0 : interfaceC32694Oooo0oo;
        this.f117530OooOooo = true;
        this.f117531Oooo000 = c33361OooO0Oo.OooO0Oo(new C32690Oooo0OO(this));
        this.f117532Oooo00O = C20519OooO0Oo.OooO0OO(new C32689Oooo0O0(this));
    }

    @Override // oO0O0OO.OooOO0O
    public final oO0O0OO.OooOO0O OooO0Oo() {
        return null;
    }

    @Override // oO0O0OO.InterfaceC32615OooOoo
    public final oO0O0O0o.OooOO0 OooOO0O() {
        return this.f117524OooOoO;
    }

    @Override // oO0O0OO.InterfaceC32615OooOoo
    public final Collection<C33477OooO0OO> OooOOOo(C33477OooO0OO fqName, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        o000OOo();
        o000OOo();
        return ((C32674OooOOo0) this.f117532Oooo00O.getValue()).OooOOOo(fqName, nameFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O0OO.InterfaceC32615OooOoo
    public final boolean OooOoO0(InterfaceC32615OooOoo targetModule) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(this.f117527OooOoo);
        if (oOo000Oo.OooOo.Oooo00o(C34438OooOoo0.f123458OooOo0o, targetModule)) {
            return true;
        }
        Oooo0o0();
        if (targetModule instanceof Void) {
        }
        return targetModule.Oooo0o0().contains(this);
    }

    @Override // oO0O0OO.InterfaceC32615OooOoo
    public final List<InterfaceC32615OooOoo> Oooo0o0() {
        if (this.f117527OooOoo != null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f120981OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // oO0O0OO.InterfaceC32615OooOoo
    public final <T> T OooooOo(C32616OooOoo0<T> capability) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(capability, "capability");
        T t = (T) this.f117526OooOoOO.get(capability);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final void o000OOo() {
        C32460OooOooO c32460OooOooO;
        if (this.f117530OooOooo) {
            return;
        }
        InterfaceC32613OooOoO0 interfaceC32613OooOoO0 = (InterfaceC32613OooOoO0) OooooOo(oO0O0OO.OooOo.f117255OooO00o);
        if (interfaceC32613OooOoO0 != null) {
            interfaceC32613OooOoO0.OooO00o();
            c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } else {
            c32460OooOooO = null;
        }
        if (c32460OooOooO != null) {
            return;
        }
        String message = "Accessing invalid module descriptor " + this;
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        throw new C32611OooOo0o(message);
    }

    @Override // oO0O0OO.InterfaceC32615OooOoo
    public final InterfaceC32623Oooo0OO o00oO0o(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        o000OOo();
        return (InterfaceC32623Oooo0OO) ((C33361OooO0Oo.OooOO0O) this.f117531Oooo000).invoke(fqName);
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0oO(d, this);
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo
    public final String toString() {
        String strO0OoOo0 = AbstractC32673OooOOo.o0OoOo0(this);
        return this.f117530OooOooo ? strO0OoOo0 : strO0OoOo0.concat(" !isValid");
    }
}
