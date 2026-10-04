package oO0O0Oo0;

import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0OooO0.C33477OooO0OO;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32693Oooo0oO extends AbstractC32675OooOOoo implements InterfaceC32620Oooo00O {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33477OooO0OO f117533OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f117534OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32693Oooo0oO(InterfaceC32615OooOoo module, C33477OooO0OO fqName) {
        super(module, InterfaceC34588OooO0oO.OooO00o.f123919OooO00o, fqName.OooO0oO(), oO0O0OO.o000oOoO.f117308OooO00o);
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        this.f117533OooOoOO = fqName;
        this.f117534OooOoo0 = "package " + fqName + " of " + module;
    }

    @Override // oO0O0OO.InterfaceC32620Oooo00O
    public final C33477OooO0OO OooO0OO() {
        return this.f117533OooOoOO;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0OO.OooOOO
    public oO0O0OO.o000oOoO getSource() {
        return oO0O0OO.o000oOoO.f117308OooO00o;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0O0(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo
    public String toString() {
        return this.f117534OooOoo0;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0OO.OooOO0O
    public final InterfaceC32615OooOoo OooO0Oo() {
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = super.OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooOO0OOooO0Oo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC32615OooOoo) oooOO0OOooO0Oo;
    }
}
