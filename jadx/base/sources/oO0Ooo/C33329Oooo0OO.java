package oO0Ooo;

import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OooO.AbstractC33457OooO0oO;
import oO0Oooo.C33515OooO0o0;
import oO0Oooo.C33518OooOO0;

/* JADX INFO: renamed from: oO0Ooo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33329Oooo0OO extends AbstractC33328Oooo0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33342OoooOo0 f120584OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f120585OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final List<InterfaceC33348OooooOO> f120586OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final oO0Oo0o0.OooOO0 f120587OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<AbstractC33457OooO0oO, AbstractC33328Oooo0O0> f120588OooOoo0;

    /* JADX WARN: Multi-variable type inference failed */
    public C33329Oooo0OO(InterfaceC33342OoooOo0 constructor, List<? extends InterfaceC33348OooooOO> arguments, boolean z, oO0Oo0o0.OooOO0 memberScope, InterfaceC32507OooOO0o<? super AbstractC33457OooO0oO, ? extends AbstractC33328Oooo0O0> interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(constructor, "constructor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
        kotlin.jvm.internal.OooOOO0.OooO0oO(memberScope, "memberScope");
        this.f120584OooOo = constructor;
        this.f120586OooOoO0 = arguments;
        this.f120585OooOoO = z;
        this.f120587OooOoOO = memberScope;
        this.f120588OooOoo0 = interfaceC32507OooOO0o;
        if (!(memberScope instanceof C33515OooO0o0) || (memberScope instanceof C33518OooOO0)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        return this.f120587OooOoOO;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final InterfaceC33342OoooOo0 o00000() {
        return this.f120584OooOo;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final List<InterfaceC33348OooooOO> o000000O() {
        return this.f120586OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final C33339OoooOOO o000000o() {
        C33339OoooOOO.f120598OooOo.getClass();
        return C33339OoooOOO.f120599OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final AbstractC33320OooOoo o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0Invoke = this.f120588OooOoo0.invoke(kotlinTypeRefiner);
        return abstractC33328Oooo0O0Invoke == null ? this : abstractC33328Oooo0O0Invoke;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return this.f120585OooOoO;
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o00000o0 */
    public final AbstractC33354o00o0O o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0Invoke = this.f120588OooOoo0.invoke(kotlinTypeRefiner);
        return abstractC33328Oooo0O0Invoke == null ? this : abstractC33328Oooo0O0Invoke;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        return z == this.f120585OooOoO ? this : z ? new C33327Oooo00o(this) : new C33326Oooo00O(this);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C33331Oooo0o0(this, newAttributes);
    }
}
